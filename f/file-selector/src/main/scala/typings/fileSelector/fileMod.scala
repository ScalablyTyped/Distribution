package typings.fileSelector

import typings.std.Blob
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("file-selector/dist/file", JSImport.Namespace)
@js.native
object fileMod extends js.Object {
  
  val COMMON_MIME_TYPES: Map[String, String] = js.native
  
  def toFileWithPath(file: FileWithPath): FileWithPath = js.native
  def toFileWithPath(file: FileWithPath, path: String): FileWithPath = js.native
  
  @js.native
  trait DOMFile extends Blob {
    
    val lastModified: Double = js.native
    
    val name: String = js.native
  }
  
  @js.native
  trait FileWithPath extends DOMFile {
    
    val path: js.UndefOr[String] = js.native
  }
}
