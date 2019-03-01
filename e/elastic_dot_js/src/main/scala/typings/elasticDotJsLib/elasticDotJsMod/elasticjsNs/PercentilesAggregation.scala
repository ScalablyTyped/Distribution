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
    _type: js.Function0[java.lang.String],
    compression: js.Function1[scala.Double, PercentilesAggregation],
    field: js.Function1[java.lang.String, PercentilesAggregation],
    keyed: js.Function1[scala.Boolean, PercentilesAggregation],
    lang: js.Function1[java.lang.String, PercentilesAggregation],
    params: js.Function1[js.Object, PercentilesAggregation],
    percent: js.Function1[scala.Double, PercentilesAggregation],
    percents: js.Function1[js.Array[scala.Double], PercentilesAggregation],
    script: js.Function1[java.lang.String, PercentilesAggregation],
    scriptValuesSorted: js.Function1[scala.Boolean, PercentilesAggregation],
    toJSON: js.Function0[js.Any]
  ): PercentilesAggregation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("_type")(_type)
    __obj.updateDynamic("compression")(compression)
    __obj.updateDynamic("field")(field)
    __obj.updateDynamic("keyed")(keyed)
    __obj.updateDynamic("lang")(lang)
    __obj.updateDynamic("params")(params)
    __obj.updateDynamic("percent")(percent)
    __obj.updateDynamic("percents")(percents)
    __obj.updateDynamic("script")(script)
    __obj.updateDynamic("scriptValuesSorted")(scriptValuesSorted)
    __obj.updateDynamic("toJSON")(toJSON)
    __obj.asInstanceOf[PercentilesAggregation]
  }
}

