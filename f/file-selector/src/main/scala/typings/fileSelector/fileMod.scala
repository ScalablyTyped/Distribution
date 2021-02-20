package typings.fileSelector

import typings.std.Blob
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fileMod {
  
  @JSImport("file-selector/dist/file", "COMMON_MIME_TYPES")
  @js.native
  val COMMON_MIME_TYPES: Map[String, String] = js.native
  
  @JSImport("file-selector/dist/file", "toFileWithPath")
  @js.native
  def toFileWithPath(file: FileWithPath): FileWithPath = js.native
  @JSImport("file-selector/dist/file", "toFileWithPath")
  @js.native
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
