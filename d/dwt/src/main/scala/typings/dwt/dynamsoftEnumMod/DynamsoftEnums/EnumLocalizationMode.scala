package typings.dwt.dynamsoftEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnumLocalizationMode extends StObject
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumLocalizationMode")
@js.native
object EnumLocalizationMode extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumLocalizationMode with Double] = js.native
  
  @js.native
  sealed trait LM_AUTO extends EnumLocalizationMode
  /* 1 */ val LM_AUTO: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumLocalizationMode.LM_AUTO with Double = js.native
  
  @js.native
  sealed trait LM_CONNECTED_BLOCKS extends EnumLocalizationMode
  /* 2 */ val LM_CONNECTED_BLOCKS: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumLocalizationMode.LM_CONNECTED_BLOCKS with Double = js.native
  
  @js.native
  sealed trait LM_LINES extends EnumLocalizationMode
  /* 8 */ val LM_LINES: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumLocalizationMode.LM_LINES with Double = js.native
  
  @js.native
  sealed trait LM_SCAN_DIRECTLY extends EnumLocalizationMode
  /* 16 */ val LM_SCAN_DIRECTLY: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumLocalizationMode.LM_SCAN_DIRECTLY with Double = js.native
  
  @js.native
  sealed trait LM_SKIP extends EnumLocalizationMode
  /* 0 */ val LM_SKIP: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumLocalizationMode.LM_SKIP with Double = js.native
  
  @js.native
  sealed trait LM_STATISTICS extends EnumLocalizationMode
  /* 4 */ val LM_STATISTICS: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumLocalizationMode.LM_STATISTICS with Double = js.native
  
  @js.native
  sealed trait LM_STATISTICS_MARKS extends EnumLocalizationMode
  /* 32 */ val LM_STATISTICS_MARKS: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumLocalizationMode.LM_STATISTICS_MARKS with Double = js.native
  
  @js.native
  sealed trait LM_STATISTICS_POSTAL_CODE extends EnumLocalizationMode
  /* 64 */ val LM_STATISTICS_POSTAL_CODE: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumLocalizationMode.LM_STATISTICS_POSTAL_CODE with Double = js.native
}
