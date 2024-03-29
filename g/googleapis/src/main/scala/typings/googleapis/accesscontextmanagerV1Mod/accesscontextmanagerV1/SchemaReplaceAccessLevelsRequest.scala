package typings.googleapis.accesscontextmanagerV1Mod.accesscontextmanagerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaReplaceAccessLevelsRequest extends StObject {
  
  /**
    * Required. The desired Access Levels that should replace all existing Access Levels in the Access Policy.
    */
  var accessLevels: js.UndefOr[js.Array[SchemaAccessLevel]] = js.undefined
  
  /**
    * Optional. The etag for the version of the Access Policy that this replace operation is to be performed on. If, at the time of replace, the etag for the Access Policy stored in Access Context Manager is different from the specified etag, then the replace operation will not be performed and the call will fail. This field is not required. If etag is not provided, the operation will be performed as if a valid etag is provided.
    */
  var etag: js.UndefOr[String | Null] = js.undefined
}
object SchemaReplaceAccessLevelsRequest {
  
  inline def apply(): SchemaReplaceAccessLevelsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReplaceAccessLevelsRequest]
  }
  
  extension [Self <: SchemaReplaceAccessLevelsRequest](x: Self) {
    
    inline def setAccessLevels(value: js.Array[SchemaAccessLevel]): Self = StObject.set(x, "accessLevels", value.asInstanceOf[js.Any])
    
    inline def setAccessLevelsUndefined: Self = StObject.set(x, "accessLevels", js.undefined)
    
    inline def setAccessLevelsVarargs(value: SchemaAccessLevel*): Self = StObject.set(x, "accessLevels", js.Array(value*))
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagNull: Self = StObject.set(x, "etag", null)
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
  }
}
