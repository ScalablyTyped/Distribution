package typings.googleVisualization.google.visualization

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChartArea extends StObject {
  
  var backgroundColor: js.UndefOr[String | ChartStrokeFill] = js.undefined
  
  var bottom: js.UndefOr[Double | String] = js.undefined
  
  var height: js.UndefOr[Double | String] = js.undefined
  
  var left: js.UndefOr[Double | String] = js.undefined
  
  var right: js.UndefOr[Double | String] = js.undefined
  
  var top: js.UndefOr[Double | String] = js.undefined
  
  var width: js.UndefOr[Double | String] = js.undefined
}
object ChartArea {
  
  @scala.inline
  def apply(): ChartArea = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartArea]
  }
  
  @scala.inline
  implicit class ChartAreaMutableBuilder[Self <: ChartArea] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackgroundColor(value: String | ChartStrokeFill): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    @scala.inline
    def setBottom(value: Double | String): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
    
    @scala.inline
    def setHeight(value: Double | String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setLeft(value: Double | String): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
    
    @scala.inline
    def setRight(value: Double | String): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
    
    @scala.inline
    def setTop(value: Double | String): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    
    @scala.inline
    def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
