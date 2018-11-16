package typings
package elasticDotJsLib.elasticDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("elastic.js", "DateRangeAggregation")
@js.native
class DateRangeAggregation protected ()
  extends elasticDotJsLib.elasticDotJsMod.elasticjsNs.DateRangeAggregation {
  /*
       Aggregation that is dedicated for date value ranges.
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
  override def agg(agg: elasticDotJsLib.elasticDotJsMod.elasticjsNs.Aggregation): elasticDotJsLib.elasticDotJsMod.elasticjsNs.DateRangeAggregation = js.native
  /*
       Add a nested aggregation.  This method can be called multiple times
       in order to set multiple nested aggregations what will be executed
       at the same time as the parent aggregation.
       */
  /* CompleteClass */
  override def aggregation(agg: elasticDotJsLib.elasticDotJsMod.elasticjsNs.Aggregation): elasticDotJsLib.elasticDotJsMod.elasticjsNs.DateRangeAggregation = js.native
  /*
       Sets the field to gather terms from.
       */
  /* CompleteClass */
  override def field(field: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.DateRangeAggregation = js.native
  /*
       Sets the date format expression.
       */
  /* CompleteClass */
  override def format(f: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.DateRangeAggregation = js.native
  /*
       Enable the response to be returned as a keyed object where the key is the
       bucket interval.
       */
  /* CompleteClass */
  override def keyed(trueFalse: scala.Boolean): elasticDotJsLib.elasticDotJsMod.elasticjsNs.DateRangeAggregation = js.native
  /*
       The script language being used.
       */
  /* CompleteClass */
  override def lang(language: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.DateRangeAggregation = js.native
  /*
       Sets parameters that will be applied to the script.  Overwrites
       any existing params.
       */
  /* CompleteClass */
  override def params(p: js.Object): elasticDotJsLib.elasticDotJsMod.elasticjsNs.DateRangeAggregation = js.native
  /*
       Adds a range to the list of exsiting range expressions.
       */
  /* CompleteClass */
  override def range(from: java.lang.String, to: java.lang.String, key: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.DateRangeAggregation = js.native
  /*
       Allows you generate or modify the terms using a script.
       */
  /* CompleteClass */
  override def script(scriptCode: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.DateRangeAggregation = js.native
  /*
       Set to true to assume script values are sorted.
       */
  /* CompleteClass */
  override def scriptValuesSorted(trueFalse: scala.Boolean): elasticDotJsLib.elasticDotJsMod.elasticjsNs.DateRangeAggregation = js.native
  /*
       Retrieves the internal agg object. This is typically used by
       internal API functions so use with caution.
       */
  /* CompleteClass */
  override def toJSON(): js.Any = js.native
}

