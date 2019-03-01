package typings
package elasticDotJsLib.elasticDotJsMod.elasticjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldMaskingSpanQuery extends Query {
  /*
    The type of ejs object.  For internal use only.
    */
  def _type(): java.lang.String
  /*
    Sets the boost value for documents matching the Query.
    */
  def boost(boost: scala.Double): FieldMaskingSpanQuery
  /*
    Sets the value of the "masked" field.
    */
  def field(f: java.lang.String): FieldMaskingSpanQuery
  /*
    Sets the span query to wrap.
    */
  def query(spanQuery: Query): FieldMaskingSpanQuery
  /*
    Retrieves the internal query object. This is typically used by
    internal API functions so use with caution.
    */
  def toJSON(): js.Any
}

object FieldMaskingSpanQuery {
  @scala.inline
  def apply(
    _type: js.Function0[java.lang.String],
    boost: js.Function1[scala.Double, FieldMaskingSpanQuery],
    field: js.Function1[java.lang.String, FieldMaskingSpanQuery],
    query: js.Function1[Query, FieldMaskingSpanQuery],
    toJSON: js.Function0[js.Any]
  ): FieldMaskingSpanQuery = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("_type")(_type)
    __obj.updateDynamic("boost")(boost)
    __obj.updateDynamic("field")(field)
    __obj.updateDynamic("query")(query)
    __obj.updateDynamic("toJSON")(toJSON)
    __obj.asInstanceOf[FieldMaskingSpanQuery]
  }
}

