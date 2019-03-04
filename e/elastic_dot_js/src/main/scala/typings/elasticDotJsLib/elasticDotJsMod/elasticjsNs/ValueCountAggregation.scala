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
    _type: js.Function0[java.lang.String],
    field: js.Function1[java.lang.String, ValueCountAggregation],
    lang: js.Function1[java.lang.String, ValueCountAggregation],
    params: js.Function1[js.Object, ValueCountAggregation],
    script: js.Function1[java.lang.String, ValueCountAggregation],
    scriptValuesUnique: js.Function1[scala.Boolean, ValueCountAggregation],
    toJSON: js.Function0[js.Any]
  ): ValueCountAggregation = {
    val __obj = js.Dynamic.literal(_type = _type, field = field, lang = lang, params = params, script = script, scriptValuesUnique = scriptValuesUnique, toJSON = toJSON)
  
    __obj.asInstanceOf[ValueCountAggregation]
  }
}

