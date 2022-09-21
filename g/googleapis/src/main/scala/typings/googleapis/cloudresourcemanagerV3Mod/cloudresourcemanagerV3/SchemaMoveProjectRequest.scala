package typings.googleapis.cloudresourcemanagerV3Mod.cloudresourcemanagerV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaMoveProjectRequest extends StObject {
  
  /**
    * Required. The new parent to move the Project under.
    */
  var destinationParent: js.UndefOr[String | Null] = js.undefined
}
object SchemaMoveProjectRequest {
  
  inline def apply(): SchemaMoveProjectRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMoveProjectRequest]
  }
  
  extension [Self <: SchemaMoveProjectRequest](x: Self) {
    
    inline def setDestinationParent(value: String): Self = StObject.set(x, "destinationParent", value.asInstanceOf[js.Any])
    
    inline def setDestinationParentNull: Self = StObject.set(x, "destinationParent", null)
    
    inline def setDestinationParentUndefined: Self = StObject.set(x, "destinationParent", js.undefined)
  }
}
