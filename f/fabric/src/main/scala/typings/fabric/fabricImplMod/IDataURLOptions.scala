package typings.fabric.fabricImplMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

///////////////////////////////////////////////////////////////////////////////
// Data Object Interfaces - These interface are not specific part of fabric,
// They are just helpful for for defining function parameters
//////////////////////////////////////////////////////////////////////////////
@js.native
trait IDataURLOptions extends StObject {
  
  var enableRetinaScaling: js.UndefOr[Boolean] = js.native
  
  /**
    * The format of the output image. Either "jpeg" or "png"
    */
  var format: js.UndefOr[String] = js.native
  
  /**
    * Cropping height. Introduced in v1.2.14
    */
  var height: js.UndefOr[Double] = js.native
  
  /**
    * Cropping left offset. Introduced in v1.2.14
    */
  var left: js.UndefOr[Double] = js.native
  
  /**
    * Multiplier to scale by
    */
  var multiplier: js.UndefOr[Double] = js.native
  
  /**
    * Quality level (0..1). Only used for jpeg
    */
  var quality: js.UndefOr[Double] = js.native
  
  /**
    * Cropping top offset. Introduced in v1.2.14
    */
  var top: js.UndefOr[Double] = js.native
  
  /**
    * Cropping width. Introduced in v1.2.14
    */
  var width: js.UndefOr[Double] = js.native
  
  var withoutShadow: js.UndefOr[Boolean] = js.native
  
  var withoutTransform: js.UndefOr[Boolean] = js.native
}
object IDataURLOptions {
  
  @scala.inline
  def apply(): IDataURLOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDataURLOptions]
  }
  
  @scala.inline
  implicit class IDataURLOptionsMutableBuilder[Self <: IDataURLOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnableRetinaScaling(value: Boolean): Self = StObject.set(x, "enableRetinaScaling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableRetinaScalingUndefined: Self = StObject.set(x, "enableRetinaScaling", js.undefined)
    
    @scala.inline
    def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
    
    @scala.inline
    def setMultiplier(value: Double): Self = StObject.set(x, "multiplier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultiplierUndefined: Self = StObject.set(x, "multiplier", js.undefined)
    
    @scala.inline
    def setQuality(value: Double): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQualityUndefined: Self = StObject.set(x, "quality", js.undefined)
    
    @scala.inline
    def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    @scala.inline
    def setWithoutShadow(value: Boolean): Self = StObject.set(x, "withoutShadow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWithoutShadowUndefined: Self = StObject.set(x, "withoutShadow", js.undefined)
    
    @scala.inline
    def setWithoutTransform(value: Boolean): Self = StObject.set(x, "withoutTransform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWithoutTransformUndefined: Self = StObject.set(x, "withoutTransform", js.undefined)
  }
}
