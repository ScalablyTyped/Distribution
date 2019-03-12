package typings
package elasticDotJsLib.elasticDotJsMod.elasticjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPv4RangeAggregation extends Aggregation {
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
  def agg(agg: Aggregation): IPv4RangeAggregation
  /*
    Add a nested aggregation.  This method can be called multiple times
    in order to set multiple nested aggregations what will be executed
    at the same time as the parent aggregation.
    */
  def aggregation(agg: Aggregation): IPv4RangeAggregation
  /*
    Sets the field to gather terms from.
    */
  def field(field: java.lang.String): IPv4RangeAggregation
  /*
    Enable the response to be returned as a keyed object where the key is the
    bucket interval.
    */
  def keyed(trueFalse: scala.Boolean): IPv4RangeAggregation
  /*
    The script language being used.
    */
  def lang(language: java.lang.String): IPv4RangeAggregation
  /*
    Sets parameters that will be applied to the script.  Overwrites
    any existing params.
    */
  def params(p: js.Object): IPv4RangeAggregation
  /*
    Adds a range to the list of exsiting range expressions.
    */
  def range(from: java.lang.String, to: java.lang.String, key: java.lang.String): IPv4RangeAggregation
  /*
    Allows you generate or modify the terms using a script.
    */
  def script(scriptCode: java.lang.String): IPv4RangeAggregation
  /*
    Set to true to assume script values are sorted.
    */
  def scriptValuesSorted(trueFalse: scala.Boolean): IPv4RangeAggregation
  /*
    Retrieves the internal agg object. This is typically used by
    internal API functions so use with caution.
    */
  def toJSON(): js.Any
}

object IPv4RangeAggregation {
  @scala.inline
  def apply(
    _type: () => java.lang.String,
    agg: Aggregation => IPv4RangeAggregation,
    aggregation: Aggregation => IPv4RangeAggregation,
    field: java.lang.String => IPv4RangeAggregation,
    keyed: scala.Boolean => IPv4RangeAggregation,
    lang: java.lang.String => IPv4RangeAggregation,
    params: js.Object => IPv4RangeAggregation,
    range: (java.lang.String, java.lang.String, java.lang.String) => IPv4RangeAggregation,
    script: java.lang.String => IPv4RangeAggregation,
    scriptValuesSorted: scala.Boolean => IPv4RangeAggregation,
    toJSON: () => js.Any
  ): IPv4RangeAggregation = {
    val __obj = js.Dynamic.literal(_type = js.Any.fromFunction0(_type), agg = js.Any.fromFunction1(agg), aggregation = js.Any.fromFunction1(aggregation), field = js.Any.fromFunction1(field), keyed = js.Any.fromFunction1(keyed), lang = js.Any.fromFunction1(lang), params = js.Any.fromFunction1(params), range = js.Any.fromFunction3(range), script = js.Any.fromFunction1(script), scriptValuesSorted = js.Any.fromFunction1(scriptValuesSorted), toJSON = js.Any.fromFunction0(toJSON))
  
    __obj.asInstanceOf[IPv4RangeAggregation]
  }
}

