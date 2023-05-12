package typings.expoFileSystem.buildFileSystemDottypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FileSystemSessionType extends StObject
@JSImport("expo-file-system/build/FileSystem.types", "FileSystemSessionType")
@js.native
object FileSystemSessionType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FileSystemSessionType & Double] = js.native
  
  /**
    * Using this mode means that the downloading/uploading session on the native side will work even if the application is moved to background.
    * If the task completes while the application is in background, the Promise will be either resolved immediately or (if the application execution has already been stopped) once the app is moved to foreground again.
    * > Note: The background session doesn't fail if the server or your connection is down. Rather, it continues retrying until the task succeeds or is canceled manually.
    */
  @js.native
  sealed trait BACKGROUND
    extends StObject
       with FileSystemSessionType
  /* 0 */ val BACKGROUND: typings.expoFileSystem.buildFileSystemDottypesMod.FileSystemSessionType.BACKGROUND & Double = js.native
  
  /**
    * Using this mode means that downloading/uploading session on the native side will be terminated once the application becomes inactive (e.g. when it goes to background).
    * Bringing the application to foreground again would trigger Promise rejection.
    */
  @js.native
  sealed trait FOREGROUND
    extends StObject
       with FileSystemSessionType
  /* 1 */ val FOREGROUND: typings.expoFileSystem.buildFileSystemDottypesMod.FileSystemSessionType.FOREGROUND & Double = js.native
}
