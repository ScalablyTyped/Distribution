package typings.forgeApis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateFolderDataAttributes extends StObject {
  
  var extension: BaseAttributesExtensionObject = js.native
  
  var name: String = js.native
}
object CreateFolderDataAttributes {
  
  @scala.inline
  def apply(extension: BaseAttributesExtensionObject, name: String): CreateFolderDataAttributes = {
    val __obj = js.Dynamic.literal(extension = extension.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateFolderDataAttributes]
  }
  
  @scala.inline
  implicit class CreateFolderDataAttributesMutableBuilder[Self <: CreateFolderDataAttributes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExtension(value: BaseAttributesExtensionObject): Self = StObject.set(x, "extension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
