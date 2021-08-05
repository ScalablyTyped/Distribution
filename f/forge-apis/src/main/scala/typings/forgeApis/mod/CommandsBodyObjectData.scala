package typings.forgeApis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommandsBodyObjectData extends StObject {
  
  var attributes: CommandsAttributesObject
  
  var relationships: CommandsRelationshipsObject
  
  var `type`: String
}
object CommandsBodyObjectData {
  
  inline def apply(attributes: CommandsAttributesObject, relationships: CommandsRelationshipsObject, `type`: String): CommandsBodyObjectData = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], relationships = relationships.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommandsBodyObjectData]
  }
  
  extension [Self <: CommandsBodyObjectData](x: Self) {
    
    inline def setAttributes(value: CommandsAttributesObject): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setRelationships(value: CommandsRelationshipsObject): Self = StObject.set(x, "relationships", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
