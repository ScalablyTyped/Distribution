package typings.expoFileSystem.buildFileSystemDottypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EncodingType extends StObject
@JSImport("expo-file-system/build/FileSystem.types", "EncodingType")
@js.native
object EncodingType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[EncodingType & String] = js.native
  
  /**
    * Binary, radix-64 representation.
    */
  @js.native
  sealed trait Base64
    extends StObject
       with EncodingType
  /* "base64" */ val Base64: typings.expoFileSystem.buildFileSystemDottypesMod.EncodingType.Base64 & String = js.native
  
  /**
    * Standard encoding format.
    */
  @js.native
  sealed trait UTF8
    extends StObject
       with EncodingType
  /* "utf8" */ val UTF8: typings.expoFileSystem.buildFileSystemDottypesMod.EncodingType.UTF8 & String = js.native
}
