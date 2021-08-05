package typings.forgeApis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateFolderDataAttributes extends StObject {
  
  var `extension`: BaseAttributesExtensionObject
  
  var name: String
}
object CreateFolderDataAttributes {
  
  inline def apply(`extension`: BaseAttributesExtensionObject, name: String): CreateFolderDataAttributes = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("extension")(`extension`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateFolderDataAttributes]
  }
  
  extension [Self <: CreateFolderDataAttributes](x: Self) {
    
    inline def setExtension(value: BaseAttributesExtensionObject): Self = StObject.set(x, "extension", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
