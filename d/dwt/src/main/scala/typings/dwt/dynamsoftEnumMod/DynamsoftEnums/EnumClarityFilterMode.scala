package typings.dwt.dynamsoftEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnumClarityFilterMode extends js.Object
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumClarityFilterMode")
@js.native
object EnumClarityFilterMode extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumClarityFilterMode with Double] = js.native
  
  @js.native
  sealed trait CFM_GENERAL extends EnumClarityFilterMode
  /* 1 */ @js.native
  object CFM_GENERAL extends TopLevel[CFM_GENERAL with Double]
}
