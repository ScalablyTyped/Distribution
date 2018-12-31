package typings
package elasticDotJsLib.elasticDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("elastic.js", "RegexpFilter")
@js.native
class RegexpFilter protected ()
  extends elasticDotJsLib.elasticDotJsMod.elasticjsNs.RegexpFilter {
  /*
    Matches documents that have fields matching a regular expression.
    */
  def this(field: java.lang.String, value: java.lang.String) = this()
  /*
    The type of ejs object.  For internal use only.
    */
  /* CompleteClass */
  override def _type(): java.lang.String = js.native
  /*
    Enable or disable caching of the filter
    */
  /* CompleteClass */
  override def cache(trueFalse: scala.Boolean): elasticDotJsLib.elasticDotJsMod.elasticjsNs.RegexpFilter = js.native
  /*
    Sets the cache key.
    */
  /* CompleteClass */
  override def cacheKey(key: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.RegexpFilter = js.native
  /*
    The field to run the filter against.
    */
  /* CompleteClass */
  override def field(f: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.RegexpFilter = js.native
  /*
    The regex flags to use.  Valid flags are:
    INTERSECTION - Support for intersection notation
    COMPLEMENT - Support for complement notation
    EMPTY - Support for the empty language symbol: #
    ANYSTRING - Support for the any string symbol: @
    INTERVAL - Support for numerical interval notation:
    NONE - Disable support for all syntax options
    ALL - Enables support for all syntax options
    Use multiple flags by separating with a "|" character.  Example:
    INTERSECTION|COMPLEMENT|EMPTY
    */
  /* CompleteClass */
  override def flags(f: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.RegexpFilter = js.native
  /*
    The regex flags to use as a numeric value.  Advanced use only,
    it is probably better to stick with the flags option.
    */
  /* CompleteClass */
  override def flagsValue(v: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.RegexpFilter = js.native
  /*
    Sets the filter name.
    */
  /* CompleteClass */
  override def name(name: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.RegexpFilter = js.native
  /*
    Returns the filter object.
    */
  /* CompleteClass */
  override def toJSON(): elasticDotJsLib.elasticDotJsMod.elasticjsNs.RegexpFilter = js.native
  /*
    The regexp value.
    */
  /* CompleteClass */
  override def value(p: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.RegexpFilter = js.native
}

