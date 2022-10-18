package typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnumClarityCalculationMethod extends StObject
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumClarityCalculationMethod")
@js.native
object EnumClarityCalculationMethod extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumClarityCalculationMethod & Double] = js.native
  
  @js.native
  sealed trait ECCM_CONTRAST
    extends StObject
       with EnumClarityCalculationMethod
  /* 1 */ val ECCM_CONTRAST: typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumClarityCalculationMethod.ECCM_CONTRAST & Double = js.native
}
