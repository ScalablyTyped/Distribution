package typings.forgeApis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateVersion extends StObject {
  
  var data: js.UndefOr[CreateVersionData] = js.undefined
  
  var jsonapi: js.UndefOr[JsonApiVersionJsonapi] = js.undefined
}
object CreateVersion {
  
  @scala.inline
  def apply(): CreateVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateVersion]
  }
  
  @scala.inline
  implicit class CreateVersionMutableBuilder[Self <: CreateVersion] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: CreateVersionData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setJsonapi(value: JsonApiVersionJsonapi): Self = StObject.set(x, "jsonapi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJsonapiUndefined: Self = StObject.set(x, "jsonapi", js.undefined)
  }
}
