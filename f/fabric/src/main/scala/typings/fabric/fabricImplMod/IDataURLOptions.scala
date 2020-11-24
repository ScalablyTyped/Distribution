package typings.fabric.fabricImplMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

///////////////////////////////////////////////////////////////////////////////
// Data Object Interfaces - These interface are not specific part of fabric,
// They are just helpful for for defining function parameters
//////////////////////////////////////////////////////////////////////////////
@js.native
trait IDataURLOptions extends js.Object {
  
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
  implicit class IDataURLOptionsOps[Self <: IDataURLOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEnableRetinaScaling(value: Boolean): Self = this.set("enableRetinaScaling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableRetinaScaling: Self = this.set("enableRetinaScaling", js.undefined)
    
    @scala.inline
    def setFormat(value: String): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setLeft(value: Double): Self = this.set("left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLeft: Self = this.set("left", js.undefined)
    
    @scala.inline
    def setMultiplier(value: Double): Self = this.set("multiplier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMultiplier: Self = this.set("multiplier", js.undefined)
    
    @scala.inline
    def setQuality(value: Double): Self = this.set("quality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuality: Self = this.set("quality", js.undefined)
    
    @scala.inline
    def setTop(value: Double): Self = this.set("top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTop: Self = this.set("top", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
    
    @scala.inline
    def setWithoutShadow(value: Boolean): Self = this.set("withoutShadow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWithoutShadow: Self = this.set("withoutShadow", js.undefined)
    
    @scala.inline
    def setWithoutTransform(value: Boolean): Self = this.set("withoutTransform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWithoutTransform: Self = this.set("withoutTransform", js.undefined)
  }
}
