package typings.gapiClientDataflow.gapi.client.dataflow

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MetricStructuredName extends js.Object {
  /**
    * Zero or more labeled fields which identify the part of the job this
    * metric is associated with, such as the name of a step or collection.
    *
    * For example, built-in counters associated with steps will have
    * context['step'] = <step-name>. Counters associated with PCollections
    * in the SDK will have context['pcollection'] = <pcollection-name>.
    */
  var context: js.UndefOr[Record[String, String]] = js.native
  /** Worker-defined metric name. */
  var name: js.UndefOr[String] = js.native
  /**
    * Origin (namespace) of metric name. May be blank for user-define metrics;
    * will be "dataflow" for metrics defined by the Dataflow service or SDK.
    */
  var origin: js.UndefOr[String] = js.native
}

object MetricStructuredName {
  @scala.inline
  def apply(): MetricStructuredName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetricStructuredName]
  }
  @scala.inline
  implicit class MetricStructuredNameOps[Self <: MetricStructuredName] (val x: Self) extends AnyVal {
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
    def setContext(value: Record[String, String]): Self = this.set("context", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setOrigin(value: String): Self = this.set("origin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrigin: Self = this.set("origin", js.undefined)
  }
  
}

