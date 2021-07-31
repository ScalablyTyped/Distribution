package typings.forgeApis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateFolderDataAttributesExtension extends StObject {
  
  var data: js.UndefOr[js.Object] = js.undefined
  
  var `type`: String
  
  var version: String
}
object CreateFolderDataAttributesExtension {
  
  @scala.inline
  def apply(`type`: String, version: String): CreateFolderDataAttributesExtension = {
    val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateFolderDataAttributesExtension]
  }
  
  @scala.inline
  implicit class CreateFolderDataAttributesExtensionMutableBuilder[Self <: CreateFolderDataAttributesExtension] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: js.Object): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
