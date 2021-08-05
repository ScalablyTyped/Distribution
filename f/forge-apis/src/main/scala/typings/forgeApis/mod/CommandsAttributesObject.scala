package typings.forgeApis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommandsAttributesObject extends StObject {
  
  var `extension`: CommandsAttributesExtensionObject
}
object CommandsAttributesObject {
  
  inline def apply(`extension`: CommandsAttributesExtensionObject): CommandsAttributesObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("extension")(`extension`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommandsAttributesObject]
  }
  
  extension [Self <: CommandsAttributesObject](x: Self) {
    
    inline def setExtension(value: CommandsAttributesExtensionObject): Self = StObject.set(x, "extension", value.asInstanceOf[js.Any])
  }
}
