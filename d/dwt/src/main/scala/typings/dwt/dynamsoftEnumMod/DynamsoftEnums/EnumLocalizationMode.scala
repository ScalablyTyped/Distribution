package typings.dwt.dynamsoftEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnumLocalizationMode extends js.Object
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumLocalizationMode")
@js.native
object EnumLocalizationMode extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumLocalizationMode with Double] = js.native
  
  @js.native
  sealed trait LM_AUTO extends EnumLocalizationMode
  /* 1 */ @js.native
  object LM_AUTO extends TopLevel[LM_AUTO with Double]
  
  @js.native
  sealed trait LM_CONNECTED_BLOCKS extends EnumLocalizationMode
  /* 2 */ @js.native
  object LM_CONNECTED_BLOCKS extends TopLevel[LM_CONNECTED_BLOCKS with Double]
  
  @js.native
  sealed trait LM_LINES extends EnumLocalizationMode
  /* 8 */ @js.native
  object LM_LINES extends TopLevel[LM_LINES with Double]
  
  @js.native
  sealed trait LM_SCAN_DIRECTLY extends EnumLocalizationMode
  /* 16 */ @js.native
  object LM_SCAN_DIRECTLY extends TopLevel[LM_SCAN_DIRECTLY with Double]
  
  @js.native
  sealed trait LM_SKIP extends EnumLocalizationMode
  /* 0 */ @js.native
  object LM_SKIP extends TopLevel[LM_SKIP with Double]
  
  @js.native
  sealed trait LM_STATISTICS extends EnumLocalizationMode
  /* 4 */ @js.native
  object LM_STATISTICS extends TopLevel[LM_STATISTICS with Double]
  
  @js.native
  sealed trait LM_STATISTICS_MARKS extends EnumLocalizationMode
  /* 32 */ @js.native
  object LM_STATISTICS_MARKS extends TopLevel[LM_STATISTICS_MARKS with Double]
  
  @js.native
  sealed trait LM_STATISTICS_POSTAL_CODE extends EnumLocalizationMode
  /* 64 */ @js.native
  object LM_STATISTICS_POSTAL_CODE extends TopLevel[LM_STATISTICS_POSTAL_CODE with Double]
}
