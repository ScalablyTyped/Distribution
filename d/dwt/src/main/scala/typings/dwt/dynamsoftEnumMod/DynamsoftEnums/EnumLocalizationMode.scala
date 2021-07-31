package typings.dwt.dynamsoftEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnumLocalizationMode extends StObject
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumLocalizationMode")
@js.native
object EnumLocalizationMode extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumLocalizationMode & Double] = js.native
  
  @js.native
  sealed trait LM_AUTO
    extends StObject
       with EnumLocalizationMode
  /* 1 */ val LM_AUTO: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumLocalizationMode.LM_AUTO & Double = js.native
  
  @js.native
  sealed trait LM_CONNECTED_BLOCKS
    extends StObject
       with EnumLocalizationMode
  /* 2 */ val LM_CONNECTED_BLOCKS: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumLocalizationMode.LM_CONNECTED_BLOCKS & Double = js.native
  
  @js.native
  sealed trait LM_LINES
    extends StObject
       with EnumLocalizationMode
  /* 8 */ val LM_LINES: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumLocalizationMode.LM_LINES & Double = js.native
  
  @js.native
  sealed trait LM_SCAN_DIRECTLY
    extends StObject
       with EnumLocalizationMode
  /* 16 */ val LM_SCAN_DIRECTLY: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumLocalizationMode.LM_SCAN_DIRECTLY & Double = js.native
  
  @js.native
  sealed trait LM_SKIP
    extends StObject
       with EnumLocalizationMode
  /* 0 */ val LM_SKIP: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumLocalizationMode.LM_SKIP & Double = js.native
  
  @js.native
  sealed trait LM_STATISTICS
    extends StObject
       with EnumLocalizationMode
  /* 4 */ val LM_STATISTICS: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumLocalizationMode.LM_STATISTICS & Double = js.native
  
  @js.native
  sealed trait LM_STATISTICS_MARKS
    extends StObject
       with EnumLocalizationMode
  /* 32 */ val LM_STATISTICS_MARKS: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumLocalizationMode.LM_STATISTICS_MARKS & Double = js.native
  
  @js.native
  sealed trait LM_STATISTICS_POSTAL_CODE
    extends StObject
       with EnumLocalizationMode
  /* 64 */ val LM_STATISTICS_POSTAL_CODE: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumLocalizationMode.LM_STATISTICS_POSTAL_CODE & Double = js.native
}
