package typings.ethereumjsWallet

import typings.ethereumjsWallet.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object thirdpartyMod {
  
  object default {
    
    @JSImport("ethereumjs-wallet/dist/thirdparty", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ethereumjs-wallet/dist/thirdparty", "default.fromEtherCamp")
    @js.native
    def fromEtherCamp: js.Function1[/* passphrase */ String, typings.ethereumjsWallet.mod.default] = js.native
    @JSImport("ethereumjs-wallet/dist/thirdparty", "default.fromEtherCamp")
    @js.native
    def fromEtherCamp(passphrase: String): typings.ethereumjsWallet.mod.default = js.native
    @scala.inline
    def fromEtherCamp_=(x: js.Function1[/* passphrase */ String, typings.ethereumjsWallet.mod.default]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fromEtherCamp")(x.asInstanceOf[js.Any])
    
    @JSImport("ethereumjs-wallet/dist/thirdparty", "default.fromEtherWallet")
    @js.native
    def fromEtherWallet: js.Function2[
        /* input */ String | EtherWalletOptions, 
        /* password */ String, 
        typings.ethereumjsWallet.mod.default
      ] = js.native
    @JSImport("ethereumjs-wallet/dist/thirdparty", "default.fromEtherWallet")
    @js.native
    def fromEtherWallet(input: String, password: String): typings.ethereumjsWallet.mod.default = js.native
    @JSImport("ethereumjs-wallet/dist/thirdparty", "default.fromEtherWallet")
    @js.native
    def fromEtherWallet(input: EtherWalletOptions, password: String): typings.ethereumjsWallet.mod.default = js.native
    @scala.inline
    def fromEtherWallet_=(
      x: js.Function2[
          /* input */ String | EtherWalletOptions, 
          /* password */ String, 
          typings.ethereumjsWallet.mod.default
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fromEtherWallet")(x.asInstanceOf[js.Any])
    
    @JSImport("ethereumjs-wallet/dist/thirdparty", "default.fromKryptoKit")
    @js.native
    def fromKryptoKit: js.Function2[
        /* entropy */ String, 
        /* password */ String, 
        js.Promise[typings.ethereumjsWallet.mod.default]
      ] = js.native
    @JSImport("ethereumjs-wallet/dist/thirdparty", "default.fromKryptoKit")
    @js.native
    def fromKryptoKit(entropy: String, password: String): js.Promise[typings.ethereumjsWallet.mod.default] = js.native
    @scala.inline
    def fromKryptoKit_=(
      x: js.Function2[
          /* entropy */ String, 
          /* password */ String, 
          js.Promise[typings.ethereumjsWallet.mod.default]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fromKryptoKit")(x.asInstanceOf[js.Any])
    
    @JSImport("ethereumjs-wallet/dist/thirdparty", "default.fromQuorumWallet")
    @js.native
    def fromQuorumWallet: js.Function2[/* passphrase */ String, /* userid */ String, typings.ethereumjsWallet.mod.default] = js.native
    @JSImport("ethereumjs-wallet/dist/thirdparty", "default.fromQuorumWallet")
    @js.native
    def fromQuorumWallet(passphrase: String, userid: String): typings.ethereumjsWallet.mod.default = js.native
    @scala.inline
    def fromQuorumWallet_=(
      x: js.Function2[/* passphrase */ String, /* userid */ String, typings.ethereumjsWallet.mod.default]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fromQuorumWallet")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("ethereumjs-wallet/dist/thirdparty", "fromEtherCamp")
  @js.native
  def fromEtherCamp(passphrase: String): default = js.native
  
  @JSImport("ethereumjs-wallet/dist/thirdparty", "fromEtherWallet")
  @js.native
  def fromEtherWallet(input: String, password: String): default = js.native
  @JSImport("ethereumjs-wallet/dist/thirdparty", "fromEtherWallet")
  @js.native
  def fromEtherWallet(input: EtherWalletOptions, password: String): default = js.native
  
  @JSImport("ethereumjs-wallet/dist/thirdparty", "fromKryptoKit")
  @js.native
  def fromKryptoKit(entropy: String, password: String): js.Promise[default] = js.native
  
  @JSImport("ethereumjs-wallet/dist/thirdparty", "fromQuorumWallet")
  @js.native
  def fromQuorumWallet(passphrase: String, userid: String): default = js.native
  
  @js.native
  trait EtherWalletOptions extends StObject {
    
    var address: String = js.native
    
    var encrypted: Boolean = js.native
    
    var hash: String = js.native
    
    var locked: Boolean = js.native
    
    var `private`: String = js.native
    
    var public: String = js.native
  }
  object EtherWalletOptions {
    
    @scala.inline
    def apply(
      address: String,
      encrypted: Boolean,
      hash: String,
      locked: Boolean,
      `private`: String,
      public: String
    ): EtherWalletOptions = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], encrypted = encrypted.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], locked = locked.asInstanceOf[js.Any], public = public.asInstanceOf[js.Any])
      __obj.updateDynamic("private")(`private`.asInstanceOf[js.Any])
      __obj.asInstanceOf[EtherWalletOptions]
    }
    
    @scala.inline
    implicit class EtherWalletOptionsMutableBuilder[Self <: EtherWalletOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncrypted(value: Boolean): Self = StObject.set(x, "encrypted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocked(value: Boolean): Self = StObject.set(x, "locked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrivate(value: String): Self = StObject.set(x, "private", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPublic(value: String): Self = StObject.set(x, "public", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait EvpKdfOpts extends StObject {
    
    var count: Double = js.native
    
    var digest: String = js.native
    
    var ivsize: Double = js.native
    
    var keysize: Double = js.native
  }
  object EvpKdfOpts {
    
    @scala.inline
    def apply(count: Double, digest: String, ivsize: Double, keysize: Double): EvpKdfOpts = {
      val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], digest = digest.asInstanceOf[js.Any], ivsize = ivsize.asInstanceOf[js.Any], keysize = keysize.asInstanceOf[js.Any])
      __obj.asInstanceOf[EvpKdfOpts]
    }
    
    @scala.inline
    implicit class EvpKdfOptsMutableBuilder[Self <: EvpKdfOpts] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDigest(value: String): Self = StObject.set(x, "digest", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIvsize(value: Double): Self = StObject.set(x, "ivsize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeysize(value: Double): Self = StObject.set(x, "keysize", value.asInstanceOf[js.Any])
    }
  }
}
