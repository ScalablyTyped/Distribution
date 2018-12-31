package typings
package elasticDotJsLib.elasticDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("elastic.js", "RangeQuery")
@js.native
class RangeQuery protected ()
  extends elasticDotJsLib.elasticDotJsMod.elasticjsNs.RangeQuery {
  /*
    Matches documents with fields that have terms within a certain range.
    */
  def this(field: java.lang.String) = this()
  /*
    The type of ejs object.  For internal use only.
    */
  /* CompleteClass */
  override def _type(): java.lang.String = js.native
  /*
    Sets the boost value of the Query.
    */
  /* CompleteClass */
  override def boost(boost: scala.Double): elasticDotJsLib.elasticDotJsMod.elasticjsNs.RangeQuery = js.native
  /*
    The field to run the query against.
    */
  /* CompleteClass */
  override def field(f: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.RangeQuery = js.native
  /*
    The lower bound. Defaults to start from the first.
    */
  /* CompleteClass */
  override def from(f: js.Any): elasticDotJsLib.elasticDotJsMod.elasticjsNs.RangeQuery = js.native
  /*
    Greater than value.  Same as setting from to the value, and
    include_lower to false,
    */
  /* CompleteClass */
  override def gt(`val`: js.Any): elasticDotJsLib.elasticDotJsMod.elasticjsNs.RangeQuery = js.native
  /*
    Greater than or equal to value.  Same as setting from to the value,
    and include_lower to true.
    */
  /* CompleteClass */
  override def gte(`val`: js.Any): elasticDotJsLib.elasticDotJsMod.elasticjsNs.RangeQuery = js.native
  /*
    Should the first from (if set) be inclusive or not.
    Defaults to true
    */
  /* CompleteClass */
  override def includeLower(trueFalse: scala.Boolean): elasticDotJsLib.elasticDotJsMod.elasticjsNs.RangeQuery = js.native
  /*
    Should the last to (if set) be inclusive or not. Defaults to true.
    */
  /* CompleteClass */
  override def includeUpper(trueFalse: scala.Boolean): elasticDotJsLib.elasticDotJsMod.elasticjsNs.RangeQuery = js.native
  /*
    Less than value.  Same as setting to to the value, and include_upper
    to false.
    */
  /* CompleteClass */
  override def lt(`val`: js.Any): elasticDotJsLib.elasticDotJsMod.elasticjsNs.RangeQuery = js.native
  /*
    Less than or equal to value.  Same as setting to to the value,
    and include_upper to true.
    */
  /* CompleteClass */
  override def lte(`val`: js.Any): elasticDotJsLib.elasticDotJsMod.elasticjsNs.RangeQuery = js.native
  /*
    The upper bound. Defaults to unbounded.
    */
  /* CompleteClass */
  override def to(t: js.Any): elasticDotJsLib.elasticDotJsMod.elasticjsNs.RangeQuery = js.native
  /*
    Retrieves the internal query object. This is typically used by
    internal API functions so use with caution.
    */
  /* CompleteClass */
  override def toJSON(): js.Any = js.native
}

