package typings.dwt.dynamsoftEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnumRegionPredetectionMode extends StObject
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumRegionPredetectionMode")
@js.native
object EnumRegionPredetectionMode extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumRegionPredetectionMode with Double] = js.native
  
  @js.native
  sealed trait RPM_AUTO extends EnumRegionPredetectionMode
  /* 1 */ val RPM_AUTO: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumRegionPredetectionMode.RPM_AUTO with Double = js.native
  
  @js.native
  sealed trait RPM_GENERAL extends EnumRegionPredetectionMode
  /* 2 */ val RPM_GENERAL: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumRegionPredetectionMode.RPM_GENERAL with Double = js.native
  
  @js.native
  sealed trait RPM_GENERAL_GRAY_CONTRAST extends EnumRegionPredetectionMode
  /* 8 */ val RPM_GENERAL_GRAY_CONTRAST: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumRegionPredetectionMode.RPM_GENERAL_GRAY_CONTRAST with Double = js.native
  
  @js.native
  sealed trait RPM_GENERAL_HSV_CONTRAST extends EnumRegionPredetectionMode
  /* 16 */ val RPM_GENERAL_HSV_CONTRAST: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumRegionPredetectionMode.RPM_GENERAL_HSV_CONTRAST with Double = js.native
  
  @js.native
  sealed trait RPM_GENERAL_RGB_CONTRAST extends EnumRegionPredetectionMode
  /* 4 */ val RPM_GENERAL_RGB_CONTRAST: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumRegionPredetectionMode.RPM_GENERAL_RGB_CONTRAST with Double = js.native
  
  @js.native
  sealed trait RPM_SKIP extends EnumRegionPredetectionMode
  /* 0 */ val RPM_SKIP: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumRegionPredetectionMode.RPM_SKIP with Double = js.native
}
