package typings.dwt.dynamsoftEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnumErrorMessage extends js.Object
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.Enum_ErrorMessage")
@js.native
object EnumErrorMessage extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[EnumErrorMessage with String] = js.native
  
  @js.native
  sealed trait FILE_STREAM_ERROR extends EnumErrorMessage
  /* "File Stream Error= " */ @js.native
  object FILE_STREAM_ERROR extends TopLevel[FILE_STREAM_ERROR with String]
  
  @js.native
  sealed trait PARAMETER_TYPE_ERROR extends EnumErrorMessage
  /* "Parameter Type not Supported= " */ @js.native
  object PARAMETER_TYPE_ERROR extends TopLevel[PARAMETER_TYPE_ERROR with String]
  
  @js.native
  sealed trait TIMEOUT extends EnumErrorMessage
  /* "Timeout no Response= " */ @js.native
  object TIMEOUT extends TopLevel[TIMEOUT with String]
}
