package typings
package elasticDotJsLib.elasticDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("elastic.js", "HistogramAggregation")
@js.native
class HistogramAggregation protected ()
  extends elasticDotJsLib.elasticDotJsMod.elasticjsNs.HistogramAggregation {
  /*
       Aggregation that can be applied on numeric values extracted from the
       documents.
       */
  def this(name: java.lang.String) = this()
  /*
       The type of ejs object.  For internal use only.
       */
  /* CompleteClass */
  override def _type(): java.lang.String = js.native
  /*
       Add a nested aggregation.  This method can be called multiple times
       in order to set multiple nested aggregations what will be executed
       at the same time as the parent aggregation.  Alias for the
       aggregation method.
       */
  /* CompleteClass */
  override def agg(agg: elasticDotJsLib.elasticDotJsMod.elasticjsNs.Aggregation): elasticDotJsLib.elasticDotJsMod.elasticjsNs.HistogramAggregation = js.native
  /*
       Add a nested aggregation.  This method can be called multiple times
       in order to set multiple nested aggregations what will be executed
       at the same time as the parent aggregation.
       */
  /* CompleteClass */
  override def aggregation(agg: elasticDotJsLib.elasticDotJsMod.elasticjsNs.Aggregation): elasticDotJsLib.elasticDotJsMod.elasticjsNs.HistogramAggregation = js.native
  /*
       Set's the range/bounds for the histogram aggregation.  Useful when you
       want to include buckets that might be outside the bounds of indexed
       documents.
       */
  /* CompleteClass */
  override def extendedBounds(min: scala.Double, max: scala.Double): elasticDotJsLib.elasticDotJsMod.elasticjsNs.HistogramAggregation = js.native
  /*
       Sets the field to gather terms from.
       */
  /* CompleteClass */
  override def field(field: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.HistogramAggregation = js.native
  /*
       Sets the format expression for the terms.  Use for number or date
       formatting
       */
  /* CompleteClass */
  override def format(f: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.HistogramAggregation = js.native
  /*
       Sets the histogram interval.  Buckets are generated based on this interval
       value.
       */
  /* CompleteClass */
  override def interval(i: scala.Double): elasticDotJsLib.elasticDotJsMod.elasticjsNs.HistogramAggregation = js.native
  /*
       Enable the response to be returned as a keyed object where the key is the
       bucket interval.
       */
  /* CompleteClass */
  override def keyed(trueFalse: scala.Boolean): elasticDotJsLib.elasticDotJsMod.elasticjsNs.HistogramAggregation = js.native
  /*
       The script language being used.
       */
  /* CompleteClass */
  override def lang(language: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.HistogramAggregation = js.native
  /*
       Only return terms that match more than a configured number of hits.
       */
  /* CompleteClass */
  override def minDocCount(num: scala.Double): elasticDotJsLib.elasticDotJsMod.elasticjsNs.HistogramAggregation = js.native
  /*
       Sets order for the aggregated values.
       */
  /* CompleteClass */
  override def order(order: java.lang.String, direction: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.HistogramAggregation = js.native
  /*
       Sets parameters that will be applied to the script.  Overwrites
       any existing params.
       */
  /* CompleteClass */
  override def params(p: js.Object): elasticDotJsLib.elasticDotJsMod.elasticjsNs.HistogramAggregation = js.native
  /*
       Allows you generate or modify the terms using a script.
       */
  /* CompleteClass */
  override def script(scriptCode: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.HistogramAggregation = js.native
  /*
       Set to true to assume script values are sorted.
       */
  /* CompleteClass */
  override def scriptValuesSorted(trueFalse: scala.Boolean): elasticDotJsLib.elasticDotJsMod.elasticjsNs.HistogramAggregation = js.native
  /*
       Retrieves the internal agg object. This is typically used by
       internal API functions so use with caution.
       */
  /* CompleteClass */
  override def toJSON(): js.Any = js.native
}

