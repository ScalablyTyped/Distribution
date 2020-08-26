package typings.gapiClientSpanner.gapi.client.spanner

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Instance extends js.Object {
  /**
    * Required. The name of the instance's configuration. Values are of the form
    * `projects/<project>/instanceConfigs/<configuration>`. See
    * also InstanceConfig and
    * ListInstanceConfigs.
    */
  var config: js.UndefOr[String] = js.native
  /**
    * Required. The descriptive name for this instance as it appears in UIs.
    * Must be unique per project and between 4 and 30 characters in length.
    */
  var displayName: js.UndefOr[String] = js.native
  /**
    * Cloud Labels are a flexible and lightweight mechanism for organizing cloud
    * resources into groups that reflect a customer's organizational needs and
    * deployment strategies. Cloud Labels can be used to filter collections of
    * resources. They can be used to control how resource metrics are aggregated.
    * And they can be used as arguments to policy management rules (e.g. route,
    * firewall, load balancing, etc.).
    *
    * &#42; Label keys must be between 1 and 63 characters long and must conform to
    * the following regular expression: `[a-z]([-a-z0-9]&#42;[a-z0-9])?`.
    * &#42; Label values must be between 0 and 63 characters long and must conform
    * to the regular expression `([a-z]([-a-z0-9]&#42;[a-z0-9])?)?`.
    * &#42; No more than 64 labels can be associated with a given resource.
    *
    * See https://goo.gl/xmQnxf for more information on and examples of labels.
    *
    * If you plan to use labels in your own code, please note that additional
    * characters may be allowed in the future. And so you are advised to use an
    * internal label representation, such as JSON, which doesn't rely upon
    * specific characters being disallowed.  For example, representing labels
    * as the string:  name + "_" + value  would prove problematic if we were to
    * allow "_" in a future release.
    */
  var labels: js.UndefOr[Record[String, String]] = js.native
  /**
    * Required. A unique identifier for the instance, which cannot be changed
    * after the instance is created. Values are of the form
    * `projects/<project>/instances/a-z&#42;[a-z0-9]`. The final
    * segment of the name must be between 6 and 30 characters in length.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Required. The number of nodes allocated to this instance. This may be zero
    * in API responses for instances that are not yet in state `READY`.
    *
    * Each Spanner node can provide up to 10,000 QPS of reads or 2000 QPS of
    * writes (writing single rows at 1KB data per row), and 2 TiB storage.
    *
    * For optimal performance, we recommend provisioning enough nodes to keep
    * overall CPU utilization under 75%.
    *
    * A minimum of 3 nodes is recommended for production environments.  This
    * minimum is required for SLAs to apply to your instance.
    *
    * Note that Cloud Spanner performance is highly dependent on workload, schema
    * design, and dataset characteristics. The performance numbers above are
    * estimates, and assume [best practices](https://cloud.google.com/spanner/docs/bulk-loading)
    * are followed.
    */
  var nodeCount: js.UndefOr[Double] = js.native
  /**
    * Output only. The current instance state. For
    * CreateInstance, the state must be
    * either omitted or set to `CREATING`. For
    * UpdateInstance, the state must be
    * either omitted or set to `READY`.
    */
  var state: js.UndefOr[String] = js.native
}

object Instance {
  @scala.inline
  def apply(): Instance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Instance]
  }
  @scala.inline
  implicit class InstanceOps[Self <: Instance] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setConfig(value: String): Self = this.set("config", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfig: Self = this.set("config", js.undefined)
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    @scala.inline
    def setLabels(value: Record[String, String]): Self = this.set("labels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabels: Self = this.set("labels", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setNodeCount(value: Double): Self = this.set("nodeCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNodeCount: Self = this.set("nodeCount", js.undefined)
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
  }
  
}

