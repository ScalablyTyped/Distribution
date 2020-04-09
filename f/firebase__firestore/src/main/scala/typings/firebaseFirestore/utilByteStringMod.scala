package typings.firebaseFirestore

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/src/util/byte_string", JSImport.Namespace)
@js.native
object utilByteStringMod extends js.Object {
  @js.native
  class ByteString protected () extends js.Object {
    val binaryString: js.Any = js.native
    def approximateByteSize(): Double = js.native
    def compareTo(other: ByteString): Double = js.native
    def isEqual(other: ByteString): Boolean = js.native
    def toBase64(): String = js.native
    def toUint8Array(): Uint8Array = js.native
  }
  
  def binaryStringFromUint8Array(array: Uint8Array): String = js.native
  def uint8ArrayFromBinaryString(binaryString: String): Uint8Array = js.native
  /* static members */
  @js.native
  object ByteString extends js.Object {
    val EMPTY_BYTE_STRING: ByteString = js.native
    def fromBase64String(base64: String): ByteString = js.native
    def fromUint8Array(array: Uint8Array): ByteString = js.native
  }
  
}

