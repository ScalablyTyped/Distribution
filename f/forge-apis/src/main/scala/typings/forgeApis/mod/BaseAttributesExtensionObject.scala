package typings.forgeApis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseAttributesExtensionObject extends StObject {
  
  var data: js.UndefOr[js.Object] = js.native
  
  var schema: JsonApiLink = js.native
  
  var `type`: String = js.native
  
  var version: String = js.native
}
object BaseAttributesExtensionObject {
  
  @scala.inline
  def apply(schema: JsonApiLink, `type`: String, version: String): BaseAttributesExtensionObject = {
    val __obj = js.Dynamic.literal(schema = schema.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseAttributesExtensionObject]
  }
  
  @scala.inline
  implicit class BaseAttributesExtensionObjectMutableBuilder[Self <: BaseAttributesExtensionObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: js.Object): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setSchema(value: JsonApiLink): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
