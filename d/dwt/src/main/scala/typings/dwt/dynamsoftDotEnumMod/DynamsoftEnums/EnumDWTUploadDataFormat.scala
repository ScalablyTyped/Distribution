package typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnumDWTUploadDataFormat extends StObject
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumDWT_UploadDataFormat")
@js.native
object EnumDWTUploadDataFormat extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWTUploadDataFormat & Double] = js.native
  
  @js.native
  sealed trait Base64
    extends StObject
       with EnumDWTUploadDataFormat
  /* 1 */ val Base64: typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumDWTUploadDataFormat.Base64 & Double = js.native
  
  @js.native
  sealed trait Binary
    extends StObject
       with EnumDWTUploadDataFormat
  /* 0 */ val Binary: typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumDWTUploadDataFormat.Binary & Double = js.native
}
