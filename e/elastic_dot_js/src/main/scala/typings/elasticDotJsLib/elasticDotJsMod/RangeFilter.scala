package typings
package elasticDotJsLib.elasticDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("elastic.js", "RangeFilter")
@js.native
class RangeFilter protected ()
  extends elasticDotJsLib.elasticDotJsMod.elasticjsNs.RangeFilter {
  /*
    Filters documents with fields that have terms within a certain range.
    */
  def this(field: java.lang.String) = this()
  /*
    The type of ejs object.  For internal use only.
    */
  /* CompleteClass */
  override def _type(): java.lang.String = js.native
  /*
    Enable or disable caching of the filter
    */
  /* CompleteClass */
  override def cache(trueFalse: scala.Boolean): elasticDotJsLib.elasticDotJsMod.elasticjsNs.RangeFilter = js.native
  /*
    Sets the cache key.
    */
  /* CompleteClass */
  override def cacheKey(key: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.RangeFilter = js.native
  /*
    The field to run the filter against.
    */
  /* CompleteClass */
  override def field(f: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.RangeFilter = js.native
  /*
    The lower bound. Defaults to start from the first.
    */
  /* CompleteClass */
  override def from(f: js.Any): elasticDotJsLib.elasticDotJsMod.elasticjsNs.RangeFilter = js.native
  /*
    Greater than value.  Same as setting from to the value, and
    include_lower to false,
    */
  /* CompleteClass */
  override def gt(`val`: js.Any): elasticDotJsLib.elasticDotJsMod.elasticjsNs.RangeFilter = js.native
  /*
    Greater than or equal to value.  Same as setting from to the value,
    and include_lower to true.
    */
  /* CompleteClass */
  override def gte(`val`: js.Any): elasticDotJsLib.elasticDotJsMod.elasticjsNs.RangeFilter = js.native
  /*
    Should the first from (if set) be inclusive or not.
    Defaults to true
    */
  /* CompleteClass */
  override def includeLower(trueFalse: scala.Boolean): elasticDotJsLib.elasticDotJsMod.elasticjsNs.RangeFilter = js.native
  /*
    Should the last to (if set) be inclusive or not. Defaults to true.
    */
  /* CompleteClass */
  override def includeUpper(trueFalse: scala.Boolean): elasticDotJsLib.elasticDotJsMod.elasticjsNs.RangeFilter = js.native
  /*
    Less than value.  Same as setting to to the value, and include_upper
    to false.
    */
  /* CompleteClass */
  override def lt(`val`: js.Any): elasticDotJsLib.elasticDotJsMod.elasticjsNs.RangeFilter = js.native
  /*
    Less than or equal to value.  Same as setting to to the value,
    and include_upper to true.
    */
  /* CompleteClass */
  override def lte(`val`: js.Any): elasticDotJsLib.elasticDotJsMod.elasticjsNs.RangeFilter = js.native
  /*
    Sets the filter name.
    */
  /* CompleteClass */
  override def name(name: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.RangeFilter = js.native
  /*
    The upper bound. Defaults to unbounded.
    */
  /* CompleteClass */
  override def to(t: js.Any): elasticDotJsLib.elasticDotJsMod.elasticjsNs.RangeFilter = js.native
  /*
    Returns the filter object.
    */
  /* CompleteClass */
  override def toJSON(): elasticDotJsLib.elasticDotJsMod.elasticjsNs.RangeFilter = js.native
}

