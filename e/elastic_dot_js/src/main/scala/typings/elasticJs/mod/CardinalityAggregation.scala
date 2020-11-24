package typings.elasticJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("elastic.js", "CardinalityAggregation")
@js.native
class CardinalityAggregation protected () extends Aggregation {
  /*
    Aggregation that calculates an approximate count of distinct values.
    */
  def this(name: String) = this()
  
  /*
    The type of ejs object.  For internal use only.
    */
  def _type(): String = js.native
  
  /*
    Sets the field to operate on.
    */
  def field(field: String): CardinalityAggregation = js.native
  
  /*
    The script language being used.
    */
  def lang(language: String): CardinalityAggregation = js.native
  
  /*
    Sets parameters that will be applied to the script.  Overwrites
    any existing params.
    */
  def params(p: js.Object): CardinalityAggregation = js.native
  
  /*
    Allows to trade memory for accuracy, and defines a unique count below which
    counts are expected to be close to accurate. Above this value, counts might
    become a bit more fuzzy. The maximum supported value is 40000, thresholds
    above this number will have the same effect as a threshold of 40000.
    Default value depends on the number of parent aggregations that multiple
    create buckets (such as terms or histograms).
    */
  def precisionThreshold(num: Double): CardinalityAggregation = js.native
  
  /*
    Set to false to disable rehashing of values.  You must have computed a hash
    on the client-side and stored it into your documents if you disable this.
    */
  def rehash(trueFalse: Boolean): CardinalityAggregation = js.native
  
  /*
    Allows you generate or modify the terms/values using a script.
    */
  def script(scriptCode: String): CardinalityAggregation = js.native
  
  /*
    Retrieves the internal agg object. This is typically used by
    internal API functions so use with caution.
    */
  def toJSON(): js.Any = js.native
}
