package typings.ethereumjsWallet.mod

import typings.ethereumjsWallet.thirdpartyMod.EtherWalletOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ethereumjs-wallet", "thirdparty")
@js.native
object thirdparty extends js.Object {
  
  def fromEtherCamp(passphrase: String): default = js.native
  @JSName("fromEtherCamp")
  var fromEtherCamp_Original: js.Function1[/* passphrase */ String, default] = js.native
  
  def fromEtherWallet(input: String, password: String): default = js.native
  def fromEtherWallet(input: EtherWalletOptions, password: String): default = js.native
  @JSName("fromEtherWallet")
  var fromEtherWallet_Original: js.Function2[/* input */ String | EtherWalletOptions, /* password */ String, default] = js.native
  
  def fromKryptoKit(entropy: String, password: String): js.Promise[default] = js.native
  @JSName("fromKryptoKit")
  var fromKryptoKit_Original: js.Function2[/* entropy */ String, /* password */ String, js.Promise[default]] = js.native
  
  def fromQuorumWallet(passphrase: String, userid: String): default = js.native
  @JSName("fromQuorumWallet")
  var fromQuorumWallet_Original: js.Function2[/* passphrase */ String, /* userid */ String, default] = js.native
}
