package typings.expoFileSystem.fileSystemTypesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FileSystemSessionType extends js.Object
@JSImport("expo-file-system/build/FileSystem.types", "FileSystemSessionType")
@js.native
object FileSystemSessionType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FileSystemSessionType with Double] = js.native
  
  @js.native
  sealed trait BACKGROUND extends FileSystemSessionType
  /* 0 */ @js.native
  object BACKGROUND extends TopLevel[BACKGROUND with Double]
  
  @js.native
  sealed trait FOREGROUND extends FileSystemSessionType
  /* 1 */ @js.native
  object FOREGROUND extends TopLevel[FOREGROUND with Double]
}
