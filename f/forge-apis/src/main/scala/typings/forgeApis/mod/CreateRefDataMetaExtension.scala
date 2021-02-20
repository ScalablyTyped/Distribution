package typings.forgeApis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateRefDataMetaExtension extends StObject {
  
  var data: js.UndefOr[js.Object] = js.native
  
  var `type`: String = js.native
  
  var version: String = js.native
}
object CreateRefDataMetaExtension {
  
  @scala.inline
  def apply(`type`: String, version: String): CreateRefDataMetaExtension = {
    val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateRefDataMetaExtension]
  }
  
  @scala.inline
  implicit class CreateRefDataMetaExtensionMutableBuilder[Self <: CreateRefDataMetaExtension] (val x: Self) extends AnyVal {
    
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
