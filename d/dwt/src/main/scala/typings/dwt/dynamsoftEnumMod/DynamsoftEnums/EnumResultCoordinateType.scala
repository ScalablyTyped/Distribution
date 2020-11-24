package typings.dwt.dynamsoftEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnumResultCoordinateType extends js.Object
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumResultCoordinateType")
@js.native
object EnumResultCoordinateType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumResultCoordinateType with Double] = js.native
  
  @js.native
  sealed trait RCT_PERCENTAGE extends EnumResultCoordinateType
  /* 2 */ @js.native
  object RCT_PERCENTAGE extends TopLevel[RCT_PERCENTAGE with Double]
  
  @js.native
  sealed trait RCT_PIXEL extends EnumResultCoordinateType
  /* 1 */ @js.native
  object RCT_PIXEL extends TopLevel[RCT_PIXEL with Double]
}
