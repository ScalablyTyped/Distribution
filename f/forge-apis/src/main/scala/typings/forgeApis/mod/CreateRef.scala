package typings.forgeApis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateRef extends StObject {
  
  var data: js.UndefOr[CreateRefData] = js.native
  
  var jsonapi: js.UndefOr[JsonApiVersionJsonapi] = js.native
}
object CreateRef {
  
  @scala.inline
  def apply(): CreateRef = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateRef]
  }
  
  @scala.inline
  implicit class CreateRefMutableBuilder[Self <: CreateRef] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: CreateRefData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setJsonapi(value: JsonApiVersionJsonapi): Self = StObject.set(x, "jsonapi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJsonapiUndefined: Self = StObject.set(x, "jsonapi", js.undefined)
  }
}
