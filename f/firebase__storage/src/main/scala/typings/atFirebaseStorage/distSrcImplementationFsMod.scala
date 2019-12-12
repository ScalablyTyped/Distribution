package typings.atFirebaseStorage

import typings.std.ArrayBuffer
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/storage/dist/src/implementation/fs", JSImport.Namespace)
@js.native
object distSrcImplementationFsMod extends js.Object {
  def getBlob(args: (String | Blob | ArrayBuffer)*): Blob = js.native
  def sliceBlob(blob: Blob, start: Double, end: Double): Blob | Null = js.native
}

