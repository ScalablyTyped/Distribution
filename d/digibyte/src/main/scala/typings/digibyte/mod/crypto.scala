package typings.digibyte.mod

import typings.digibyte.digibyteStrings.little
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("digibyte", "crypto")
@js.native
object crypto extends js.Object {
  @js.native
  class BN () extends js.Object
  
  @js.native
  class Signature () extends js.Object {
    var SIGHASH_ALL: Double = js.native
  }
  
  @js.native
  object ECDSA extends js.Object {
    def sign(message: Buffer, key: PrivateKey): Signature = js.native
    def verify(hashbuf: Buffer, sig: Signature, pubkey: PublicKey): Boolean = js.native
    @JSName("verify")
    def verify_little(hashbuf: Buffer, sig: Signature, pubkey: PublicKey, endian: little): Boolean = js.native
  }
  
  @js.native
  object Hash extends js.Object {
    def ripemd160(buffer: Buffer): Buffer = js.native
    def sha1(buffer: Buffer): Buffer = js.native
    def sha256(buffer: Buffer): Buffer = js.native
    def sha256hmac(data: Buffer, key: Buffer): Buffer = js.native
    def sha256ripemd160(buffer: Buffer): Buffer = js.native
    def sha256sha256(buffer: Buffer): Buffer = js.native
    def sha512(buffer: Buffer): Buffer = js.native
    def sha512hmac(data: Buffer, key: Buffer): Buffer = js.native
  }
  
  @js.native
  object Random extends js.Object {
    def getRandomBuffer(size: Double): Buffer = js.native
  }
  
  /* static members */
  @js.native
  object Signature extends js.Object {
    def fromDER(sig: Buffer): Signature = js.native
    def fromString(data: String): Signature = js.native
  }
  
}

