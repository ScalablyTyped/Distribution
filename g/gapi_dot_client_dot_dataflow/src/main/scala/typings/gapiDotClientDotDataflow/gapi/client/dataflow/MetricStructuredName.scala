package typings.gapiDotClientDotDataflow.gapi.client.dataflow

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetricStructuredName extends js.Object {
  /**
    * Zero or more labeled fields which identify the part of the job this
    * metric is associated with, such as the name of a step or collection.
    *
    * For example, built-in counters associated with steps will have
    * context['step'] = <step-name>. Counters associated with PCollections
    * in the SDK will have context['pcollection'] = <pcollection-name>.
    */
  var context: js.UndefOr[Record[String, String]] = js.undefined
  /** Worker-defined metric name. */
  var name: js.UndefOr[String] = js.undefined
  /**
    * Origin (namespace) of metric name. May be blank for user-define metrics;
    * will be "dataflow" for metrics defined by the Dataflow service or SDK.
    */
  var origin: js.UndefOr[String] = js.undefined
}

object MetricStructuredName {
  @scala.inline
  def apply(context: Record[String, String] = null, name: String = null, origin: String = null): MetricStructuredName = {
    val __obj = js.Dynamic.literal()
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (origin != null) __obj.updateDynamic("origin")(origin.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetricStructuredName]
  }
}

