package typings.dwt.dynamsoftEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnumBarcodeComplementMode extends js.Object
/** Barcode Complement Mode */
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumBarcodeComplementMode")
@js.native
object EnumBarcodeComplementMode extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumBarcodeComplementMode with Double] = js.native
  
  @js.native
  sealed trait BCM_AUTO extends EnumBarcodeComplementMode
  /* 1 */ @js.native
  object BCM_AUTO extends TopLevel[BCM_AUTO with Double]
  
  @js.native
  sealed trait BCM_GENERAL extends EnumBarcodeComplementMode
  /* 2 */ @js.native
  object BCM_GENERAL extends TopLevel[BCM_GENERAL with Double]
  
  @js.native
  sealed trait BCM_SKIP extends EnumBarcodeComplementMode
  /* 0 */ @js.native
  object BCM_SKIP extends TopLevel[BCM_SKIP with Double]
}
