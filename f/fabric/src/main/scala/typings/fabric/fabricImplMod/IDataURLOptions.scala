package typings.fabric.fabricImplMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

///////////////////////////////////////////////////////////////////////////////
// Data Object Interfaces - These interface are not specific part of fabric,
// They are just helpful for for defining function parameters
//////////////////////////////////////////////////////////////////////////////
trait IDataURLOptions extends StObject {
  
  var enableRetinaScaling: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The format of the output image. Either "jpeg" or "png"
    */
  var format: js.UndefOr[String] = js.undefined
  
  /**
    * Cropping height. Introduced in v1.2.14
    */
  var height: js.UndefOr[Double] = js.undefined
  
  /**
    * Cropping left offset. Introduced in v1.2.14
    */
  var left: js.UndefOr[Double] = js.undefined
  
  /**
    * Multiplier to scale by
    */
  var multiplier: js.UndefOr[Double] = js.undefined
  
  /**
    * Quality level (0..1). Only used for jpeg
    */
  var quality: js.UndefOr[Double] = js.undefined
  
  /**
    * Cropping top offset. Introduced in v1.2.14
    */
  var top: js.UndefOr[Double] = js.undefined
  
  /**
    * Cropping width. Introduced in v1.2.14
    */
  var width: js.UndefOr[Double] = js.undefined
  
  var withoutShadow: js.UndefOr[Boolean] = js.undefined
  
  var withoutTransform: js.UndefOr[Boolean] = js.undefined
}
object IDataURLOptions {
  
  inline def apply(): IDataURLOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDataURLOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IDataURLOptions] (val x: Self) extends AnyVal {
    
    inline def setEnableRetinaScaling(value: Boolean): Self = StObject.set(x, "enableRetinaScaling", value.asInstanceOf[js.Any])
    
    inline def setEnableRetinaScalingUndefined: Self = StObject.set(x, "enableRetinaScaling", js.undefined)
    
    inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
    
    inline def setMultiplier(value: Double): Self = StObject.set(x, "multiplier", value.asInstanceOf[js.Any])
    
    inline def setMultiplierUndefined: Self = StObject.set(x, "multiplier", js.undefined)
    
    inline def setQuality(value: Double): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
    
    inline def setQualityUndefined: Self = StObject.set(x, "quality", js.undefined)
    
    inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    inline def setWithoutShadow(value: Boolean): Self = StObject.set(x, "withoutShadow", value.asInstanceOf[js.Any])
    
    inline def setWithoutShadowUndefined: Self = StObject.set(x, "withoutShadow", js.undefined)
    
    inline def setWithoutTransform(value: Boolean): Self = StObject.set(x, "withoutTransform", value.asInstanceOf[js.Any])
    
    inline def setWithoutTransformUndefined: Self = StObject.set(x, "withoutTransform", js.undefined)
  }
}
