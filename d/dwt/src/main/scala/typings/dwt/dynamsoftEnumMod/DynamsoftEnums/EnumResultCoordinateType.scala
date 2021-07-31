package typings.dwt.dynamsoftEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnumResultCoordinateType extends StObject
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumResultCoordinateType")
@js.native
object EnumResultCoordinateType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumResultCoordinateType & Double] = js.native
  
  @js.native
  sealed trait RCT_PERCENTAGE
    extends StObject
       with EnumResultCoordinateType
  /* 2 */ val RCT_PERCENTAGE: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumResultCoordinateType.RCT_PERCENTAGE & Double = js.native
  
  @js.native
  sealed trait RCT_PIXEL
    extends StObject
       with EnumResultCoordinateType
  /* 1 */ val RCT_PIXEL: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumResultCoordinateType.RCT_PIXEL & Double = js.native
}
