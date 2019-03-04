package typings
package elasticDotJsLib.elasticDotJsMod.elasticjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CardinalityAggregation extends Aggregation {
  /*
    The type of ejs object.  For internal use only.
    */
  def _type(): java.lang.String
  /*
    Sets the field to operate on.
    */
  def field(field: java.lang.String): CardinalityAggregation
  /*
    The script language being used.
    */
  def lang(language: java.lang.String): CardinalityAggregation
  /*
    Sets parameters that will be applied to the script.  Overwrites
    any existing params.
    */
  def params(p: js.Object): CardinalityAggregation
  /*
    Allows to trade memory for accuracy, and defines a unique count below which
    counts are expected to be close to accurate. Above this value, counts might
    become a bit more fuzzy. The maximum supported value is 40000, thresholds
    above this number will have the same effect as a threshold of 40000.
    Default value depends on the number of parent aggregations that multiple
    create buckets (such as terms or histograms).
    */
  def precisionThreshold(num: scala.Double): CardinalityAggregation
  /*
    Set to false to disable rehashing of values.  You must have computed a hash
    on the client-side and stored it into your documents if you disable this.
    */
  def rehash(trueFalse: scala.Boolean): CardinalityAggregation
  /*
    Allows you generate or modify the terms/values using a script.
    */
  def script(scriptCode: java.lang.String): CardinalityAggregation
  /*
    Retrieves the internal agg object. This is typically used by
    internal API functions so use with caution.
    */
  def toJSON(): js.Any
}

object CardinalityAggregation {
  @scala.inline
  def apply(
    _type: js.Function0[java.lang.String],
    field: js.Function1[java.lang.String, CardinalityAggregation],
    lang: js.Function1[java.lang.String, CardinalityAggregation],
    params: js.Function1[js.Object, CardinalityAggregation],
    precisionThreshold: js.Function1[scala.Double, CardinalityAggregation],
    rehash: js.Function1[scala.Boolean, CardinalityAggregation],
    script: js.Function1[java.lang.String, CardinalityAggregation],
    toJSON: js.Function0[js.Any]
  ): CardinalityAggregation = {
    val __obj = js.Dynamic.literal(_type = _type, field = field, lang = lang, params = params, precisionThreshold = precisionThreshold, rehash = rehash, script = script, toJSON = toJSON)
  
    __obj.asInstanceOf[CardinalityAggregation]
  }
}

