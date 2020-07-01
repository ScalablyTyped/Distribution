package typings.firebaseFirestore.indexDotnodeMod

import typings.firebaseFirestore.byteStringMod.ByteString
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/packages/firestore/lite/index.node", "Blob")
@js.native
class Blob protected ()
  extends typings.firebaseFirestore.blobMod.Blob {
  def this(byteString: ByteString) = this()
}

/* static members */
@JSImport("@firebase/firestore/dist/packages/firestore/lite/index.node", "Blob")
@js.native
object Blob extends js.Object {
  def fromBase64String(base64: String): typings.firebaseFirestore.blobMod.Blob = js.native
  def fromUint8Array(array: Uint8Array): typings.firebaseFirestore.blobMod.Blob = js.native
}

