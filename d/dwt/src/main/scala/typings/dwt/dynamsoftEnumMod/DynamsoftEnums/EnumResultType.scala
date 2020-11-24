package typings.dwt.dynamsoftEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnumResultType extends js.Object
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumResultType")
@js.native
object EnumResultType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumResultType with Double] = js.native
  
  @js.native
  sealed trait RT_CANDIDATE_TEXT extends EnumResultType
  /* 2 */ @js.native
  object RT_CANDIDATE_TEXT extends TopLevel[RT_CANDIDATE_TEXT with Double]
  
  @js.native
  sealed trait RT_PARTIAL_TEXT extends EnumResultType
  /* 3 */ @js.native
  object RT_PARTIAL_TEXT extends TopLevel[RT_PARTIAL_TEXT with Double]
  
  @js.native
  sealed trait RT_RAW_TEXT extends EnumResultType
  /* 1 */ @js.native
  object RT_RAW_TEXT extends TopLevel[RT_RAW_TEXT with Double]
  
  @js.native
  sealed trait RT_STANDARD_TEXT extends EnumResultType
  /* 0 */ @js.native
  object RT_STANDARD_TEXT extends TopLevel[RT_STANDARD_TEXT with Double]
}
