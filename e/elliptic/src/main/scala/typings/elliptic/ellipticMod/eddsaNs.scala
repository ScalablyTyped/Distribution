package typings.elliptic.ellipticMod

import typings.elliptic.ellipticMod.curveNs.baseNs.BasePoint
import typings.elliptic.ellipticMod.eddsaNs.Bytes
import typings.elliptic.ellipticMod.eddsaNs.KeyPair
import typings.elliptic.ellipticMod.eddsaNs.KeyPairOptions
import typings.elliptic.ellipticMod.eddsaNs.Point
import typings.elliptic.ellipticMod.eddsaNs.Signature
import typings.elliptic.ellipticStrings.hex
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("elliptic", "eddsa")
@js.native
object eddsaNs extends js.Object {
  @js.native
  class KeyPair protected () extends js.Object {
    def this(eddsa: eddsa, params: KeyPairOptions) = this()
    def getPublic(): Buffer = js.native
    @JSName("getPublic")
    def getPublic_hex(enc: hex): String = js.native
    def getSecret(): Buffer = js.native
    @JSName("getSecret")
    def getSecret_hex(enc: hex): String = js.native
    def secret(): Buffer = js.native
    def sign(message: Bytes): Signature = js.native
    def verify(message: Bytes, sig: Bytes): Boolean = js.native
    def verify(message: Bytes, sig: Signature): Boolean = js.native
  }
  
  trait KeyPairOptions extends js.Object {
    var pub: Buffer | Point
    var secret: Buffer
  }
  
  @js.native
  class Signature protected () extends js.Object {
    def this(eddsa: eddsa, sig: Bytes) = this()
    def this(eddsa: eddsa, sig: Signature) = this()
    def toBytes(): Buffer = js.native
    def toHex(): String = js.native
  }
  
  /* static members */
  @js.native
  object KeyPair extends js.Object {
    def fromPublic(eddsa: eddsa, pub: Bytes): KeyPair = js.native
    def fromSecret(eddsa: eddsa, secret: Bytes): KeyPair = js.native
  }
  
  type Bytes = String | Buffer
  type Point = BasePoint
}

