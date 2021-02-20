package typings.dwt.dynamsoftEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnumErrorMessage extends StObject
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.Enum_ErrorMessage")
@js.native
object EnumErrorMessage extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[EnumErrorMessage with String] = js.native
  
  @js.native
  sealed trait FILE_STREAM_ERROR extends EnumErrorMessage
  /* "File Stream Error= " */ val FILE_STREAM_ERROR: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumErrorMessage.FILE_STREAM_ERROR with String = js.native
  
  @js.native
  sealed trait PARAMETER_TYPE_ERROR extends EnumErrorMessage
  /* "Parameter Type not Supported= " */ val PARAMETER_TYPE_ERROR: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumErrorMessage.PARAMETER_TYPE_ERROR with String = js.native
  
  @js.native
  sealed trait TIMEOUT extends EnumErrorMessage
  /* "Timeout no Response= " */ val TIMEOUT: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumErrorMessage.TIMEOUT with String = js.native
}
