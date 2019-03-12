package typings
package elasticDotJsLib.elasticDotJsMod.elasticjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValueCountAggregation extends Aggregation {
  /*
    The type of ejs object.  For internal use only.
    */
  def _type(): java.lang.String
  /*
    Sets the field to operate on.
    */
  def field(field: java.lang.String): ValueCountAggregation
  /*
    The script language being used.
    */
  def lang(language: java.lang.String): ValueCountAggregation
  /*
    Sets parameters that will be applied to the script.  Overwrites
    any existing params.
    */
  def params(p: js.Object): ValueCountAggregation
  /*
    Allows you generate or modify the terms/values using a script.
    */
  def script(scriptCode: java.lang.String): ValueCountAggregation
  /*
    Set to true to assume script values are unique.
    */
  def scriptValuesUnique(trueFalse: scala.Boolean): ValueCountAggregation
  /*
    Retrieves the internal agg object. This is typically used by
    internal API functions so use with caution.
    */
  def toJSON(): js.Any
}

object ValueCountAggregation {
  @scala.inline
  def apply(
    _type: () => java.lang.String,
    field: java.lang.String => ValueCountAggregation,
    lang: java.lang.String => ValueCountAggregation,
    params: js.Object => ValueCountAggregation,
    script: java.lang.String => ValueCountAggregation,
    scriptValuesUnique: scala.Boolean => ValueCountAggregation,
    toJSON: () => js.Any
  ): ValueCountAggregation = {
    val __obj = js.Dynamic.literal(_type = js.Any.fromFunction0(_type), field = js.Any.fromFunction1(field), lang = js.Any.fromFunction1(lang), params = js.Any.fromFunction1(params), script = js.Any.fromFunction1(script), scriptValuesUnique = js.Any.fromFunction1(scriptValuesUnique), toJSON = js.Any.fromFunction0(toJSON))
  
    __obj.asInstanceOf[ValueCountAggregation]
  }
}

