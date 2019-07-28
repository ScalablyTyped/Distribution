package typings.elasticDotJs.elasticDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("elastic.js", "RangeAggregation")
@js.native
class RangeAggregation protected () extends Aggregation {
  /*
    Aggregation that enables the user to define a set of ranges that each
    represent a bucket.
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
  def agg(agg: Aggregation): RangeAggregation = js.native
  /*
    Add a nested aggregation.  This method can be called multiple times
    in order to set multiple nested aggregations what will be executed
    at the same time as the parent aggregation.
    */
  def aggregation(agg: Aggregation): RangeAggregation = js.native
  /*
    Sets the field to gather terms from.
    */
  def field(field: String): RangeAggregation = js.native
  /*
    Enable the response to be returned as a keyed object where the key is the
    bucket interval.
    */
  def keyed(trueFalse: Boolean): RangeAggregation = js.native
  /*
    The script language being used.
    */
  def lang(language: String): RangeAggregation = js.native
  /*
    Sets parameters that will be applied to the script.  Overwrites
    any existing params.
    */
  def params(p: js.Object): RangeAggregation = js.native
  /*
    Adds a range to the list of exsiting range expressions.
    */
  def range(from: Double): RangeAggregation = js.native
  def range(from: Double, to: Double): RangeAggregation = js.native
  def range(from: Double, to: Double, key: String): RangeAggregation = js.native
  /*
    Allows you generate or modify the terms using a script.
    */
  def script(scriptCode: String): RangeAggregation = js.native
  /*
    Set to true to assume script values are sorted.
    */
  def scriptValuesSorted(trueFalse: Boolean): RangeAggregation = js.native
  /*
    Retrieves the internal agg object. This is typically used by
    internal API functions so use with caution.
    */
  def toJSON(): js.Any = js.native
}

