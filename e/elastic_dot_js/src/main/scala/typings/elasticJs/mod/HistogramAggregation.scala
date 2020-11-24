package typings.elasticJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("elastic.js", "HistogramAggregation")
@js.native
class HistogramAggregation protected () extends Aggregation {
  /*
    Aggregation that can be applied on numeric values extracted from the
    documents.
    */
  def this(name: String) = this()
  
  /*
    The type of ejs object.  For internal use only.
    */
  def _type(): String = js.native
  
  /*
    Add a nested aggregation.  This method can be called multiple times
    in order to set multiple nested aggregations what will be executed
    at the same time as the parent aggregation.  Alias for the
    aggregation method.
    */
  def agg(agg: Aggregation): HistogramAggregation = js.native
  
  /*
    Add a nested aggregation.  This method can be called multiple times
    in order to set multiple nested aggregations what will be executed
    at the same time as the parent aggregation.
    */
  def aggregation(agg: Aggregation): HistogramAggregation = js.native
  
  /*
    Set's the range/bounds for the histogram aggregation.  Useful when you
    want to include buckets that might be outside the bounds of indexed
    documents.
    */
  def extendedBounds(min: Double, max: Double): HistogramAggregation = js.native
  
  /*
    Sets the field to gather terms from.
    */
  def field(field: String): HistogramAggregation = js.native
  
  /*
    Sets the format expression for the terms.  Use for number or date
    formatting
    */
  def format(f: String): HistogramAggregation = js.native
  
  /*
    Sets the histogram interval.  Buckets are generated based on this interval
    value.
    */
  def interval(i: Double): HistogramAggregation = js.native
  
  /*
    Enable the response to be returned as a keyed object where the key is the
    bucket interval.
    */
  def keyed(trueFalse: Boolean): HistogramAggregation = js.native
  
  /*
    The script language being used.
    */
  def lang(language: String): HistogramAggregation = js.native
  
  /*
    Only return terms that match more than a configured number of hits.
    */
  def minDocCount(num: Double): HistogramAggregation = js.native
  
  /*
    Sets order for the aggregated values.
    */
  def order(order: String, direction: String): HistogramAggregation = js.native
  
  /*
    Sets parameters that will be applied to the script.  Overwrites
    any existing params.
    */
  def params(p: js.Object): HistogramAggregation = js.native
  
  /*
    Allows you generate or modify the terms using a script.
    */
  def script(scriptCode: String): HistogramAggregation = js.native
  
  /*
    Set to true to assume script values are sorted.
    */
  def scriptValuesSorted(trueFalse: Boolean): HistogramAggregation = js.native
  
  /*
    Retrieves the internal agg object. This is typically used by
    internal API functions so use with caution.
    */
  def toJSON(): js.Any = js.native
}
