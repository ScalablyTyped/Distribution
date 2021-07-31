package typings.forgeApis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateFolder extends StObject {
  
  var data: js.UndefOr[CreateFolderData] = js.undefined
  
  var jsonapi: js.UndefOr[JsonApiVersionJsonapi] = js.undefined
}
object CreateFolder {
  
  @scala.inline
  def apply(): CreateFolder = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateFolder]
  }
  
  @scala.inline
  implicit class CreateFolderMutableBuilder[Self <: CreateFolder] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: CreateFolderData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setJsonapi(value: JsonApiVersionJsonapi): Self = StObject.set(x, "jsonapi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJsonapiUndefined: Self = StObject.set(x, "jsonapi", js.undefined)
  }
}
