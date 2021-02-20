package typings.ethersprojectJsonWallets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inspectMod {
  
  @JSImport("@ethersproject/json-wallets/lib/inspect", "getJsonWalletAddress")
  @js.native
  def getJsonWalletAddress(json: String): String = js.native
  
  @JSImport("@ethersproject/json-wallets/lib/inspect", "isCrowdsaleWallet")
  @js.native
  def isCrowdsaleWallet(json: String): Boolean = js.native
  
  @JSImport("@ethersproject/json-wallets/lib/inspect", "isKeystoreWallet")
  @js.native
  def isKeystoreWallet(json: String): Boolean = js.native
}
