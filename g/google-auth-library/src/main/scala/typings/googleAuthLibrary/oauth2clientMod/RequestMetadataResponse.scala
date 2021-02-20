package typings.googleAuthLibrary.oauth2clientMod

import typings.gaxios.commonMod.GaxiosResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RequestMetadataResponse extends StObject {
  
  var headers: Headers = js.native
  
  var res: js.UndefOr[GaxiosResponse[Unit] | Null] = js.native
}
object RequestMetadataResponse {
  
  @scala.inline
  def apply(headers: Headers): RequestMetadataResponse = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestMetadataResponse]
  }
  
  @scala.inline
  implicit class RequestMetadataResponseMutableBuilder[Self <: RequestMetadataResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeaders(value: Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRes(value: GaxiosResponse[Unit]): Self = StObject.set(x, "res", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResNull: Self = StObject.set(x, "res", null)
    
    @scala.inline
    def setResUndefined: Self = StObject.set(x, "res", js.undefined)
  }
}
