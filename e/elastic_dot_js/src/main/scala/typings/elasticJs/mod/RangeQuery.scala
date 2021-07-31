package typings.elasticJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("elastic.js", "RangeQuery")
@js.native
class RangeQuery protected ()
  extends StObject
     with Query {
  /*
    Matches documents with fields that have terms within a certain range.
    */
  def this(field: String) = this()
  
  /*
    The type of ejs object.  For internal use only.
    */
  def _type(): String = js.native
  
  /*
    Sets the boost value of the Query.
    */
  def boost(boost: Double): RangeQuery = js.native
  
  /*
    The field to run the query against.
    */
  def field(f: String): RangeQuery = js.native
  
  /*
    The lower bound. Defaults to start from the first.
    */
  def from(f: js.Any): RangeQuery = js.native
  
  /*
    Greater than value.  Same as setting from to the value, and
    include_lower to false,
    */
  def gt(`val`: js.Any): RangeQuery = js.native
  
  /*
    Greater than or equal to value.  Same as setting from to the value,
    and include_lower to true.
    */
  def gte(`val`: js.Any): RangeQuery = js.native
  
  /*
    Should the first from (if set) be inclusive or not.
    Defaults to true
    */
  def includeLower(trueFalse: Boolean): RangeQuery = js.native
  
  /*
    Should the last to (if set) be inclusive or not. Defaults to true.
    */
  def includeUpper(trueFalse: Boolean): RangeQuery = js.native
  
  /*
    Less than value.  Same as setting to to the value, and include_upper
    to false.
    */
  def lt(`val`: js.Any): RangeQuery = js.native
  
  /*
    Less than or equal to value.  Same as setting to to the value,
    and include_upper to true.
    */
  def lte(`val`: js.Any): RangeQuery = js.native
  
  /*
    The upper bound. Defaults to unbounded.
    */
  def to(t: js.Any): RangeQuery = js.native
  
  /*
    Retrieves the internal query object. This is typically used by
    internal API functions so use with caution.
    */
  def toJSON(): js.Any = js.native
}
