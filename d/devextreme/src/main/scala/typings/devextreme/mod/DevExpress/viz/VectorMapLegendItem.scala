package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.mod.DevExpress.common.charts.BaseLegendItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VectorMapLegendItem
  extends StObject
     with BaseLegendItem {
  
  /**
    * The color of the legend item&apos;s marker.
    */
  var color: js.UndefOr[String] = js.undefined
  
  /**
    * The end value of the group that the legend item indicates.
    */
  var end: js.UndefOr[Double] = js.undefined
  
  /**
    * The diameter of the legend item&apos;s marker in pixels.
    */
  var size: js.UndefOr[Double] = js.undefined
  
  /**
    * The start value of the group that the legend item indicates.
    */
  var start: js.UndefOr[Double] = js.undefined
}
object VectorMapLegendItem {
  
  inline def apply(): VectorMapLegendItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VectorMapLegendItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VectorMapLegendItem] (val x: Self) extends AnyVal {
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
  }
}
