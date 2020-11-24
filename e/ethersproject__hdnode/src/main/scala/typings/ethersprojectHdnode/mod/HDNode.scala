package typings.ethersprojectHdnode.mod

import typings.ethersprojectAbstractSigner.mod.ExternallyOwnedAccount
import typings.ethersprojectBytes.mod.BytesLike
import typings.ethersprojectWordlists.mod.Wordlist
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
@JSImport("@ethersproject/hdnode", "HDNode")
@js.native
object HDNode extends js.Object {
  
  def _fromSeed(seed: BytesLike, mnemonic: Mnemonic): HDNode = js.native
  
  def fromExtendedKey(extendedKey: String): HDNode = js.native
  
  def fromMnemonic(mnemonic: String): HDNode = js.native
  def fromMnemonic(mnemonic: String, password: js.UndefOr[scala.Nothing], wordlist: String): HDNode = js.native
  def fromMnemonic(mnemonic: String, password: js.UndefOr[scala.Nothing], wordlist: Wordlist): HDNode = js.native
  def fromMnemonic(mnemonic: String, password: String): HDNode = js.native
  def fromMnemonic(mnemonic: String, password: String, wordlist: String): HDNode = js.native
  def fromMnemonic(mnemonic: String, password: String, wordlist: Wordlist): HDNode = js.native
  
  def fromSeed(seed: BytesLike): HDNode = js.native
}
