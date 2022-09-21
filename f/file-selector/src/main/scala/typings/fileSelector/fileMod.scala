package typings.fileSelector

import typings.std.File
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fileMod {
  
  @JSImport("file-selector/dist/file", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("file-selector/dist/file", "COMMON_MIME_TYPES")
  @js.native
  val COMMON_MIME_TYPES: Map[String, String] = js.native
  
  inline def toFileWithPath(file: FileWithPath): FileWithPath = ^.asInstanceOf[js.Dynamic].applyDynamic("toFileWithPath")(file.asInstanceOf[js.Any]).asInstanceOf[FileWithPath]
  inline def toFileWithPath(file: FileWithPath, path: String): FileWithPath = (^.asInstanceOf[js.Dynamic].applyDynamic("toFileWithPath")(file.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[FileWithPath]
  
  @js.native
  trait FileWithPath
    extends StObject
       with File {
    
    val path: js.UndefOr[String] = js.native
  }
}
