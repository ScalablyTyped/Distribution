package typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnumTextFilterMode extends StObject
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumTextFilterMode")
@js.native
object EnumTextFilterMode extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumTextFilterMode & Double] = js.native
  
  @js.native
  sealed trait TFM_AUTO
    extends StObject
       with EnumTextFilterMode
  /* 1 */ val TFM_AUTO: typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumTextFilterMode.TFM_AUTO & Double = js.native
  
  @js.native
  sealed trait TFM_GENERAL_CONTOUR
    extends StObject
       with EnumTextFilterMode
  /* 2 */ val TFM_GENERAL_CONTOUR: typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumTextFilterMode.TFM_GENERAL_CONTOUR & Double = js.native
  
  @js.native
  sealed trait TFM_SKIP
    extends StObject
       with EnumTextFilterMode
  /* 0 */ val TFM_SKIP: typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumTextFilterMode.TFM_SKIP & Double = js.native
}
