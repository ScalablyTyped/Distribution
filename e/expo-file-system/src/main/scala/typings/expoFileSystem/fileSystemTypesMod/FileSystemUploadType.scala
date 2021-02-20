package typings.expoFileSystem.fileSystemTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FileSystemUploadType extends StObject
@JSImport("expo-file-system/build/FileSystem.types", "FileSystemUploadType")
@js.native
object FileSystemUploadType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FileSystemUploadType with Double] = js.native
  
  @js.native
  sealed trait BINARY_CONTENT extends FileSystemUploadType
  /* 0 */ val BINARY_CONTENT: typings.expoFileSystem.fileSystemTypesMod.FileSystemUploadType.BINARY_CONTENT with Double = js.native
  
  @js.native
  sealed trait MULTIPART extends FileSystemUploadType
  /* 1 */ val MULTIPART: typings.expoFileSystem.fileSystemTypesMod.FileSystemUploadType.MULTIPART with Double = js.native
}
