package typings.gapiPeople.gapi.client.people

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchContactsResponse extends StObject {
  
  var results: js.UndefOr[js.Array[SearchContactsResult]] = js.undefined
}
object SearchContactsResponse {
  
  inline def apply(): SearchContactsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchContactsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SearchContactsResponse] (val x: Self) extends AnyVal {
    
    inline def setResults(value: js.Array[SearchContactsResult]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    inline def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
    
    inline def setResultsVarargs(value: SearchContactsResult*): Self = StObject.set(x, "results", js.Array(value*))
  }
}
