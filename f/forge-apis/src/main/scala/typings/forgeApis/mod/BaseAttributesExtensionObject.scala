package typings.forgeApis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseAttributesExtensionObject extends StObject {
  
  var data: js.UndefOr[js.Object] = js.undefined
  
  var schema: JsonApiLink
  
  var `type`: String
  
  var version: String
}
object BaseAttributesExtensionObject {
  
  inline def apply(schema: JsonApiLink, `type`: String, version: String): BaseAttributesExtensionObject = {
    val __obj = js.Dynamic.literal(schema = schema.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseAttributesExtensionObject]
  }
  
  extension [Self <: BaseAttributesExtensionObject](x: Self) {
    
    inline def setData(value: js.Object): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setSchema(value: JsonApiLink): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
