package typings.forgeApis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateVersion extends StObject {
  
  var data: js.UndefOr[CreateVersionData] = js.undefined
  
  var jsonapi: js.UndefOr[JsonApiVersionJsonapi] = js.undefined
}
object CreateVersion {
  
  inline def apply(): CreateVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateVersion]
  }
  
  extension [Self <: CreateVersion](x: Self) {
    
    inline def setData(value: CreateVersionData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setJsonapi(value: JsonApiVersionJsonapi): Self = StObject.set(x, "jsonapi", value.asInstanceOf[js.Any])
    
    inline def setJsonapiUndefined: Self = StObject.set(x, "jsonapi", js.undefined)
  }
}
