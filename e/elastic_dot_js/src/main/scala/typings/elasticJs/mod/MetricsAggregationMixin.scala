package typings.elasticJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("elastic.js", "MetricsAggregationMixin")
@js.native
class MetricsAggregationMixin () extends Aggregation {
  /*
    The type of ejs object.  For internal use only.
    */
  def _type(): String = js.native
  /*
    Sets the field to operate on.
    */
  def field(field: String): MetricsAggregationMixin = js.native
  /*
    The script language being used.
    */
  def lang(language: String): MetricsAggregationMixin = js.native
  /*
    Sets parameters that will be applied to the script.  Overwrites
    any existing params.
    */
  def params(p: js.Object): MetricsAggregationMixin = js.native
  /*
    Allows you generate or modify the terms/values using a script.
    */
  def script(scriptCode: String): MetricsAggregationMixin = js.native
  /*
    Set to true to assume script values are sorted.
    */
  def scriptValuesSorted(trueFalse: Boolean): MetricsAggregationMixin = js.native
  /*
    Retrieves the internal agg object. This is typically used by
    internal API functions so use with caution.
    */
  def toJSON(): js.Any = js.native
}

