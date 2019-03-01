package typings
package elasticDotJsLib.elasticDotJsMod.elasticjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetricsAggregationMixin extends Aggregation {
  /*
    The type of ejs object.  For internal use only.
    */
  def _type(): java.lang.String
  /*
    Sets the field to operate on.
    */
  def field(field: java.lang.String): MetricsAggregationMixin
  /*
    The script language being used.
    */
  def lang(language: java.lang.String): MetricsAggregationMixin
  /*
    Sets parameters that will be applied to the script.  Overwrites
    any existing params.
    */
  def params(p: js.Object): MetricsAggregationMixin
  /*
    Allows you generate or modify the terms/values using a script.
    */
  def script(scriptCode: java.lang.String): MetricsAggregationMixin
  /*
    Set to true to assume script values are sorted.
    */
  def scriptValuesSorted(trueFalse: scala.Boolean): MetricsAggregationMixin
  /*
    Retrieves the internal agg object. This is typically used by
    internal API functions so use with caution.
    */
  def toJSON(): js.Any
}

object MetricsAggregationMixin {
  @scala.inline
  def apply(
    _type: js.Function0[java.lang.String],
    field: js.Function1[java.lang.String, MetricsAggregationMixin],
    lang: js.Function1[java.lang.String, MetricsAggregationMixin],
    params: js.Function1[js.Object, MetricsAggregationMixin],
    script: js.Function1[java.lang.String, MetricsAggregationMixin],
    scriptValuesSorted: js.Function1[scala.Boolean, MetricsAggregationMixin],
    toJSON: js.Function0[js.Any]
  ): MetricsAggregationMixin = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("_type")(_type)
    __obj.updateDynamic("field")(field)
    __obj.updateDynamic("lang")(lang)
    __obj.updateDynamic("params")(params)
    __obj.updateDynamic("script")(script)
    __obj.updateDynamic("scriptValuesSorted")(scriptValuesSorted)
    __obj.updateDynamic("toJSON")(toJSON)
    __obj.asInstanceOf[MetricsAggregationMixin]
  }
}

