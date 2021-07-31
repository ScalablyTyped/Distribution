package typings.ethersprojectJsonWallets

import org.scalablytyped.runtime.TopLevel
import typings.ethersprojectAbstractSigner.mod.ExternallyOwnedAccount
import typings.ethersprojectBytes.mod.Bytes
import typings.ethersprojectBytes.mod.BytesLike
import typings.ethersprojectHdnode.mod.Mnemonic
import typings.ethersprojectJsonWallets.anon.N
import typings.ethersprojectProperties.mod.Description
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object keystoreMod {
  
  @JSImport("@ethersproject/json-wallets/lib/keystore", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@ethersproject/json-wallets/lib/keystore", "KeystoreAccount")
  @js.native
  class KeystoreAccount protected ()
    extends Description[_KeystoreAccount]
       with ExternallyOwnedAccount {
    def this(info: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in 'address' | 'privateKey' | 'mnemonic' | '_isKeystoreAccount' ]: @ethersproject/json-wallets.@ethersproject/json-wallets/lib/keystore._KeystoreAccount[K]}
      */ typings.ethersprojectJsonWallets.ethersprojectJsonWalletsStrings.KeystoreAccount & TopLevel[_KeystoreAccount]) = this()
    
    val _isKeystoreAccount: Boolean = js.native
    
    /* CompleteClass */
    override val address: String = js.native
    
    def isKeystoreAccount(value: js.Any): /* is @ethersproject/json-wallets.@ethersproject/json-wallets/lib/keystore.KeystoreAccount */ Boolean = js.native
    
    val mnemonic: js.UndefOr[Mnemonic] = js.native
    
    /* CompleteClass */
    override val privateKey: String = js.native
  }
  
  @scala.inline
  def decrypt(json: String, password: String): js.Promise[KeystoreAccount] = (^.asInstanceOf[js.Dynamic].applyDynamic("decrypt")(json.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[js.Promise[KeystoreAccount]]
  @scala.inline
  def decrypt(json: String, password: String, progressCallback: ProgressCallback): js.Promise[KeystoreAccount] = (^.asInstanceOf[js.Dynamic].applyDynamic("decrypt")(json.asInstanceOf[js.Any], password.asInstanceOf[js.Any], progressCallback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[KeystoreAccount]]
  @scala.inline
  def decrypt(json: String, password: Bytes): js.Promise[KeystoreAccount] = (^.asInstanceOf[js.Dynamic].applyDynamic("decrypt")(json.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[js.Promise[KeystoreAccount]]
  @scala.inline
  def decrypt(json: String, password: Bytes, progressCallback: ProgressCallback): js.Promise[KeystoreAccount] = (^.asInstanceOf[js.Dynamic].applyDynamic("decrypt")(json.asInstanceOf[js.Any], password.asInstanceOf[js.Any], progressCallback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[KeystoreAccount]]
  
  @scala.inline
  def decryptSync(json: String, password: String): KeystoreAccount = (^.asInstanceOf[js.Dynamic].applyDynamic("decryptSync")(json.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[KeystoreAccount]
  @scala.inline
  def decryptSync(json: String, password: Bytes): KeystoreAccount = (^.asInstanceOf[js.Dynamic].applyDynamic("decryptSync")(json.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[KeystoreAccount]
  
  @scala.inline
  def encrypt(account: ExternallyOwnedAccount, password: String): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("encrypt")(account.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  @scala.inline
  def encrypt(
    account: ExternallyOwnedAccount,
    password: String,
    options: Unit,
    progressCallback: ProgressCallback
  ): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("encrypt")(account.asInstanceOf[js.Any], password.asInstanceOf[js.Any], options.asInstanceOf[js.Any], progressCallback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  @scala.inline
  def encrypt(account: ExternallyOwnedAccount, password: String, options: EncryptOptions): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("encrypt")(account.asInstanceOf[js.Any], password.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  @scala.inline
  def encrypt(
    account: ExternallyOwnedAccount,
    password: String,
    options: EncryptOptions,
    progressCallback: ProgressCallback
  ): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("encrypt")(account.asInstanceOf[js.Any], password.asInstanceOf[js.Any], options.asInstanceOf[js.Any], progressCallback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  @scala.inline
  def encrypt(account: ExternallyOwnedAccount, password: Bytes): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("encrypt")(account.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  @scala.inline
  def encrypt(
    account: ExternallyOwnedAccount,
    password: Bytes,
    options: Unit,
    progressCallback: ProgressCallback
  ): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("encrypt")(account.asInstanceOf[js.Any], password.asInstanceOf[js.Any], options.asInstanceOf[js.Any], progressCallback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  @scala.inline
  def encrypt(account: ExternallyOwnedAccount, password: Bytes, options: EncryptOptions): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("encrypt")(account.asInstanceOf[js.Any], password.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  @scala.inline
  def encrypt(
    account: ExternallyOwnedAccount,
    password: Bytes,
    options: EncryptOptions,
    progressCallback: ProgressCallback
  ): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("encrypt")(account.asInstanceOf[js.Any], password.asInstanceOf[js.Any], options.asInstanceOf[js.Any], progressCallback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  trait EncryptOptions extends StObject {
    
    var client: js.UndefOr[String] = js.undefined
    
    var entropy: js.UndefOr[BytesLike] = js.undefined
    
    var iv: js.UndefOr[BytesLike] = js.undefined
    
    var salt: js.UndefOr[BytesLike] = js.undefined
    
    var scrypt: js.UndefOr[N] = js.undefined
    
    var uuid: js.UndefOr[String] = js.undefined
  }
  object EncryptOptions {
    
    @scala.inline
    def apply(): EncryptOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EncryptOptions]
    }
    
    @scala.inline
    implicit class EncryptOptionsMutableBuilder[Self <: EncryptOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClient(value: String): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientUndefined: Self = StObject.set(x, "client", js.undefined)
      
      @scala.inline
      def setEntropy(value: BytesLike): Self = StObject.set(x, "entropy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEntropyUndefined: Self = StObject.set(x, "entropy", js.undefined)
      
      @scala.inline
      def setIv(value: BytesLike): Self = StObject.set(x, "iv", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIvUndefined: Self = StObject.set(x, "iv", js.undefined)
      
      @scala.inline
      def setSalt(value: BytesLike): Self = StObject.set(x, "salt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSaltUndefined: Self = StObject.set(x, "salt", js.undefined)
      
      @scala.inline
      def setScrypt(value: N): Self = StObject.set(x, "scrypt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScryptUndefined: Self = StObject.set(x, "scrypt", js.undefined)
      
      @scala.inline
      def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUuidUndefined: Self = StObject.set(x, "uuid", js.undefined)
    }
  }
  
  type ProgressCallback = js.Function1[/* percent */ Double, Unit]
  
  trait _KeystoreAccount extends StObject {
    
    var _isKeystoreAccount: Boolean
    
    var address: String
    
    var mnemonic: js.UndefOr[Mnemonic] = js.undefined
    
    var privateKey: String
  }
  object _KeystoreAccount {
    
    @scala.inline
    def apply(_isKeystoreAccount: Boolean, address: String, privateKey: String): _KeystoreAccount = {
      val __obj = js.Dynamic.literal(_isKeystoreAccount = _isKeystoreAccount.asInstanceOf[js.Any], address = address.asInstanceOf[js.Any], privateKey = privateKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[_KeystoreAccount]
    }
    
    @scala.inline
    implicit class _KeystoreAccountMutableBuilder[Self <: _KeystoreAccount] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMnemonic(value: Mnemonic): Self = StObject.set(x, "mnemonic", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMnemonicUndefined: Self = StObject.set(x, "mnemonic", js.undefined)
      
      @scala.inline
      def setPrivateKey(value: String): Self = StObject.set(x, "privateKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_isKeystoreAccount(value: Boolean): Self = StObject.set(x, "_isKeystoreAccount", value.asInstanceOf[js.Any])
    }
  }
}
