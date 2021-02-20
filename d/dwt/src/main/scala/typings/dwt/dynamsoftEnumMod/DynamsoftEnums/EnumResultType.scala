package typings.dwt.dynamsoftEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnumResultType extends StObject
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumResultType")
@js.native
object EnumResultType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumResultType with Double] = js.native
  
  @js.native
  sealed trait RT_CANDIDATE_TEXT extends EnumResultType
  /* 2 */ val RT_CANDIDATE_TEXT: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumResultType.RT_CANDIDATE_TEXT with Double = js.native
  
  @js.native
  sealed trait RT_PARTIAL_TEXT extends EnumResultType
  /* 3 */ val RT_PARTIAL_TEXT: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumResultType.RT_PARTIAL_TEXT with Double = js.native
  
  @js.native
  sealed trait RT_RAW_TEXT extends EnumResultType
  /* 1 */ val RT_RAW_TEXT: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumResultType.RT_RAW_TEXT with Double = js.native
  
  @js.native
  sealed trait RT_STANDARD_TEXT extends EnumResultType
  /* 0 */ val RT_STANDARD_TEXT: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumResultType.RT_STANDARD_TEXT with Double = js.native
}
