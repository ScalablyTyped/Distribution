package typings.forgeApis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateStorage extends StObject {
  
  var data: js.UndefOr[CreateStorageData] = js.undefined
  
  var jsonapi: js.UndefOr[JsonApiVersionJsonapi] = js.undefined
}
object CreateStorage {
  
  inline def apply(): CreateStorage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateStorage]
  }
  
  extension [Self <: CreateStorage](x: Self) {
    
    inline def setData(value: CreateStorageData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setJsonapi(value: JsonApiVersionJsonapi): Self = StObject.set(x, "jsonapi", value.asInstanceOf[js.Any])
    
    inline def setJsonapiUndefined: Self = StObject.set(x, "jsonapi", js.undefined)
  }
}
