package typings.elasticJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("elastic.js", "RegexpFilter")
@js.native
class RegexpFilter protected () extends Filter {
  /*
    Matches documents that have fields matching a regular expression.
    */
  def this(field: String, value: String) = this()
  /*
    The type of ejs object.  For internal use only.
    */
  def _type(): String = js.native
  /*
    Enable or disable caching of the filter
    */
  def cache(trueFalse: Boolean): RegexpFilter = js.native
  /*
    Sets the cache key.
    */
  def cacheKey(key: String): RegexpFilter = js.native
  /*
    The field to run the filter against.
    */
  def field(f: String): RegexpFilter = js.native
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
  def flags(f: String): RegexpFilter = js.native
  /*
    The regex flags to use as a numeric value.  Advanced use only,
    it is probably better to stick with the flags option.
    */
  def flagsValue(v: String): RegexpFilter = js.native
  /*
    Sets the filter name.
    */
  def name(name: String): RegexpFilter = js.native
  /*
    Returns the filter object.
    */
  def toJSON(): RegexpFilter = js.native
  /*
    The regexp value.
    */
  def value(p: String): RegexpFilter = js.native
}

