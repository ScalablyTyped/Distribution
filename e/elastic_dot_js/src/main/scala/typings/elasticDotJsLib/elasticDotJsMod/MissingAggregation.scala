package typings
package elasticDotJsLib.elasticDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("elastic.js", "MissingAggregation")
@js.native
class MissingAggregation protected ()
  extends elasticDotJsLib.elasticDotJsMod.elasticjsNs.MissingAggregation {
  /*
    Defines a bucket of all documents that are missing a field value.
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
  override def agg(agg: elasticDotJsLib.elasticDotJsMod.elasticjsNs.Aggregation): elasticDotJsLib.elasticDotJsMod.elasticjsNs.MissingAggregation = js.native
  /*
    Add a nested aggregation.  This method can be called multiple times
    in order to set multiple nested aggregations what will be executed
    at the same time as the parent aggregation.
    */
  /* CompleteClass */
  override def aggregation(agg: elasticDotJsLib.elasticDotJsMod.elasticjsNs.Aggregation): elasticDotJsLib.elasticDotJsMod.elasticjsNs.MissingAggregation = js.native
  /*
    Sets the field to gather missing terms from.
    */
  /* CompleteClass */
  override def field(field: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.MissingAggregation = js.native
  /*
    Retrieves the internal agg object. This is typically used by
    internal API functions so use with caution.
    */
  /* CompleteClass */
  override def toJSON(): js.Any = js.native
}

