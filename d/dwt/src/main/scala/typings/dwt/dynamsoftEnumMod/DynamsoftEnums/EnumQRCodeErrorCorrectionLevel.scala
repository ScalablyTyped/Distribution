package typings.dwt.dynamsoftEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnumQRCodeErrorCorrectionLevel extends js.Object
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumQRCodeErrorCorrectionLevel")
@js.native
object EnumQRCodeErrorCorrectionLevel extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumQRCodeErrorCorrectionLevel with Double] = js.native
  
  @js.native
  sealed trait QRECL_ERROR_CORRECTION_H extends EnumQRCodeErrorCorrectionLevel
  /* 0 */ @js.native
  object QRECL_ERROR_CORRECTION_H extends TopLevel[QRECL_ERROR_CORRECTION_H with Double]
  
  @js.native
  sealed trait QRECL_ERROR_CORRECTION_L extends EnumQRCodeErrorCorrectionLevel
  /* 1 */ @js.native
  object QRECL_ERROR_CORRECTION_L extends TopLevel[QRECL_ERROR_CORRECTION_L with Double]
  
  @js.native
  sealed trait QRECL_ERROR_CORRECTION_M extends EnumQRCodeErrorCorrectionLevel
  /* 2 */ @js.native
  object QRECL_ERROR_CORRECTION_M extends TopLevel[QRECL_ERROR_CORRECTION_M with Double]
  
  @js.native
  sealed trait QRECL_ERROR_CORRECTION_Q extends EnumQRCodeErrorCorrectionLevel
  /* 3 */ @js.native
  object QRECL_ERROR_CORRECTION_Q extends TopLevel[QRECL_ERROR_CORRECTION_Q with Double]
}
