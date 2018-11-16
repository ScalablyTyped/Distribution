package typings
package elasticDotJsLib.elasticDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("elastic.js", "ExtendedStatsAggregation")
@js.native
class ExtendedStatsAggregation protected ()
  extends elasticDotJsLib.elasticDotJsMod.elasticjsNs.ExtendedStatsAggregation {
  /*
       Aggregation that computes extra stats over numeric values extracted from
       the aggregated documents.
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
  override def field(field: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.ExtendedStatsAggregation = js.native
  /*
       The script language being used.
       */
  /* CompleteClass */
  override def lang(language: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.ExtendedStatsAggregation = js.native
  /*
       Sets parameters that will be applied to the script.  Overwrites
       any existing params.
       */
  /* CompleteClass */
  override def params(p: js.Object): elasticDotJsLib.elasticDotJsMod.elasticjsNs.ExtendedStatsAggregation = js.native
  /*
       Allows you generate or modify the terms/values using a script.
       */
  /* CompleteClass */
  override def script(scriptCode: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.ExtendedStatsAggregation = js.native
  /*
       Set to true to assume script values are sorted.
       */
  /* CompleteClass */
  override def scriptValuesSorted(trueFalse: scala.Boolean): elasticDotJsLib.elasticDotJsMod.elasticjsNs.ExtendedStatsAggregation = js.native
  /*
       Retrieves the internal agg object. This is typically used by
       internal API functions so use with caution.
       */
  /* CompleteClass */
  override def toJSON(): js.Any = js.native
}

