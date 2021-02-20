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
import typings.ethersprojectJsonWallets.keystoreMod.ProgressCallback
import typings.ethersprojectSigningKey.mod.SigningKey
import typings.ethersprojectWordlists.mod.Wordlist
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@ethersproject/wallet", "Wallet")
  @js.native
  class Wallet protected ()
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
    
    def _signingKey(): SigningKey = js.native
    
    def encrypt(password: String): js.Promise[String] = js.native
    def encrypt(password: String, options: js.UndefOr[scala.Nothing], progressCallback: ProgressCallback): js.Promise[String] = js.native
    def encrypt(password: String, options: js.Any): js.Promise[String] = js.native
    def encrypt(password: String, options: js.Any, progressCallback: ProgressCallback): js.Promise[String] = js.native
    def encrypt(password: Bytes): js.Promise[String] = js.native
    def encrypt(password: Bytes, options: js.UndefOr[scala.Nothing], progressCallback: ProgressCallback): js.Promise[String] = js.native
    def encrypt(password: Bytes, options: js.Any): js.Promise[String] = js.native
    def encrypt(password: Bytes, options: js.Any, progressCallback: ProgressCallback): js.Promise[String] = js.native
    
    def mnemonic: Mnemonic = js.native
    
    @JSName("privateKey")
    def privateKey_MWallet: String = js.native
    
    @JSName("provider")
    val provider_Wallet: Provider = js.native
    
    def publicKey: String = js.native
    
    def signTransaction(transaction: TransactionRequest): js.Promise[String] = js.native
  }
  /* static members */
  object Wallet {
    
    /**
      *  Static methods to create Wallet instances.
      */
    @JSImport("@ethersproject/wallet", "Wallet.createRandom")
    @js.native
    def createRandom(): Wallet = js.native
    @JSImport("@ethersproject/wallet", "Wallet.createRandom")
    @js.native
    def createRandom(options: js.Any): Wallet = js.native
    
    @JSImport("@ethersproject/wallet", "Wallet.fromEncryptedJson")
    @js.native
    def fromEncryptedJson(json: String, password: String): js.Promise[Wallet] = js.native
    @JSImport("@ethersproject/wallet", "Wallet.fromEncryptedJson")
    @js.native
    def fromEncryptedJson(json: String, password: String, progressCallback: ProgressCallback): js.Promise[Wallet] = js.native
    @JSImport("@ethersproject/wallet", "Wallet.fromEncryptedJson")
    @js.native
    def fromEncryptedJson(json: String, password: Bytes): js.Promise[Wallet] = js.native
    @JSImport("@ethersproject/wallet", "Wallet.fromEncryptedJson")
    @js.native
    def fromEncryptedJson(json: String, password: Bytes, progressCallback: ProgressCallback): js.Promise[Wallet] = js.native
    
    @JSImport("@ethersproject/wallet", "Wallet.fromEncryptedJsonSync")
    @js.native
    def fromEncryptedJsonSync(json: String, password: String): Wallet = js.native
    @JSImport("@ethersproject/wallet", "Wallet.fromEncryptedJsonSync")
    @js.native
    def fromEncryptedJsonSync(json: String, password: Bytes): Wallet = js.native
    
    @JSImport("@ethersproject/wallet", "Wallet.fromMnemonic")
    @js.native
    def fromMnemonic(mnemonic: String): Wallet = js.native
    @JSImport("@ethersproject/wallet", "Wallet.fromMnemonic")
    @js.native
    def fromMnemonic(mnemonic: String, path: js.UndefOr[scala.Nothing], wordlist: Wordlist): Wallet = js.native
    @JSImport("@ethersproject/wallet", "Wallet.fromMnemonic")
    @js.native
    def fromMnemonic(mnemonic: String, path: String): Wallet = js.native
    @JSImport("@ethersproject/wallet", "Wallet.fromMnemonic")
    @js.native
    def fromMnemonic(mnemonic: String, path: String, wordlist: Wordlist): Wallet = js.native
  }
  
  @JSImport("@ethersproject/wallet", "verifyMessage")
  @js.native
  def verifyMessage(message: String, signature: SignatureLike): String = js.native
  @JSImport("@ethersproject/wallet", "verifyMessage")
  @js.native
  def verifyMessage(message: Bytes, signature: SignatureLike): String = js.native
  
  @JSImport("@ethersproject/wallet", "verifyTypedData")
  @js.native
  def verifyTypedData(
    domain: TypedDataDomain,
    types: Record[String, js.Array[TypedDataField]],
    value: Record[String, _],
    signature: SignatureLike
  ): String = js.native
}
