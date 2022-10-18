package typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnumColourClusteringMode extends StObject
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumColourClusteringMode")
@js.native
object EnumColourClusteringMode extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumColourClusteringMode & Double] = js.native
  
  @js.native
  sealed trait CCM_AUTO
    extends StObject
       with EnumColourClusteringMode
  /* 1 */ val CCM_AUTO: typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumColourClusteringMode.CCM_AUTO & Double = js.native
  
  @js.native
  sealed trait CCM_GENERAL_HSV
    extends StObject
       with EnumColourClusteringMode
  /* 2 */ val CCM_GENERAL_HSV: typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumColourClusteringMode.CCM_GENERAL_HSV & Double = js.native
  
  @js.native
  sealed trait CCM_SKIP
    extends StObject
       with EnumColourClusteringMode
  /* 0 */ val CCM_SKIP: typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumColourClusteringMode.CCM_SKIP & Double = js.native
}
