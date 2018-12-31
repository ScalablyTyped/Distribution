package typings
package elasticDotJsLib.elasticDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("elastic.js", "MetricsAggregationMixin")
@js.native
class MetricsAggregationMixin ()
  extends elasticDotJsLib.elasticDotJsMod.elasticjsNs.MetricsAggregationMixin {
  /*
    The type of ejs object.  For internal use only.
    */
  /* CompleteClass */
  override def _type(): java.lang.String = js.native
  /*
    Sets the field to operate on.
    */
  /* CompleteClass */
  override def field(field: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.MetricsAggregationMixin = js.native
  /*
    The script language being used.
    */
  /* CompleteClass */
  override def lang(language: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.MetricsAggregationMixin = js.native
  /*
    Sets parameters that will be applied to the script.  Overwrites
    any existing params.
    */
  /* CompleteClass */
  override def params(p: js.Object): elasticDotJsLib.elasticDotJsMod.elasticjsNs.MetricsAggregationMixin = js.native
  /*
    Allows you generate or modify the terms/values using a script.
    */
  /* CompleteClass */
  override def script(scriptCode: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.MetricsAggregationMixin = js.native
  /*
    Set to true to assume script values are sorted.
    */
  /* CompleteClass */
  override def scriptValuesSorted(trueFalse: scala.Boolean): elasticDotJsLib.elasticDotJsMod.elasticjsNs.MetricsAggregationMixin = js.native
  /*
    Retrieves the internal agg object. This is typically used by
    internal API functions so use with caution.
    */
  /* CompleteClass */
  override def toJSON(): js.Any = js.native
}

