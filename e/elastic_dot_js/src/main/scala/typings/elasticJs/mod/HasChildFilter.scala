package typings.elasticJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("elastic.js", "HasChildFilter")
@js.native
class HasChildFilter protected () extends Filter {
  /*
    Returns results that have child documents matching the filter.
    */
  def this(qry: js.Object, `type`: String) = this()
  
  /*
    The type of ejs object.  For internal use only.
    */
  def _type(): String = js.native
  
  /*
    Enable or disable caching of the filter
    */
  def cache(trueFalse: Boolean): HasChildFilter = js.native
  
  /*
    Sets the cache key.
    */
  def cacheKey(key: String): HasChildFilter = js.native
  
  /*
    Sets the filter
    */
  def filter(f: Query): HasChildFilter = js.native
  
  /*
    Sets the filter name.
    */
  def name(name: String): HasChildFilter = js.native
  
  /*
    Sets the query
    */
  def query(q: Query): HasChildFilter = js.native
  
  /*
    Sets the scope of the filter.  A scope allows to run facets on the
    same scope name that will work against the child documents.
    */
  def scope(s: String): HasChildFilter = js.native
  
  /*
    Sets the cutoff value to short circuit processing.
    */
  def shortCircuitCutoff(cutoff: Double): HasChildFilter = js.native
  
  /*
    Returns the filter object.
    */
  def toJSON(): HasChildFilter = js.native
  
  /*
    Sets the child document type to search against
    */
  def `type`(t: String): HasChildFilter = js.native
}
