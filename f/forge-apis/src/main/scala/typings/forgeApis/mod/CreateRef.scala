package typings.forgeApis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateRef extends StObject {
  
  var data: js.UndefOr[CreateRefData] = js.undefined
  
  var jsonapi: js.UndefOr[JsonApiVersionJsonapi] = js.undefined
}
object CreateRef {
  
  inline def apply(): CreateRef = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateRef]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateRef] (val x: Self) extends AnyVal {
    
    inline def setData(value: CreateRefData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setJsonapi(value: JsonApiVersionJsonapi): Self = StObject.set(x, "jsonapi", value.asInstanceOf[js.Any])
    
    inline def setJsonapiUndefined: Self = StObject.set(x, "jsonapi", js.undefined)
  }
}
