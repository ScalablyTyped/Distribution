package typings.ethersprojectHdnode

import typings.ethersprojectAbstractSigner.mod.ExternallyOwnedAccount
import typings.ethersprojectBytes.mod.BytesLike
import typings.ethersprojectWordlists.mod.Wordlist
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@ethersproject/hdnode", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@ethersproject/hdnode", "HDNode")
  @js.native
  class HDNode protected ()
    extends StObject
       with ExternallyOwnedAccount {
    def this(
      constructorGuard: js.Any,
      privateKey: String,
      publicKey: String,
      parentFingerprint: String,
      chainCode: String,
      index: Double,
      depth: Double,
      mnemonicOrPath: String
    ) = this()
    /**
      *  This constructor should not be called directly.
      *
      *  Please use:
      *   - fromMnemonic
      *   - fromSeed
      */
    def this(
      constructorGuard: js.Any,
      privateKey: String,
      publicKey: String,
      parentFingerprint: String,
      chainCode: String,
      index: Double,
      depth: Double,
      mnemonicOrPath: Mnemonic
    ) = this()
    
    var _derive: js.Any = js.native
    
    /* CompleteClass */
    override val address: String = js.native
    
    val chainCode: String = js.native
    
    val depth: Double = js.native
    
    def derivePath(path: String): HDNode = js.native
    
    def extendedKey: String = js.native
    
    val fingerprint: String = js.native
    
    val index: Double = js.native
    
    val mnemonic: js.UndefOr[Mnemonic] = js.native
    
    def neuter(): HDNode = js.native
    
    val parentFingerprint: String = js.native
    
    val path: String = js.native
    
    /* CompleteClass */
    override val privateKey: String = js.native
    
    val publicKey: String = js.native
  }
  /* static members */
  object HDNode {
    
    @JSImport("@ethersproject/hdnode", "HDNode")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def _fromSeed(seed: BytesLike, mnemonic: Mnemonic): HDNode = (^.asInstanceOf[js.Dynamic].applyDynamic("_fromSeed")(seed.asInstanceOf[js.Any], mnemonic.asInstanceOf[js.Any])).asInstanceOf[HDNode]
    
    @scala.inline
    def fromExtendedKey(extendedKey: String): HDNode = ^.asInstanceOf[js.Dynamic].applyDynamic("fromExtendedKey")(extendedKey.asInstanceOf[js.Any]).asInstanceOf[HDNode]
    
    @scala.inline
    def fromMnemonic(mnemonic: String): HDNode = ^.asInstanceOf[js.Dynamic].applyDynamic("fromMnemonic")(mnemonic.asInstanceOf[js.Any]).asInstanceOf[HDNode]
    @scala.inline
    def fromMnemonic(mnemonic: String, password: String): HDNode = (^.asInstanceOf[js.Dynamic].applyDynamic("fromMnemonic")(mnemonic.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[HDNode]
    @scala.inline
    def fromMnemonic(mnemonic: String, password: String, wordlist: String): HDNode = (^.asInstanceOf[js.Dynamic].applyDynamic("fromMnemonic")(mnemonic.asInstanceOf[js.Any], password.asInstanceOf[js.Any], wordlist.asInstanceOf[js.Any])).asInstanceOf[HDNode]
    @scala.inline
    def fromMnemonic(mnemonic: String, password: String, wordlist: Wordlist): HDNode = (^.asInstanceOf[js.Dynamic].applyDynamic("fromMnemonic")(mnemonic.asInstanceOf[js.Any], password.asInstanceOf[js.Any], wordlist.asInstanceOf[js.Any])).asInstanceOf[HDNode]
    @scala.inline
    def fromMnemonic(mnemonic: String, password: Unit, wordlist: String): HDNode = (^.asInstanceOf[js.Dynamic].applyDynamic("fromMnemonic")(mnemonic.asInstanceOf[js.Any], password.asInstanceOf[js.Any], wordlist.asInstanceOf[js.Any])).asInstanceOf[HDNode]
    @scala.inline
    def fromMnemonic(mnemonic: String, password: Unit, wordlist: Wordlist): HDNode = (^.asInstanceOf[js.Dynamic].applyDynamic("fromMnemonic")(mnemonic.asInstanceOf[js.Any], password.asInstanceOf[js.Any], wordlist.asInstanceOf[js.Any])).asInstanceOf[HDNode]
    
    @scala.inline
    def fromSeed(seed: BytesLike): HDNode = ^.asInstanceOf[js.Dynamic].applyDynamic("fromSeed")(seed.asInstanceOf[js.Any]).asInstanceOf[HDNode]
  }
  
  @JSImport("@ethersproject/hdnode", "defaultPath")
  @js.native
  val defaultPath: /* "m/44'/60'/0'/0/0" */ String = js.native
  
  @scala.inline
  def entropyToMnemonic(entropy: BytesLike): String = ^.asInstanceOf[js.Dynamic].applyDynamic("entropyToMnemonic")(entropy.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def entropyToMnemonic(entropy: BytesLike, wordlist: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("entropyToMnemonic")(entropy.asInstanceOf[js.Any], wordlist.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def entropyToMnemonic(entropy: BytesLike, wordlist: Wordlist): String = (^.asInstanceOf[js.Dynamic].applyDynamic("entropyToMnemonic")(entropy.asInstanceOf[js.Any], wordlist.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def isValidMnemonic(mnemonic: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidMnemonic")(mnemonic.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  @scala.inline
  def isValidMnemonic(mnemonic: String, wordlist: Wordlist): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isValidMnemonic")(mnemonic.asInstanceOf[js.Any], wordlist.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def mnemonicToEntropy(mnemonic: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("mnemonicToEntropy")(mnemonic.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def mnemonicToEntropy(mnemonic: String, wordlist: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("mnemonicToEntropy")(mnemonic.asInstanceOf[js.Any], wordlist.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def mnemonicToEntropy(mnemonic: String, wordlist: Wordlist): String = (^.asInstanceOf[js.Dynamic].applyDynamic("mnemonicToEntropy")(mnemonic.asInstanceOf[js.Any], wordlist.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def mnemonicToSeed(mnemonic: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("mnemonicToSeed")(mnemonic.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def mnemonicToSeed(mnemonic: String, password: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("mnemonicToSeed")(mnemonic.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[String]
  
  trait Mnemonic extends StObject {
    
    val locale: String
    
    val path: String
    
    val phrase: String
  }
  object Mnemonic {
    
    @scala.inline
    def apply(locale: String, path: String, phrase: String): Mnemonic = {
      val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], phrase = phrase.asInstanceOf[js.Any])
      __obj.asInstanceOf[Mnemonic]
    }
    
    @scala.inline
    implicit class MnemonicMutableBuilder[Self <: Mnemonic] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPhrase(value: String): Self = StObject.set(x, "phrase", value.asInstanceOf[js.Any])
    }
  }
}
