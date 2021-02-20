package typings.dwt.dynamsoftEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnumClarityFilterMode extends StObject
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumClarityFilterMode")
@js.native
object EnumClarityFilterMode extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumClarityFilterMode with Double] = js.native
  
  @js.native
  sealed trait CFM_GENERAL extends EnumClarityFilterMode
  /* 1 */ val CFM_GENERAL: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumClarityFilterMode.CFM_GENERAL with Double = js.native
}
