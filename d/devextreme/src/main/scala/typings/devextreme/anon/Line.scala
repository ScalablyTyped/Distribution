package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.common.charts.ScaleBreakLineStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Line extends StObject {
  
  /**
    * Specifies the scale breaks&apos; color.
    */
  var color: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the scale breaks&apos; line style.
    */
  var line: js.UndefOr[ScaleBreakLineStyle] = js.undefined
  
  /**
    * Specifies the scale breaks&apos; width in pixels.
    */
  var width: js.UndefOr[Double] = js.undefined
}
object Line {
  
  inline def apply(): Line = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Line]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Line] (val x: Self) extends AnyVal {
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setLine(value: ScaleBreakLineStyle): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    inline def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
