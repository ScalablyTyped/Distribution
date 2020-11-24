package typings.dwt.dynamsoftEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnumDWTUploadDataFormat extends js.Object
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumDWT_UploadDataFormat")
@js.native
object EnumDWTUploadDataFormat extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWTUploadDataFormat with Double] = js.native
  
  @js.native
  sealed trait Base64 extends EnumDWTUploadDataFormat
  /* 1 */ @js.native
  object Base64 extends TopLevel[Base64 with Double]
  
  @js.native
  sealed trait Binary extends EnumDWTUploadDataFormat
  /* 0 */ @js.native
  object Binary extends TopLevel[Binary with Double]
}
