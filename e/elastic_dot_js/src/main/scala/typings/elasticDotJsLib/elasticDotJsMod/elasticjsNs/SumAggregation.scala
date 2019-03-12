package typings
package elasticDotJsLib.elasticDotJsMod.elasticjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SumAggregation extends Aggregation {
  /*
    The type of ejs object.  For internal use only.
    */
  def _type(): java.lang.String
  /*
    Sets the field to operate on.
    */
  def field(field: java.lang.String): SumAggregation
  /*
    The script language being used.
    */
  def lang(language: java.lang.String): SumAggregation
  /*
    Sets parameters that will be applied to the script.  Overwrites
    any existing params.
    */
  def params(p: js.Object): SumAggregation
  /*
    Allows you generate or modify the terms/values using a script.
    */
  def script(scriptCode: java.lang.String): SumAggregation
  /*
    Set to true to assume script values are sorted.
    */
  def scriptValuesSorted(trueFalse: scala.Boolean): SumAggregation
  /*
    Retrieves the internal agg object. This is typically used by
    internal API functions so use with caution.
    */
  def toJSON(): js.Any
}

object SumAggregation {
  @scala.inline
  def apply(
    _type: () => java.lang.String,
    field: java.lang.String => SumAggregation,
    lang: java.lang.String => SumAggregation,
    params: js.Object => SumAggregation,
    script: java.lang.String => SumAggregation,
    scriptValuesSorted: scala.Boolean => SumAggregation,
    toJSON: () => js.Any
  ): SumAggregation = {
    val __obj = js.Dynamic.literal(_type = js.Any.fromFunction0(_type), field = js.Any.fromFunction1(field), lang = js.Any.fromFunction1(lang), params = js.Any.fromFunction1(params), script = js.Any.fromFunction1(script), scriptValuesSorted = js.Any.fromFunction1(scriptValuesSorted), toJSON = js.Any.fromFunction0(toJSON))
  
    __obj.asInstanceOf[SumAggregation]
  }
}

