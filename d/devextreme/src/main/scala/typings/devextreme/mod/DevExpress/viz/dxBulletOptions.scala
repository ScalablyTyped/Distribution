package typings.devextreme.mod.DevExpress.viz

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxBulletOptions
  extends StObject
     with BaseSparklineOptions[dxBullet] {
  
  /**
    * Specifies a color for the bullet bar.
    */
  var color: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies an end value for the invisible scale.
    */
  var endScaleValue: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies whether or not to show the target line.
    */
  var showTarget: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies whether or not to show the line indicating zero on the invisible scale.
    */
  var showZeroLevel: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies a start value for the invisible scale.
    */
  var startScaleValue: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the value indicated by the target line.
    */
  var target: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies a color for both the target and zero level lines.
    */
  var targetColor: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the width of the target line.
    */
  var targetWidth: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the primary value indicated by the bullet bar.
    */
  var value: js.UndefOr[Double] = js.undefined
}
object dxBulletOptions {
  
  inline def apply(): dxBulletOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxBulletOptions]
  }
  
  extension [Self <: dxBulletOptions](x: Self) {
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setEndScaleValue(value: Double): Self = StObject.set(x, "endScaleValue", value.asInstanceOf[js.Any])
    
    inline def setEndScaleValueUndefined: Self = StObject.set(x, "endScaleValue", js.undefined)
    
    inline def setShowTarget(value: Boolean): Self = StObject.set(x, "showTarget", value.asInstanceOf[js.Any])
    
    inline def setShowTargetUndefined: Self = StObject.set(x, "showTarget", js.undefined)
    
    inline def setShowZeroLevel(value: Boolean): Self = StObject.set(x, "showZeroLevel", value.asInstanceOf[js.Any])
    
    inline def setShowZeroLevelUndefined: Self = StObject.set(x, "showZeroLevel", js.undefined)
    
    inline def setStartScaleValue(value: Double): Self = StObject.set(x, "startScaleValue", value.asInstanceOf[js.Any])
    
    inline def setStartScaleValueUndefined: Self = StObject.set(x, "startScaleValue", js.undefined)
    
    inline def setTarget(value: Double): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetColor(value: String): Self = StObject.set(x, "targetColor", value.asInstanceOf[js.Any])
    
    inline def setTargetColorUndefined: Self = StObject.set(x, "targetColor", js.undefined)
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    inline def setTargetWidth(value: Double): Self = StObject.set(x, "targetWidth", value.asInstanceOf[js.Any])
    
    inline def setTargetWidthUndefined: Self = StObject.set(x, "targetWidth", js.undefined)
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
