package typings.elliptic.mod.ec

import typings.elliptic.anon.Reason
import typings.elliptic.anon.X
import typings.elliptic.ellipticStrings.array
import typings.elliptic.ellipticStrings.hex
import typings.elliptic.mod.BNInput
import typings.elliptic.mod.SignatureInput
import typings.elliptic.mod.curve.base.BasePoint
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("elliptic", "ec.KeyPair")
@js.native
class KeyPair protected () extends js.Object {
  def this(ec: typings.elliptic.mod.ec, options: KeyPairOptions) = this()
  var ec: typings.elliptic.mod.ec = js.native
  def derive(pub: BasePoint): js.Any = js.native
  def getPrivate(): js.Any = js.native
  @JSName("getPrivate")
  def getPrivate_hex(enc: hex): String = js.native
  def getPublic(): BasePoint = js.native
  @JSName("getPublic")
  def getPublic_array(compact: Boolean, enc: array): js.Array[Double] = js.native
  @JSName("getPublic")
  def getPublic_array(enc: array): js.Array[Double] = js.native
  @JSName("getPublic")
  def getPublic_hex(compact: Boolean, enc: hex): String = js.native
  @JSName("getPublic")
  def getPublic_hex(enc: hex): String = js.native
  def inspect(): String = js.native
  def sign(msg: BNInput): Signature = js.native
  def sign(msg: BNInput, enc: String): Signature = js.native
  def sign(msg: BNInput, enc: String, options: SignOptions): Signature = js.native
  def sign(msg: BNInput, options: SignOptions): Signature = js.native
  def validate(): Reason = js.native
  def verify(msg: BNInput, signature: SignatureInput): Boolean = js.native
}

/* static members */
@JSImport("elliptic", "ec.KeyPair")
@js.native
object KeyPair extends js.Object {
  def fromPrivate(ec: typings.elliptic.mod.ec, priv: String): KeyPair = js.native
  def fromPrivate(ec: typings.elliptic.mod.ec, priv: String, enc: String): KeyPair = js.native
  def fromPrivate(ec: typings.elliptic.mod.ec, priv: KeyPair): KeyPair = js.native
  def fromPrivate(ec: typings.elliptic.mod.ec, priv: KeyPair, enc: String): KeyPair = js.native
  def fromPrivate(ec: typings.elliptic.mod.ec, priv: Buffer): KeyPair = js.native
  def fromPrivate(ec: typings.elliptic.mod.ec, priv: Buffer, enc: String): KeyPair = js.native
  def fromPublic(ec: typings.elliptic.mod.ec, pub: String): KeyPair = js.native
  def fromPublic(ec: typings.elliptic.mod.ec, pub: String, enc: String): KeyPair = js.native
  def fromPublic(ec: typings.elliptic.mod.ec, pub: X): KeyPair = js.native
  def fromPublic(ec: typings.elliptic.mod.ec, pub: X, enc: String): KeyPair = js.native
  def fromPublic(ec: typings.elliptic.mod.ec, pub: KeyPair): KeyPair = js.native
  def fromPublic(ec: typings.elliptic.mod.ec, pub: KeyPair, enc: String): KeyPair = js.native
  def fromPublic(ec: typings.elliptic.mod.ec, pub: Buffer): KeyPair = js.native
  def fromPublic(ec: typings.elliptic.mod.ec, pub: Buffer, enc: String): KeyPair = js.native
}

