package typings
package elasticDotJsLib.elasticDotJsMod.elasticjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PercentilesAggregation extends Aggregation {
  /*
    The type of ejs object.  For internal use only.
    */
  def _type(): java.lang.String
  /*
    Compression controls memory usage and approximation error. The compression
    value limits the maximum number of nodes to 100 * compression.  By
    increasing the compression value, you can increase the accuracy of your
    percentiles at the cost of more memory. Larger compression values also make
    the algorithm slower since the underlying tree data structure grows in
    size, resulting in more expensive operations. The default compression
    value is 100.
    */
  def compression(c: scala.Double): PercentilesAggregation
  /*
    Sets the field to operate on.
    */
  def field(field: java.lang.String): PercentilesAggregation
  /*
    Enable the response to be returned as a keyed object where the key is the
    bucket interval.
    */
  def keyed(trueFalse: scala.Boolean): PercentilesAggregation
  /*
    The script language being used.
    */
  def lang(language: java.lang.String): PercentilesAggregation
  /*
    Sets parameters that will be applied to the script.  Overwrites
    any existing params.
    */
  def params(p: js.Object): PercentilesAggregation
  /*
    Add a single percentile to the current list of percentiles.
    */
  def percent(percentile: scala.Double): PercentilesAggregation
  /*
    Sets the percentile bucket array.  Overwrites all existing values.
    */
  def percents(percents: js.Array[scala.Double]): PercentilesAggregation
  /*
    Allows you generate or modify the terms/values using a script.
    */
  def script(scriptCode: java.lang.String): PercentilesAggregation
  /*
    Set to true to assume script values are sorted.
    */
  def scriptValuesSorted(trueFalse: scala.Boolean): PercentilesAggregation
  /*
    Retrieves the internal agg object. This is typically used by
    internal API functions so use with caution.
    */
  def toJSON(): js.Any
}

object PercentilesAggregation {
  @scala.inline
  def apply(
    _type: () => java.lang.String,
    compression: scala.Double => PercentilesAggregation,
    field: java.lang.String => PercentilesAggregation,
    keyed: scala.Boolean => PercentilesAggregation,
    lang: java.lang.String => PercentilesAggregation,
    params: js.Object => PercentilesAggregation,
    percent: scala.Double => PercentilesAggregation,
    percents: js.Array[scala.Double] => PercentilesAggregation,
    script: java.lang.String => PercentilesAggregation,
    scriptValuesSorted: scala.Boolean => PercentilesAggregation,
    toJSON: () => js.Any
  ): PercentilesAggregation = {
    val __obj = js.Dynamic.literal(_type = js.Any.fromFunction0(_type), compression = js.Any.fromFunction1(compression), field = js.Any.fromFunction1(field), keyed = js.Any.fromFunction1(keyed), lang = js.Any.fromFunction1(lang), params = js.Any.fromFunction1(params), percent = js.Any.fromFunction1(percent), percents = js.Any.fromFunction1(percents), script = js.Any.fromFunction1(script), scriptValuesSorted = js.Any.fromFunction1(scriptValuesSorted), toJSON = js.Any.fromFunction0(toJSON))
  
    __obj.asInstanceOf[PercentilesAggregation]
  }
}

