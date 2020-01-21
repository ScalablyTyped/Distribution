package typings.firebaseFirestore

import org.scalablytyped.runtime.Instantiable0
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/lib/src/api/blob", JSImport.Namespace)
@js.native
object blobMod extends js.Object {
  @js.native
  class Blob protected () extends js.Object {
    var _binaryString: js.Any = js.native
    /**
      * Actually private to JS consumers of our API, so this function is prefixed
      * with an underscore.
      */
    def _compareTo(other: Blob): Double = js.native
    def isEqual(other: Blob): Boolean = js.native
    def toBase64(): String = js.native
    def toUint8Array(): Uint8Array = js.native
  }
  
  @js.native
  class PublicBlob () extends Blob
  
  /* static members */
  @js.native
  object Blob extends js.Object {
    def fromBase64String(base64: String): Blob = js.native
    def fromUint8Array(array: Uint8Array): Blob = js.native
  }
  
  @js.native
  object PublicBlob extends Instantiable0[Blob] {
    def fromBase64String(base64: String): Blob = js.native
    def fromUint8Array(array: Uint8Array): Blob = js.native
  }
  
}

