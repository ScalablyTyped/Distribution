package typings.dwt.dynamsoftEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnumTerminatePhase extends StObject
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumTerminatePhase")
@js.native
object EnumTerminatePhase extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumTerminatePhase with Double] = js.native
  
  @js.native
  sealed trait TP_BARCODE_LOCALIZED extends EnumTerminatePhase
  /* 8 */ val TP_BARCODE_LOCALIZED: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumTerminatePhase.TP_BARCODE_LOCALIZED with Double = js.native
  
  @js.native
  sealed trait TP_BARCODE_RECOGNIZED extends EnumTerminatePhase
  /* 32 */ val TP_BARCODE_RECOGNIZED: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumTerminatePhase.TP_BARCODE_RECOGNIZED with Double = js.native
  
  @js.native
  sealed trait TP_BARCODE_TYPE_DETERMINED extends EnumTerminatePhase
  /* 16 */ val TP_BARCODE_TYPE_DETERMINED: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumTerminatePhase.TP_BARCODE_TYPE_DETERMINED with Double = js.native
  
  @js.native
  sealed trait TP_IMAGE_BINARIZED extends EnumTerminatePhase
  /* 4 */ val TP_IMAGE_BINARIZED: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumTerminatePhase.TP_IMAGE_BINARIZED with Double = js.native
  
  @js.native
  sealed trait TP_IMAGE_PREPROCESSED extends EnumTerminatePhase
  /* 2 */ val TP_IMAGE_PREPROCESSED: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumTerminatePhase.TP_IMAGE_PREPROCESSED with Double = js.native
  
  @js.native
  sealed trait TP_REGION_PREDETECTED extends EnumTerminatePhase
  /* 1 */ val TP_REGION_PREDETECTED: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumTerminatePhase.TP_REGION_PREDETECTED with Double = js.native
}
