package typings
package elasticDotJsLib.elasticDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("elastic.js", "ValueCountAggregation")
@js.native
class ValueCountAggregation protected () extends Aggregation {
  /*
    Aggregation that counts the number of values that are extracted from the
    aggregated documents.
    */
  def this(name: java.lang.String) = this()
  /*
    The type of ejs object.  For internal use only.
    */
  def _type(): java.lang.String = js.native
  /*
    Sets the field to operate on.
    */
  def field(field: java.lang.String): ValueCountAggregation = js.native
  /*
    The script language being used.
    */
  def lang(language: java.lang.String): ValueCountAggregation = js.native
  /*
    Sets parameters that will be applied to the script.  Overwrites
    any existing params.
    */
  def params(p: js.Object): ValueCountAggregation = js.native
  /*
    Allows you generate or modify the terms/values using a script.
    */
  def script(scriptCode: java.lang.String): ValueCountAggregation = js.native
  /*
    Set to true to assume script values are unique.
    */
  def scriptValuesUnique(trueFalse: scala.Boolean): ValueCountAggregation = js.native
  /*
    Retrieves the internal agg object. This is typically used by
    internal API functions so use with caution.
    */
  def toJSON(): js.Any = js.native
}

