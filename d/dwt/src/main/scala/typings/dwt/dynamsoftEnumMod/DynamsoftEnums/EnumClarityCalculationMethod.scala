package typings.dwt.dynamsoftEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnumClarityCalculationMethod extends js.Object
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumClarityCalculationMethod")
@js.native
object EnumClarityCalculationMethod extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumClarityCalculationMethod with Double] = js.native
  
  @js.native
  sealed trait ECCM_CONTRAST extends EnumClarityCalculationMethod
  /* 1 */ @js.native
  object ECCM_CONTRAST extends TopLevel[ECCM_CONTRAST with Double]
}
