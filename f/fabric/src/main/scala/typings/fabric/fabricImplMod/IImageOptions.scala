package typings.fabric.fabricImplMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IImageOptions extends IObjectOptions {
  
  /**
    * key used to retrieve the texture representing this image
    * @since 2.0.0
    * @type String
    */
  var cacheKey: js.UndefOr[String] = js.native
  
  /**
    * Image crop in pixels from original image size.
    * @since 2.0.0
    * @type Number
    */
  var cropX: js.UndefOr[Double] = js.native
  
  /**
    * Image crop in pixels from original image size.
    * @since 2.0.0
    * @type Number
    */
  var cropY: js.UndefOr[Double] = js.native
  
  /**
    * crossOrigin value (one of "", "anonymous", "allow-credentials")
    */
  var crossOrigin: js.UndefOr[String] = js.native
  
  /**
    * Image filter array
    */
  var filters: js.UndefOr[js.Array[IBaseFilter]] = js.native
  
  /**
    * minimum scale factor under which any resizeFilter is triggered to resize the image
    * 0 will disable the automatic resize. 1 will trigger automatically always.
    * number bigger than 1 are not implemented yet.
    * @type Number
    */
  var minimumScaleTrigger: js.UndefOr[Double] = js.native
  
  /**
    * When calling {@link fabric.Image.getSrc}, return value from element src with `element.getAttribute('src')`.
    * This allows for relative urls as image src.
    * @since 2.7.0
    * @type Boolean
    */
  var srcFromAttribute: js.UndefOr[Boolean] = js.native
}
object IImageOptions {
  
  @scala.inline
  def apply(): IImageOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IImageOptions]
  }
  
  @scala.inline
  implicit class IImageOptionsMutableBuilder[Self <: IImageOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCacheKey(value: String): Self = StObject.set(x, "cacheKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCacheKeyUndefined: Self = StObject.set(x, "cacheKey", js.undefined)
    
    @scala.inline
    def setCropX(value: Double): Self = StObject.set(x, "cropX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCropXUndefined: Self = StObject.set(x, "cropX", js.undefined)
    
    @scala.inline
    def setCropY(value: Double): Self = StObject.set(x, "cropY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCropYUndefined: Self = StObject.set(x, "cropY", js.undefined)
    
    @scala.inline
    def setCrossOrigin(value: String): Self = StObject.set(x, "crossOrigin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrossOriginUndefined: Self = StObject.set(x, "crossOrigin", js.undefined)
    
    @scala.inline
    def setFilters(value: js.Array[IBaseFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
    
    @scala.inline
    def setFiltersVarargs(value: IBaseFilter*): Self = StObject.set(x, "filters", js.Array(value :_*))
    
    @scala.inline
    def setMinimumScaleTrigger(value: Double): Self = StObject.set(x, "minimumScaleTrigger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimumScaleTriggerUndefined: Self = StObject.set(x, "minimumScaleTrigger", js.undefined)
    
    @scala.inline
    def setSrcFromAttribute(value: Boolean): Self = StObject.set(x, "srcFromAttribute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSrcFromAttributeUndefined: Self = StObject.set(x, "srcFromAttribute", js.undefined)
  }
}
