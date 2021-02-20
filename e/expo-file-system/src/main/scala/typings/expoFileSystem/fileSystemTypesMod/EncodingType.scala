package typings.expoFileSystem.fileSystemTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EncodingType extends StObject
@JSImport("expo-file-system/build/FileSystem.types", "EncodingType")
@js.native
object EncodingType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[EncodingType with String] = js.native
  
  @js.native
  sealed trait Base64 extends EncodingType
  /* "base64" */ val Base64: typings.expoFileSystem.fileSystemTypesMod.EncodingType.Base64 with String = js.native
  
  @js.native
  sealed trait UTF8 extends EncodingType
  /* "utf8" */ val UTF8: typings.expoFileSystem.fileSystemTypesMod.EncodingType.UTF8 with String = js.native
}
