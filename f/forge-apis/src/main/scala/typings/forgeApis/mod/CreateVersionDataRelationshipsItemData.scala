package typings.forgeApis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateVersionDataRelationshipsItemData extends StObject {
  
  var id: String
  
  var `type`: String
}
object CreateVersionDataRelationshipsItemData {
  
  inline def apply(id: String, `type`: String): CreateVersionDataRelationshipsItemData = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateVersionDataRelationshipsItemData]
  }
  
  extension [Self <: CreateVersionDataRelationshipsItemData](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
