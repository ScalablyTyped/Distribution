package typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnumBarcodeColourMode extends StObject
/** Barcode Color Mode */
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumBarcodeColourMode")
@js.native
object EnumBarcodeColourMode extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumBarcodeColourMode & Double] = js.native
  
  @js.native
  sealed trait BICM_DARK_LIGHT_MIXED
    extends StObject
       with EnumBarcodeColourMode
  /* 16 */ val BICM_DARK_LIGHT_MIXED: typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumBarcodeColourMode.BICM_DARK_LIGHT_MIXED & Double = js.native
  
  @js.native
  sealed trait BICM_DARK_ON_DARK
    extends StObject
       with EnumBarcodeColourMode
  /* 4 */ val BICM_DARK_ON_DARK: typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumBarcodeColourMode.BICM_DARK_ON_DARK & Double = js.native
  
  @js.native
  sealed trait BICM_DARK_ON_LIGHT
    extends StObject
       with EnumBarcodeColourMode
  /* 1 */ val BICM_DARK_ON_LIGHT: typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumBarcodeColourMode.BICM_DARK_ON_LIGHT & Double = js.native
  
  @js.native
  sealed trait BICM_DARK_ON_LIGHT_DARK_SURROUNDING
    extends StObject
       with EnumBarcodeColourMode
  /* 32 */ val BICM_DARK_ON_LIGHT_DARK_SURROUNDING: typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumBarcodeColourMode.BICM_DARK_ON_LIGHT_DARK_SURROUNDING & Double = js.native
  
  @js.native
  sealed trait BICM_LIGHT_ON
    extends StObject
       with EnumBarcodeColourMode
  /* 0 */ val BICM_LIGHT_ON: typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumBarcodeColourMode.BICM_LIGHT_ON & Double = js.native
  
  @js.native
  sealed trait BICM_LIGHT_ON_DARK
    extends StObject
       with EnumBarcodeColourMode
  /* 2 */ val BICM_LIGHT_ON_DARK: typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumBarcodeColourMode.BICM_LIGHT_ON_DARK & Double = js.native
  
  @js.native
  sealed trait BICM_SKIP
    extends StObject
       with EnumBarcodeColourMode
  /* 0 */ val BICM_SKIP: typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumBarcodeColourMode.BICM_SKIP & Double = js.native
  
  @js.native
  sealed trait _LIGHT
    extends StObject
       with EnumBarcodeColourMode
  /* 8 */ val _LIGHT: typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumBarcodeColourMode._LIGHT & Double = js.native
}
