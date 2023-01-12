package typings.devextreme.mod.DevExpress.viz

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PieChartLegendItem
  extends StObject
     with BaseLegendItem {
  
  /**
    * The argument of the point(s) that the legend item represents.
    */
  var argument: js.UndefOr[String | js.Date | Double] = js.undefined
  
  /**
    * The zero-based index of the legend item used to identify the item among other legend items with the same argument.
    */
  var argumentIndex: js.UndefOr[Double] = js.undefined
  
  /**
    * An array of points that the legend item represents. Can contain more than one point only in a multi-series PieChart.
    */
  var points: js.UndefOr[js.Array[piePointObject]] = js.undefined
  
  /**
    * The text that the legend item displays.
    */
  @JSName("text")
  var text_PieChartLegendItem: js.UndefOr[Any] = js.undefined
}
object PieChartLegendItem {
  
  inline def apply(): PieChartLegendItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PieChartLegendItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PieChartLegendItem] (val x: Self) extends AnyVal {
    
    inline def setArgument(value: String | js.Date | Double): Self = StObject.set(x, "argument", value.asInstanceOf[js.Any])
    
    inline def setArgumentIndex(value: Double): Self = StObject.set(x, "argumentIndex", value.asInstanceOf[js.Any])
    
    inline def setArgumentIndexUndefined: Self = StObject.set(x, "argumentIndex", js.undefined)
    
    inline def setArgumentUndefined: Self = StObject.set(x, "argument", js.undefined)
    
    inline def setPoints(value: js.Array[piePointObject]): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
    
    inline def setPointsUndefined: Self = StObject.set(x, "points", js.undefined)
    
    inline def setPointsVarargs(value: piePointObject*): Self = StObject.set(x, "points", js.Array(value*))
    
    inline def setText(value: Any): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
