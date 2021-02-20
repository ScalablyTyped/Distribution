package typings.expoFileSystem.fileSystemTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FileSystemSessionType extends StObject
@JSImport("expo-file-system/build/FileSystem.types", "FileSystemSessionType")
@js.native
object FileSystemSessionType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FileSystemSessionType with Double] = js.native
  
  @js.native
  sealed trait BACKGROUND extends FileSystemSessionType
  /* 0 */ val BACKGROUND: typings.expoFileSystem.fileSystemTypesMod.FileSystemSessionType.BACKGROUND with Double = js.native
  
  @js.native
  sealed trait FOREGROUND extends FileSystemSessionType
  /* 1 */ val FOREGROUND: typings.expoFileSystem.fileSystemTypesMod.FileSystemSessionType.FOREGROUND with Double = js.native
}
