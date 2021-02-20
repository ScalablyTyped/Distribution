package typings.forgeApis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CommandsRelationshipsObject extends StObject {
  
  var resources: CommandsRelationshipsResourceObject = js.native
}
object CommandsRelationshipsObject {
  
  @scala.inline
  def apply(resources: CommandsRelationshipsResourceObject): CommandsRelationshipsObject = {
    val __obj = js.Dynamic.literal(resources = resources.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommandsRelationshipsObject]
  }
  
  @scala.inline
  implicit class CommandsRelationshipsObjectMutableBuilder[Self <: CommandsRelationshipsObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResources(value: CommandsRelationshipsResourceObject): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
  }
}
