package typings.elasticJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("elastic.js", "QueryFilter")
@js.native
class QueryFilter protected ()
  extends StObject
     with Filter {
  /*
    Filters documents matching the wrapped query.
    */
  def this(qry: js.Object) = this()
  
  /*
    The type of ejs object.  For internal use only.
    */
  def _type(): String = js.native
  
  /*
    Enable or disable caching of the filter
    */
  def cache(trueFalse: Boolean): QueryFilter = js.native
  
  /*
    Sets the cache key.
    */
  def cacheKey(key: String): QueryFilter = js.native
  
  /*
    Sets the filter name.
    */
  def name(name: String): QueryFilter = js.native
  
  /*
    Sets the query
    */
  def query(q: js.Object): QueryFilter = js.native
  
  /*
    Returns the filter object.
    */
  def toJSON(): QueryFilter = js.native
}
