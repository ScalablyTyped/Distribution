package typings.ethereumjsWallet

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hdkeyMod {
  
  @JSImport("ethereumjs-wallet/dist/hdkey", JSImport.Default)
  @js.native
  class default () extends EthereumHDKey {
    def this(_hdkey: js.Any) = this()
  }
  /* static members */
  object default {
    
    /**
      * Create an instance based on a BIP32 extended private or public key.
      */
    @JSImport("ethereumjs-wallet/dist/hdkey", "default.fromExtendedKey")
    @js.native
    def fromExtendedKey(base58Key: String): EthereumHDKey = js.native
    
    /**
      * Creates an instance based on a seed.
      *
      * For the seed we suggest to use [bip39](https://npmjs.org/package/bip39) to
      * create one from a BIP39 mnemonic.
      */
    @JSImport("ethereumjs-wallet/dist/hdkey", "default.fromMasterSeed")
    @js.native
    def fromMasterSeed(seedBuffer: Buffer): EthereumHDKey = js.native
  }
  
  @js.native
  trait EthereumHDKey extends StObject {
    
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
    implicit class EthereumHDKeyMutableBuilder[Self <: EthereumHDKey] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDeriveChild(value: Double => EthereumHDKey): Self = StObject.set(x, "deriveChild", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDerivePath(value: String => EthereumHDKey): Self = StObject.set(x, "derivePath", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetWallet(value: () => typings.ethereumjsWallet.mod.default): Self = StObject.set(x, "getWallet", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPrivateExtendedKey(value: () => Buffer): Self = StObject.set(x, "privateExtendedKey", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPublicExtendedKey(value: () => Buffer): Self = StObject.set(x, "publicExtendedKey", js.Any.fromFunction0(value))
      
      @scala.inline
      def set_hdkey(value: js.Any): Self = StObject.set(x, "_hdkey", value.asInstanceOf[js.Any])
    }
  }
}
