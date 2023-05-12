package typings.ethers.typesEthersMod

import typings.ethers.typesProvidersProviderMod.Provider
import typings.ethers.typesUtilsDataMod.BytesLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ethers/types/ethers", "HDNodeWallet")
@js.native
open class HDNodeWallet protected ()
  extends typings.ethers.typesWalletMod.HDNodeWallet {
  def this(
    guard: Any,
    signingKey: typings.ethers.typesCryptoMod.SigningKey,
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
    signingKey: typings.ethers.typesCryptoMod.SigningKey,
    parentFingerprint: String,
    chainCode: String,
    path: Null,
    index: Double,
    depth: Double
  ) = this()
  def this(
    guard: Any,
    signingKey: typings.ethers.typesCryptoMod.SigningKey,
    parentFingerprint: String,
    chainCode: String,
    path: String,
    index: Double,
    depth: Double,
    mnemonic: typings.ethers.typesWalletMnemonicMod.Mnemonic
  ) = this()
  def this(
    guard: Any,
    signingKey: typings.ethers.typesCryptoMod.SigningKey,
    parentFingerprint: String,
    chainCode: String,
    path: Null,
    index: Double,
    depth: Double,
    mnemonic: typings.ethers.typesWalletMnemonicMod.Mnemonic
  ) = this()
  def this(
    guard: Any,
    signingKey: typings.ethers.typesCryptoMod.SigningKey,
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
    signingKey: typings.ethers.typesCryptoMod.SigningKey,
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
    signingKey: typings.ethers.typesCryptoMod.SigningKey,
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
    signingKey: typings.ethers.typesCryptoMod.SigningKey,
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
  
  @JSImport("ethers/types/ethers", "HDNodeWallet")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    *  Creates a new random HDNode.
    */
  inline def createRandom(): typings.ethers.typesWalletHdwalletMod.HDNodeWallet = ^.asInstanceOf[js.Dynamic].applyDynamic("createRandom")().asInstanceOf[typings.ethers.typesWalletHdwalletMod.HDNodeWallet]
  inline def createRandom(password: String): typings.ethers.typesWalletHdwalletMod.HDNodeWallet = ^.asInstanceOf[js.Dynamic].applyDynamic("createRandom")(password.asInstanceOf[js.Any]).asInstanceOf[typings.ethers.typesWalletHdwalletMod.HDNodeWallet]
  inline def createRandom(password: String, path: String): typings.ethers.typesWalletHdwalletMod.HDNodeWallet = (^.asInstanceOf[js.Dynamic].applyDynamic("createRandom")(password.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[typings.ethers.typesWalletHdwalletMod.HDNodeWallet]
  inline def createRandom(password: String, path: String, wordlist: typings.ethers.typesWordlistsMod.Wordlist): typings.ethers.typesWalletHdwalletMod.HDNodeWallet = (^.asInstanceOf[js.Dynamic].applyDynamic("createRandom")(password.asInstanceOf[js.Any], path.asInstanceOf[js.Any], wordlist.asInstanceOf[js.Any])).asInstanceOf[typings.ethers.typesWalletHdwalletMod.HDNodeWallet]
  inline def createRandom(password: String, path: Unit, wordlist: typings.ethers.typesWordlistsMod.Wordlist): typings.ethers.typesWalletHdwalletMod.HDNodeWallet = (^.asInstanceOf[js.Dynamic].applyDynamic("createRandom")(password.asInstanceOf[js.Any], path.asInstanceOf[js.Any], wordlist.asInstanceOf[js.Any])).asInstanceOf[typings.ethers.typesWalletHdwalletMod.HDNodeWallet]
  inline def createRandom(password: Unit, path: String): typings.ethers.typesWalletHdwalletMod.HDNodeWallet = (^.asInstanceOf[js.Dynamic].applyDynamic("createRandom")(password.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[typings.ethers.typesWalletHdwalletMod.HDNodeWallet]
  inline def createRandom(password: Unit, path: String, wordlist: typings.ethers.typesWordlistsMod.Wordlist): typings.ethers.typesWalletHdwalletMod.HDNodeWallet = (^.asInstanceOf[js.Dynamic].applyDynamic("createRandom")(password.asInstanceOf[js.Any], path.asInstanceOf[js.Any], wordlist.asInstanceOf[js.Any])).asInstanceOf[typings.ethers.typesWalletHdwalletMod.HDNodeWallet]
  inline def createRandom(password: Unit, path: Unit, wordlist: typings.ethers.typesWordlistsMod.Wordlist): typings.ethers.typesWalletHdwalletMod.HDNodeWallet = (^.asInstanceOf[js.Dynamic].applyDynamic("createRandom")(password.asInstanceOf[js.Any], path.asInstanceOf[js.Any], wordlist.asInstanceOf[js.Any])).asInstanceOf[typings.ethers.typesWalletHdwalletMod.HDNodeWallet]
  
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
  inline def fromPhrase(
    phrase: String,
    password: String,
    path: String,
    wordlist: typings.ethers.typesWordlistsMod.Wordlist
  ): typings.ethers.typesWalletHdwalletMod.HDNodeWallet = (^.asInstanceOf[js.Dynamic].applyDynamic("fromPhrase")(phrase.asInstanceOf[js.Any], password.asInstanceOf[js.Any], path.asInstanceOf[js.Any], wordlist.asInstanceOf[js.Any])).asInstanceOf[typings.ethers.typesWalletHdwalletMod.HDNodeWallet]
  inline def fromPhrase(phrase: String, password: String, path: Unit, wordlist: typings.ethers.typesWordlistsMod.Wordlist): typings.ethers.typesWalletHdwalletMod.HDNodeWallet = (^.asInstanceOf[js.Dynamic].applyDynamic("fromPhrase")(phrase.asInstanceOf[js.Any], password.asInstanceOf[js.Any], path.asInstanceOf[js.Any], wordlist.asInstanceOf[js.Any])).asInstanceOf[typings.ethers.typesWalletHdwalletMod.HDNodeWallet]
  inline def fromPhrase(phrase: String, password: Unit, path: String): typings.ethers.typesWalletHdwalletMod.HDNodeWallet = (^.asInstanceOf[js.Dynamic].applyDynamic("fromPhrase")(phrase.asInstanceOf[js.Any], password.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[typings.ethers.typesWalletHdwalletMod.HDNodeWallet]
  inline def fromPhrase(phrase: String, password: Unit, path: String, wordlist: typings.ethers.typesWordlistsMod.Wordlist): typings.ethers.typesWalletHdwalletMod.HDNodeWallet = (^.asInstanceOf[js.Dynamic].applyDynamic("fromPhrase")(phrase.asInstanceOf[js.Any], password.asInstanceOf[js.Any], path.asInstanceOf[js.Any], wordlist.asInstanceOf[js.Any])).asInstanceOf[typings.ethers.typesWalletHdwalletMod.HDNodeWallet]
  inline def fromPhrase(phrase: String, password: Unit, path: Unit, wordlist: typings.ethers.typesWordlistsMod.Wordlist): typings.ethers.typesWalletHdwalletMod.HDNodeWallet = (^.asInstanceOf[js.Dynamic].applyDynamic("fromPhrase")(phrase.asInstanceOf[js.Any], password.asInstanceOf[js.Any], path.asInstanceOf[js.Any], wordlist.asInstanceOf[js.Any])).asInstanceOf[typings.ethers.typesWalletHdwalletMod.HDNodeWallet]
  
  /**
    *  Creates an HD Node from a %%seed%%.
    */
  inline def fromSeed(seed: BytesLike): typings.ethers.typesWalletHdwalletMod.HDNodeWallet = ^.asInstanceOf[js.Dynamic].applyDynamic("fromSeed")(seed.asInstanceOf[js.Any]).asInstanceOf[typings.ethers.typesWalletHdwalletMod.HDNodeWallet]
}
