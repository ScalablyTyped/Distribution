package typings
package elasticDotJsLib.elasticDotJsMod.elasticjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DateRangeAggregation extends Aggregation {
  /*
    The type of ejs object.  For internal use only.
    */
  def _type(): java.lang.String
  /*
    Add a nested aggregation.  This method can be called multiple times
    in order to set multiple nested aggregations what will be executed
    at the same time as the parent aggregation.  Alias for the
    aggregation method.
    */
  def agg(agg: Aggregation): DateRangeAggregation
  /*
    Add a nested aggregation.  This method can be called multiple times
    in order to set multiple nested aggregations what will be executed
    at the same time as the parent aggregation.
    */
  def aggregation(agg: Aggregation): DateRangeAggregation
  /*
    Sets the field to gather terms from.
    */
  def field(field: java.lang.String): DateRangeAggregation
  /*
    Sets the date format expression.
    */
  def format(f: java.lang.String): DateRangeAggregation
  /*
    Enable the response to be returned as a keyed object where the key is the
    bucket interval.
    */
  def keyed(trueFalse: scala.Boolean): DateRangeAggregation
  /*
    The script language being used.
    */
  def lang(language: java.lang.String): DateRangeAggregation
  /*
    Sets parameters that will be applied to the script.  Overwrites
    any existing params.
    */
  def params(p: js.Object): DateRangeAggregation
  /*
    Adds a range to the list of exsiting range expressions.
    */
  def range(from: java.lang.String, to: java.lang.String, key: java.lang.String): DateRangeAggregation
  /*
    Allows you generate or modify the terms using a script.
    */
  def script(scriptCode: java.lang.String): DateRangeAggregation
  /*
    Set to true to assume script values are sorted.
    */
  def scriptValuesSorted(trueFalse: scala.Boolean): DateRangeAggregation
  /*
    Retrieves the internal agg object. This is typically used by
    internal API functions so use with caution.
    */
  def toJSON(): js.Any
}

object DateRangeAggregation {
  @scala.inline
  def apply(
    _type: js.Function0[java.lang.String],
    agg: js.Function1[Aggregation, DateRangeAggregation],
    aggregation: js.Function1[Aggregation, DateRangeAggregation],
    field: js.Function1[java.lang.String, DateRangeAggregation],
    format: js.Function1[java.lang.String, DateRangeAggregation],
    keyed: js.Function1[scala.Boolean, DateRangeAggregation],
    lang: js.Function1[java.lang.String, DateRangeAggregation],
    params: js.Function1[js.Object, DateRangeAggregation],
    range: js.Function3[java.lang.String, java.lang.String, java.lang.String, DateRangeAggregation],
    script: js.Function1[java.lang.String, DateRangeAggregation],
    scriptValuesSorted: js.Function1[scala.Boolean, DateRangeAggregation],
    toJSON: js.Function0[js.Any]
  ): DateRangeAggregation = {
    val __obj = js.Dynamic.literal(_type = _type, agg = agg, aggregation = aggregation, field = field, format = format, keyed = keyed, lang = lang, params = params, range = range, script = script, scriptValuesSorted = scriptValuesSorted, toJSON = toJSON)
  
    __obj.asInstanceOf[DateRangeAggregation]
  }
}

