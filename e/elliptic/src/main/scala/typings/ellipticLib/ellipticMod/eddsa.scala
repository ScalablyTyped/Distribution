package typings
package ellipticLib.ellipticMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("elliptic", "eddsa")
@js.native
class eddsa protected () extends js.Object {
  def this(name: ellipticLib.ellipticLibStrings.ed25519) = this()
  var curve: ellipticLib.ellipticMod.curveNs.edwards = js.native
  def decodeInt(bytes: BNInput): js.Any = js.native
  def decodePoint(bytes: ellipticLib.ellipticMod.eddsaNs.Bytes): ellipticLib.ellipticMod.eddsaNs.Point = js.native
  def encodeInt(num: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify BN */ js.Any): nodeLib.Buffer = js.native
  def encodePoint(point: ellipticLib.ellipticMod.eddsaNs.Point): nodeLib.Buffer = js.native
  def hashInt(): js.Any = js.native
  def isPoint(`val`: js.Any): scala.Boolean = js.native
  def keyFromPublic(pub: ellipticLib.ellipticMod.eddsaNs.Bytes): ellipticLib.ellipticMod.eddsaNs.KeyPair = js.native
  def keyFromSecret(secret: ellipticLib.ellipticMod.eddsaNs.Bytes): ellipticLib.ellipticMod.eddsaNs.KeyPair = js.native
  def makeSignature(sig: ellipticLib.ellipticMod.eddsaNs.Signature): ellipticLib.ellipticMod.eddsaNs.Signature = js.native
  def makeSignature(sig: java.lang.String): ellipticLib.ellipticMod.eddsaNs.Signature = js.native
  def makeSignature(sig: nodeLib.Buffer): ellipticLib.ellipticMod.eddsaNs.Signature = js.native
  def sign(message: ellipticLib.ellipticMod.eddsaNs.Bytes, secret: ellipticLib.ellipticMod.eddsaNs.Bytes): ellipticLib.ellipticMod.eddsaNs.Signature = js.native
  def verify(
    message: ellipticLib.ellipticMod.eddsaNs.Bytes,
    sig: ellipticLib.ellipticMod.eddsaNs.Bytes,
    pub: ellipticLib.ellipticMod.eddsaNs.Bytes
  ): scala.Boolean = js.native
  def verify(
    message: ellipticLib.ellipticMod.eddsaNs.Bytes,
    sig: ellipticLib.ellipticMod.eddsaNs.Bytes,
    pub: ellipticLib.ellipticMod.eddsaNs.KeyPair
  ): scala.Boolean = js.native
  def verify(
    message: ellipticLib.ellipticMod.eddsaNs.Bytes,
    sig: ellipticLib.ellipticMod.eddsaNs.Bytes,
    pub: ellipticLib.ellipticMod.eddsaNs.Point
  ): scala.Boolean = js.native
  def verify(
    message: ellipticLib.ellipticMod.eddsaNs.Bytes,
    sig: ellipticLib.ellipticMod.eddsaNs.Signature,
    pub: ellipticLib.ellipticMod.eddsaNs.Bytes
  ): scala.Boolean = js.native
  def verify(
    message: ellipticLib.ellipticMod.eddsaNs.Bytes,
    sig: ellipticLib.ellipticMod.eddsaNs.Signature,
    pub: ellipticLib.ellipticMod.eddsaNs.KeyPair
  ): scala.Boolean = js.native
  def verify(
    message: ellipticLib.ellipticMod.eddsaNs.Bytes,
    sig: ellipticLib.ellipticMod.eddsaNs.Signature,
    pub: ellipticLib.ellipticMod.eddsaNs.Point
  ): scala.Boolean = js.native
}

