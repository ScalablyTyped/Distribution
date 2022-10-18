package typings.googleCloudStorage.buildSrcStorageMod

import typings.googleCloudStorage.buildSrcHmacKeyMod.HmacKeyMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HmacKeyResourceResponse extends StObject {
  
  var metadata: HmacKeyMetadata
  
  var secret: String
}
object HmacKeyResourceResponse {
  
  inline def apply(metadata: HmacKeyMetadata, secret: String): HmacKeyResourceResponse = {
    val __obj = js.Dynamic.literal(metadata = metadata.asInstanceOf[js.Any], secret = secret.asInstanceOf[js.Any])
    __obj.asInstanceOf[HmacKeyResourceResponse]
  }
  
  extension [Self <: HmacKeyResourceResponse](x: Self) {
    
    inline def setMetadata(value: HmacKeyMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setSecret(value: String): Self = StObject.set(x, "secret", value.asInstanceOf[js.Any])
  }
}
