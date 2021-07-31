package typings.dwt.dynamsoftEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnumQRCodeErrorCorrectionLevel extends StObject
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumQRCodeErrorCorrectionLevel")
@js.native
object EnumQRCodeErrorCorrectionLevel extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumQRCodeErrorCorrectionLevel & Double] = js.native
  
  @js.native
  sealed trait QRECL_ERROR_CORRECTION_H
    extends StObject
       with EnumQRCodeErrorCorrectionLevel
  /* 0 */ val QRECL_ERROR_CORRECTION_H: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumQRCodeErrorCorrectionLevel.QRECL_ERROR_CORRECTION_H & Double = js.native
  
  @js.native
  sealed trait QRECL_ERROR_CORRECTION_L
    extends StObject
       with EnumQRCodeErrorCorrectionLevel
  /* 1 */ val QRECL_ERROR_CORRECTION_L: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumQRCodeErrorCorrectionLevel.QRECL_ERROR_CORRECTION_L & Double = js.native
  
  @js.native
  sealed trait QRECL_ERROR_CORRECTION_M
    extends StObject
       with EnumQRCodeErrorCorrectionLevel
  /* 2 */ val QRECL_ERROR_CORRECTION_M: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumQRCodeErrorCorrectionLevel.QRECL_ERROR_CORRECTION_M & Double = js.native
  
  @js.native
  sealed trait QRECL_ERROR_CORRECTION_Q
    extends StObject
       with EnumQRCodeErrorCorrectionLevel
  /* 3 */ val QRECL_ERROR_CORRECTION_Q: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumQRCodeErrorCorrectionLevel.QRECL_ERROR_CORRECTION_Q & Double = js.native
}
