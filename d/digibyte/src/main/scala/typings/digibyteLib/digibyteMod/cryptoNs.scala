package typings
package digibyteLib.digibyteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("digibyte", "crypto")
@js.native
object cryptoNs extends js.Object {
  @js.native
  class BN () extends js.Object
  
  @js.native
  class Signature () extends js.Object {
    var SIGHASH_ALL: scala.Double = js.native
  }
  
  @JSName("ECDSA")
  @js.native
  object ECDSANs extends js.Object {
    def sign(message: nodeLib.Buffer, key: digibyteLib.digibyteMod.PrivateKey): digibyteLib.digibyteMod.cryptoNs.Signature = js.native
    def verify(
      hashbuf: nodeLib.Buffer,
      sig: digibyteLib.digibyteMod.cryptoNs.Signature,
      pubkey: digibyteLib.digibyteMod.PublicKey
    ): scala.Boolean = js.native
    @JSName("verify")
    def verify_little(
      hashbuf: nodeLib.Buffer,
      sig: digibyteLib.digibyteMod.cryptoNs.Signature,
      pubkey: digibyteLib.digibyteMod.PublicKey,
      endian: digibyteLib.digibyteLibStrings.little
    ): scala.Boolean = js.native
  }
  
  @JSName("Hash")
  @js.native
  object HashNs extends js.Object {
    def ripemd160(buffer: nodeLib.Buffer): nodeLib.Buffer = js.native
    def sha1(buffer: nodeLib.Buffer): nodeLib.Buffer = js.native
    def sha256(buffer: nodeLib.Buffer): nodeLib.Buffer = js.native
    def sha256hmac(data: nodeLib.Buffer, key: nodeLib.Buffer): nodeLib.Buffer = js.native
    def sha256ripemd160(buffer: nodeLib.Buffer): nodeLib.Buffer = js.native
    def sha256sha256(buffer: nodeLib.Buffer): nodeLib.Buffer = js.native
    def sha512(buffer: nodeLib.Buffer): nodeLib.Buffer = js.native
    def sha512hmac(data: nodeLib.Buffer, key: nodeLib.Buffer): nodeLib.Buffer = js.native
  }
  
  @JSName("Random")
  @js.native
  object RandomNs extends js.Object {
    def getRandomBuffer(size: scala.Double): nodeLib.Buffer = js.native
  }
  
  /* static members */
  @js.native
  object Signature extends js.Object {
    def fromDER(sig: nodeLib.Buffer): digibyteLib.digibyteMod.cryptoNs.Signature = js.native
    def fromString(data: java.lang.String): digibyteLib.digibyteMod.cryptoNs.Signature = js.native
  }
  
}

