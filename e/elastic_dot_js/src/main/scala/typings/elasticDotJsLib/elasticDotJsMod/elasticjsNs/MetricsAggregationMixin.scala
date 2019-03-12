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
    _type: () => java.lang.String,
    field: java.lang.String => MetricsAggregationMixin,
    lang: java.lang.String => MetricsAggregationMixin,
    params: js.Object => MetricsAggregationMixin,
    script: java.lang.String => MetricsAggregationMixin,
    scriptValuesSorted: scala.Boolean => MetricsAggregationMixin,
    toJSON: () => js.Any
  ): MetricsAggregationMixin = {
    val __obj = js.Dynamic.literal(_type = js.Any.fromFunction0(_type), field = js.Any.fromFunction1(field), lang = js.Any.fromFunction1(lang), params = js.Any.fromFunction1(params), script = js.Any.fromFunction1(script), scriptValuesSorted = js.Any.fromFunction1(scriptValuesSorted), toJSON = js.Any.fromFunction0(toJSON))
  
    __obj.asInstanceOf[MetricsAggregationMixin]
  }
}

