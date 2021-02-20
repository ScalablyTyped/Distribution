package typings.dwt.dynamsoftEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnumQRCodeErrorCorrectionLevel extends StObject
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumQRCodeErrorCorrectionLevel")
@js.native
object EnumQRCodeErrorCorrectionLevel extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumQRCodeErrorCorrectionLevel with Double] = js.native
  
  @js.native
  sealed trait QRECL_ERROR_CORRECTION_H extends EnumQRCodeErrorCorrectionLevel
  /* 0 */ val QRECL_ERROR_CORRECTION_H: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumQRCodeErrorCorrectionLevel.QRECL_ERROR_CORRECTION_H with Double = js.native
  
  @js.native
  sealed trait QRECL_ERROR_CORRECTION_L extends EnumQRCodeErrorCorrectionLevel
  /* 1 */ val QRECL_ERROR_CORRECTION_L: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumQRCodeErrorCorrectionLevel.QRECL_ERROR_CORRECTION_L with Double = js.native
  
  @js.native
  sealed trait QRECL_ERROR_CORRECTION_M extends EnumQRCodeErrorCorrectionLevel
  /* 2 */ val QRECL_ERROR_CORRECTION_M: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumQRCodeErrorCorrectionLevel.QRECL_ERROR_CORRECTION_M with Double = js.native
  
  @js.native
  sealed trait QRECL_ERROR_CORRECTION_Q extends EnumQRCodeErrorCorrectionLevel
  /* 3 */ val QRECL_ERROR_CORRECTION_Q: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumQRCodeErrorCorrectionLevel.QRECL_ERROR_CORRECTION_Q with Double = js.native
}
