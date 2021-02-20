package typings.dwt.dynamsoftEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnumBarcodeColourMode extends StObject
/** Barcode Color Mode */
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumBarcodeColourMode")
@js.native
object EnumBarcodeColourMode extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumBarcodeColourMode with Double] = js.native
  
  @js.native
  sealed trait BICM_DARK_LIGHT_MIXED extends EnumBarcodeColourMode
  /* 16 */ val BICM_DARK_LIGHT_MIXED: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumBarcodeColourMode.BICM_DARK_LIGHT_MIXED with Double = js.native
  
  @js.native
  sealed trait BICM_DARK_ON_DARK extends EnumBarcodeColourMode
  /* 4 */ val BICM_DARK_ON_DARK: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumBarcodeColourMode.BICM_DARK_ON_DARK with Double = js.native
  
  @js.native
  sealed trait BICM_DARK_ON_LIGHT extends EnumBarcodeColourMode
  /* 1 */ val BICM_DARK_ON_LIGHT: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumBarcodeColourMode.BICM_DARK_ON_LIGHT with Double = js.native
  
  @js.native
  sealed trait BICM_DARK_ON_LIGHT_DARK_SURROUNDING extends EnumBarcodeColourMode
  /* 32 */ val BICM_DARK_ON_LIGHT_DARK_SURROUNDING: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumBarcodeColourMode.BICM_DARK_ON_LIGHT_DARK_SURROUNDING with Double = js.native
  
  @js.native
  sealed trait BICM_LIGHT_ON extends EnumBarcodeColourMode
  /* 0 */ val BICM_LIGHT_ON: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumBarcodeColourMode.BICM_LIGHT_ON with Double = js.native
  
  @js.native
  sealed trait BICM_LIGHT_ON_DARK extends EnumBarcodeColourMode
  /* 2 */ val BICM_LIGHT_ON_DARK: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumBarcodeColourMode.BICM_LIGHT_ON_DARK with Double = js.native
  
  @js.native
  sealed trait BICM_SKIP extends EnumBarcodeColourMode
  /* 0 */ val BICM_SKIP: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumBarcodeColourMode.BICM_SKIP with Double = js.native
  
  @js.native
  sealed trait _LIGHT extends EnumBarcodeColourMode
  /* 8 */ val _LIGHT: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumBarcodeColourMode._LIGHT with Double = js.native
}
