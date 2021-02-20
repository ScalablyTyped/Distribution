package typings.googleAuthLibrary.oauth2clientMod

import typings.gaxios.commonMod.GaxiosResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IapPublicKeysResponse extends StObject {
  
  var pubkeys: PublicKeys = js.native
  
  var res: js.UndefOr[GaxiosResponse[Unit] | Null] = js.native
}
object IapPublicKeysResponse {
  
  @scala.inline
  def apply(pubkeys: PublicKeys): IapPublicKeysResponse = {
    val __obj = js.Dynamic.literal(pubkeys = pubkeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[IapPublicKeysResponse]
  }
  
  @scala.inline
  implicit class IapPublicKeysResponseMutableBuilder[Self <: IapPublicKeysResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPubkeys(value: PublicKeys): Self = StObject.set(x, "pubkeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRes(value: GaxiosResponse[Unit]): Self = StObject.set(x, "res", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResNull: Self = StObject.set(x, "res", null)
    
    @scala.inline
    def setResUndefined: Self = StObject.set(x, "res", js.undefined)
  }
}
