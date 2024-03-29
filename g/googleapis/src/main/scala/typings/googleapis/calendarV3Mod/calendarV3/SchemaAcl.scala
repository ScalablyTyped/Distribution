package typings.googleapis.calendarV3Mod.calendarV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAcl extends StObject {
  
  /**
    * ETag of the collection.
    */
  var etag: js.UndefOr[String | Null] = js.undefined
  
  /**
    * List of rules on the access control list.
    */
  var items: js.UndefOr[js.Array[SchemaAclRule]] = js.undefined
  
  /**
    * Type of the collection ("calendar#acl").
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Token used to access the next page of this result. Omitted if no further results are available, in which case nextSyncToken is provided.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Token used at a later point in time to retrieve only the entries that have changed since this result was returned. Omitted if further results are available, in which case nextPageToken is provided.
    */
  var nextSyncToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaAcl {
  
  inline def apply(): SchemaAcl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAcl]
  }
  
  extension [Self <: SchemaAcl](x: Self) {
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagNull: Self = StObject.set(x, "etag", null)
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setItems(value: js.Array[SchemaAclRule]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: SchemaAclRule*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setNextSyncToken(value: String): Self = StObject.set(x, "nextSyncToken", value.asInstanceOf[js.Any])
    
    inline def setNextSyncTokenNull: Self = StObject.set(x, "nextSyncToken", null)
    
    inline def setNextSyncTokenUndefined: Self = StObject.set(x, "nextSyncToken", js.undefined)
  }
}
