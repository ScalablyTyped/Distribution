package typings.gapiPeople.gapi.client.people

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchContactsParameters extends StObject {
  
  var pageSize: js.UndefOr[Double] = js.undefined
  
  var query: String
  
  var readMask: String
}
object SearchContactsParameters {
  
  inline def apply(query: String, readMask: String): SearchContactsParameters = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any], readMask = readMask.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchContactsParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SearchContactsParameters] (val x: Self) extends AnyVal {
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setReadMask(value: String): Self = StObject.set(x, "readMask", value.asInstanceOf[js.Any])
  }
}
