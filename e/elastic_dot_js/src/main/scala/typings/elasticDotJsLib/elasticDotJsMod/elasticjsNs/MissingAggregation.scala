package typings
package elasticDotJsLib.elasticDotJsMod.elasticjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MissingAggregation extends Aggregation {
  /*
    The type of ejs object.  For internal use only.
    */
  def _type(): java.lang.String
  /*
    Add a nested aggregation.  This method can be called multiple times
    in order to set multiple nested aggregations what will be executed
    at the same time as the parent aggregation.  Alias for the
    aggregation method.
    */
  def agg(agg: Aggregation): MissingAggregation
  /*
    Add a nested aggregation.  This method can be called multiple times
    in order to set multiple nested aggregations what will be executed
    at the same time as the parent aggregation.
    */
  def aggregation(agg: Aggregation): MissingAggregation
  /*
    Sets the field to gather missing terms from.
    */
  def field(field: java.lang.String): MissingAggregation
  /*
    Retrieves the internal agg object. This is typically used by
    internal API functions so use with caution.
    */
  def toJSON(): js.Any
}

object MissingAggregation {
  @scala.inline
  def apply(
    _type: js.Function0[java.lang.String],
    agg: js.Function1[Aggregation, MissingAggregation],
    aggregation: js.Function1[Aggregation, MissingAggregation],
    field: js.Function1[java.lang.String, MissingAggregation],
    toJSON: js.Function0[js.Any]
  ): MissingAggregation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("_type")(_type)
    __obj.updateDynamic("agg")(agg)
    __obj.updateDynamic("aggregation")(aggregation)
    __obj.updateDynamic("field")(field)
    __obj.updateDynamic("toJSON")(toJSON)
    __obj.asInstanceOf[MissingAggregation]
  }
}

