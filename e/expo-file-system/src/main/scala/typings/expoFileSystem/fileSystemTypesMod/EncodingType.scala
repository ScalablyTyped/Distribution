package typings.expoFileSystem.fileSystemTypesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EncodingType extends js.Object

@JSImport("expo-file-system/build/FileSystem.types", "EncodingType")
@js.native
object EncodingType extends js.Object {
  @js.native
  sealed trait Base64 extends EncodingType
  
  @js.native
  sealed trait UTF8 extends EncodingType
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[EncodingType with String] = js.native
  /* "base64" */ @js.native
  object Base64 extends TopLevel[Base64 with String]
  
  /* "utf8" */ @js.native
  object UTF8 extends TopLevel[UTF8 with String]
  
}

