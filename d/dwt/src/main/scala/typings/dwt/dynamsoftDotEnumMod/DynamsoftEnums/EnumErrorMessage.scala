package typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnumErrorMessage extends StObject
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.Enum_ErrorMessage")
@js.native
object EnumErrorMessage extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[EnumErrorMessage & String] = js.native
  
  @js.native
  sealed trait FILE_STREAM_ERROR
    extends StObject
       with EnumErrorMessage
  /* "File Stream Error= " */ val FILE_STREAM_ERROR: typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumErrorMessage.FILE_STREAM_ERROR & String = js.native
  
  @js.native
  sealed trait PARAMETER_TYPE_ERROR
    extends StObject
       with EnumErrorMessage
  /* "Parameter Type not Supported= " */ val PARAMETER_TYPE_ERROR: typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumErrorMessage.PARAMETER_TYPE_ERROR & String = js.native
  
  @js.native
  sealed trait TIMEOUT
    extends StObject
       with EnumErrorMessage
  /* "Timeout no Response= " */ val TIMEOUT: typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumErrorMessage.TIMEOUT & String = js.native
}
