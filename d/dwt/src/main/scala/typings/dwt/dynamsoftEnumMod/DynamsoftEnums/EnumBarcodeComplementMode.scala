package typings.dwt.dynamsoftEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnumBarcodeComplementMode extends StObject
/** Barcode Complement Mode */
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumBarcodeComplementMode")
@js.native
object EnumBarcodeComplementMode extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumBarcodeComplementMode with Double] = js.native
  
  @js.native
  sealed trait BCM_AUTO extends EnumBarcodeComplementMode
  /* 1 */ val BCM_AUTO: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumBarcodeComplementMode.BCM_AUTO with Double = js.native
  
  @js.native
  sealed trait BCM_GENERAL extends EnumBarcodeComplementMode
  /* 2 */ val BCM_GENERAL: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumBarcodeComplementMode.BCM_GENERAL with Double = js.native
  
  @js.native
  sealed trait BCM_SKIP extends EnumBarcodeComplementMode
  /* 0 */ val BCM_SKIP: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumBarcodeComplementMode.BCM_SKIP with Double = js.native
}
