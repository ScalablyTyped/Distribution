package typings.firebaseFirestore

import org.scalablytyped.runtime.Instantiable1
import typings.firebaseFirestore.utilByteStringMod.ByteString
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/src/api/blob", JSImport.Namespace)
@js.native
object apiBlobMod extends js.Object {
  @js.native
  class Blob protected () extends js.Object {
    def this(byteString: ByteString) = this()
    var _byteString: ByteString = js.native
    def isEqual(other: Blob): Boolean = js.native
    def toBase64(): String = js.native
    def toUint8Array(): Uint8Array = js.native
  }
  
  @js.native
  class PublicBlob protected () extends Blob {
    def this(byteString: ByteString) = this()
  }
  
  /* static members */
  @js.native
  object Blob extends js.Object {
    def fromBase64String(base64: String): Blob = js.native
    def fromUint8Array(array: Uint8Array): Blob = js.native
  }
  
  @js.native
  object PublicBlob extends Instantiable1[/* byteString */ ByteString, Blob] {
    def fromBase64String(base64: String): Blob = js.native
    def fromUint8Array(array: Uint8Array): Blob = js.native
  }
  
}

