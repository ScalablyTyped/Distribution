package typings.googleAuthLibrary.buildSrcAuthOauth2clientMod

import typings.gaxios.buildSrcCommonMod.GaxiosResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IapPublicKeysResponse extends StObject {
  
  var pubkeys: PublicKeys
  
  var res: js.UndefOr[GaxiosResponse[Unit] | Null] = js.undefined
}
object IapPublicKeysResponse {
  
  inline def apply(pubkeys: PublicKeys): IapPublicKeysResponse = {
    val __obj = js.Dynamic.literal(pubkeys = pubkeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[IapPublicKeysResponse]
  }
  
  extension [Self <: IapPublicKeysResponse](x: Self) {
    
    inline def setPubkeys(value: PublicKeys): Self = StObject.set(x, "pubkeys", value.asInstanceOf[js.Any])
    
    inline def setRes(value: GaxiosResponse[Unit]): Self = StObject.set(x, "res", value.asInstanceOf[js.Any])
    
    inline def setResNull: Self = StObject.set(x, "res", null)
    
    inline def setResUndefined: Self = StObject.set(x, "res", js.undefined)
  }
}
