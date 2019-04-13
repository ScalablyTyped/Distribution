package typings
package elasticDotJsLib.elasticDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("elastic.js", "TermFilter")
@js.native
class TermFilter protected () extends Filter {
  /*
    Constructs a filter for docs matching the term added to this object.
    */
  def this(fieldName: java.lang.String, term: java.lang.String) = this()
  /*
    The type of ejs object.  For internal use only.
    */
  def _type(): java.lang.String = js.native
  /*
    Enable or disable caching of the filter
    */
  def cache(trueFalse: scala.Boolean): TermFilter = js.native
  /*
    Sets the cache key.
    */
  def cacheKey(key: java.lang.String): TermFilter = js.native
  /*
    Provides access to the filter fieldName used to construct the
    termFilter object.
    */
  def field(f: java.lang.String): TermFilter = js.native
  /*
    Sets the filter name.
    */
  def name(name: java.lang.String): TermFilter = js.native
  /*
    Provides access to the filter term used to construct the
    termFilter object.
    */
  def term(): TermFilter = js.native
  /*
    Returns the filter object.
    */
  def toJSON(): TermFilter = js.native
}

