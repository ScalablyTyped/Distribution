package typings.googleAuthLibrary.oauth2clientMod

import typings.gaxios.commonMod.GaxiosResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestMetadataResponse extends StObject {
  
  var headers: Headers
  
  var res: js.UndefOr[GaxiosResponse[Unit] | Null] = js.undefined
}
object RequestMetadataResponse {
  
  inline def apply(headers: Headers): RequestMetadataResponse = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestMetadataResponse]
  }
  
  extension [Self <: RequestMetadataResponse](x: Self) {
    
    inline def setHeaders(value: Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setRes(value: GaxiosResponse[Unit]): Self = StObject.set(x, "res", value.asInstanceOf[js.Any])
    
    inline def setResNull: Self = StObject.set(x, "res", null)
    
    inline def setResUndefined: Self = StObject.set(x, "res", js.undefined)
  }
}
