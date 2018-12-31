package typings
package elasticDotJsLib.elasticDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("elastic.js", "TermFilter")
@js.native
class TermFilter protected ()
  extends elasticDotJsLib.elasticDotJsMod.elasticjsNs.TermFilter {
  /*
    Constructs a filter for docs matching the term added to this object.
    */
  def this(fieldName: java.lang.String, term: java.lang.String) = this()
  /*
    The type of ejs object.  For internal use only.
    */
  /* CompleteClass */
  override def _type(): java.lang.String = js.native
  /*
    Enable or disable caching of the filter
    */
  /* CompleteClass */
  override def cache(trueFalse: scala.Boolean): elasticDotJsLib.elasticDotJsMod.elasticjsNs.TermFilter = js.native
  /*
    Sets the cache key.
    */
  /* CompleteClass */
  override def cacheKey(key: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.TermFilter = js.native
  /*
    Provides access to the filter fieldName used to construct the
    termFilter object.
    */
  /* CompleteClass */
  override def field(f: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.TermFilter = js.native
  /*
    Sets the filter name.
    */
  /* CompleteClass */
  override def name(name: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.TermFilter = js.native
  /*
    Provides access to the filter term used to construct the
    termFilter object.
    */
  /* CompleteClass */
  override def term(): elasticDotJsLib.elasticDotJsMod.elasticjsNs.TermFilter = js.native
  /*
    Returns the filter object.
    */
  /* CompleteClass */
  override def toJSON(): elasticDotJsLib.elasticDotJsMod.elasticjsNs.TermFilter = js.native
}

