package typings.dwt.dynamsoftEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EnumDWTUploadDataFormat extends js.Object

@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumDWT_UploadDataFormat")
@js.native
object EnumDWTUploadDataFormat extends js.Object {
  @js.native
  sealed trait Base64 extends EnumDWTUploadDataFormat
  
  @js.native
  sealed trait Binary extends EnumDWTUploadDataFormat
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWTUploadDataFormat with Double] = js.native
  /* 1 */ @js.native
  object Base64 extends TopLevel[Base64 with Double]
  
  /* 0 */ @js.native
  object Binary extends TopLevel[Binary with Double]
  
}

