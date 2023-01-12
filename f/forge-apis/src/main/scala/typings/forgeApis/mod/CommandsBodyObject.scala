package typings.forgeApis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommandsBodyObject extends StObject {
  
  var data: CommandsBodyObjectData
  
  var included: js.UndefOr[js.Object] = js.undefined
  
  var jsonapi: JsonApiVersionJsonapi
}
object CommandsBodyObject {
  
  inline def apply(data: CommandsBodyObjectData, jsonapi: JsonApiVersionJsonapi): CommandsBodyObject = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], jsonapi = jsonapi.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommandsBodyObject]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CommandsBodyObject] (val x: Self) extends AnyVal {
    
    inline def setData(value: CommandsBodyObjectData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setIncluded(value: js.Object): Self = StObject.set(x, "included", value.asInstanceOf[js.Any])
    
    inline def setIncludedUndefined: Self = StObject.set(x, "included", js.undefined)
    
    inline def setJsonapi(value: JsonApiVersionJsonapi): Self = StObject.set(x, "jsonapi", value.asInstanceOf[js.Any])
  }
}
