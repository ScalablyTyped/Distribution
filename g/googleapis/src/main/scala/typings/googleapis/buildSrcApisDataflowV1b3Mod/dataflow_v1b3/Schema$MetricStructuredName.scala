package typings.googleapis.buildSrcApisDataflowV1b3Mod.dataflow_v1b3

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Identifies a metric, by describing the source which generated the metric.
  */
@js.native
trait Schema$MetricStructuredName extends js.Object {
  /**
    * Zero or more labeled fields which identify the part of the job this
    * metric is associated with, such as the name of a step or collection.  For
    * example, built-in counters associated with steps will have
    * context[&#39;step&#39;] = &lt;step-name&gt;. Counters associated with
    * PCollections in the SDK will have context[&#39;pcollection&#39;] =
    * &lt;pcollection-name&gt;.
    */
  var context: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * Worker-defined metric name.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Origin (namespace) of metric name. May be blank for user-define metrics;
    * will be &quot;dataflow&quot; for metrics defined by the Dataflow service
    * or SDK.
    */
  var origin: js.UndefOr[String] = js.native
}

object Schema$MetricStructuredName {
  @scala.inline
  def apply(context: StringDictionary[String] = null, name: String = null, origin: String = null): Schema$MetricStructuredName = {
    val __obj = js.Dynamic.literal()
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (origin != null) __obj.updateDynamic("origin")(origin.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$MetricStructuredName]
  }
}

