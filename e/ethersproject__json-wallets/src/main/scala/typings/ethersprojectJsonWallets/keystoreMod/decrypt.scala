package typings.ethersprojectJsonWallets.keystoreMod

import typings.ethersprojectBytes.mod.Bytes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ethersproject/json-wallets/lib/keystore", "decrypt")
@js.native
object decrypt extends js.Object {
  
  def apply(json: String, password: String): js.Promise[KeystoreAccount] = js.native
  def apply(json: String, password: String, progressCallback: ProgressCallback): js.Promise[KeystoreAccount] = js.native
  def apply(json: String, password: Bytes): js.Promise[KeystoreAccount] = js.native
  def apply(json: String, password: Bytes, progressCallback: ProgressCallback): js.Promise[KeystoreAccount] = js.native
}
