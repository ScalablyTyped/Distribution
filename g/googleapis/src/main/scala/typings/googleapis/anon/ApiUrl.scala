package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApiUrl extends StObject {
  
  var apiUrl: js.UndefOr[String] = js.native
  
  var browserUrl: js.UndefOr[String] = js.native
}
object ApiUrl {
  
  @scala.inline
  def apply(): ApiUrl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApiUrl]
  }
  
  @scala.inline
  implicit class ApiUrlMutableBuilder[Self <: ApiUrl] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApiUrl(value: String): Self = StObject.set(x, "apiUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApiUrlUndefined: Self = StObject.set(x, "apiUrl", js.undefined)
    
    @scala.inline
    def setBrowserUrl(value: String): Self = StObject.set(x, "browserUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrowserUrlUndefined: Self = StObject.set(x, "browserUrl", js.undefined)
  }
}
