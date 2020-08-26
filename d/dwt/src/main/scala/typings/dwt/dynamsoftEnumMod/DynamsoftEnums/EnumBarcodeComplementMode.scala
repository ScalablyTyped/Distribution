package typings.dwt.dynamsoftEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EnumBarcodeComplementMode extends js.Object

/** Barcode Complement Mode */
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumBarcodeComplementMode")
@js.native
object EnumBarcodeComplementMode extends js.Object {
  @js.native
  sealed trait BCM_AUTO extends EnumBarcodeComplementMode
  
  @js.native
  sealed trait BCM_GENERAL extends EnumBarcodeComplementMode
  
  @js.native
  sealed trait BCM_SKIP extends EnumBarcodeComplementMode
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumBarcodeComplementMode with Double] = js.native
  /* 1 */ @js.native
  object BCM_AUTO extends TopLevel[BCM_AUTO with Double]
  
  /* 2 */ @js.native
  object BCM_GENERAL extends TopLevel[BCM_GENERAL with Double]
  
  /* 0 */ @js.native
  object BCM_SKIP extends TopLevel[BCM_SKIP with Double]
  
}

