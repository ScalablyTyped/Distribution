package typings.googleapis.cloudresourcemanagerV1Mod.cloudresourcemanagerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaResourceId extends StObject {
  
  /**
    * The type-specific id. This should correspond to the id used in the type-specific API's.
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The resource type this id is for. At present, the valid types are: "organization", "folder", and "project".
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
}
object SchemaResourceId {
  
  inline def apply(): SchemaResourceId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResourceId]
  }
  
  extension [Self <: SchemaResourceId](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
