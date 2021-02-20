package typings.dwt.dynamsoftEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnumColourClusteringMode extends StObject
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumColourClusteringMode")
@js.native
object EnumColourClusteringMode extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumColourClusteringMode with Double] = js.native
  
  @js.native
  sealed trait CCM_AUTO extends EnumColourClusteringMode
  /* 1 */ val CCM_AUTO: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumColourClusteringMode.CCM_AUTO with Double = js.native
  
  @js.native
  sealed trait CCM_GENERAL_HSV extends EnumColourClusteringMode
  /* 2 */ val CCM_GENERAL_HSV: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumColourClusteringMode.CCM_GENERAL_HSV with Double = js.native
  
  @js.native
  sealed trait CCM_SKIP extends EnumColourClusteringMode
  /* 0 */ val CCM_SKIP: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumColourClusteringMode.CCM_SKIP with Double = js.native
}
