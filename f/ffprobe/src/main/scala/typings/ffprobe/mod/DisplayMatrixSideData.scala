package typings.ffprobe.mod

import typings.ffprobe.ffprobeStrings.`Display Matrix`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisplayMatrixSideData
  extends StObject
     with BaseSideData
     with _SideData {
  
  /**
    * Mismatches the type linked earlier because ffprobe JSON output
    * reads the printed integers for the display matrix as a string
    */
  var displaymatrix: String
  
  var rotation: Double
  
  /**
    * Based on the C code related to Display Matrix side data section
    * {@see https://github.com/FFmpeg/FFmpeg/blob/b37795688a9bfa6d5a2e9b2535c4b10ebc14ac5d/fftools/ffprobe.c#L2300-L2304}
    */
  @JSName("side_data_type")
  var side_data_type_DisplayMatrixSideData: `Display Matrix`
}
object DisplayMatrixSideData {
  
  inline def apply(displaymatrix: String, rotation: Double): DisplayMatrixSideData = {
    val __obj = js.Dynamic.literal(displaymatrix = displaymatrix.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], side_data_type = "Display Matrix")
    __obj.asInstanceOf[DisplayMatrixSideData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DisplayMatrixSideData] (val x: Self) extends AnyVal {
    
    inline def setDisplaymatrix(value: String): Self = StObject.set(x, "displaymatrix", value.asInstanceOf[js.Any])
    
    inline def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
    
    inline def setSide_data_type(value: `Display Matrix`): Self = StObject.set(x, "side_data_type", value.asInstanceOf[js.Any])
  }
}
