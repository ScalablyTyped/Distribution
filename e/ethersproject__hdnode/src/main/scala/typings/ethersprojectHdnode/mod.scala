package typings.ethersprojectHdnode

import typings.ethersprojectAbstractSigner.mod.ExternallyOwnedAccount
import typings.ethersprojectBytes.mod.BytesLike
import typings.ethersprojectWordlists.mod.Wordlist
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@ethersproject/hdnode", "HDNode")
  @js.native
  class HDNode protected () extends ExternallyOwnedAccount {
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
    
    val publicKey: String = js.native
  }
  /* static members */
  object HDNode {
    
    @JSImport("@ethersproject/hdnode", "HDNode._fromSeed")
    @js.native
    def _fromSeed(seed: BytesLike, mnemonic: Mnemonic): HDNode = js.native
    
    @JSImport("@ethersproject/hdnode", "HDNode.fromExtendedKey")
    @js.native
    def fromExtendedKey(extendedKey: String): HDNode = js.native
    
    @JSImport("@ethersproject/hdnode", "HDNode.fromMnemonic")
    @js.native
    def fromMnemonic(mnemonic: String): HDNode = js.native
    @JSImport("@ethersproject/hdnode", "HDNode.fromMnemonic")
    @js.native
    def fromMnemonic(mnemonic: String, password: js.UndefOr[scala.Nothing], wordlist: String): HDNode = js.native
    @JSImport("@ethersproject/hdnode", "HDNode.fromMnemonic")
    @js.native
    def fromMnemonic(mnemonic: String, password: js.UndefOr[scala.Nothing], wordlist: Wordlist): HDNode = js.native
    @JSImport("@ethersproject/hdnode", "HDNode.fromMnemonic")
    @js.native
    def fromMnemonic(mnemonic: String, password: String): HDNode = js.native
    @JSImport("@ethersproject/hdnode", "HDNode.fromMnemonic")
    @js.native
    def fromMnemonic(mnemonic: String, password: String, wordlist: String): HDNode = js.native
    @JSImport("@ethersproject/hdnode", "HDNode.fromMnemonic")
    @js.native
    def fromMnemonic(mnemonic: String, password: String, wordlist: Wordlist): HDNode = js.native
    
    @JSImport("@ethersproject/hdnode", "HDNode.fromSeed")
    @js.native
    def fromSeed(seed: BytesLike): HDNode = js.native
  }
  
  @JSImport("@ethersproject/hdnode", "defaultPath")
  @js.native
  val defaultPath: /* "m/44'/60'/0'/0/0" */ String = js.native
  
  @JSImport("@ethersproject/hdnode", "entropyToMnemonic")
  @js.native
  def entropyToMnemonic(entropy: BytesLike): String = js.native
  @JSImport("@ethersproject/hdnode", "entropyToMnemonic")
  @js.native
  def entropyToMnemonic(entropy: BytesLike, wordlist: String): String = js.native
  @JSImport("@ethersproject/hdnode", "entropyToMnemonic")
  @js.native
  def entropyToMnemonic(entropy: BytesLike, wordlist: Wordlist): String = js.native
  
  @JSImport("@ethersproject/hdnode", "isValidMnemonic")
  @js.native
  def isValidMnemonic(mnemonic: String): Boolean = js.native
  @JSImport("@ethersproject/hdnode", "isValidMnemonic")
  @js.native
  def isValidMnemonic(mnemonic: String, wordlist: Wordlist): Boolean = js.native
  
  @JSImport("@ethersproject/hdnode", "mnemonicToEntropy")
  @js.native
  def mnemonicToEntropy(mnemonic: String): String = js.native
  @JSImport("@ethersproject/hdnode", "mnemonicToEntropy")
  @js.native
  def mnemonicToEntropy(mnemonic: String, wordlist: String): String = js.native
  @JSImport("@ethersproject/hdnode", "mnemonicToEntropy")
  @js.native
  def mnemonicToEntropy(mnemonic: String, wordlist: Wordlist): String = js.native
  
  @JSImport("@ethersproject/hdnode", "mnemonicToSeed")
  @js.native
  def mnemonicToSeed(mnemonic: String): String = js.native
  @JSImport("@ethersproject/hdnode", "mnemonicToSeed")
  @js.native
  def mnemonicToSeed(mnemonic: String, password: String): String = js.native
  
  @js.native
  trait Mnemonic extends StObject {
    
    val locale: String = js.native
    
    val path: String = js.native
    
    val phrase: String = js.native
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
