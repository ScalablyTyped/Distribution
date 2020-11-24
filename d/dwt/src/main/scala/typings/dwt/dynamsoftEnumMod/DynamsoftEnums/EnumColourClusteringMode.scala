package typings.dwt.dynamsoftEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnumColourClusteringMode extends js.Object
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumColourClusteringMode")
@js.native
object EnumColourClusteringMode extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumColourClusteringMode with Double] = js.native
  
  @js.native
  sealed trait CCM_AUTO extends EnumColourClusteringMode
  /* 1 */ @js.native
  object CCM_AUTO extends TopLevel[CCM_AUTO with Double]
  
  @js.native
  sealed trait CCM_GENERAL_HSV extends EnumColourClusteringMode
  /* 2 */ @js.native
  object CCM_GENERAL_HSV extends TopLevel[CCM_GENERAL_HSV with Double]
  
  @js.native
  sealed trait CCM_SKIP extends EnumColourClusteringMode
  /* 0 */ @js.native
  object CCM_SKIP extends TopLevel[CCM_SKIP with Double]
}
