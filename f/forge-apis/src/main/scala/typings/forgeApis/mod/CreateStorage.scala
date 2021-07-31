package typings.forgeApis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateStorage extends StObject {
  
  var data: js.UndefOr[CreateStorageData] = js.undefined
  
  var jsonapi: js.UndefOr[JsonApiVersionJsonapi] = js.undefined
}
object CreateStorage {
  
  @scala.inline
  def apply(): CreateStorage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateStorage]
  }
  
  @scala.inline
  implicit class CreateStorageMutableBuilder[Self <: CreateStorage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: CreateStorageData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setJsonapi(value: JsonApiVersionJsonapi): Self = StObject.set(x, "jsonapi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJsonapiUndefined: Self = StObject.set(x, "jsonapi", js.undefined)
  }
}
