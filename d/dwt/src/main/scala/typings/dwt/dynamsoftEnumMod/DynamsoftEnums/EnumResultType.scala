package typings.dwt.dynamsoftEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnumResultType extends StObject
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumResultType")
@js.native
object EnumResultType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumResultType & Double] = js.native
  
  @js.native
  sealed trait RT_CANDIDATE_TEXT
    extends StObject
       with EnumResultType
  /* 2 */ val RT_CANDIDATE_TEXT: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumResultType.RT_CANDIDATE_TEXT & Double = js.native
  
  @js.native
  sealed trait RT_PARTIAL_TEXT
    extends StObject
       with EnumResultType
  /* 3 */ val RT_PARTIAL_TEXT: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumResultType.RT_PARTIAL_TEXT & Double = js.native
  
  @js.native
  sealed trait RT_RAW_TEXT
    extends StObject
       with EnumResultType
  /* 1 */ val RT_RAW_TEXT: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumResultType.RT_RAW_TEXT & Double = js.native
  
  @js.native
  sealed trait RT_STANDARD_TEXT
    extends StObject
       with EnumResultType
  /* 0 */ val RT_STANDARD_TEXT: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumResultType.RT_STANDARD_TEXT & Double = js.native
}
