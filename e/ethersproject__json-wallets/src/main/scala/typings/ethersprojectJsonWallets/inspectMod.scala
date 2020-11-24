package typings.ethersprojectJsonWallets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ethersproject/json-wallets/lib/inspect", JSImport.Namespace)
@js.native
object inspectMod extends js.Object {
  
  def getJsonWalletAddress(json: String): String = js.native
  
  def isCrowdsaleWallet(json: String): Boolean = js.native
  
  def isKeystoreWallet(json: String): Boolean = js.native
}
