package typings.elasticJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("elastic.js", "SumAggregation")
@js.native
class SumAggregation protected () extends Aggregation {
  /*
    Aggregation that sums up numeric values that are extracted from the
    aggregated documents.
    */
  def this(name: String) = this()
  /*
    The type of ejs object.  For internal use only.
    */
  def _type(): String = js.native
  /*
    Sets the field to operate on.
    */
  def field(field: String): SumAggregation = js.native
  /*
    The script language being used.
    */
  def lang(language: String): SumAggregation = js.native
  /*
    Sets parameters that will be applied to the script.  Overwrites
    any existing params.
    */
  def params(p: js.Object): SumAggregation = js.native
  /*
    Allows you generate or modify the terms/values using a script.
    */
  def script(scriptCode: String): SumAggregation = js.native
  /*
    Set to true to assume script values are sorted.
    */
  def scriptValuesSorted(trueFalse: Boolean): SumAggregation = js.native
  /*
    Retrieves the internal agg object. This is typically used by
    internal API functions so use with caution.
    */
  def toJSON(): js.Any = js.native
}

