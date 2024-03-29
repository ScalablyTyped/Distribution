package typings.exceljs.mod

import typings.exceljs.anon.Left
import typings.exceljs.exceljsStrings.gradient
import typings.exceljs.exceljsStrings.path
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FillGradientPath
  extends StObject
     with Fill {
  
  /**
  	 * For 'path' gradient. Specifies the relative coordinates for the start of the path.
  	 * 'left' and 'top' values range from 0 to 1
  	 */
  var center: Left
  
  var gradient: path
  
  /**
  	 * Specifies the gradient colour sequence. Is an array of objects containing position and
  	 * color starting with position 0 and ending with position 1.
  	 * Intermediary positions may be used to specify other colours on the path.
  	 */
  var stops: js.Array[GradientStop]
  
  var `type`: gradient
}
object FillGradientPath {
  
  inline def apply(center: Left, stops: js.Array[GradientStop]): FillGradientPath = {
    val __obj = js.Dynamic.literal(center = center.asInstanceOf[js.Any], gradient = "path", stops = stops.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("gradient")
    __obj.asInstanceOf[FillGradientPath]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FillGradientPath] (val x: Self) extends AnyVal {
    
    inline def setCenter(value: Left): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
    
    inline def setGradient(value: path): Self = StObject.set(x, "gradient", value.asInstanceOf[js.Any])
    
    inline def setStops(value: js.Array[GradientStop]): Self = StObject.set(x, "stops", value.asInstanceOf[js.Any])
    
    inline def setStopsVarargs(value: GradientStop*): Self = StObject.set(x, "stops", js.Array(value*))
    
    inline def setType(value: gradient): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
