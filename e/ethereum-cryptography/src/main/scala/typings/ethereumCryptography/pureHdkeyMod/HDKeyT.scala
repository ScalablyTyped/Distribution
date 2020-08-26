package typings.ethereumCryptography.pureHdkeyMod

import typings.ethereumCryptography.anon.Xpriv
import typings.ethereumCryptography.anon.Xpub
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ethereum-cryptography/pure/hdkey", "HDKeyT")
@js.native
class HDKeyT protected () extends js.Object {
  var chainCode: Buffer | Null = js.native
  var depth: Double = js.native
  var fingerprint: Double = js.native
  var identifier: js.UndefOr[Buffer] = js.native
  var index: Double = js.native
  var parentFingerprint: Double = js.native
  var privateExtendedKey: String = js.native
  var privateKey: Buffer | Null = js.native
  var pubKeyHash: js.UndefOr[Buffer] = js.native
  var publicExtendedKey: String = js.native
  var publicKey: Buffer | Null = js.native
  var versions: Versions = js.native
  def derive(path: String): HDKeyT = js.native
  def deriveChild(index: Double): HDKeyT = js.native
  def sign(hash: Buffer): Buffer = js.native
  def toJSON(): Xpub = js.native
  def verify(hash: Buffer, signature: Buffer): Boolean = js.native
  def wipePrivateData(): this.type = js.native
}

/* static members */
@JSImport("ethereum-cryptography/pure/hdkey", "HDKeyT")
@js.native
object HDKeyT extends js.Object {
  var HARDENED_OFFSET: Double = js.native
  def fromExtendedKey(base58key: String): HDKeyT = js.native
  def fromExtendedKey(base58key: String, versions: Versions): HDKeyT = js.native
  def fromJSON(json: Xpriv): HDKeyT = js.native
  def fromMasterSeed(seed: Buffer): HDKeyT = js.native
  def fromMasterSeed(seed: Buffer, versions: Versions): HDKeyT = js.native
}

