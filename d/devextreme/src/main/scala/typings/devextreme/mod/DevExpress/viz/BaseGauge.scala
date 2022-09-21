package typings.devextreme.mod.DevExpress.viz

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseGauge[TProperties]
  extends StObject
     with BaseWidget[TProperties] {
  
  /**
    * Gets subvalues.
    */
  def subvalues(): js.Array[Double] = js.native
  /**
    * Updates subvalues.
    */
  def subvalues(subvalues: js.Array[Double]): Unit = js.native
  
  /**
    * Gets the main value.
    */
  def value(): Double = js.native
  /**
    * Updates the main value.
    */
  def value(value: Double): Unit = js.native
}
object BaseGauge {
  
  /* Rewritten from type alias, can be one of: 
    - typings.devextreme.devextremeStrings.circle
    - typings.devextreme.devextremeStrings.rangeBar
    - typings.devextreme.devextremeStrings.rectangle
    - typings.devextreme.devextremeStrings.rectangleNeedle
    - typings.devextreme.devextremeStrings.rhombus
    - typings.devextreme.devextremeStrings.textCloud
    - typings.devextreme.devextremeStrings.triangleMarker
    - typings.devextreme.devextremeStrings.triangleNeedle
    - typings.devextreme.devextremeStrings.twoColorNeedle
  */
  trait GaugeIndicatorType extends StObject
  object GaugeIndicatorType {
    
    inline def circle: typings.devextreme.devextremeStrings.circle = "circle".asInstanceOf[typings.devextreme.devextremeStrings.circle]
    
    inline def rangeBar: typings.devextreme.devextremeStrings.rangeBar = "rangeBar".asInstanceOf[typings.devextreme.devextremeStrings.rangeBar]
    
    inline def rectangle: typings.devextreme.devextremeStrings.rectangle = "rectangle".asInstanceOf[typings.devextreme.devextremeStrings.rectangle]
    
    inline def rectangleNeedle: typings.devextreme.devextremeStrings.rectangleNeedle = "rectangleNeedle".asInstanceOf[typings.devextreme.devextremeStrings.rectangleNeedle]
    
    inline def rhombus: typings.devextreme.devextremeStrings.rhombus = "rhombus".asInstanceOf[typings.devextreme.devextremeStrings.rhombus]
    
    inline def textCloud: typings.devextreme.devextremeStrings.textCloud = "textCloud".asInstanceOf[typings.devextreme.devextremeStrings.textCloud]
    
    inline def triangleMarker: typings.devextreme.devextremeStrings.triangleMarker = "triangleMarker".asInstanceOf[typings.devextreme.devextremeStrings.triangleMarker]
    
    inline def triangleNeedle: typings.devextreme.devextremeStrings.triangleNeedle = "triangleNeedle".asInstanceOf[typings.devextreme.devextremeStrings.triangleNeedle]
    
    inline def twoColorNeedle: typings.devextreme.devextremeStrings.twoColorNeedle = "twoColorNeedle".asInstanceOf[typings.devextreme.devextremeStrings.twoColorNeedle]
  }
  
  trait TooltipInfo extends StObject {
    
    var target: Any
  }
  object TooltipInfo {
    
    inline def apply(target: Any): TooltipInfo = {
      val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[TooltipInfo]
    }
    
    extension [Self <: TooltipInfo](x: Self) {
      
      inline def setTarget(value: Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
}
