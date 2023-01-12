package typings.gapiPeople.gapi.client.people

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object otherContacts {
  
  trait ListParameters extends StObject {
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var pageToken: js.UndefOr[String] = js.undefined
    
    var readMask: String
    
    var requestSyncToken: js.UndefOr[Boolean] = js.undefined
    
    var syncToken: js.UndefOr[String] = js.undefined
  }
  object ListParameters {
    
    inline def apply(readMask: String): ListParameters = {
      val __obj = js.Dynamic.literal(readMask = readMask.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListParameters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ListParameters] (val x: Self) extends AnyVal {
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
      
      inline def setReadMask(value: String): Self = StObject.set(x, "readMask", value.asInstanceOf[js.Any])
      
      inline def setRequestSyncToken(value: Boolean): Self = StObject.set(x, "requestSyncToken", value.asInstanceOf[js.Any])
      
      inline def setRequestSyncTokenUndefined: Self = StObject.set(x, "requestSyncToken", js.undefined)
      
      inline def setSyncToken(value: String): Self = StObject.set(x, "syncToken", value.asInstanceOf[js.Any])
      
      inline def setSyncTokenUndefined: Self = StObject.set(x, "syncToken", js.undefined)
    }
  }
  
  trait ListResponse extends StObject {
    
    var nextPageToken: js.UndefOr[String] = js.undefined
    
    var nextSyncToken: js.UndefOr[String] = js.undefined
    
    var otherContacts: js.UndefOr[js.Array[Person]] = js.undefined
  }
  object ListResponse {
    
    inline def apply(): ListResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListResponse]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ListResponse] (val x: Self) extends AnyVal {
      
      inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
      
      inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
      
      inline def setNextSyncToken(value: String): Self = StObject.set(x, "nextSyncToken", value.asInstanceOf[js.Any])
      
      inline def setNextSyncTokenUndefined: Self = StObject.set(x, "nextSyncToken", js.undefined)
      
      inline def setOtherContacts(value: js.Array[Person]): Self = StObject.set(x, "otherContacts", value.asInstanceOf[js.Any])
      
      inline def setOtherContactsUndefined: Self = StObject.set(x, "otherContacts", js.undefined)
      
      inline def setOtherContactsVarargs(value: Person*): Self = StObject.set(x, "otherContacts", js.Array(value*))
    }
  }
}
