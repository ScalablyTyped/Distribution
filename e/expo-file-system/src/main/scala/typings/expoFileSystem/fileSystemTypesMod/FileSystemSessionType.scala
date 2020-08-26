package typings.expoFileSystem.fileSystemTypesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FileSystemSessionType extends js.Object

@JSImport("expo-file-system/build/FileSystem.types", "FileSystemSessionType")
@js.native
object FileSystemSessionType extends js.Object {
  @js.native
  sealed trait BACKGROUND extends FileSystemSessionType
  
  @js.native
  sealed trait FOREGROUND extends FileSystemSessionType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FileSystemSessionType with Double] = js.native
  /* 0 */ @js.native
  object BACKGROUND extends TopLevel[BACKGROUND with Double]
  
  /* 1 */ @js.native
  object FOREGROUND extends TopLevel[FOREGROUND with Double]
  
}

