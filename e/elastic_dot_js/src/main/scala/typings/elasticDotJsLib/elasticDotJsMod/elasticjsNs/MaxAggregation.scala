package typings
package elasticDotJsLib.elasticDotJsMod.elasticjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MaxAggregation extends Aggregation {
  /*
    The type of ejs object.  For internal use only.
    */
  def _type(): java.lang.String
  /*
    Sets the field to operate on.
    */
  def field(field: java.lang.String): MaxAggregation
  /*
    The script language being used.
    */
  def lang(language: java.lang.String): MaxAggregation
  /*
    Sets parameters that will be applied to the script.  Overwrites
    any existing params.
    */
  def params(p: js.Object): MaxAggregation
  /*
    Allows you generate or modify the terms/values using a script.
    */
  def script(scriptCode: java.lang.String): MaxAggregation
  /*
    Set to true to assume script values are sorted.
    */
  def scriptValuesSorted(trueFalse: scala.Boolean): MaxAggregation
  /*
    Retrieves the internal agg object. This is typically used by
    internal API functions so use with caution.
    */
  def toJSON(): js.Any
}

object MaxAggregation {
  @scala.inline
  def apply(
    _type: js.Function0[java.lang.String],
    field: js.Function1[java.lang.String, MaxAggregation],
    lang: js.Function1[java.lang.String, MaxAggregation],
    params: js.Function1[js.Object, MaxAggregation],
    script: js.Function1[java.lang.String, MaxAggregation],
    scriptValuesSorted: js.Function1[scala.Boolean, MaxAggregation],
    toJSON: js.Function0[js.Any]
  ): MaxAggregation = {
    val __obj = js.Dynamic.literal(_type = _type, field = field, lang = lang, params = params, script = script, scriptValuesSorted = scriptValuesSorted, toJSON = toJSON)
  
    __obj.asInstanceOf[MaxAggregation]
  }
}

