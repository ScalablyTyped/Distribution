package typings.ethers

import typings.ethers.anon.Entropy
import typings.ethers.anon.N
import typings.ethers.typesCryptoScryptMod.ProgressCallback
import typings.ethers.typesUtilsDataMod.BytesLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesWalletJsonKeystoreMod {
  
  @JSImport("ethers/types/wallet/json-keystore", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def decryptKeystoreJson(json: String, _password: String): js.Promise[KeystoreAccount] = (^.asInstanceOf[js.Dynamic].applyDynamic("decryptKeystoreJson")(json.asInstanceOf[js.Any], _password.asInstanceOf[js.Any])).asInstanceOf[js.Promise[KeystoreAccount]]
  inline def decryptKeystoreJson(json: String, _password: String, progress: ProgressCallback): js.Promise[KeystoreAccount] = (^.asInstanceOf[js.Dynamic].applyDynamic("decryptKeystoreJson")(json.asInstanceOf[js.Any], _password.asInstanceOf[js.Any], progress.asInstanceOf[js.Any])).asInstanceOf[js.Promise[KeystoreAccount]]
  inline def decryptKeystoreJson(json: String, _password: js.typedarray.Uint8Array): js.Promise[KeystoreAccount] = (^.asInstanceOf[js.Dynamic].applyDynamic("decryptKeystoreJson")(json.asInstanceOf[js.Any], _password.asInstanceOf[js.Any])).asInstanceOf[js.Promise[KeystoreAccount]]
  inline def decryptKeystoreJson(json: String, _password: js.typedarray.Uint8Array, progress: ProgressCallback): js.Promise[KeystoreAccount] = (^.asInstanceOf[js.Dynamic].applyDynamic("decryptKeystoreJson")(json.asInstanceOf[js.Any], _password.asInstanceOf[js.Any], progress.asInstanceOf[js.Any])).asInstanceOf[js.Promise[KeystoreAccount]]
  
  inline def decryptKeystoreJsonSync(json: String, _password: String): KeystoreAccount = (^.asInstanceOf[js.Dynamic].applyDynamic("decryptKeystoreJsonSync")(json.asInstanceOf[js.Any], _password.asInstanceOf[js.Any])).asInstanceOf[KeystoreAccount]
  inline def decryptKeystoreJsonSync(json: String, _password: js.typedarray.Uint8Array): KeystoreAccount = (^.asInstanceOf[js.Dynamic].applyDynamic("decryptKeystoreJsonSync")(json.asInstanceOf[js.Any], _password.asInstanceOf[js.Any])).asInstanceOf[KeystoreAccount]
  
  inline def encryptKeystoreJson(account: KeystoreAccount, password: String): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("encryptKeystoreJson")(account.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def encryptKeystoreJson(account: KeystoreAccount, password: String, options: EncryptOptions): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("encryptKeystoreJson")(account.asInstanceOf[js.Any], password.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def encryptKeystoreJson(account: KeystoreAccount, password: js.typedarray.Uint8Array): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("encryptKeystoreJson")(account.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def encryptKeystoreJson(account: KeystoreAccount, password: js.typedarray.Uint8Array, options: EncryptOptions): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("encryptKeystoreJson")(account.asInstanceOf[js.Any], password.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  inline def encryptKeystoreJsonSync(account: KeystoreAccount, password: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encryptKeystoreJsonSync")(account.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def encryptKeystoreJsonSync(account: KeystoreAccount, password: String, options: EncryptOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encryptKeystoreJsonSync")(account.asInstanceOf[js.Any], password.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def encryptKeystoreJsonSync(account: KeystoreAccount, password: js.typedarray.Uint8Array): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encryptKeystoreJsonSync")(account.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def encryptKeystoreJsonSync(account: KeystoreAccount, password: js.typedarray.Uint8Array, options: EncryptOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encryptKeystoreJsonSync")(account.asInstanceOf[js.Any], password.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def isKeystoreJson(json: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isKeystoreJson")(json.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  trait EncryptOptions extends StObject {
    
    var client: js.UndefOr[String] = js.undefined
    
    var entropy: js.UndefOr[BytesLike] = js.undefined
    
    var iv: js.UndefOr[BytesLike] = js.undefined
    
    var progressCallback: js.UndefOr[ProgressCallback] = js.undefined
    
    var salt: js.UndefOr[BytesLike] = js.undefined
    
    var scrypt: js.UndefOr[N] = js.undefined
    
    var uuid: js.UndefOr[String] = js.undefined
  }
  object EncryptOptions {
    
    inline def apply(): EncryptOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EncryptOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EncryptOptions] (val x: Self) extends AnyVal {
      
      inline def setClient(value: String): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
      
      inline def setClientUndefined: Self = StObject.set(x, "client", js.undefined)
      
      inline def setEntropy(value: BytesLike): Self = StObject.set(x, "entropy", value.asInstanceOf[js.Any])
      
      inline def setEntropyUndefined: Self = StObject.set(x, "entropy", js.undefined)
      
      inline def setIv(value: BytesLike): Self = StObject.set(x, "iv", value.asInstanceOf[js.Any])
      
      inline def setIvUndefined: Self = StObject.set(x, "iv", js.undefined)
      
      inline def setProgressCallback(value: /* percent */ Double => Unit): Self = StObject.set(x, "progressCallback", js.Any.fromFunction1(value))
      
      inline def setProgressCallbackUndefined: Self = StObject.set(x, "progressCallback", js.undefined)
      
      inline def setSalt(value: BytesLike): Self = StObject.set(x, "salt", value.asInstanceOf[js.Any])
      
      inline def setSaltUndefined: Self = StObject.set(x, "salt", js.undefined)
      
      inline def setScrypt(value: N): Self = StObject.set(x, "scrypt", value.asInstanceOf[js.Any])
      
      inline def setScryptUndefined: Self = StObject.set(x, "scrypt", js.undefined)
      
      inline def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
      
      inline def setUuidUndefined: Self = StObject.set(x, "uuid", js.undefined)
    }
  }
  
  trait KeystoreAccount extends StObject {
    
    var address: String
    
    var mnemonic: js.UndefOr[Entropy] = js.undefined
    
    var privateKey: String
  }
  object KeystoreAccount {
    
    inline def apply(address: String, privateKey: String): KeystoreAccount = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], privateKey = privateKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[KeystoreAccount]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: KeystoreAccount] (val x: Self) extends AnyVal {
      
      inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      inline def setMnemonic(value: Entropy): Self = StObject.set(x, "mnemonic", value.asInstanceOf[js.Any])
      
      inline def setMnemonicUndefined: Self = StObject.set(x, "mnemonic", js.undefined)
      
      inline def setPrivateKey(value: String): Self = StObject.set(x, "privateKey", value.asInstanceOf[js.Any])
    }
  }
}
