package typings.fabric.fabricImplMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IImageOptions
  extends StObject
     with IObjectOptions {
  
  /**
    * key used to retrieve the texture representing this image
    * @since 2.0.0
    * @type String
    */
  var cacheKey: js.UndefOr[String] = js.undefined
  
  /**
    * Image crop in pixels from original image size.
    * @since 2.0.0
    * @type Number
    */
  var cropX: js.UndefOr[Double] = js.undefined
  
  /**
    * Image crop in pixels from original image size.
    * @since 2.0.0
    * @type Number
    */
  var cropY: js.UndefOr[Double] = js.undefined
  
  /**
    * crossOrigin value (one of "", "anonymous", "allow-credentials")
    */
  var crossOrigin: js.UndefOr[String] = js.undefined
  
  /**
    * Image filter array
    */
  var filters: js.UndefOr[js.Array[IBaseFilter]] = js.undefined
  
  /**
    * minimum scale factor under which any resizeFilter is triggered to resize the image
    * 0 will disable the automatic resize. 1 will trigger automatically always.
    * number bigger than 1 are not implemented yet.
    * @type Number
    */
  var minimumScaleTrigger: js.UndefOr[Double] = js.undefined
  
  /**
    * When calling {@link fabric.Image.getSrc}, return value from element src with `element.getAttribute('src')`.
    * This allows for relative urls as image src.
    * @since 2.7.0
    * @type Boolean
    */
  var srcFromAttribute: js.UndefOr[Boolean] = js.undefined
}
object IImageOptions {
  
  inline def apply(): IImageOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IImageOptions]
  }
  
  extension [Self <: IImageOptions](x: Self) {
    
    inline def setCacheKey(value: String): Self = StObject.set(x, "cacheKey", value.asInstanceOf[js.Any])
    
    inline def setCacheKeyUndefined: Self = StObject.set(x, "cacheKey", js.undefined)
    
    inline def setCropX(value: Double): Self = StObject.set(x, "cropX", value.asInstanceOf[js.Any])
    
    inline def setCropXUndefined: Self = StObject.set(x, "cropX", js.undefined)
    
    inline def setCropY(value: Double): Self = StObject.set(x, "cropY", value.asInstanceOf[js.Any])
    
    inline def setCropYUndefined: Self = StObject.set(x, "cropY", js.undefined)
    
    inline def setCrossOrigin(value: String): Self = StObject.set(x, "crossOrigin", value.asInstanceOf[js.Any])
    
    inline def setCrossOriginUndefined: Self = StObject.set(x, "crossOrigin", js.undefined)
    
    inline def setFilters(value: js.Array[IBaseFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
    
    inline def setFiltersVarargs(value: IBaseFilter*): Self = StObject.set(x, "filters", js.Array(value*))
    
    inline def setMinimumScaleTrigger(value: Double): Self = StObject.set(x, "minimumScaleTrigger", value.asInstanceOf[js.Any])
    
    inline def setMinimumScaleTriggerUndefined: Self = StObject.set(x, "minimumScaleTrigger", js.undefined)
    
    inline def setSrcFromAttribute(value: Boolean): Self = StObject.set(x, "srcFromAttribute", value.asInstanceOf[js.Any])
    
    inline def setSrcFromAttributeUndefined: Self = StObject.set(x, "srcFromAttribute", js.undefined)
  }
}
