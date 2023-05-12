package typings.ethers

import typings.ethers.typesCryptoMod.SigningKey
import typings.ethers.typesCryptoScryptMod.ProgressCallback
import typings.ethers.typesProvidersMod.VoidSigner
import typings.ethers.typesProvidersProviderMod.Provider
import typings.ethers.typesUtilsDataMod.BytesLike
import typings.ethers.typesUtilsMathsMod.Numeric
import typings.ethers.typesWalletBaseWalletMod.BaseWallet
import typings.ethers.typesWalletMnemonicMod.Mnemonic
import typings.ethers.typesWordlistsMod.Wordlist
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesWalletHdwalletMod {
  
  @JSImport("ethers/types/wallet/hdwallet", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ethers/types/wallet/hdwallet", "HDNodeVoidWallet")
  @js.native
  open class HDNodeVoidWallet protected () extends VoidSigner {
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
    
    /**
      *  The chaincode, which is effectively a public key used
      *  to derive children.
      */
    val chainCode: String = js.native
    
    /**
      *  The depth of this wallet, which is the number of components
      *  in its path.
      */
    val depth: Double = js.native
    
    /**
      *  Return the child for %%index%%.
      */
    def deriveChild(_index: Numeric): HDNodeVoidWallet = js.native
    
    /**
      *  Return the signer for %%path%% from this node.
      */
    def derivePath(path: String): HDNodeVoidWallet = js.native
    
    /**
      *  The extended key.
      *
      *  This key will begin with the prefix ``xpub`` and can be used to
      *  reconstruct this neutered key to derive its children addresses.
      */
    def extendedKey: String = js.native
    
    /**
      *  The fingerprint.
      *
      *  A fingerprint allows quick qay to detect parent and child nodes,
      *  but developers should be prepared to deal with collisions as it
      *  is only 4 bytes.
      */
    val fingerprint: String = js.native
    
    /**
      *  Returns true if this wallet has a path, providing a Type Guard
      *  that the path is non-null.
      */
    def hasPath(): /* is ethers.anon.Path */ Boolean = js.native
    
    /**
      *  The child index of this wallet. Values over ``2 *\* 31`` indicate
      *  the node is hardened.
      */
    val index: Double = js.native
    
    /**
      *  The parent node fingerprint.
      */
    val parentFingerprint: String = js.native
    
    /**
      *  The derivation path of this wallet.
      *
      *  Since extended keys do not provider full path details, this
      *  may be ``null``, if instantiated from a source that does not
      *  enocde it.
      */
    val path: Null | String = js.native
    
    /**
      *  The compressed public key.
      */
    val publicKey: String = js.native
  }
  
  @JSImport("ethers/types/wallet/hdwallet", "HDNodeWallet")
  @js.native
  open class HDNodeWallet protected () extends BaseWallet {
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
      mnemonic: Mnemonic
    ) = this()
    def this(
      guard: Any,
      signingKey: SigningKey,
      parentFingerprint: String,
      chainCode: String,
      path: Null,
      index: Double,
      depth: Double,
      mnemonic: Mnemonic
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
      mnemonic: Mnemonic,
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
      mnemonic: Mnemonic,
      provider: Provider
    ) = this()
    
    /**
      *  The chaincode, which is effectively a public key used
      *  to derive children.
      */
    val chainCode: String = js.native
    
    /**
      *  The depth of this wallet, which is the number of components
      *  in its path.
      */
    val depth: Double = js.native
    
    /**
      *  Return the child for %%index%%.
      */
    def deriveChild(_index: Numeric): HDNodeWallet = js.native
    
    /**
      *  Return the HDNode for %%path%% from this node.
      */
    def derivePath(path: String): HDNodeWallet = js.native
    
    def encrypt(password: String): js.Promise[String] = js.native
    def encrypt(password: String, progressCallback: ProgressCallback): js.Promise[String] = js.native
    /**
      *  Resolves to a [JSON Keystore Wallet](json-wallets) encrypted with
      *  %%password%%.
      *
      *  If %%progressCallback%% is specified, it will receive periodic
      *  updates as the encryption process progreses.
      */
    def encrypt(password: js.typedarray.Uint8Array): js.Promise[String] = js.native
    def encrypt(password: js.typedarray.Uint8Array, progressCallback: ProgressCallback): js.Promise[String] = js.native
    
    def encryptSync(password: String): String = js.native
    /**
      *  Returns a [JSON Keystore Wallet](json-wallets) encryped with
      *  %%password%%.
      *
      *  It is preferred to use the [async version](encrypt) instead,
      *  which allows a [[ProgressCallback]] to keep the user informed.
      *
      *  This method will block the event loop (freezing all UI) until
      *  it is complete, which may be a non-trivial duration.
      */
    def encryptSync(password: js.typedarray.Uint8Array): String = js.native
    
    /**
      *  The extended key.
      *
      *  This key will begin with the prefix ``xpriv`` and can be used to
      *  reconstruct this HD Node to derive its children.
      */
    def extendedKey: String = js.native
    
    /**
      *  The fingerprint.
      *
      *  A fingerprint allows quick qay to detect parent and child nodes,
      *  but developers should be prepared to deal with collisions as it
      *  is only 4 bytes.
      */
    val fingerprint: String = js.native
    
    /**
      *  Returns true if this wallet has a path, providing a Type Guard
      *  that the path is non-null.
      */
    def hasPath(): /* is ethers.anon.Path */ Boolean = js.native
    
    /**
      *  The child index of this wallet. Values over ``2 *\* 31`` indicate
      *  the node is hardened.
      */
    val index: Double = js.native
    
    /**
      *  The mnemonic used to create this HD Node, if available.
      *
      *  Sources such as extended keys do not encode the mnemonic, in
      *  which case this will be ``null``.
      */
    val mnemonic: Null | Mnemonic = js.native
    
    /**
      *  Returns a neutered HD Node, which removes the private details
      *  of an HD Node.
      *
      *  A neutered node has no private key, but can be used to derive
      *  child addresses and other public data about the HD Node.
      */
    def neuter(): HDNodeVoidWallet = js.native
    
    /**
      *  The parent fingerprint.
      */
    val parentFingerprint: String = js.native
    
    /**
      *  The derivation path of this wallet.
      *
      *  Since extended keys do not provider full path details, this
      *  may be ``null``, if instantiated from a source that does not
      *  enocde it.
      */
    val path: Null | String = js.native
    
    /**
      *  The compressed public key.
      */
    val publicKey: String = js.native
  }
  /* static members */
  object HDNodeWallet {
    
    @JSImport("ethers/types/wallet/hdwallet", "HDNodeWallet")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      *  Creates a new random HDNode.
      */
    inline def createRandom(): HDNodeWallet = ^.asInstanceOf[js.Dynamic].applyDynamic("createRandom")().asInstanceOf[HDNodeWallet]
    inline def createRandom(password: String): HDNodeWallet = ^.asInstanceOf[js.Dynamic].applyDynamic("createRandom")(password.asInstanceOf[js.Any]).asInstanceOf[HDNodeWallet]
    inline def createRandom(password: String, path: String): HDNodeWallet = (^.asInstanceOf[js.Dynamic].applyDynamic("createRandom")(password.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[HDNodeWallet]
    inline def createRandom(password: String, path: String, wordlist: Wordlist): HDNodeWallet = (^.asInstanceOf[js.Dynamic].applyDynamic("createRandom")(password.asInstanceOf[js.Any], path.asInstanceOf[js.Any], wordlist.asInstanceOf[js.Any])).asInstanceOf[HDNodeWallet]
    inline def createRandom(password: String, path: Unit, wordlist: Wordlist): HDNodeWallet = (^.asInstanceOf[js.Dynamic].applyDynamic("createRandom")(password.asInstanceOf[js.Any], path.asInstanceOf[js.Any], wordlist.asInstanceOf[js.Any])).asInstanceOf[HDNodeWallet]
    inline def createRandom(password: Unit, path: String): HDNodeWallet = (^.asInstanceOf[js.Dynamic].applyDynamic("createRandom")(password.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[HDNodeWallet]
    inline def createRandom(password: Unit, path: String, wordlist: Wordlist): HDNodeWallet = (^.asInstanceOf[js.Dynamic].applyDynamic("createRandom")(password.asInstanceOf[js.Any], path.asInstanceOf[js.Any], wordlist.asInstanceOf[js.Any])).asInstanceOf[HDNodeWallet]
    inline def createRandom(password: Unit, path: Unit, wordlist: Wordlist): HDNodeWallet = (^.asInstanceOf[js.Dynamic].applyDynamic("createRandom")(password.asInstanceOf[js.Any], path.asInstanceOf[js.Any], wordlist.asInstanceOf[js.Any])).asInstanceOf[HDNodeWallet]
    
    /**
      *  Creates a new HD Node from %%extendedKey%%.
      *
      *  If the %%extendedKey%% will either have a prefix or ``xpub`` or
      *  ``xpriv``, returning a neutered HD Node ([[HDNodeVoidWallet]])
      *  or full HD Node ([[HDNodeWallet) respectively.
      */
    inline def fromExtendedKey(extendedKey: String): HDNodeWallet | HDNodeVoidWallet = ^.asInstanceOf[js.Dynamic].applyDynamic("fromExtendedKey")(extendedKey.asInstanceOf[js.Any]).asInstanceOf[HDNodeWallet | HDNodeVoidWallet]
    
    /**
      *  Create am HD Node from %%mnemonic%%.
      */
    inline def fromMnemonic(mnemonic: Mnemonic): HDNodeWallet = ^.asInstanceOf[js.Dynamic].applyDynamic("fromMnemonic")(mnemonic.asInstanceOf[js.Any]).asInstanceOf[HDNodeWallet]
    inline def fromMnemonic(mnemonic: Mnemonic, path: String): HDNodeWallet = (^.asInstanceOf[js.Dynamic].applyDynamic("fromMnemonic")(mnemonic.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[HDNodeWallet]
    
    /**
      *  Creates an HD Node from a mnemonic %%phrase%%.
      */
    inline def fromPhrase(phrase: String): HDNodeWallet = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPhrase")(phrase.asInstanceOf[js.Any]).asInstanceOf[HDNodeWallet]
    inline def fromPhrase(phrase: String, password: String): HDNodeWallet = (^.asInstanceOf[js.Dynamic].applyDynamic("fromPhrase")(phrase.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[HDNodeWallet]
    inline def fromPhrase(phrase: String, password: String, path: String): HDNodeWallet = (^.asInstanceOf[js.Dynamic].applyDynamic("fromPhrase")(phrase.asInstanceOf[js.Any], password.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[HDNodeWallet]
    inline def fromPhrase(phrase: String, password: String, path: String, wordlist: Wordlist): HDNodeWallet = (^.asInstanceOf[js.Dynamic].applyDynamic("fromPhrase")(phrase.asInstanceOf[js.Any], password.asInstanceOf[js.Any], path.asInstanceOf[js.Any], wordlist.asInstanceOf[js.Any])).asInstanceOf[HDNodeWallet]
    inline def fromPhrase(phrase: String, password: String, path: Unit, wordlist: Wordlist): HDNodeWallet = (^.asInstanceOf[js.Dynamic].applyDynamic("fromPhrase")(phrase.asInstanceOf[js.Any], password.asInstanceOf[js.Any], path.asInstanceOf[js.Any], wordlist.asInstanceOf[js.Any])).asInstanceOf[HDNodeWallet]
    inline def fromPhrase(phrase: String, password: Unit, path: String): HDNodeWallet = (^.asInstanceOf[js.Dynamic].applyDynamic("fromPhrase")(phrase.asInstanceOf[js.Any], password.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[HDNodeWallet]
    inline def fromPhrase(phrase: String, password: Unit, path: String, wordlist: Wordlist): HDNodeWallet = (^.asInstanceOf[js.Dynamic].applyDynamic("fromPhrase")(phrase.asInstanceOf[js.Any], password.asInstanceOf[js.Any], path.asInstanceOf[js.Any], wordlist.asInstanceOf[js.Any])).asInstanceOf[HDNodeWallet]
    inline def fromPhrase(phrase: String, password: Unit, path: Unit, wordlist: Wordlist): HDNodeWallet = (^.asInstanceOf[js.Dynamic].applyDynamic("fromPhrase")(phrase.asInstanceOf[js.Any], password.asInstanceOf[js.Any], path.asInstanceOf[js.Any], wordlist.asInstanceOf[js.Any])).asInstanceOf[HDNodeWallet]
    
    /**
      *  Creates an HD Node from a %%seed%%.
      */
    inline def fromSeed(seed: BytesLike): HDNodeWallet = ^.asInstanceOf[js.Dynamic].applyDynamic("fromSeed")(seed.asInstanceOf[js.Any]).asInstanceOf[HDNodeWallet]
  }
  
  @JSImport("ethers/types/wallet/hdwallet", "defaultPath")
  @js.native
  val defaultPath: String = js.native
  
  inline def getAccountPath(_index: Numeric): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getAccountPath")(_index.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getIndexedAccountPath(_index: Numeric): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getIndexedAccountPath")(_index.asInstanceOf[js.Any]).asInstanceOf[String]
}
