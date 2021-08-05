package typings.foundationSites.FoundationSites

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaQuery extends StObject {
  
  def atLeast(size: String): Boolean
  
  var current: String
  
  def get(size: String): String
  
  var queries: js.Array[String]
}
object MediaQuery {
  
  inline def apply(atLeast: String => Boolean, current: String, get: String => String, queries: js.Array[String]): MediaQuery = {
    val __obj = js.Dynamic.literal(atLeast = js.Any.fromFunction1(atLeast), current = current.asInstanceOf[js.Any], get = js.Any.fromFunction1(get), queries = queries.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaQuery]
  }
  
  extension [Self <: MediaQuery](x: Self) {
    
    inline def setAtLeast(value: String => Boolean): Self = StObject.set(x, "atLeast", js.Any.fromFunction1(value))
    
    inline def setCurrent(value: String): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
    
    inline def setGet(value: String => String): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
    
    inline def setQueries(value: js.Array[String]): Self = StObject.set(x, "queries", value.asInstanceOf[js.Any])
    
    inline def setQueriesVarargs(value: String*): Self = StObject.set(x, "queries", js.Array(value :_*))
  }
}
