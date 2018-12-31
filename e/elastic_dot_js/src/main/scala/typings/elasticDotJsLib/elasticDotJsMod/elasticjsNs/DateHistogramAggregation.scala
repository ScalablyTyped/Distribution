package typings
package elasticDotJsLib.elasticDotJsMod.elasticjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DateHistogramAggregation extends Aggregation {
  /*
    The type of ejs object.  For internal use only.
    */
  def _type(): java.lang.String = js.native
  /*
    Add a nested aggregation.  This method can be called multiple times
    in order to set multiple nested aggregations what will be executed
    at the same time as the parent aggregation.  Alias for the
    aggregation method.
    */
  def agg(agg: Aggregation): DateHistogramAggregation = js.native
  /*
    Add a nested aggregation.  This method can be called multiple times
    in order to set multiple nested aggregations what will be executed
    at the same time as the parent aggregation.
    */
  def aggregation(agg: Aggregation): DateHistogramAggregation = js.native
  /*
    Set's the range/bounds for the histogram aggregation.  Useful when you
    want to include buckets that might be outside the bounds of indexed
    documents.
    */
  def extendedBounds(min: java.lang.String, max: java.lang.String): DateHistogramAggregation = js.native
  def extendedBounds(min: java.lang.String, max: scala.Double): DateHistogramAggregation = js.native
  def extendedBounds(min: scala.Double, max: java.lang.String): DateHistogramAggregation = js.native
  def extendedBounds(min: scala.Double, max: scala.Double): DateHistogramAggregation = js.native
  /*
    Sets the field to gather terms from.
    */
  def field(field: java.lang.String): DateHistogramAggregation = js.native
  /*
    Sets the format expression for the terms.  Use for number or date
    formatting
    */
  def format(f: java.lang.String): DateHistogramAggregation = js.native
  /*
    Sets the histogram interval.  Buckets are generated based on this interval
    value.
    */
  def interval(i: java.lang.String): DateHistogramAggregation = js.native
  /*
    Enable the response to be returned as a keyed object where the key is the
    bucket interval.
    */
  def keyed(trueFalse: scala.Boolean): DateHistogramAggregation = js.native
  /*
    The script language being used.
    */
  def lang(language: java.lang.String): DateHistogramAggregation = js.native
  /*
    Only return terms that match more than a configured number of hits.
    */
  def minDocCount(num: scala.Double): DateHistogramAggregation = js.native
  /*
    Sets order for the aggregated values.
    */
  def order(order: java.lang.String, direction: java.lang.String): DateHistogramAggregation = js.native
  /*
    Sets parameters that will be applied to the script.  Overwrites
    any existing params.
    */
  def params(p: js.Object): DateHistogramAggregation = js.native
  /*
    Set the post-rouding offset.
    */
  def postOffset(offset: java.lang.String): DateHistogramAggregation = js.native
  /*
    Set the post-rouding date time zone.
    */
  def postZone(tz: java.lang.String): DateHistogramAggregation = js.native
  /*
    Set the pre-rouding offset.
    */
  def preOffset(offset: java.lang.String): DateHistogramAggregation = js.native
  /*
    Set the pre-rouding date time zone.
    */
  def preZone(tz: java.lang.String): DateHistogramAggregation = js.native
  /*
    Set to true to apply interval adjusts to day and above intervals.
    */
  def preZoneAdjustLargeInterval(trueFalse: scala.Boolean): DateHistogramAggregation = js.native
  /*
    Allows you generate or modify the terms using a script.
    */
  def script(scriptCode: java.lang.String): DateHistogramAggregation = js.native
  /*
    Set to true to assume script values are sorted.
    */
  def scriptValuesSorted(trueFalse: scala.Boolean): DateHistogramAggregation = js.native
  /*
    Set the date time zone.
    */
  def timeZone(tz: java.lang.String): DateHistogramAggregation = js.native
  /*
    Retrieves the internal agg object. This is typically used by
    internal API functions so use with caution.
    */
  def toJSON(): js.Any = js.native
}

