package typings.dwt.dynamsoftEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnumScaleUpMode extends js.Object
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumScaleUpMode")
@js.native
object EnumScaleUpMode extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumScaleUpMode with Double] = js.native
  
  @js.native
  sealed trait SUM_AUTO extends EnumScaleUpMode
  /* 1 */ @js.native
  object SUM_AUTO extends TopLevel[SUM_AUTO with Double]
  
  @js.native
  sealed trait SUM_LINEAR_INTERPOLATION extends EnumScaleUpMode
  /* 2 */ @js.native
  object SUM_LINEAR_INTERPOLATION extends TopLevel[SUM_LINEAR_INTERPOLATION with Double]
  
  @js.native
  sealed trait SUM_NEAREST_NEIGHBOUR_INTERPOLATION extends EnumScaleUpMode
  /* 4 */ @js.native
  object SUM_NEAREST_NEIGHBOUR_INTERPOLATION extends TopLevel[SUM_NEAREST_NEIGHBOUR_INTERPOLATION with Double]
  
  @js.native
  sealed trait SUM_SKIP extends EnumScaleUpMode
  /* 0 */ @js.native
  object SUM_SKIP extends TopLevel[SUM_SKIP with Double]
}
