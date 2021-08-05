package typings.forgeApis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateFolderDataRelationshipsParentData extends StObject {
  
  var id: String
  
  var `type`: String
}
object CreateFolderDataRelationshipsParentData {
  
  inline def apply(id: String, `type`: String): CreateFolderDataRelationshipsParentData = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateFolderDataRelationshipsParentData]
  }
  
  extension [Self <: CreateFolderDataRelationshipsParentData](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
