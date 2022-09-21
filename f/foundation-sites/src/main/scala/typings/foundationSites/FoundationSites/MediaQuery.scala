package typings.foundationSites.FoundationSites

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaQuery extends StObject {
  
  def atLeast(size: String): Boolean
  
  var current: String
  
  def get(size: String): String | Null
  
  def is(size: String): Boolean
  
  def next(size: String): String | Null
  
  def only(size: String): Boolean
  
  var queries: js.Array[Any]
  
  def upTo(size: String): Boolean
}
object MediaQuery {
  
  inline def apply(
    atLeast: String => Boolean,
    current: String,
    get: String => String | Null,
    is: String => Boolean,
    next: String => String | Null,
    only: String => Boolean,
    queries: js.Array[Any],
    upTo: String => Boolean
  ): MediaQuery = {
    val __obj = js.Dynamic.literal(atLeast = js.Any.fromFunction1(atLeast), current = current.asInstanceOf[js.Any], get = js.Any.fromFunction1(get), is = js.Any.fromFunction1(is), next = js.Any.fromFunction1(next), only = js.Any.fromFunction1(only), queries = queries.asInstanceOf[js.Any], upTo = js.Any.fromFunction1(upTo))
    __obj.asInstanceOf[MediaQuery]
  }
  
  extension [Self <: MediaQuery](x: Self) {
    
    inline def setAtLeast(value: String => Boolean): Self = StObject.set(x, "atLeast", js.Any.fromFunction1(value))
    
    inline def setCurrent(value: String): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
    
    inline def setGet(value: String => String | Null): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
    
    inline def setIs(value: String => Boolean): Self = StObject.set(x, "is", js.Any.fromFunction1(value))
    
    inline def setNext(value: String => String | Null): Self = StObject.set(x, "next", js.Any.fromFunction1(value))
    
    inline def setOnly(value: String => Boolean): Self = StObject.set(x, "only", js.Any.fromFunction1(value))
    
    inline def setQueries(value: js.Array[Any]): Self = StObject.set(x, "queries", value.asInstanceOf[js.Any])
    
    inline def setQueriesVarargs(value: Any*): Self = StObject.set(x, "queries", js.Array(value*))
    
    inline def setUpTo(value: String => Boolean): Self = StObject.set(x, "upTo", js.Any.fromFunction1(value))
  }
}
