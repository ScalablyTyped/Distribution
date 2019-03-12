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
    _type: () => java.lang.String,
    boost: scala.Double => RangeQuery,
    field: java.lang.String => RangeQuery,
    from: js.Any => RangeQuery,
    gt: js.Any => RangeQuery,
    gte: js.Any => RangeQuery,
    includeLower: scala.Boolean => RangeQuery,
    includeUpper: scala.Boolean => RangeQuery,
    lt: js.Any => RangeQuery,
    lte: js.Any => RangeQuery,
    to: js.Any => RangeQuery,
    toJSON: () => js.Any
  ): RangeQuery = {
    val __obj = js.Dynamic.literal(_type = js.Any.fromFunction0(_type), boost = js.Any.fromFunction1(boost), field = js.Any.fromFunction1(field), from = js.Any.fromFunction1(from), gt = js.Any.fromFunction1(gt), gte = js.Any.fromFunction1(gte), includeLower = js.Any.fromFunction1(includeLower), includeUpper = js.Any.fromFunction1(includeUpper), lt = js.Any.fromFunction1(lt), lte = js.Any.fromFunction1(lte), to = js.Any.fromFunction1(to), toJSON = js.Any.fromFunction0(toJSON))
  
    __obj.asInstanceOf[RangeQuery]
  }
}

