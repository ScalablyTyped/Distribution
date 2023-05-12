package typings.ffprobe.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrimariesMasteringDisplayMetadataSideData
  extends StObject
     with BaseMasteringDisplayMetadataSideData
     with _MasteringDisplayMetadataSideData {
  
  var blue_x: String
  
  var blue_y: String
  
  var green_x: String
  
  var green_y: String
  
  /**
    * Based on the C code related to Primaries Mastering display metadata side data section
    * {@see https://github.com/FFmpeg/FFmpeg/blob/b37795688a9bfa6d5a2e9b2535c4b10ebc14ac5d/fftools/ffprobe.c#L2336-L2344}
    */
  var red_x: String
  
  var red_y: String
  
  var white_point_x: String
  
  var white_point_y: String
}
object PrimariesMasteringDisplayMetadataSideData {
  
  inline def apply(
    blue_x: String,
    blue_y: String,
    green_x: String,
    green_y: String,
    red_x: String,
    red_y: String,
    white_point_x: String,
    white_point_y: String
  ): PrimariesMasteringDisplayMetadataSideData = {
    val __obj = js.Dynamic.literal(blue_x = blue_x.asInstanceOf[js.Any], blue_y = blue_y.asInstanceOf[js.Any], green_x = green_x.asInstanceOf[js.Any], green_y = green_y.asInstanceOf[js.Any], red_x = red_x.asInstanceOf[js.Any], red_y = red_y.asInstanceOf[js.Any], side_data_type = "Mastering display metadata", white_point_x = white_point_x.asInstanceOf[js.Any], white_point_y = white_point_y.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrimariesMasteringDisplayMetadataSideData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PrimariesMasteringDisplayMetadataSideData] (val x: Self) extends AnyVal {
    
    inline def setBlue_x(value: String): Self = StObject.set(x, "blue_x", value.asInstanceOf[js.Any])
    
    inline def setBlue_y(value: String): Self = StObject.set(x, "blue_y", value.asInstanceOf[js.Any])
    
    inline def setGreen_x(value: String): Self = StObject.set(x, "green_x", value.asInstanceOf[js.Any])
    
    inline def setGreen_y(value: String): Self = StObject.set(x, "green_y", value.asInstanceOf[js.Any])
    
    inline def setRed_x(value: String): Self = StObject.set(x, "red_x", value.asInstanceOf[js.Any])
    
    inline def setRed_y(value: String): Self = StObject.set(x, "red_y", value.asInstanceOf[js.Any])
    
    inline def setWhite_point_x(value: String): Self = StObject.set(x, "white_point_x", value.asInstanceOf[js.Any])
    
    inline def setWhite_point_y(value: String): Self = StObject.set(x, "white_point_y", value.asInstanceOf[js.Any])
  }
}
