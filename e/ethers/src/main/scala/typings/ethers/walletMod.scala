package typings.ethers

import typings.ethers.typesCryptoMod.SigningKey
import typings.ethers.typesCryptoScryptMod.ProgressCallback
import typings.ethers.typesProvidersProviderMod.Provider
import typings.ethers.typesUtilsDataMod.BytesLike
import typings.ethers.typesUtilsMathsMod.Numeric
import typings.ethers.typesWalletJsonCrowdsaleMod.CrowdsaleAccount
import typings.ethers.typesWalletJsonKeystoreMod.EncryptOptions
import typings.ethers.typesWalletJsonKeystoreMod.KeystoreAccount
import typings.ethers.typesWordlistsMod.Wordlist
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object walletMod {
  
  @JSImport("ethers/wallet", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ethers/wallet", "BaseWallet")
  @js.native
  open class BaseWallet protected ()
    extends typings.ethers.typesWalletMod.BaseWallet {
    /**
      *  Creates a new BaseWallet for %%privateKey%%, optionally
      *  connected to %%provider%%.
      *
      *  If %%provider%% is not specified, only offline methods can
      *  be used.
      */
    def this(privateKey: SigningKey) = this()
    def this(privateKey: SigningKey, provider: Provider) = this()
  }
  
  @JSImport("ethers/wallet", "HDNodeVoidWallet")
  @js.native
  open class HDNodeVoidWallet protected ()
    extends typings.ethers.typesWalletMod.HDNodeVoidWallet {
    def this(
      guard: Any,
      address: String,
      publicKey: String,
      parentFingerprint: String,
      chainCode: String,
      path: String,
      index: Double,
      depth: Double
    ) = this()
    /**
      *  @private
      */
    def this(
      guard: Any,
      address: String,
      publicKey: String,
      parentFingerprint: String,
      chainCode: String,
      path: Null,
      index: Double,
      depth: Double
    ) = this()
    def this(
      guard: Any,
      address: String,
      publicKey: String,
      parentFingerprint: String,
      chainCode: String,
      path: String,
      index: Double,
      depth: Double,
      provider: Provider
    ) = this()
    def this(
      guard: Any,
      address: String,
      publicKey: String,
      parentFingerprint: String,
      chainCode: String,
      path: Null,
      index: Double,
      depth: Double,
      provider: Provider
    ) = this()
  }
  
  @JSImport("ethers/wallet", "HDNodeWallet")
  @js.native
  open class HDNodeWallet protected ()
    extends typings.ethers.typesWalletMod.HDNodeWallet {
    def this(
      guard: Any,
      signingKey: SigningKey,
      parentFingerprint: String,
      chainCode: String,
      path: String,
      index: Double,
      depth: Double
    ) = this()
    /**
      *  @private
      */
    def this(
      guard: Any,
      signingKey: SigningKey,
      parentFingerprint: String,
      chainCode: String,
      path: Null,
      index: Double,
      depth: Double
    ) = this()
    def this(
      guard: Any,
      signingKey: SigningKey,
      parentFingerprint: String,
      chainCode: String,
      path: String,
      index: Double,
      depth: Double,
      mnemonic: typings.ethers.typesWalletMnemonicMod.Mnemonic
    ) = this()
    def this(
      guard: Any,
      signingKey: SigningKey,
      parentFingerprint: String,
      chainCode: String,
      path: Null,
      index: Double,
      depth: Double,
      mnemonic: typings.ethers.typesWalletMnemonicMod.Mnemonic
    ) = this()
    def this(
      guard: Any,
      signingKey: SigningKey,
      parentFingerprint: String,
      chainCode: String,
      path: String,
      index: Double,
      depth: Double,
      mnemonic: Null,
      provider: Provider
    ) = this()
    def this(
      guard: Any,
      signingKey: SigningKey,
      parentFingerprint: String,
      chainCode: String,
      path: String,
      index: Double,
      depth: Double,
      mnemonic: typings.ethers.typesWalletMnemonicMod.Mnemonic,
      provider: Provider
    ) = this()
    def this(
      guard: Any,
      signingKey: SigningKey,
      parentFingerprint: String,
      chainCode: String,
      path: Null,
      index: Double,
      depth: Double,
      mnemonic: Null,
      provider: Provider
    ) = this()
    def this(
      guard: Any,
      signingKey: SigningKey,
      parentFingerprint: String,
      chainCode: String,
      path: Null,
      index: Double,
      depth: Double,
      mnemonic: typings.ethers.typesWalletMnemonicMod.Mnemonic,
      provider: Provider
    ) = this()
  }
  /* static members */
  object HDNodeWallet {
    
    @JSImport("ethers/wallet", "HDNodeWallet")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      *  Creates a new random HDNode.
      */
    inline def createRandom(): typings.ethers.typesWalletHdwalletMod.HDNodeWallet = ^.asInstanceOf[js.Dynamic].applyDynamic("createRandom")().asInstanceOf[typings.ethers.typesWalletHdwalletMod.HDNodeWallet]
    inline def createRandom(password: String): typings.ethers.typesWalletHdwalletMod.HDNodeWallet = ^.asInstanceOf[js.Dynamic].applyDynamic("createRandom")(password.asInstanceOf[js.Any]).asInstanceOf[typings.ethers.typesWalletHdwalletMod.HDNodeWallet]
    inline def createRandom(password: String, path: String): typings.ethers.typesWalletHdwalletMod.HDNodeWallet = (^.asInstanceOf[js.Dynamic].applyDynamic("createRandom")(password.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[typings.ethers.typesWalletHdwalletMod.HDNodeWallet]
    inline def createRandom(password: String, path: String, wordlist: Wordlist): typings.ethers.typesWalletHdwalletMod.HDNodeWallet = (^.asInstanceOf[js.Dynamic].applyDynamic("createRandom")(password.asInstanceOf[js.Any], path.asInstanceOf[js.Any], wordlist.asInstanceOf[js.Any])).asInstanceOf[typings.ethers.typesWalletHdwalletMod.HDNodeWallet]
    inline def createRandom(password: String, path: Unit, wordlist: Wordlist): typings.ethers.typesWalletHdwalletMod.HDNodeWallet = (^.asInstanceOf[js.Dynamic].applyDynamic("createRandom")(password.asInstanceOf[js.Any], path.asInstanceOf[js.Any], wordlist.asInstanceOf[js.Any])).asInstanceOf[typings.ethers.typesWalletHdwalletMod.HDNodeWallet]
    inline def createRandom(password: Unit, path: String): typings.ethers.typesWalletHdwalletMod.HDNodeWallet = (^.asInstanceOf[js.Dynamic].applyDynamic("createRandom")(password.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[typings.ethers.typesWalletHdwalletMod.HDNodeWallet]
    inline def createRandom(password: Unit, path: String, wordlist: Wordlist): typings.ethers.typesWalletHdwalletMod.HDNodeWallet = (^.asInstanceOf[js.Dynamic].applyDynamic("createRandom")(password.asInstanceOf[js.Any], path.asInstanceOf[js.Any], wordlist.asInstanceOf[js.Any])).asInstanceOf[typings.ethers.typesWalletHdwalletMod.HDNodeWallet]
    inline def createRandom(password: Unit, path: Unit, wordlist: Wordlist): typings.ethers.typesWalletHdwalletMod.HDNodeWallet = (^.asInstanceOf[js.Dynamic].applyDynamic("createRandom")(password.asInstanceOf[js.Any], path.asInstanceOf[js.Any], wordlist.asInstanceOf[js.Any])).asInstanceOf[typings.ethers.typesWalletHdwalletMod.HDNodeWallet]
    
    /**
      *  Creates a new HD Node from %%extendedKey%%.
      *
      *  If the %%extendedKey%% will either have a prefix or ``xpub`` or
      *  ``xpriv``, returning a neutered HD Node ([[HDNodeVoidWallet]])
      *  or full HD Node ([[HDNodeWallet) respectively.
      */
    inline def fromExtendedKey(extendedKey: String): typings.ethers.typesWalletHdwalletMod.HDNodeWallet | typings.ethers.typesWalletHdwalletMod.HDNodeVoidWallet = ^.asInstanceOf[js.Dynamic].applyDynamic("fromExtendedKey")(extendedKey.asInstanceOf[js.Any]).asInstanceOf[typings.ethers.typesWalletHdwalletMod.HDNodeWallet | typings.ethers.typesWalletHdwalletMod.HDNodeVoidWallet]
    
    /**
      *  Create am HD Node from %%mnemonic%%.
      */
    inline def fromMnemonic(mnemonic: typings.ethers.typesWalletMnemonicMod.Mnemonic): typings.ethers.typesWalletHdwalletMod.HDNodeWallet = ^.asInstanceOf[js.Dynamic].applyDynamic("fromMnemonic")(mnemonic.asInstanceOf[js.Any]).asInstanceOf[typings.ethers.typesWalletHdwalletMod.HDNodeWallet]
    inline def fromMnemonic(mnemonic: typings.ethers.typesWalletMnemonicMod.Mnemonic, path: String): typings.ethers.typesWalletHdwalletMod.HDNodeWallet = (^.asInstanceOf[js.Dynamic].applyDynamic("fromMnemonic")(mnemonic.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[typings.ethers.typesWalletHdwalletMod.HDNodeWallet]
    
    /**
      *  Creates an HD Node from a mnemonic %%phrase%%.
      */
    inline def fromPhrase(phrase: String): typings.ethers.typesWalletHdwalletMod.HDNodeWallet = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPhrase")(phrase.asInstanceOf[js.Any]).asInstanceOf[typings.ethers.typesWalletHdwalletMod.HDNodeWallet]
    inline def fromPhrase(phrase: String, password: String): typings.ethers.typesWalletHdwalletMod.HDNodeWallet = (^.asInstanceOf[js.Dynamic].applyDynamic("fromPhrase")(phrase.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[typings.ethers.typesWalletHdwalletMod.HDNodeWallet]
    inline def fromPhrase(phrase: String, password: String, path: String): typings.ethers.typesWalletHdwalletMod.HDNodeWallet = (^.asInstanceOf[js.Dynamic].applyDynamic("fromPhrase")(phrase.asInstanceOf[js.Any], password.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[typings.ethers.typesWalletHdwalletMod.HDNodeWallet]
    inline def fromPhrase(phrase: String, password: String, path: String, wordlist: Wordlist): typings.ethers.typesWalletHdwalletMod.HDNodeWallet = (^.asInstanceOf[js.Dynamic].applyDynamic("fromPhrase")(phrase.asInstanceOf[js.Any], password.asInstanceOf[js.Any], path.asInstanceOf[js.Any], wordlist.asInstanceOf[js.Any])).asInstanceOf[typings.ethers.typesWalletHdwalletMod.HDNodeWallet]
    inline def fromPhrase(phrase: String, password: String, path: Unit, wordlist: Wordlist): typings.ethers.typesWalletHdwalletMod.HDNodeWallet = (^.asInstanceOf[js.Dynamic].applyDynamic("fromPhrase")(phrase.asInstanceOf[js.Any], password.asInstanceOf[js.Any], path.asInstanceOf[js.Any], wordlist.asInstanceOf[js.Any])).asInstanceOf[typings.ethers.typesWalletHdwalletMod.HDNodeWallet]
    inline def fromPhrase(phrase: String, password: Unit, path: String): typings.ethers.typesWalletHdwalletMod.HDNodeWallet = (^.asInstanceOf[js.Dynamic].applyDynamic("fromPhrase")(phrase.asInstanceOf[js.Any], password.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[typings.ethers.typesWalletHdwalletMod.HDNodeWallet]
    inline def fromPhrase(phrase: String, password: Unit, path: String, wordlist: Wordlist): typings.ethers.typesWalletHdwalletMod.HDNodeWallet = (^.asInstanceOf[js.Dynamic].applyDynamic("fromPhrase")(phrase.asInstanceOf[js.Any], password.asInstanceOf[js.Any], path.asInstanceOf[js.Any], wordlist.asInstanceOf[js.Any])).asInstanceOf[typings.ethers.typesWalletHdwalletMod.HDNodeWallet]
    inline def fromPhrase(phrase: String, password: Unit, path: Unit, wordlist: Wordlist): typings.ethers.typesWalletHdwalletMod.HDNodeWallet = (^.asInstanceOf[js.Dynamic].applyDynamic("fromPhrase")(phrase.asInstanceOf[js.Any], password.asInstanceOf[js.Any], path.asInstanceOf[js.Any], wordlist.asInstanceOf[js.Any])).asInstanceOf[typings.ethers.typesWalletHdwalletMod.HDNodeWallet]
    
    /**
      *  Creates an HD Node from a %%seed%%.
      */
    inline def fromSeed(seed: BytesLike): typings.ethers.typesWalletHdwalletMod.HDNodeWallet = ^.asInstanceOf[js.Dynamic].applyDynamic("fromSeed")(seed.asInstanceOf[js.Any]).asInstanceOf[typings.ethers.typesWalletHdwalletMod.HDNodeWallet]
  }
  
  @JSImport("ethers/wallet", "Mnemonic")
  @js.native
  open class Mnemonic protected ()
    extends typings.ethers.typesWalletMod.Mnemonic {
    /**
      *  @private
      */
    def this(guard: Any, entropy: String, phrase: String) = this()
    def this(guard: Any, entropy: String, phrase: String, password: String) = this()
    def this(guard: Any, entropy: String, phrase: String, password: String, wordlist: Wordlist) = this()
    def this(guard: Any, entropy: String, phrase: String, password: Null, wordlist: Wordlist) = this()
    def this(guard: Any, entropy: String, phrase: String, password: Unit, wordlist: Wordlist) = this()
  }
  /* static members */
  object Mnemonic {
    
    @JSImport("ethers/wallet", "Mnemonic")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      *  Returns the phrase for %%mnemonic%%.
      */
    inline def entropyToPhrase(_entropy: BytesLike): String = ^.asInstanceOf[js.Dynamic].applyDynamic("entropyToPhrase")(_entropy.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def entropyToPhrase(_entropy: BytesLike, wordlist: Wordlist): String = (^.asInstanceOf[js.Dynamic].applyDynamic("entropyToPhrase")(_entropy.asInstanceOf[js.Any], wordlist.asInstanceOf[js.Any])).asInstanceOf[String]
    
    /**
      *  Create a new **Mnemonic** from the %%entropy%%.
      *
      *  The default %%password%% is the empty string and the default
      *  wordlist is the [English wordlists](LangEn).
      */
    inline def fromEntropy(_entropy: BytesLike): typings.ethers.typesWalletMnemonicMod.Mnemonic = ^.asInstanceOf[js.Dynamic].applyDynamic("fromEntropy")(_entropy.asInstanceOf[js.Any]).asInstanceOf[typings.ethers.typesWalletMnemonicMod.Mnemonic]
    inline def fromEntropy(_entropy: BytesLike, password: String): typings.ethers.typesWalletMnemonicMod.Mnemonic = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEntropy")(_entropy.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[typings.ethers.typesWalletMnemonicMod.Mnemonic]
    inline def fromEntropy(_entropy: BytesLike, password: String, wordlist: Wordlist): typings.ethers.typesWalletMnemonicMod.Mnemonic = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEntropy")(_entropy.asInstanceOf[js.Any], password.asInstanceOf[js.Any], wordlist.asInstanceOf[js.Any])).asInstanceOf[typings.ethers.typesWalletMnemonicMod.Mnemonic]
    inline def fromEntropy(_entropy: BytesLike, password: Null, wordlist: Wordlist): typings.ethers.typesWalletMnemonicMod.Mnemonic = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEntropy")(_entropy.asInstanceOf[js.Any], password.asInstanceOf[js.Any], wordlist.asInstanceOf[js.Any])).asInstanceOf[typings.ethers.typesWalletMnemonicMod.Mnemonic]
    inline def fromEntropy(_entropy: BytesLike, password: Unit, wordlist: Wordlist): typings.ethers.typesWalletMnemonicMod.Mnemonic = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEntropy")(_entropy.asInstanceOf[js.Any], password.asInstanceOf[js.Any], wordlist.asInstanceOf[js.Any])).asInstanceOf[typings.ethers.typesWalletMnemonicMod.Mnemonic]
    
    /**
      *  Creates a new Mnemonic for the %%phrase%%.
      *
      *  The default %%password%% is the empty string and the default
      *  wordlist is the [English wordlists](LangEn).
      */
    inline def fromPhrase(phrase: String): typings.ethers.typesWalletMnemonicMod.Mnemonic = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPhrase")(phrase.asInstanceOf[js.Any]).asInstanceOf[typings.ethers.typesWalletMnemonicMod.Mnemonic]
    inline def fromPhrase(phrase: String, password: String): typings.ethers.typesWalletMnemonicMod.Mnemonic = (^.asInstanceOf[js.Dynamic].applyDynamic("fromPhrase")(phrase.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[typings.ethers.typesWalletMnemonicMod.Mnemonic]
    inline def fromPhrase(phrase: String, password: String, wordlist: Wordlist): typings.ethers.typesWalletMnemonicMod.Mnemonic = (^.asInstanceOf[js.Dynamic].applyDynamic("fromPhrase")(phrase.asInstanceOf[js.Any], password.asInstanceOf[js.Any], wordlist.asInstanceOf[js.Any])).asInstanceOf[typings.ethers.typesWalletMnemonicMod.Mnemonic]
    inline def fromPhrase(phrase: String, password: Null, wordlist: Wordlist): typings.ethers.typesWalletMnemonicMod.Mnemonic = (^.asInstanceOf[js.Dynamic].applyDynamic("fromPhrase")(phrase.asInstanceOf[js.Any], password.asInstanceOf[js.Any], wordlist.asInstanceOf[js.Any])).asInstanceOf[typings.ethers.typesWalletMnemonicMod.Mnemonic]
    inline def fromPhrase(phrase: String, password: Unit, wordlist: Wordlist): typings.ethers.typesWalletMnemonicMod.Mnemonic = (^.asInstanceOf[js.Dynamic].applyDynamic("fromPhrase")(phrase.asInstanceOf[js.Any], password.asInstanceOf[js.Any], wordlist.asInstanceOf[js.Any])).asInstanceOf[typings.ethers.typesWalletMnemonicMod.Mnemonic]
    
    /**
      *  Returns true if %%phrase%% is a valid [[link-bip-39]] phrase.
      *
      *  This checks all the provided words belong to the %%wordlist%%,
      *  that the length is valid and the checksum is correct.
      */
    inline def isValidMnemonic(phrase: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidMnemonic")(phrase.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    inline def isValidMnemonic(phrase: String, wordlist: Wordlist): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isValidMnemonic")(phrase.asInstanceOf[js.Any], wordlist.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      *  Returns the entropy for %%phrase%%.
      */
    inline def phraseToEntropy(phrase: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("phraseToEntropy")(phrase.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def phraseToEntropy(phrase: String, wordlist: Wordlist): String = (^.asInstanceOf[js.Dynamic].applyDynamic("phraseToEntropy")(phrase.asInstanceOf[js.Any], wordlist.asInstanceOf[js.Any])).asInstanceOf[String]
  }
  
  @JSImport("ethers/wallet", "Wallet")
  @js.native
  open class Wallet protected ()
    extends typings.ethers.typesWalletMod.Wallet {
    /**
      *  Create a new wallet for the %%privateKey%%, optionally connected
      *  to %%provider%%.
      */
    def this(key: String) = this()
    def this(key: SigningKey) = this()
    def this(key: String, provider: Provider) = this()
    def this(key: SigningKey, provider: Provider) = this()
  }
  /* static members */
  object Wallet {
    
    @JSImport("ethers/wallet", "Wallet")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      *  Creates a new random [[HDNodeWallet]] using the avavilable
      *  [cryptographic random source](randomBytes).
      *
      *  If there is no crytographic random source, this will throw.
      */
    inline def createRandom(): typings.ethers.typesWalletHdwalletMod.HDNodeWallet = ^.asInstanceOf[js.Dynamic].applyDynamic("createRandom")().asInstanceOf[typings.ethers.typesWalletHdwalletMod.HDNodeWallet]
    inline def createRandom(provider: Provider): typings.ethers.typesWalletHdwalletMod.HDNodeWallet = ^.asInstanceOf[js.Dynamic].applyDynamic("createRandom")(provider.asInstanceOf[js.Any]).asInstanceOf[typings.ethers.typesWalletHdwalletMod.HDNodeWallet]
    
    inline def fromEncryptedJson(json: String, password: String): js.Promise[
        typings.ethers.typesWalletHdwalletMod.HDNodeWallet | typings.ethers.typesWalletWalletMod.Wallet
      ] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEncryptedJson")(json.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[js.Promise[
        typings.ethers.typesWalletHdwalletMod.HDNodeWallet | typings.ethers.typesWalletWalletMod.Wallet
      ]]
    inline def fromEncryptedJson(json: String, password: String, progress: ProgressCallback): js.Promise[
        typings.ethers.typesWalletHdwalletMod.HDNodeWallet | typings.ethers.typesWalletWalletMod.Wallet
      ] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEncryptedJson")(json.asInstanceOf[js.Any], password.asInstanceOf[js.Any], progress.asInstanceOf[js.Any])).asInstanceOf[js.Promise[
        typings.ethers.typesWalletHdwalletMod.HDNodeWallet | typings.ethers.typesWalletWalletMod.Wallet
      ]]
    /**
      *  Creates (asynchronously) a **Wallet** by decrypting the %%json%%
      *  with %%password%%.
      *
      *  If %%progress%% is provided, it is called periodically during
      *  decryption so that any UI can be updated.
      */
    inline def fromEncryptedJson(json: String, password: js.typedarray.Uint8Array): js.Promise[
        typings.ethers.typesWalletHdwalletMod.HDNodeWallet | typings.ethers.typesWalletWalletMod.Wallet
      ] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEncryptedJson")(json.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[js.Promise[
        typings.ethers.typesWalletHdwalletMod.HDNodeWallet | typings.ethers.typesWalletWalletMod.Wallet
      ]]
    inline def fromEncryptedJson(json: String, password: js.typedarray.Uint8Array, progress: ProgressCallback): js.Promise[
        typings.ethers.typesWalletHdwalletMod.HDNodeWallet | typings.ethers.typesWalletWalletMod.Wallet
      ] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEncryptedJson")(json.asInstanceOf[js.Any], password.asInstanceOf[js.Any], progress.asInstanceOf[js.Any])).asInstanceOf[js.Promise[
        typings.ethers.typesWalletHdwalletMod.HDNodeWallet | typings.ethers.typesWalletWalletMod.Wallet
      ]]
    
    inline def fromEncryptedJsonSync(json: String, password: String): typings.ethers.typesWalletHdwalletMod.HDNodeWallet | typings.ethers.typesWalletWalletMod.Wallet = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEncryptedJsonSync")(json.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[typings.ethers.typesWalletHdwalletMod.HDNodeWallet | typings.ethers.typesWalletWalletMod.Wallet]
    /**
      *  Creates a **Wallet** by decrypting the %%json%% with %%password%%.
      *
      *  The [[fromEncryptedJson]] method is preferred, as this method
      *  will lock up and freeze the UI during decryption, which may take
      *  some time.
      */
    inline def fromEncryptedJsonSync(json: String, password: js.typedarray.Uint8Array): typings.ethers.typesWalletHdwalletMod.HDNodeWallet | typings.ethers.typesWalletWalletMod.Wallet = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEncryptedJsonSync")(json.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[typings.ethers.typesWalletHdwalletMod.HDNodeWallet | typings.ethers.typesWalletWalletMod.Wallet]
    
    /**
      *  Creates a [[HDNodeWallet]] for %%phrase%%.
      */
    inline def fromPhrase(phrase: String): typings.ethers.typesWalletHdwalletMod.HDNodeWallet = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPhrase")(phrase.asInstanceOf[js.Any]).asInstanceOf[typings.ethers.typesWalletHdwalletMod.HDNodeWallet]
    inline def fromPhrase(phrase: String, provider: Provider): typings.ethers.typesWalletHdwalletMod.HDNodeWallet = (^.asInstanceOf[js.Dynamic].applyDynamic("fromPhrase")(phrase.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[typings.ethers.typesWalletHdwalletMod.HDNodeWallet]
  }
  
  inline def decryptCrowdsaleJson(json: String, _password: String): CrowdsaleAccount = (^.asInstanceOf[js.Dynamic].applyDynamic("decryptCrowdsaleJson")(json.asInstanceOf[js.Any], _password.asInstanceOf[js.Any])).asInstanceOf[CrowdsaleAccount]
  inline def decryptCrowdsaleJson(json: String, _password: js.typedarray.Uint8Array): CrowdsaleAccount = (^.asInstanceOf[js.Dynamic].applyDynamic("decryptCrowdsaleJson")(json.asInstanceOf[js.Any], _password.asInstanceOf[js.Any])).asInstanceOf[CrowdsaleAccount]
  
  inline def decryptKeystoreJson(json: String, _password: String): js.Promise[KeystoreAccount] = (^.asInstanceOf[js.Dynamic].applyDynamic("decryptKeystoreJson")(json.asInstanceOf[js.Any], _password.asInstanceOf[js.Any])).asInstanceOf[js.Promise[KeystoreAccount]]
  inline def decryptKeystoreJson(json: String, _password: String, progress: ProgressCallback): js.Promise[KeystoreAccount] = (^.asInstanceOf[js.Dynamic].applyDynamic("decryptKeystoreJson")(json.asInstanceOf[js.Any], _password.asInstanceOf[js.Any], progress.asInstanceOf[js.Any])).asInstanceOf[js.Promise[KeystoreAccount]]
  inline def decryptKeystoreJson(json: String, _password: js.typedarray.Uint8Array): js.Promise[KeystoreAccount] = (^.asInstanceOf[js.Dynamic].applyDynamic("decryptKeystoreJson")(json.asInstanceOf[js.Any], _password.asInstanceOf[js.Any])).asInstanceOf[js.Promise[KeystoreAccount]]
  inline def decryptKeystoreJson(json: String, _password: js.typedarray.Uint8Array, progress: ProgressCallback): js.Promise[KeystoreAccount] = (^.asInstanceOf[js.Dynamic].applyDynamic("decryptKeystoreJson")(json.asInstanceOf[js.Any], _password.asInstanceOf[js.Any], progress.asInstanceOf[js.Any])).asInstanceOf[js.Promise[KeystoreAccount]]
  
  inline def decryptKeystoreJsonSync(json: String, _password: String): KeystoreAccount = (^.asInstanceOf[js.Dynamic].applyDynamic("decryptKeystoreJsonSync")(json.asInstanceOf[js.Any], _password.asInstanceOf[js.Any])).asInstanceOf[KeystoreAccount]
  inline def decryptKeystoreJsonSync(json: String, _password: js.typedarray.Uint8Array): KeystoreAccount = (^.asInstanceOf[js.Dynamic].applyDynamic("decryptKeystoreJsonSync")(json.asInstanceOf[js.Any], _password.asInstanceOf[js.Any])).asInstanceOf[KeystoreAccount]
  
  @JSImport("ethers/wallet", "defaultPath")
  @js.native
  val defaultPath: String = js.native
  
  inline def encryptKeystoreJson(account: KeystoreAccount, password: String): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("encryptKeystoreJson")(account.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def encryptKeystoreJson(account: KeystoreAccount, password: String, options: EncryptOptions): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("encryptKeystoreJson")(account.asInstanceOf[js.Any], password.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def encryptKeystoreJson(account: KeystoreAccount, password: js.typedarray.Uint8Array): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("encryptKeystoreJson")(account.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def encryptKeystoreJson(account: KeystoreAccount, password: js.typedarray.Uint8Array, options: EncryptOptions): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("encryptKeystoreJson")(account.asInstanceOf[js.Any], password.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  inline def encryptKeystoreJsonSync(account: KeystoreAccount, password: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encryptKeystoreJsonSync")(account.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def encryptKeystoreJsonSync(account: KeystoreAccount, password: String, options: EncryptOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encryptKeystoreJsonSync")(account.asInstanceOf[js.Any], password.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def encryptKeystoreJsonSync(account: KeystoreAccount, password: js.typedarray.Uint8Array): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encryptKeystoreJsonSync")(account.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def encryptKeystoreJsonSync(account: KeystoreAccount, password: js.typedarray.Uint8Array, options: EncryptOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encryptKeystoreJsonSync")(account.asInstanceOf[js.Any], password.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getAccountPath(_index: Numeric): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getAccountPath")(_index.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getIndexedAccountPath(_index: Numeric): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getIndexedAccountPath")(_index.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def isCrowdsaleJson(json: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCrowdsaleJson")(json.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isKeystoreJson(json: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isKeystoreJson")(json.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
