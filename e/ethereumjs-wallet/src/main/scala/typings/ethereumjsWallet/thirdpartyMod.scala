package typings.ethereumjsWallet

import typings.ethereumjsWallet.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object thirdpartyMod {
  
  @JSImport("ethereumjs-wallet/dist/thirdparty", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object default {
    
    @JSImport("ethereumjs-wallet/dist/thirdparty", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ethereumjs-wallet/dist/thirdparty", "default.fromEtherCamp")
    @js.native
    def fromEtherCamp: js.Function1[/* passphrase */ String, typings.ethereumjsWallet.mod.default] = js.native
    @scala.inline
    def fromEtherCamp(passphrase: String): typings.ethereumjsWallet.mod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("fromEtherCamp")(passphrase.asInstanceOf[js.Any]).asInstanceOf[typings.ethereumjsWallet.mod.default]
    @scala.inline
    def fromEtherCamp_=(x: js.Function1[/* passphrase */ String, typings.ethereumjsWallet.mod.default]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fromEtherCamp")(x.asInstanceOf[js.Any])
    
    @JSImport("ethereumjs-wallet/dist/thirdparty", "default.fromEtherWallet")
    @js.native
    def fromEtherWallet: js.Function2[
        /* input */ String | EtherWalletOptions, 
        /* password */ String, 
        typings.ethereumjsWallet.mod.default
      ] = js.native
    @scala.inline
    def fromEtherWallet(input: String, password: String): typings.ethereumjsWallet.mod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEtherWallet")(input.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[typings.ethereumjsWallet.mod.default]
    @scala.inline
    def fromEtherWallet(input: EtherWalletOptions, password: String): typings.ethereumjsWallet.mod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEtherWallet")(input.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[typings.ethereumjsWallet.mod.default]
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
    @scala.inline
    def fromKryptoKit(entropy: String, password: String): js.Promise[typings.ethereumjsWallet.mod.default] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromKryptoKit")(entropy.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.ethereumjsWallet.mod.default]]
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
    @scala.inline
    def fromQuorumWallet(passphrase: String, userid: String): typings.ethereumjsWallet.mod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("fromQuorumWallet")(passphrase.asInstanceOf[js.Any], userid.asInstanceOf[js.Any])).asInstanceOf[typings.ethereumjsWallet.mod.default]
    @scala.inline
    def fromQuorumWallet_=(
      x: js.Function2[/* passphrase */ String, /* userid */ String, typings.ethereumjsWallet.mod.default]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fromQuorumWallet")(x.asInstanceOf[js.Any])
  }
  
  @scala.inline
  def fromEtherCamp(passphrase: String): default = ^.asInstanceOf[js.Dynamic].applyDynamic("fromEtherCamp")(passphrase.asInstanceOf[js.Any]).asInstanceOf[default]
  
  @scala.inline
  def fromEtherWallet(input: String, password: String): default = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEtherWallet")(input.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[default]
  @scala.inline
  def fromEtherWallet(input: EtherWalletOptions, password: String): default = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEtherWallet")(input.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[default]
  
  @scala.inline
  def fromKryptoKit(entropy: String, password: String): js.Promise[default] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromKryptoKit")(entropy.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[js.Promise[default]]
  
  @scala.inline
  def fromQuorumWallet(passphrase: String, userid: String): default = (^.asInstanceOf[js.Dynamic].applyDynamic("fromQuorumWallet")(passphrase.asInstanceOf[js.Any], userid.asInstanceOf[js.Any])).asInstanceOf[default]
  
  trait EtherWalletOptions extends StObject {
    
    var address: String
    
    var encrypted: Boolean
    
    var hash: String
    
    var locked: Boolean
    
    var `private`: String
    
    var public: String
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
  
  trait EvpKdfOpts extends StObject {
    
    var count: Double
    
    var digest: String
    
    var ivsize: Double
    
    var keysize: Double
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
