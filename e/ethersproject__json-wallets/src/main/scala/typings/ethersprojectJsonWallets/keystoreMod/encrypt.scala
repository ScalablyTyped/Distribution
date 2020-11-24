package typings.ethersprojectJsonWallets.keystoreMod

import typings.ethersprojectAbstractSigner.mod.ExternallyOwnedAccount
import typings.ethersprojectBytes.mod.Bytes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ethersproject/json-wallets/lib/keystore", "encrypt")
@js.native
object encrypt extends js.Object {
  
  def apply(account: ExternallyOwnedAccount, password: String): js.Promise[String] = js.native
  def apply(
    account: ExternallyOwnedAccount,
    password: String,
    options: js.UndefOr[scala.Nothing],
    progressCallback: ProgressCallback
  ): js.Promise[String] = js.native
  def apply(account: ExternallyOwnedAccount, password: String, options: EncryptOptions): js.Promise[String] = js.native
  def apply(
    account: ExternallyOwnedAccount,
    password: String,
    options: EncryptOptions,
    progressCallback: ProgressCallback
  ): js.Promise[String] = js.native
  def apply(account: ExternallyOwnedAccount, password: Bytes): js.Promise[String] = js.native
  def apply(
    account: ExternallyOwnedAccount,
    password: Bytes,
    options: js.UndefOr[scala.Nothing],
    progressCallback: ProgressCallback
  ): js.Promise[String] = js.native
  def apply(account: ExternallyOwnedAccount, password: Bytes, options: EncryptOptions): js.Promise[String] = js.native
  def apply(
    account: ExternallyOwnedAccount,
    password: Bytes,
    options: EncryptOptions,
    progressCallback: ProgressCallback
  ): js.Promise[String] = js.native
}
