package typings.forgeApis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CommandsAttributesObject extends StObject {
  
  var extension: CommandsAttributesExtensionObject = js.native
}
object CommandsAttributesObject {
  
  @scala.inline
  def apply(extension: CommandsAttributesExtensionObject): CommandsAttributesObject = {
    val __obj = js.Dynamic.literal(extension = extension.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommandsAttributesObject]
  }
  
  @scala.inline
  implicit class CommandsAttributesObjectMutableBuilder[Self <: CommandsAttributesObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExtension(value: CommandsAttributesExtensionObject): Self = StObject.set(x, "extension", value.asInstanceOf[js.Any])
  }
}
