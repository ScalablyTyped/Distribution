package typings
package elasticDotJsLib.elasticDotJsMod.elasticjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MinAggregation extends Aggregation {
  /*
    The type of ejs object.  For internal use only.
    */
  def _type(): java.lang.String
  /*
    Sets the field to operate on.
    */
  def field(field: java.lang.String): MinAggregation
  /*
    The script language being used.
    */
  def lang(language: java.lang.String): MinAggregation
  /*
    Sets parameters that will be applied to the script.  Overwrites
    any existing params.
    */
  def params(p: js.Object): MinAggregation
  /*
    Allows you generate or modify the terms/values using a script.
    */
  def script(scriptCode: java.lang.String): MinAggregation
  /*
    Set to true to assume script values are sorted.
    */
  def scriptValuesSorted(trueFalse: scala.Boolean): MinAggregation
  /*
    Retrieves the internal agg object. This is typically used by
    internal API functions so use with caution.
    */
  def toJSON(): js.Any
}

object MinAggregation {
  @scala.inline
  def apply(
    _type: () => java.lang.String,
    field: java.lang.String => MinAggregation,
    lang: java.lang.String => MinAggregation,
    params: js.Object => MinAggregation,
    script: java.lang.String => MinAggregation,
    scriptValuesSorted: scala.Boolean => MinAggregation,
    toJSON: () => js.Any
  ): MinAggregation = {
    val __obj = js.Dynamic.literal(_type = js.Any.fromFunction0(_type), field = js.Any.fromFunction1(field), lang = js.Any.fromFunction1(lang), params = js.Any.fromFunction1(params), script = js.Any.fromFunction1(script), scriptValuesSorted = js.Any.fromFunction1(scriptValuesSorted), toJSON = js.Any.fromFunction0(toJSON))
  
    __obj.asInstanceOf[MinAggregation]
  }
}

