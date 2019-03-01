package typings
package elasticDotJsLib.elasticDotJsMod.elasticjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RangeQuery extends Query {
  /*
    The type of ejs object.  For internal use only.
    */
  def _type(): java.lang.String
  /*
    Sets the boost value of the Query.
    */
  def boost(boost: scala.Double): RangeQuery
  /*
    The field to run the query against.
    */
  def field(f: java.lang.String): RangeQuery
  /*
    The lower bound. Defaults to start from the first.
    */
  def from(f: js.Any): RangeQuery
  /*
    Greater than value.  Same as setting from to the value, and
    include_lower to false,
    */
  def gt(`val`: js.Any): RangeQuery
  /*
    Greater than or equal to value.  Same as setting from to the value,
    and include_lower to true.
    */
  def gte(`val`: js.Any): RangeQuery
  /*
    Should the first from (if set) be inclusive or not.
    Defaults to true
    */
  def includeLower(trueFalse: scala.Boolean): RangeQuery
  /*
    Should the last to (if set) be inclusive or not. Defaults to true.
    */
  def includeUpper(trueFalse: scala.Boolean): RangeQuery
  /*
    Less than value.  Same as setting to to the value, and include_upper
    to false.
    */
  def lt(`val`: js.Any): RangeQuery
  /*
    Less than or equal to value.  Same as setting to to the value,
    and include_upper to true.
    */
  def lte(`val`: js.Any): RangeQuery
  /*
    The upper bound. Defaults to unbounded.
    */
  def to(t: js.Any): RangeQuery
  /*
    Retrieves the internal query object. This is typically used by
    internal API functions so use with caution.
    */
  def toJSON(): js.Any
}

object RangeQuery {
  @scala.inline
  def apply(
    _type: js.Function0[java.lang.String],
    boost: js.Function1[scala.Double, RangeQuery],
    field: js.Function1[java.lang.String, RangeQuery],
    from: js.Function1[js.Any, RangeQuery],
    gt: js.Function1[js.Any, RangeQuery],
    gte: js.Function1[js.Any, RangeQuery],
    includeLower: js.Function1[scala.Boolean, RangeQuery],
    includeUpper: js.Function1[scala.Boolean, RangeQuery],
    lt: js.Function1[js.Any, RangeQuery],
    lte: js.Function1[js.Any, RangeQuery],
    to: js.Function1[js.Any, RangeQuery],
    toJSON: js.Function0[js.Any]
  ): RangeQuery = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("_type")(_type)
    __obj.updateDynamic("boost")(boost)
    __obj.updateDynamic("field")(field)
    __obj.updateDynamic("from")(from)
    __obj.updateDynamic("gt")(gt)
    __obj.updateDynamic("gte")(gte)
    __obj.updateDynamic("includeLower")(includeLower)
    __obj.updateDynamic("includeUpper")(includeUpper)
    __obj.updateDynamic("lt")(lt)
    __obj.updateDynamic("lte")(lte)
    __obj.updateDynamic("to")(to)
    __obj.updateDynamic("toJSON")(toJSON)
    __obj.asInstanceOf[RangeQuery]
  }
}

