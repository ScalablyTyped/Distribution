package typings.dwt.dynamsoftEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnumClarityCalculationMethod extends StObject
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumClarityCalculationMethod")
@js.native
object EnumClarityCalculationMethod extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumClarityCalculationMethod with Double] = js.native
  
  @js.native
  sealed trait ECCM_CONTRAST extends EnumClarityCalculationMethod
  /* 1 */ val ECCM_CONTRAST: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumClarityCalculationMethod.ECCM_CONTRAST with Double = js.native
}
