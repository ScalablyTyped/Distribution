package typings.fabric.fabricImplMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IShadowOptions extends StObject {
  
  /**
    * Whether the shadow should affect stroke operations
    */
  var affectStroke: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Shadow blur
    */
  var blur: js.UndefOr[Double] = js.undefined
  
  /**
    * Shadow color
    */
  var color: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates whether toObject should include default values
    */
  var includeDefaultValues: js.UndefOr[Boolean] = js.undefined
  
  /**
    * When `false`, the shadow will scale with the object.
    * When `true`, the shadow's offsetX, offsetY, and blur will not be affected by the object's scale.
    * default to false
    * @type Boolean
    * @default
    */
  var nonScaling: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Shadow horizontal offset
    */
  var offsetX: js.UndefOr[Double] = js.undefined
  
  /**
    * Shadow vertical offset
    */
  var offsetY: js.UndefOr[Double] = js.undefined
}
object IShadowOptions {
  
  inline def apply(): IShadowOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IShadowOptions]
  }
  
  extension [Self <: IShadowOptions](x: Self) {
    
    inline def setAffectStroke(value: Boolean): Self = StObject.set(x, "affectStroke", value.asInstanceOf[js.Any])
    
    inline def setAffectStrokeUndefined: Self = StObject.set(x, "affectStroke", js.undefined)
    
    inline def setBlur(value: Double): Self = StObject.set(x, "blur", value.asInstanceOf[js.Any])
    
    inline def setBlurUndefined: Self = StObject.set(x, "blur", js.undefined)
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setIncludeDefaultValues(value: Boolean): Self = StObject.set(x, "includeDefaultValues", value.asInstanceOf[js.Any])
    
    inline def setIncludeDefaultValuesUndefined: Self = StObject.set(x, "includeDefaultValues", js.undefined)
    
    inline def setNonScaling(value: Boolean): Self = StObject.set(x, "nonScaling", value.asInstanceOf[js.Any])
    
    inline def setNonScalingUndefined: Self = StObject.set(x, "nonScaling", js.undefined)
    
    inline def setOffsetX(value: Double): Self = StObject.set(x, "offsetX", value.asInstanceOf[js.Any])
    
    inline def setOffsetXUndefined: Self = StObject.set(x, "offsetX", js.undefined)
    
    inline def setOffsetY(value: Double): Self = StObject.set(x, "offsetY", value.asInstanceOf[js.Any])
    
    inline def setOffsetYUndefined: Self = StObject.set(x, "offsetY", js.undefined)
  }
}
