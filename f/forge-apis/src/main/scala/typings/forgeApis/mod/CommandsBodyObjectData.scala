package typings.forgeApis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CommandsBodyObjectData extends StObject {
  
  var attributes: CommandsAttributesObject = js.native
  
  var relationships: CommandsRelationshipsObject = js.native
  
  var `type`: String = js.native
}
object CommandsBodyObjectData {
  
  @scala.inline
  def apply(attributes: CommandsAttributesObject, relationships: CommandsRelationshipsObject, `type`: String): CommandsBodyObjectData = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], relationships = relationships.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommandsBodyObjectData]
  }
  
  @scala.inline
  implicit class CommandsBodyObjectDataMutableBuilder[Self <: CommandsBodyObjectData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributes(value: CommandsAttributesObject): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelationships(value: CommandsRelationshipsObject): Self = StObject.set(x, "relationships", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
