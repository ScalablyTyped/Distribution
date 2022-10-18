package typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnumRegionPredetectionMode extends StObject
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumRegionPredetectionMode")
@js.native
object EnumRegionPredetectionMode extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumRegionPredetectionMode & Double] = js.native
  
  @js.native
  sealed trait RPM_AUTO
    extends StObject
       with EnumRegionPredetectionMode
  /* 1 */ val RPM_AUTO: typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumRegionPredetectionMode.RPM_AUTO & Double = js.native
  
  @js.native
  sealed trait RPM_GENERAL
    extends StObject
       with EnumRegionPredetectionMode
  /* 2 */ val RPM_GENERAL: typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumRegionPredetectionMode.RPM_GENERAL & Double = js.native
  
  @js.native
  sealed trait RPM_GENERAL_GRAY_CONTRAST
    extends StObject
       with EnumRegionPredetectionMode
  /* 8 */ val RPM_GENERAL_GRAY_CONTRAST: typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumRegionPredetectionMode.RPM_GENERAL_GRAY_CONTRAST & Double = js.native
  
  @js.native
  sealed trait RPM_GENERAL_HSV_CONTRAST
    extends StObject
       with EnumRegionPredetectionMode
  /* 16 */ val RPM_GENERAL_HSV_CONTRAST: typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumRegionPredetectionMode.RPM_GENERAL_HSV_CONTRAST & Double = js.native
  
  @js.native
  sealed trait RPM_GENERAL_RGB_CONTRAST
    extends StObject
       with EnumRegionPredetectionMode
  /* 4 */ val RPM_GENERAL_RGB_CONTRAST: typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumRegionPredetectionMode.RPM_GENERAL_RGB_CONTRAST & Double = js.native
  
  @js.native
  sealed trait RPM_SKIP
    extends StObject
       with EnumRegionPredetectionMode
  /* 0 */ val RPM_SKIP: typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumRegionPredetectionMode.RPM_SKIP & Double = js.native
}
