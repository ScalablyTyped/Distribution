package typings.ethersprojectWallet

import typings.ethersprojectAbstractProvider.mod.Provider
import typings.ethersprojectAbstractProvider.mod.TransactionRequest
import typings.ethersprojectAbstractSigner.mod.ExternallyOwnedAccount
import typings.ethersprojectAbstractSigner.mod.Signer
import typings.ethersprojectAbstractSigner.mod.TypedDataDomain
import typings.ethersprojectAbstractSigner.mod.TypedDataField
import typings.ethersprojectAbstractSigner.mod.TypedDataSigner
import typings.ethersprojectBytes.mod.Bytes
import typings.ethersprojectBytes.mod.BytesLike
import typings.ethersprojectBytes.mod.SignatureLike
import typings.ethersprojectHdnode.mod.Mnemonic
import typings.ethersprojectJsonWallets.libKeystoreMod.ProgressCallback
import typings.ethersprojectSigningKey.mod.SigningKey
import typings.ethersprojectWordlists.mod.Wordlist
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@ethersproject/wallet", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@ethersproject/wallet", "Wallet")
  @js.native
  open class Wallet protected ()
    extends Signer
       with ExternallyOwnedAccount
       with TypedDataSigner {
    def this(privateKey: ExternallyOwnedAccount) = this()
    def this(privateKey: BytesLike) = this()
    def this(privateKey: SigningKey) = this()
    def this(privateKey: ExternallyOwnedAccount, provider: Provider) = this()
    def this(privateKey: BytesLike, provider: Provider) = this()
    def this(privateKey: SigningKey, provider: Provider) = this()
    
    def _mnemonic(): Mnemonic = js.native
    
    /* CompleteClass */
    override def _signTypedData(
      domain: TypedDataDomain,
      types: Record[String, js.Array[TypedDataField]],
      value: Record[String, Any]
    ): js.Promise[String] = js.native
    
    def _signingKey(): SigningKey = js.native
    
    /* CompleteClass */
    override val address: String = js.native
    
    def encrypt(password: String): js.Promise[String] = js.native
    def encrypt(password: String, options: Any): js.Promise[String] = js.native
    def encrypt(password: String, options: Any, progressCallback: ProgressCallback): js.Promise[String] = js.native
    def encrypt(password: String, options: Unit, progressCallback: ProgressCallback): js.Promise[String] = js.native
    def encrypt(password: Bytes): js.Promise[String] = js.native
    def encrypt(password: Bytes, options: Any): js.Promise[String] = js.native
    def encrypt(password: Bytes, options: Any, progressCallback: ProgressCallback): js.Promise[String] = js.native
    def encrypt(password: Bytes, options: Unit, progressCallback: ProgressCallback): js.Promise[String] = js.native
    
    def mnemonic: Mnemonic = js.native
    
    /* CompleteClass */
    override val privateKey: String = js.native
    @JSName("privateKey")
    def privateKey_MWallet: String = js.native
    
    @JSName("provider")
    val provider_Wallet: Provider = js.native
    
    def publicKey: String = js.native
    
    def signTransaction(transaction: TransactionRequest): js.Promise[String] = js.native
  }
  /* static members */
  object Wallet {
    
    @JSImport("@ethersproject/wallet", "Wallet")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      *  Static methods to create Wallet instances.
      */
    inline def createRandom(): Wallet = ^.asInstanceOf[js.Dynamic].applyDynamic("createRandom")().asInstanceOf[Wallet]
    inline def createRandom(options: Any): Wallet = ^.asInstanceOf[js.Dynamic].applyDynamic("createRandom")(options.asInstanceOf[js.Any]).asInstanceOf[Wallet]
    
    inline def fromEncryptedJson(json: String, password: String): js.Promise[Wallet] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEncryptedJson")(json.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Wallet]]
    inline def fromEncryptedJson(json: String, password: String, progressCallback: ProgressCallback): js.Promise[Wallet] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEncryptedJson")(json.asInstanceOf[js.Any], password.asInstanceOf[js.Any], progressCallback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Wallet]]
    inline def fromEncryptedJson(json: String, password: Bytes): js.Promise[Wallet] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEncryptedJson")(json.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Wallet]]
    inline def fromEncryptedJson(json: String, password: Bytes, progressCallback: ProgressCallback): js.Promise[Wallet] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEncryptedJson")(json.asInstanceOf[js.Any], password.asInstanceOf[js.Any], progressCallback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Wallet]]
    
    inline def fromEncryptedJsonSync(json: String, password: String): Wallet = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEncryptedJsonSync")(json.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[Wallet]
    inline def fromEncryptedJsonSync(json: String, password: Bytes): Wallet = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEncryptedJsonSync")(json.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[Wallet]
    
    inline def fromMnemonic(mnemonic: String): Wallet = ^.asInstanceOf[js.Dynamic].applyDynamic("fromMnemonic")(mnemonic.asInstanceOf[js.Any]).asInstanceOf[Wallet]
    inline def fromMnemonic(mnemonic: String, path: String): Wallet = (^.asInstanceOf[js.Dynamic].applyDynamic("fromMnemonic")(mnemonic.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[Wallet]
    inline def fromMnemonic(mnemonic: String, path: String, wordlist: Wordlist): Wallet = (^.asInstanceOf[js.Dynamic].applyDynamic("fromMnemonic")(mnemonic.asInstanceOf[js.Any], path.asInstanceOf[js.Any], wordlist.asInstanceOf[js.Any])).asInstanceOf[Wallet]
    inline def fromMnemonic(mnemonic: String, path: Unit, wordlist: Wordlist): Wallet = (^.asInstanceOf[js.Dynamic].applyDynamic("fromMnemonic")(mnemonic.asInstanceOf[js.Any], path.asInstanceOf[js.Any], wordlist.asInstanceOf[js.Any])).asInstanceOf[Wallet]
  }
  
  inline def verifyMessage(message: String, signature: SignatureLike): String = (^.asInstanceOf[js.Dynamic].applyDynamic("verifyMessage")(message.asInstanceOf[js.Any], signature.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def verifyMessage(message: Bytes, signature: SignatureLike): String = (^.asInstanceOf[js.Dynamic].applyDynamic("verifyMessage")(message.asInstanceOf[js.Any], signature.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def verifyTypedData(
    domain: TypedDataDomain,
    types: Record[String, js.Array[TypedDataField]],
    value: Record[String, Any],
    signature: SignatureLike
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("verifyTypedData")(domain.asInstanceOf[js.Any], types.asInstanceOf[js.Any], value.asInstanceOf[js.Any], signature.asInstanceOf[js.Any])).asInstanceOf[String]
}
