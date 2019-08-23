package typings.expoDashFileDashSystem.buildFileSystemDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EncodingType extends js.Object

@JSImport("expo-file-system/build/FileSystem.types", "EncodingType")
@js.native
object EncodingType extends js.Object {
  @js.native
  sealed trait Base64 extends EncodingType
  
  @js.native
  sealed trait UTF8 extends EncodingType
  
  /* "base64" */ val Base64: typings.expoDashFileDashSystem.buildFileSystemDotTypesMod.EncodingType.Base64 with String = js.native
  /* "utf8" */ val UTF8: typings.expoDashFileDashSystem.buildFileSystemDotTypesMod.EncodingType.UTF8 with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[EncodingType with String] = js.native
}

