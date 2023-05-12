package typings.ethers

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesWalletJsonCrowdsaleMod {
  
  @JSImport("ethers/types/wallet/json-crowdsale", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def decryptCrowdsaleJson(json: String, _password: String): CrowdsaleAccount = (^.asInstanceOf[js.Dynamic].applyDynamic("decryptCrowdsaleJson")(json.asInstanceOf[js.Any], _password.asInstanceOf[js.Any])).asInstanceOf[CrowdsaleAccount]
  inline def decryptCrowdsaleJson(json: String, _password: js.typedarray.Uint8Array): CrowdsaleAccount = (^.asInstanceOf[js.Dynamic].applyDynamic("decryptCrowdsaleJson")(json.asInstanceOf[js.Any], _password.asInstanceOf[js.Any])).asInstanceOf[CrowdsaleAccount]
  
  inline def isCrowdsaleJson(json: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCrowdsaleJson")(json.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  trait CrowdsaleAccount extends StObject {
    
    var address: String
    
    var privateKey: String
  }
  object CrowdsaleAccount {
    
    inline def apply(address: String, privateKey: String): CrowdsaleAccount = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], privateKey = privateKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[CrowdsaleAccount]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CrowdsaleAccount] (val x: Self) extends AnyVal {
      
      inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      inline def setPrivateKey(value: String): Self = StObject.set(x, "privateKey", value.asInstanceOf[js.Any])
    }
  }
}
