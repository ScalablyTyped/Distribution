package typings.expoFileSystem.buildFileSystemDottypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FileSystemUploadType extends StObject
@JSImport("expo-file-system/build/FileSystem.types", "FileSystemUploadType")
@js.native
object FileSystemUploadType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FileSystemUploadType & Double] = js.native
  
  @js.native
  sealed trait BINARY_CONTENT
    extends StObject
       with FileSystemUploadType
  /* 0 */ val BINARY_CONTENT: typings.expoFileSystem.buildFileSystemDottypesMod.FileSystemUploadType.BINARY_CONTENT & Double = js.native
  
  @js.native
  sealed trait MULTIPART
    extends StObject
       with FileSystemUploadType
  /* 1 */ val MULTIPART: typings.expoFileSystem.buildFileSystemDottypesMod.FileSystemUploadType.MULTIPART & Double = js.native
}
