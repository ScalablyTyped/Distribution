package typings.ethersprojectJsonWallets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inspectMod {
  
  @JSImport("@ethersproject/json-wallets/lib/inspect", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getJsonWalletAddress(json: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getJsonWalletAddress")(json.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def isCrowdsaleWallet(json: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCrowdsaleWallet")(json.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isKeystoreWallet(json: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isKeystoreWallet")(json.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
