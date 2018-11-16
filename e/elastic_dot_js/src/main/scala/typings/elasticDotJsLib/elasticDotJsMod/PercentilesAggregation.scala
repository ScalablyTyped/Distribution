package typings
package elasticDotJsLib.elasticDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("elastic.js", "PercentilesAggregation")
@js.native
class PercentilesAggregation protected ()
  extends elasticDotJsLib.elasticDotJsMod.elasticjsNs.PercentilesAggregation {
  /*
       Aggregation that calculates one or more percentiles over numeric values
       extracted from the aggregated documents.
       */
  def this(name: java.lang.String) = this()
  /*
       The type of ejs object.  For internal use only.
       */
  /* CompleteClass */
  override def _type(): java.lang.String = js.native
  /*
       Compression controls memory usage and approximation error. The compression
       value limits the maximum number of nodes to 100 * compression.  By
       increasing the compression value, you can increase the accuracy of your
       percentiles at the cost of more memory. Larger compression values also make
       the algorithm slower since the underlying tree data structure grows in
       size, resulting in more expensive operations. The default compression
       value is 100.
       */
  /* CompleteClass */
  override def compression(c: scala.Double): elasticDotJsLib.elasticDotJsMod.elasticjsNs.PercentilesAggregation = js.native
  /*
       Sets the field to operate on.
       */
  /* CompleteClass */
  override def field(field: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.PercentilesAggregation = js.native
  /*
       Enable the response to be returned as a keyed object where the key is the
       bucket interval.
       */
  /* CompleteClass */
  override def keyed(trueFalse: scala.Boolean): elasticDotJsLib.elasticDotJsMod.elasticjsNs.PercentilesAggregation = js.native
  /*
       The script language being used.
       */
  /* CompleteClass */
  override def lang(language: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.PercentilesAggregation = js.native
  /*
       Sets parameters that will be applied to the script.  Overwrites
       any existing params.
       */
  /* CompleteClass */
  override def params(p: js.Object): elasticDotJsLib.elasticDotJsMod.elasticjsNs.PercentilesAggregation = js.native
  /*
       Add a single percentile to the current list of percentiles.
       */
  /* CompleteClass */
  override def percent(percentile: scala.Double): elasticDotJsLib.elasticDotJsMod.elasticjsNs.PercentilesAggregation = js.native
  /*
       Sets the percentile bucket array.  Overwrites all existing values.
       */
  /* CompleteClass */
  override def percents(percents: js.Array[scala.Double]): elasticDotJsLib.elasticDotJsMod.elasticjsNs.PercentilesAggregation = js.native
  /*
       Allows you generate or modify the terms/values using a script.
       */
  /* CompleteClass */
  override def script(scriptCode: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.PercentilesAggregation = js.native
  /*
       Set to true to assume script values are sorted.
       */
  /* CompleteClass */
  override def scriptValuesSorted(trueFalse: scala.Boolean): elasticDotJsLib.elasticDotJsMod.elasticjsNs.PercentilesAggregation = js.native
  /*
       Retrieves the internal agg object. This is typically used by
       internal API functions so use with caution.
       */
  /* CompleteClass */
  override def toJSON(): js.Any = js.native
}

