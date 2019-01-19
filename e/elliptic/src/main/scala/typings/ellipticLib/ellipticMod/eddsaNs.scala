package typings
package ellipticLib.ellipticMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("elliptic", "eddsa")
@js.native
object eddsaNs extends js.Object {
  @js.native
  class KeyPair protected () extends js.Object {
    def this(eddsa: ellipticLib.ellipticMod.eddsa, params: KeyPairOptions) = this()
    def getPublic(): nodeLib.Buffer = js.native
    @JSName("getPublic")
    def getPublic_hex(enc: ellipticLib.ellipticLibStrings.hex): java.lang.String = js.native
    def getSecret(): nodeLib.Buffer = js.native
    @JSName("getSecret")
    def getSecret_hex(enc: ellipticLib.ellipticLibStrings.hex): java.lang.String = js.native
    def secret(): nodeLib.Buffer = js.native
    def sign(message: Bytes): Signature = js.native
    def verify(message: Bytes, sig: Bytes): scala.Boolean = js.native
    def verify(message: Bytes, sig: Signature): scala.Boolean = js.native
  }
  
  trait KeyPairOptions extends js.Object {
    var pub: nodeLib.Buffer | Point
    var secret: nodeLib.Buffer
  }
  
  @js.native
  class Signature protected () extends js.Object {
    def this(eddsa: ellipticLib.ellipticMod.eddsa, sig: Bytes) = this()
    def this(eddsa: ellipticLib.ellipticMod.eddsa, sig: Signature) = this()
    def toBytes(): nodeLib.Buffer = js.native
    def toHex(): java.lang.String = js.native
  }
  
  @js.native
  object KeyPair extends js.Object {
    def fromPublic(eddsa: ellipticLib.ellipticMod.eddsa, pub: ellipticLib.ellipticMod.eddsaNs.Bytes): ellipticLib.ellipticMod.eddsaNs.KeyPair = js.native
    def fromSecret(eddsa: ellipticLib.ellipticMod.eddsa, secret: ellipticLib.ellipticMod.eddsaNs.Bytes): ellipticLib.ellipticMod.eddsaNs.KeyPair = js.native
  }
  
  type Bytes = java.lang.String | nodeLib.Buffer
  type Point = ellipticLib.ellipticMod.curveNs.baseNs.BasePoint
}

