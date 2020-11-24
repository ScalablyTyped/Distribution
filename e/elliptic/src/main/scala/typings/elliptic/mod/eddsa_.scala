package typings.elliptic.mod

import typings.elliptic.ellipticStrings.ed25519
import typings.elliptic.mod.curve.edwards
import typings.elliptic.mod.eddsa.Bytes
import typings.elliptic.mod.eddsa.KeyPair
import typings.elliptic.mod.eddsa.Point
import typings.elliptic.mod.eddsa.Signature
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("elliptic", "eddsa")
@js.native
class eddsa_ protected () extends js.Object {
  def this(name: ed25519) = this()
  
  var curve: edwards = js.native
  
  def decodeInt(bytes: BNInput): js.Any = js.native
  
  def decodePoint(bytes: Bytes): Point = js.native
  
  def encodeInt(
    num: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any
  ): Buffer = js.native
  
  def encodePoint(point: Point): Buffer = js.native
  
  def hashInt(): js.Any = js.native
  
  def isPoint(`val`: js.Any): Boolean = js.native
  
  def keyFromPublic(pub: Bytes): KeyPair = js.native
  def keyFromPublic(pub: KeyPair): KeyPair = js.native
  def keyFromPublic(pub: Point): KeyPair = js.native
  
  def keyFromSecret(secret: Bytes): KeyPair = js.native
  
  def makeSignature(sig: String): Signature = js.native
  def makeSignature(sig: Signature): Signature = js.native
  def makeSignature(sig: Buffer): Signature = js.native
  
  def sign(message: Bytes, secret: Bytes): Signature = js.native
  
  def verify(message: Bytes, sig: Bytes, pub: Bytes): Boolean = js.native
  def verify(message: Bytes, sig: Bytes, pub: KeyPair): Boolean = js.native
  def verify(message: Bytes, sig: Bytes, pub: Point): Boolean = js.native
  def verify(message: Bytes, sig: Signature, pub: Bytes): Boolean = js.native
  def verify(message: Bytes, sig: Signature, pub: KeyPair): Boolean = js.native
  def verify(message: Bytes, sig: Signature, pub: Point): Boolean = js.native
}
