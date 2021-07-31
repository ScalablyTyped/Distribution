package typings.elasticJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("elastic.js", "TermFilter")
@js.native
class TermFilter protected ()
  extends StObject
     with Filter {
  /*
    Constructs a filter for docs matching the term added to this object.
    */
  def this(fieldName: String, term: String) = this()
  
  /*
    The type of ejs object.  For internal use only.
    */
  def _type(): String = js.native
  
  /*
    Enable or disable caching of the filter
    */
  def cache(trueFalse: Boolean): TermFilter = js.native
  
  /*
    Sets the cache key.
    */
  def cacheKey(key: String): TermFilter = js.native
  
  /*
    Provides access to the filter fieldName used to construct the
    termFilter object.
    */
  def field(f: String): TermFilter = js.native
  
  /*
    Sets the filter name.
    */
  def name(name: String): TermFilter = js.native
  
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
