package typings.ethersprojectJsonWallets

import org.scalablytyped.runtime.TopLevel
import typings.ethersprojectAbstractSigner.mod.ExternallyOwnedAccount
import typings.ethersprojectBytes.mod.Bytes
import typings.ethersprojectProperties.mod.Description
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object crowdsaleMod {
  
  @JSImport("@ethersproject/json-wallets/lib/crowdsale", "CrowdsaleAccount")
  @js.native
  class CrowdsaleAccount protected ()
    extends Description[_CrowdsaleAccount]
       with ExternallyOwnedAccount {
    def this(info: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in 'address' | 'privateKey' | '_isCrowdsaleAccount' ]: @ethersproject/json-wallets.@ethersproject/json-wallets/lib/crowdsale._CrowdsaleAccount[K]}
      */ typings.ethersprojectJsonWallets.ethersprojectJsonWalletsStrings.CrowdsaleAccount with TopLevel[_CrowdsaleAccount]) = this()
    
    val _isCrowdsaleAccount: Boolean = js.native
    
    def isCrowdsaleAccount(value: js.Any): /* is @ethersproject/json-wallets.@ethersproject/json-wallets/lib/crowdsale.CrowdsaleAccount */ Boolean = js.native
    
    val mnemonic: js.UndefOr[String] = js.native
    
    val path: js.UndefOr[String] = js.native
  }
  
  @JSImport("@ethersproject/json-wallets/lib/crowdsale", "decrypt")
  @js.native
  def decrypt(json: String, password: String): ExternallyOwnedAccount = js.native
  @JSImport("@ethersproject/json-wallets/lib/crowdsale", "decrypt")
  @js.native
  def decrypt(json: String, password: Bytes): ExternallyOwnedAccount = js.native
  
  @js.native
  trait _CrowdsaleAccount extends StObject {
    
    var _isCrowdsaleAccount: Boolean = js.native
    
    var address: String = js.native
    
    var privateKey: String = js.native
  }
  object _CrowdsaleAccount {
    
    @scala.inline
    def apply(_isCrowdsaleAccount: Boolean, address: String, privateKey: String): _CrowdsaleAccount = {
      val __obj = js.Dynamic.literal(_isCrowdsaleAccount = _isCrowdsaleAccount.asInstanceOf[js.Any], address = address.asInstanceOf[js.Any], privateKey = privateKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[_CrowdsaleAccount]
    }
    
    @scala.inline
    implicit class _CrowdsaleAccountMutableBuilder[Self <: _CrowdsaleAccount] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrivateKey(value: String): Self = StObject.set(x, "privateKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_isCrowdsaleAccount(value: Boolean): Self = StObject.set(x, "_isCrowdsaleAccount", value.asInstanceOf[js.Any])
    }
  }
}
