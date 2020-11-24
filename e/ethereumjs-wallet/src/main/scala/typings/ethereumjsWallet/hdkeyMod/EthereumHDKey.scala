package typings.ethereumjsWallet.hdkeyMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EthereumHDKey extends js.Object {
  
  val _hdkey: js.Any = js.native
  
  /**
    * Derive a node based on a child index
    */
  def deriveChild(index: Double): EthereumHDKey = js.native
  
  /**
    * Derives a node based on a path (e.g. m/44'/0'/0/1)
    */
  def derivePath(path: String): EthereumHDKey = js.native
  
  /**
    * Return a `Wallet` instance as seen above
    */
  def getWallet(): typings.ethereumjsWallet.mod.default = js.native
  
  /**
    * Returns a BIP32 extended private key (xprv)
    */
  def privateExtendedKey(): Buffer = js.native
  
  /**
    * Return a BIP32 extended public key (xpub)
    */
  def publicExtendedKey(): Buffer = js.native
}
object EthereumHDKey {
  
  @scala.inline
  def apply(
    _hdkey: js.Any,
    deriveChild: Double => EthereumHDKey,
    derivePath: String => EthereumHDKey,
    getWallet: () => typings.ethereumjsWallet.mod.default,
    privateExtendedKey: () => Buffer,
    publicExtendedKey: () => Buffer
  ): EthereumHDKey = {
    val __obj = js.Dynamic.literal(_hdkey = _hdkey.asInstanceOf[js.Any], deriveChild = js.Any.fromFunction1(deriveChild), derivePath = js.Any.fromFunction1(derivePath), getWallet = js.Any.fromFunction0(getWallet), privateExtendedKey = js.Any.fromFunction0(privateExtendedKey), publicExtendedKey = js.Any.fromFunction0(publicExtendedKey))
    __obj.asInstanceOf[EthereumHDKey]
  }
  
  @scala.inline
  implicit class EthereumHDKeyOps[Self <: EthereumHDKey] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def set_hdkey(value: js.Any): Self = this.set("_hdkey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeriveChild(value: Double => EthereumHDKey): Self = this.set("deriveChild", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDerivePath(value: String => EthereumHDKey): Self = this.set("derivePath", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetWallet(value: () => typings.ethereumjsWallet.mod.default): Self = this.set("getWallet", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPrivateExtendedKey(value: () => Buffer): Self = this.set("privateExtendedKey", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPublicExtendedKey(value: () => Buffer): Self = this.set("publicExtendedKey", js.Any.fromFunction0(value))
  }
}
