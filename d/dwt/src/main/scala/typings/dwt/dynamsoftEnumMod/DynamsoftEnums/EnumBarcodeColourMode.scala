package typings.dwt.dynamsoftEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EnumBarcodeColourMode extends js.Object

/** Barcode Color Mode */
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumBarcodeColourMode")
@js.native
object EnumBarcodeColourMode extends js.Object {
  @js.native
  sealed trait BICM_DARK_LIGHT_MIXED extends EnumBarcodeColourMode
  
  @js.native
  sealed trait BICM_DARK_ON_DARK extends EnumBarcodeColourMode
  
  @js.native
  sealed trait BICM_DARK_ON_LIGHT extends EnumBarcodeColourMode
  
  @js.native
  sealed trait BICM_DARK_ON_LIGHT_DARK_SURROUNDING extends EnumBarcodeColourMode
  
  @js.native
  sealed trait BICM_LIGHT_ON extends EnumBarcodeColourMode
  
  @js.native
  sealed trait BICM_LIGHT_ON_DARK extends EnumBarcodeColourMode
  
  @js.native
  sealed trait BICM_SKIP extends EnumBarcodeColourMode
  
  @js.native
  sealed trait _LIGHT extends EnumBarcodeColourMode
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumBarcodeColourMode with Double] = js.native
  /* 16 */ @js.native
  object BICM_DARK_LIGHT_MIXED extends TopLevel[BICM_DARK_LIGHT_MIXED with Double]
  
  /* 4 */ @js.native
  object BICM_DARK_ON_DARK extends TopLevel[BICM_DARK_ON_DARK with Double]
  
  /* 1 */ @js.native
  object BICM_DARK_ON_LIGHT extends TopLevel[BICM_DARK_ON_LIGHT with Double]
  
  /* 32 */ @js.native
  object BICM_DARK_ON_LIGHT_DARK_SURROUNDING extends TopLevel[BICM_DARK_ON_LIGHT_DARK_SURROUNDING with Double]
  
  /* 0 */ @js.native
  object BICM_LIGHT_ON extends TopLevel[BICM_LIGHT_ON with Double]
  
  /* 2 */ @js.native
  object BICM_LIGHT_ON_DARK extends TopLevel[BICM_LIGHT_ON_DARK with Double]
  
  /* 0 */ @js.native
  object BICM_SKIP extends TopLevel[BICM_SKIP with Double]
  
  /* 8 */ @js.native
  object _LIGHT extends TopLevel[_LIGHT with Double]
  
}

