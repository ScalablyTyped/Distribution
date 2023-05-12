package typings.ffprobe.mod

import typings.ffprobe.ffprobeStrings.`DOVI configuration record`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DoviConfigurationRecordSideData
  extends StObject
     with BaseSideData
     with _SideData {
  
  var bl_present_flag: Double
  
  var dv_bl_signal_compatibility_id: Double
  
  var dv_level: Double
  
  var dv_profile: Double
  
  var dv_version_major: Double
  
  var dv_version_minor: Double
  
  var el_present_flag: Double
  
  var rpu_present_flag: Double
  
  /**
    * Based on the C code related to DOVI configuration record side data section
    * {@see https://github.com/FFmpeg/FFmpeg/blob/b37795688a9bfa6d5a2e9b2535c4b10ebc14ac5d/fftools/ffprobe.c#L2356-L2364}
    */
  @JSName("side_data_type")
  var side_data_type_DoviConfigurationRecordSideData: `DOVI configuration record`
}
object DoviConfigurationRecordSideData {
  
  inline def apply(
    bl_present_flag: Double,
    dv_bl_signal_compatibility_id: Double,
    dv_level: Double,
    dv_profile: Double,
    dv_version_major: Double,
    dv_version_minor: Double,
    el_present_flag: Double,
    rpu_present_flag: Double
  ): DoviConfigurationRecordSideData = {
    val __obj = js.Dynamic.literal(bl_present_flag = bl_present_flag.asInstanceOf[js.Any], dv_bl_signal_compatibility_id = dv_bl_signal_compatibility_id.asInstanceOf[js.Any], dv_level = dv_level.asInstanceOf[js.Any], dv_profile = dv_profile.asInstanceOf[js.Any], dv_version_major = dv_version_major.asInstanceOf[js.Any], dv_version_minor = dv_version_minor.asInstanceOf[js.Any], el_present_flag = el_present_flag.asInstanceOf[js.Any], rpu_present_flag = rpu_present_flag.asInstanceOf[js.Any], side_data_type = "DOVI configuration record")
    __obj.asInstanceOf[DoviConfigurationRecordSideData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DoviConfigurationRecordSideData] (val x: Self) extends AnyVal {
    
    inline def setBl_present_flag(value: Double): Self = StObject.set(x, "bl_present_flag", value.asInstanceOf[js.Any])
    
    inline def setDv_bl_signal_compatibility_id(value: Double): Self = StObject.set(x, "dv_bl_signal_compatibility_id", value.asInstanceOf[js.Any])
    
    inline def setDv_level(value: Double): Self = StObject.set(x, "dv_level", value.asInstanceOf[js.Any])
    
    inline def setDv_profile(value: Double): Self = StObject.set(x, "dv_profile", value.asInstanceOf[js.Any])
    
    inline def setDv_version_major(value: Double): Self = StObject.set(x, "dv_version_major", value.asInstanceOf[js.Any])
    
    inline def setDv_version_minor(value: Double): Self = StObject.set(x, "dv_version_minor", value.asInstanceOf[js.Any])
    
    inline def setEl_present_flag(value: Double): Self = StObject.set(x, "el_present_flag", value.asInstanceOf[js.Any])
    
    inline def setRpu_present_flag(value: Double): Self = StObject.set(x, "rpu_present_flag", value.asInstanceOf[js.Any])
    
    inline def setSide_data_type(value: `DOVI configuration record`): Self = StObject.set(x, "side_data_type", value.asInstanceOf[js.Any])
  }
}
