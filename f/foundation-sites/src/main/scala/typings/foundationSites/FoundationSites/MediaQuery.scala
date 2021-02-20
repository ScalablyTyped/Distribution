package typings.foundationSites.FoundationSites

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MediaQuery extends StObject {
  
  def atLeast(size: String): Boolean = js.native
  
  var current: String = js.native
  
  def get(size: String): String = js.native
  
  var queries: js.Array[String] = js.native
}
object MediaQuery {
  
  @scala.inline
  def apply(atLeast: String => Boolean, current: String, get: String => String, queries: js.Array[String]): MediaQuery = {
    val __obj = js.Dynamic.literal(atLeast = js.Any.fromFunction1(atLeast), current = current.asInstanceOf[js.Any], get = js.Any.fromFunction1(get), queries = queries.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaQuery]
  }
  
  @scala.inline
  implicit class MediaQueryMutableBuilder[Self <: MediaQuery] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAtLeast(value: String => Boolean): Self = StObject.set(x, "atLeast", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCurrent(value: String): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGet(value: String => String): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
    
    @scala.inline
    def setQueries(value: js.Array[String]): Self = StObject.set(x, "queries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueriesVarargs(value: String*): Self = StObject.set(x, "queries", js.Array(value :_*))
  }
}
