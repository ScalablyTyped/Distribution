package typings.atFirebaseStorage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/storage/dist/src/implementation/path", JSImport.Namespace)
@js.native
object distSrcImplementationPathMod extends js.Object {
  def child(path: String, childPath: String): String = js.native
  def lastComponent(path: String): String = js.native
  def parent(path: String): String | Null = js.native
}

