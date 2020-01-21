package typings.elasticJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("elastic.js", "PercentilesAggregation")
@js.native
class PercentilesAggregation protected () extends Aggregation {
  /*
    Aggregation that calculates one or more percentiles over numeric values
    extracted from the aggregated documents.
    */
  def this(name: String) = this()
  /*
    The type of ejs object.  For internal use only.
    */
  def _type(): String = js.native
  /*
    Compression controls memory usage and approximation error. The compression
    value limits the maximum number of nodes to 100 * compression.  By
    increasing the compression value, you can increase the accuracy of your
    percentiles at the cost of more memory. Larger compression values also make
    the algorithm slower since the underlying tree data structure grows in
    size, resulting in more expensive operations. The default compression
    value is 100.
    */
  def compression(c: Double): PercentilesAggregation = js.native
  /*
    Sets the field to operate on.
    */
  def field(field: String): PercentilesAggregation = js.native
  /*
    Enable the response to be returned as a keyed object where the key is the
    bucket interval.
    */
  def keyed(trueFalse: Boolean): PercentilesAggregation = js.native
  /*
    The script language being used.
    */
  def lang(language: String): PercentilesAggregation = js.native
  /*
    Sets parameters that will be applied to the script.  Overwrites
    any existing params.
    */
  def params(p: js.Object): PercentilesAggregation = js.native
  /*
    Add a single percentile to the current list of percentiles.
    */
  def percent(percentile: Double): PercentilesAggregation = js.native
  /*
    Sets the percentile bucket array.  Overwrites all existing values.
    */
  def percents(percents: js.Array[Double]): PercentilesAggregation = js.native
  /*
    Allows you generate or modify the terms/values using a script.
    */
  def script(scriptCode: String): PercentilesAggregation = js.native
  /*
    Set to true to assume script values are sorted.
    */
  def scriptValuesSorted(trueFalse: Boolean): PercentilesAggregation = js.native
  /*
    Retrieves the internal agg object. This is typically used by
    internal API functions so use with caution.
    */
  def toJSON(): js.Any = js.native
}

