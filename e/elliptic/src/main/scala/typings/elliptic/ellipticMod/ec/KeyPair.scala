package typings.elliptic.ellipticMod.ec

import typings.elliptic.Anon_Reason
import typings.elliptic.Anon_X
import typings.elliptic.ellipticMod.BNInput
import typings.elliptic.ellipticMod.curve.base.BasePoint
import typings.elliptic.ellipticStrings.array
import typings.elliptic.ellipticStrings.hex
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("elliptic", "ec.KeyPair")
@js.native
class KeyPair protected () extends js.Object {
  def this(ec: typings.elliptic.ellipticMod.ec, options: KeyPairOptions) = this()
  var ec: typings.elliptic.ellipticMod.ec = js.native
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
  def validate(): Anon_Reason = js.native
  def verify(msg: BNInput, signature: String): Boolean = js.native
  def verify(msg: BNInput, signature: Signature): Boolean = js.native
  def verify(msg: BNInput, signature: SignatureOptions): Boolean = js.native
}

/* static members */
@JSImport("elliptic", "ec.KeyPair")
@js.native
object KeyPair extends js.Object {
  def fromPrivate(ec: typings.elliptic.ellipticMod.ec, priv: String): KeyPair = js.native
  def fromPrivate(ec: typings.elliptic.ellipticMod.ec, priv: String, enc: String): KeyPair = js.native
  def fromPrivate(ec: typings.elliptic.ellipticMod.ec, priv: KeyPair): KeyPair = js.native
  def fromPrivate(ec: typings.elliptic.ellipticMod.ec, priv: KeyPair, enc: String): KeyPair = js.native
  def fromPrivate(ec: typings.elliptic.ellipticMod.ec, priv: Buffer): KeyPair = js.native
  def fromPrivate(ec: typings.elliptic.ellipticMod.ec, priv: Buffer, enc: String): KeyPair = js.native
  def fromPublic(ec: typings.elliptic.ellipticMod.ec, pub: String): KeyPair = js.native
  def fromPublic(ec: typings.elliptic.ellipticMod.ec, pub: String, enc: String): KeyPair = js.native
  def fromPublic(ec: typings.elliptic.ellipticMod.ec, pub: Anon_X): KeyPair = js.native
  def fromPublic(ec: typings.elliptic.ellipticMod.ec, pub: Anon_X, enc: String): KeyPair = js.native
  def fromPublic(ec: typings.elliptic.ellipticMod.ec, pub: KeyPair): KeyPair = js.native
  def fromPublic(ec: typings.elliptic.ellipticMod.ec, pub: KeyPair, enc: String): KeyPair = js.native
  def fromPublic(ec: typings.elliptic.ellipticMod.ec, pub: Buffer): KeyPair = js.native
  def fromPublic(ec: typings.elliptic.ellipticMod.ec, pub: Buffer, enc: String): KeyPair = js.native
}

