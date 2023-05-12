package typings.ffprobe.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _MasteringDisplayMetadataSideData
  extends StObject
     with _SideData
object _MasteringDisplayMetadataSideData {
  
  inline def LuminanceMasteringDisplayMetadataSideData(max_luminance: String, min_luminance: String): typings.ffprobe.mod.LuminanceMasteringDisplayMetadataSideData = {
    val __obj = js.Dynamic.literal(max_luminance = max_luminance.asInstanceOf[js.Any], min_luminance = min_luminance.asInstanceOf[js.Any], side_data_type = "Mastering display metadata")
    __obj.asInstanceOf[typings.ffprobe.mod.LuminanceMasteringDisplayMetadataSideData]
  }
  
  inline def PrimariesMasteringDisplayMetadataSideData(
    blue_x: String,
    blue_y: String,
    green_x: String,
    green_y: String,
    red_x: String,
    red_y: String,
    white_point_x: String,
    white_point_y: String
  ): typings.ffprobe.mod.PrimariesMasteringDisplayMetadataSideData = {
    val __obj = js.Dynamic.literal(blue_x = blue_x.asInstanceOf[js.Any], blue_y = blue_y.asInstanceOf[js.Any], green_x = green_x.asInstanceOf[js.Any], green_y = green_y.asInstanceOf[js.Any], red_x = red_x.asInstanceOf[js.Any], red_y = red_y.asInstanceOf[js.Any], side_data_type = "Mastering display metadata", white_point_x = white_point_x.asInstanceOf[js.Any], white_point_y = white_point_y.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.ffprobe.mod.PrimariesMasteringDisplayMetadataSideData]
  }
}
