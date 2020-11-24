package typings.ethersprojectJsonWallets.crowdsaleMod

import typings.ethersprojectAbstractSigner.mod.ExternallyOwnedAccount
import typings.ethersprojectProperties.mod.Description
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ethersproject/json-wallets/lib/crowdsale", "CrowdsaleAccount")
@js.native
class CrowdsaleAccount ()
  extends Description[_CrowdsaleAccount]
     with ExternallyOwnedAccount {
  
  val _isCrowdsaleAccount: Boolean = js.native
  
  def isCrowdsaleAccount(value: js.Any): /* is @ethersproject/json-wallets.@ethersproject/json-wallets/lib/crowdsale.CrowdsaleAccount */ Boolean = js.native
  
  val mnemonic: js.UndefOr[String] = js.native
  
  val path: js.UndefOr[String] = js.native
}
