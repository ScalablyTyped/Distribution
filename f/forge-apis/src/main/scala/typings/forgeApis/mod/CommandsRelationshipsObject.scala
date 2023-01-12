package typings.forgeApis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommandsRelationshipsObject extends StObject {
  
  var resources: CommandsRelationshipsResourceObject
}
object CommandsRelationshipsObject {
  
  inline def apply(resources: CommandsRelationshipsResourceObject): CommandsRelationshipsObject = {
    val __obj = js.Dynamic.literal(resources = resources.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommandsRelationshipsObject]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CommandsRelationshipsObject] (val x: Self) extends AnyVal {
    
    inline def setResources(value: CommandsRelationshipsResourceObject): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
  }
}
