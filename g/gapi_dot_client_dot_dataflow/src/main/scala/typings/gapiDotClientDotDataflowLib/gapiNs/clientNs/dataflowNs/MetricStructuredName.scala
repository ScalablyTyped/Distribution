package typings
package gapiDotClientDotDataflowLib.gapiNs.clientNs.dataflowNs

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
  var context: js.UndefOr[stdLib.Record[java.lang.String, java.lang.String]] = js.undefined
  /** Worker-defined metric name. */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Origin (namespace) of metric name. May be blank for user-define metrics;
    * will be "dataflow" for metrics defined by the Dataflow service or SDK.
    */
  var origin: js.UndefOr[java.lang.String] = js.undefined
}

object MetricStructuredName {
  @scala.inline
  def apply(
    context: stdLib.Record[java.lang.String, java.lang.String] = null,
    name: java.lang.String = null,
    origin: java.lang.String = null
  ): MetricStructuredName = {
    val __obj = js.Dynamic.literal()
    if (context != null) __obj.updateDynamic("context")(context)
    if (name != null) __obj.updateDynamic("name")(name)
    if (origin != null) __obj.updateDynamic("origin")(origin)
    __obj.asInstanceOf[MetricStructuredName]
  }
}

