package typings.dwt.dynamsoftEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnumTerminatePhase extends js.Object
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumTerminatePhase")
@js.native
object EnumTerminatePhase extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumTerminatePhase with Double] = js.native
  
  @js.native
  sealed trait TP_BARCODE_LOCALIZED extends EnumTerminatePhase
  /* 8 */ @js.native
  object TP_BARCODE_LOCALIZED extends TopLevel[TP_BARCODE_LOCALIZED with Double]
  
  @js.native
  sealed trait TP_BARCODE_RECOGNIZED extends EnumTerminatePhase
  /* 32 */ @js.native
  object TP_BARCODE_RECOGNIZED extends TopLevel[TP_BARCODE_RECOGNIZED with Double]
  
  @js.native
  sealed trait TP_BARCODE_TYPE_DETERMINED extends EnumTerminatePhase
  /* 16 */ @js.native
  object TP_BARCODE_TYPE_DETERMINED extends TopLevel[TP_BARCODE_TYPE_DETERMINED with Double]
  
  @js.native
  sealed trait TP_IMAGE_BINARIZED extends EnumTerminatePhase
  /* 4 */ @js.native
  object TP_IMAGE_BINARIZED extends TopLevel[TP_IMAGE_BINARIZED with Double]
  
  @js.native
  sealed trait TP_IMAGE_PREPROCESSED extends EnumTerminatePhase
  /* 2 */ @js.native
  object TP_IMAGE_PREPROCESSED extends TopLevel[TP_IMAGE_PREPROCESSED with Double]
  
  @js.native
  sealed trait TP_REGION_PREDETECTED extends EnumTerminatePhase
  /* 1 */ @js.native
  object TP_REGION_PREDETECTED extends TopLevel[TP_REGION_PREDETECTED with Double]
}
