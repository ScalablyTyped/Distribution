package typings
package gapiDotClientDotSpannerLib.gapiNs.clientNs.spannerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Instance extends js.Object {
  /**
               * Required. The name of the instance's configuration. Values are of the form
               * `projects/<project>/instanceConfigs/<configuration>`. See
               * also InstanceConfig and
               * ListInstanceConfigs.
               */
  var config: js.UndefOr[java.lang.String] = js.undefined
  /**
               * Required. The descriptive name for this instance as it appears in UIs.
               * Must be unique per project and between 4 and 30 characters in length.
               */
  var displayName: js.UndefOr[java.lang.String] = js.undefined
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
  var labels: js.UndefOr[stdLib.Record[java.lang.String, java.lang.String]] = js.undefined
  /**
               * Required. A unique identifier for the instance, which cannot be changed
               * after the instance is created. Values are of the form
               * `projects/<project>/instances/a-z&#42;[a-z0-9]`. The final
               * segment of the name must be between 6 and 30 characters in length.
               */
  var name: js.UndefOr[java.lang.String] = js.undefined
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
  var nodeCount: js.UndefOr[scala.Double] = js.undefined
  /**
               * Output only. The current instance state. For
               * CreateInstance, the state must be
               * either omitted or set to `CREATING`. For
               * UpdateInstance, the state must be
               * either omitted or set to `READY`.
               */
  var state: js.UndefOr[java.lang.String] = js.undefined
}

