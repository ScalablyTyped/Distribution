package typings.dwt.dynamsoftEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnumDWTUploadDataFormat extends StObject
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumDWT_UploadDataFormat")
@js.native
object EnumDWTUploadDataFormat extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWTUploadDataFormat with Double] = js.native
  
  @js.native
  sealed trait Base64 extends EnumDWTUploadDataFormat
  /* 1 */ val Base64: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTUploadDataFormat.Base64 with Double = js.native
  
  @js.native
  sealed trait Binary extends EnumDWTUploadDataFormat
  /* 0 */ val Binary: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTUploadDataFormat.Binary with Double = js.native
}
