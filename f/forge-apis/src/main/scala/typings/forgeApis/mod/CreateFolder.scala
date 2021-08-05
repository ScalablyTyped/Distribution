package typings.forgeApis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateFolder extends StObject {
  
  var data: js.UndefOr[CreateFolderData] = js.undefined
  
  var jsonapi: js.UndefOr[JsonApiVersionJsonapi] = js.undefined
}
object CreateFolder {
  
  inline def apply(): CreateFolder = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateFolder]
  }
  
  extension [Self <: CreateFolder](x: Self) {
    
    inline def setData(value: CreateFolderData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setJsonapi(value: JsonApiVersionJsonapi): Self = StObject.set(x, "jsonapi", value.asInstanceOf[js.Any])
    
    inline def setJsonapiUndefined: Self = StObject.set(x, "jsonapi", js.undefined)
  }
}
