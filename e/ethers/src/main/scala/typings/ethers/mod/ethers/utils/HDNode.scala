package typings.ethers.mod.ethers.utils

import typings.ethersprojectBytes.mod.BytesLike
import typings.ethersprojectHdnode.mod.Mnemonic
import typings.ethersprojectWordlists.mod.Wordlist
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ethers", "ethers.utils.HDNode")
@js.native
class HDNode protected ()
  extends typings.ethers.ethersMod.utils.HDNode {
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
}
/* static members */
@JSImport("ethers", "ethers.utils.HDNode")
@js.native
object HDNode extends js.Object {
  
  def _fromSeed(seed: BytesLike, mnemonic: Mnemonic): typings.ethersprojectHdnode.mod.HDNode = js.native
  
  def fromExtendedKey(extendedKey: String): typings.ethersprojectHdnode.mod.HDNode = js.native
  
  def fromMnemonic(mnemonic: String): typings.ethersprojectHdnode.mod.HDNode = js.native
  def fromMnemonic(mnemonic: String, password: js.UndefOr[scala.Nothing], wordlist: String): typings.ethersprojectHdnode.mod.HDNode = js.native
  def fromMnemonic(mnemonic: String, password: js.UndefOr[scala.Nothing], wordlist: Wordlist): typings.ethersprojectHdnode.mod.HDNode = js.native
  def fromMnemonic(mnemonic: String, password: String): typings.ethersprojectHdnode.mod.HDNode = js.native
  def fromMnemonic(mnemonic: String, password: String, wordlist: String): typings.ethersprojectHdnode.mod.HDNode = js.native
  def fromMnemonic(mnemonic: String, password: String, wordlist: Wordlist): typings.ethersprojectHdnode.mod.HDNode = js.native
  
  def fromSeed(seed: BytesLike): typings.ethersprojectHdnode.mod.HDNode = js.native
}
