package typings.fileDashSelector

import typings.std.File
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("file-selector/dist/file", JSImport.Namespace)
@js.native
object distFileMod extends js.Object {
  @js.native
  trait FileWithPath extends File {
    val path: js.UndefOr[String] = js.native
  }
  
  val COMMON_MIME_TYPES: Map[String, String] = js.native
  def toFileWithPath(file: FileWithPath): FileWithPath = js.native
  def toFileWithPath(file: FileWithPath, path: String): FileWithPath = js.native
}

