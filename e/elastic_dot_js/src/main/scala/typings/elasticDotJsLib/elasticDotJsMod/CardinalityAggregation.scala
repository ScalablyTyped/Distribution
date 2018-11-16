package typings
package elasticDotJsLib.elasticDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("elastic.js", "CardinalityAggregation")
@js.native
class CardinalityAggregation protected ()
  extends elasticDotJsLib.elasticDotJsMod.elasticjsNs.CardinalityAggregation {
  /*
       Aggregation that calculates an approximate count of distinct values.
       */
  def this(name: java.lang.String) = this()
  /*
       The type of ejs object.  For internal use only.
       */
  /* CompleteClass */
  override def _type(): java.lang.String = js.native
  /*
       Sets the field to operate on.
       */
  /* CompleteClass */
  override def field(field: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.CardinalityAggregation = js.native
  /*
       The script language being used.
       */
  /* CompleteClass */
  override def lang(language: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.CardinalityAggregation = js.native
  /*
       Sets parameters that will be applied to the script.  Overwrites
       any existing params.
       */
  /* CompleteClass */
  override def params(p: js.Object): elasticDotJsLib.elasticDotJsMod.elasticjsNs.CardinalityAggregation = js.native
  /*
       Allows to trade memory for accuracy, and defines a unique count below which
       counts are expected to be close to accurate. Above this value, counts might
       become a bit more fuzzy. The maximum supported value is 40000, thresholds
       above this number will have the same effect as a threshold of 40000.
       Default value depends on the number of parent aggregations that multiple
       create buckets (such as terms or histograms).
       */
  /* CompleteClass */
  override def precisionThreshold(num: scala.Double): elasticDotJsLib.elasticDotJsMod.elasticjsNs.CardinalityAggregation = js.native
  /*
       Set to false to disable rehashing of values.  You must have computed a hash
       on the client-side and stored it into your documents if you disable this.
       */
  /* CompleteClass */
  override def rehash(trueFalse: scala.Boolean): elasticDotJsLib.elasticDotJsMod.elasticjsNs.CardinalityAggregation = js.native
  /*
       Allows you generate or modify the terms/values using a script.
       */
  /* CompleteClass */
  override def script(scriptCode: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.CardinalityAggregation = js.native
  /*
       Retrieves the internal agg object. This is typically used by
       internal API functions so use with caution.
       */
  /* CompleteClass */
  override def toJSON(): js.Any = js.native
}

