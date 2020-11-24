package typings.ethersprojectJsonWallets.keystoreMod

import typings.ethersprojectBytes.mod.Bytes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ethersproject/json-wallets/lib/keystore", "decryptSync")
@js.native
object decryptSync extends js.Object {
  
  def apply(json: String, password: String): KeystoreAccount = js.native
  def apply(json: String, password: Bytes): KeystoreAccount = js.native
}
