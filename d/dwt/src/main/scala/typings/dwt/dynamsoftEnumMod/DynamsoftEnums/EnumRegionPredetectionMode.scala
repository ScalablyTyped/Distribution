package typings.dwt.dynamsoftEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnumRegionPredetectionMode extends js.Object
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumRegionPredetectionMode")
@js.native
object EnumRegionPredetectionMode extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumRegionPredetectionMode with Double] = js.native
  
  @js.native
  sealed trait RPM_AUTO extends EnumRegionPredetectionMode
  /* 1 */ @js.native
  object RPM_AUTO extends TopLevel[RPM_AUTO with Double]
  
  @js.native
  sealed trait RPM_GENERAL extends EnumRegionPredetectionMode
  /* 2 */ @js.native
  object RPM_GENERAL extends TopLevel[RPM_GENERAL with Double]
  
  @js.native
  sealed trait RPM_GENERAL_GRAY_CONTRAST extends EnumRegionPredetectionMode
  /* 8 */ @js.native
  object RPM_GENERAL_GRAY_CONTRAST extends TopLevel[RPM_GENERAL_GRAY_CONTRAST with Double]
  
  @js.native
  sealed trait RPM_GENERAL_HSV_CONTRAST extends EnumRegionPredetectionMode
  /* 16 */ @js.native
  object RPM_GENERAL_HSV_CONTRAST extends TopLevel[RPM_GENERAL_HSV_CONTRAST with Double]
  
  @js.native
  sealed trait RPM_GENERAL_RGB_CONTRAST extends EnumRegionPredetectionMode
  /* 4 */ @js.native
  object RPM_GENERAL_RGB_CONTRAST extends TopLevel[RPM_GENERAL_RGB_CONTRAST with Double]
  
  @js.native
  sealed trait RPM_SKIP extends EnumRegionPredetectionMode
  /* 0 */ @js.native
  object RPM_SKIP extends TopLevel[RPM_SKIP with Double]
}
