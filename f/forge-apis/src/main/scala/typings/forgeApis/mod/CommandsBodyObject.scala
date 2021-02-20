package typings.forgeApis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CommandsBodyObject extends StObject {
  
  var data: CommandsBodyObjectData = js.native
  
  var included: js.UndefOr[js.Object] = js.native
  
  var jsonapi: JsonApiVersionJsonapi = js.native
}
object CommandsBodyObject {
  
  @scala.inline
  def apply(data: CommandsBodyObjectData, jsonapi: JsonApiVersionJsonapi): CommandsBodyObject = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], jsonapi = jsonapi.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommandsBodyObject]
  }
  
  @scala.inline
  implicit class CommandsBodyObjectMutableBuilder[Self <: CommandsBodyObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: CommandsBodyObjectData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncluded(value: js.Object): Self = StObject.set(x, "included", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludedUndefined: Self = StObject.set(x, "included", js.undefined)
    
    @scala.inline
    def setJsonapi(value: JsonApiVersionJsonapi): Self = StObject.set(x, "jsonapi", value.asInstanceOf[js.Any])
  }
}
