package typings.dwt.dynamsoftEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnumScaleUpMode extends StObject
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumScaleUpMode")
@js.native
object EnumScaleUpMode extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumScaleUpMode & Double] = js.native
  
  @js.native
  sealed trait SUM_AUTO
    extends StObject
       with EnumScaleUpMode
  /* 1 */ val SUM_AUTO: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumScaleUpMode.SUM_AUTO & Double = js.native
  
  @js.native
  sealed trait SUM_LINEAR_INTERPOLATION
    extends StObject
       with EnumScaleUpMode
  /* 2 */ val SUM_LINEAR_INTERPOLATION: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumScaleUpMode.SUM_LINEAR_INTERPOLATION & Double = js.native
  
  @js.native
  sealed trait SUM_NEAREST_NEIGHBOUR_INTERPOLATION
    extends StObject
       with EnumScaleUpMode
  /* 4 */ val SUM_NEAREST_NEIGHBOUR_INTERPOLATION: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumScaleUpMode.SUM_NEAREST_NEIGHBOUR_INTERPOLATION & Double = js.native
  
  @js.native
  sealed trait SUM_SKIP
    extends StObject
       with EnumScaleUpMode
  /* 0 */ val SUM_SKIP: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumScaleUpMode.SUM_SKIP & Double = js.native
}
