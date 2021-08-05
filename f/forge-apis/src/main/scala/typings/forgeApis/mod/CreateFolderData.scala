package typings.forgeApis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateFolderData extends StObject {
  
  var attributes: js.UndefOr[CreateFolderDataAttributes] = js.undefined
  
  var relationships: js.UndefOr[CreateFolderDataRelationships] = js.undefined
  
  var `type`: String
}
object CreateFolderData {
  
  inline def apply(`type`: String): CreateFolderData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateFolderData]
  }
  
  extension [Self <: CreateFolderData](x: Self) {
    
    inline def setAttributes(value: CreateFolderDataAttributes): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    inline def setRelationships(value: CreateFolderDataRelationships): Self = StObject.set(x, "relationships", value.asInstanceOf[js.Any])
    
    inline def setRelationshipsUndefined: Self = StObject.set(x, "relationships", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
