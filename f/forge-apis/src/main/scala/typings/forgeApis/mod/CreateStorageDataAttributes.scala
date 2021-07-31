package typings.forgeApis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateStorageDataAttributes extends StObject {
  
  var `extension`: js.UndefOr[BaseAttributesExtensionObject] = js.undefined
  
  var name: String
}
object CreateStorageDataAttributes {
  
  @scala.inline
  def apply(name: String): CreateStorageDataAttributes = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateStorageDataAttributes]
  }
  
  @scala.inline
  implicit class CreateStorageDataAttributesMutableBuilder[Self <: CreateStorageDataAttributes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExtension(value: BaseAttributesExtensionObject): Self = StObject.set(x, "extension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtensionUndefined: Self = StObject.set(x, "extension", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
