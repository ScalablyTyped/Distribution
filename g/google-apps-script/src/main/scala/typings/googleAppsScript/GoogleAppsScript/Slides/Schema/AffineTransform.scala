package typings.googleAppsScript.GoogleAppsScript.Slides.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AffineTransform extends js.Object {
  
  var scaleX: js.UndefOr[Double] = js.native
  
  var scaleY: js.UndefOr[Double] = js.native
  
  var shearX: js.UndefOr[Double] = js.native
  
  var shearY: js.UndefOr[Double] = js.native
  
  var translateX: js.UndefOr[Double] = js.native
  
  var translateY: js.UndefOr[Double] = js.native
  
  var unit: js.UndefOr[String] = js.native
}
object AffineTransform {
  
  @scala.inline
  def apply(): AffineTransform = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AffineTransform]
  }
  
  @scala.inline
  implicit class AffineTransformOps[Self <: AffineTransform] (val x: Self) extends AnyVal {
    
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
    def setScaleX(value: Double): Self = this.set("scaleX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScaleX: Self = this.set("scaleX", js.undefined)
    
    @scala.inline
    def setScaleY(value: Double): Self = this.set("scaleY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScaleY: Self = this.set("scaleY", js.undefined)
    
    @scala.inline
    def setShearX(value: Double): Self = this.set("shearX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShearX: Self = this.set("shearX", js.undefined)
    
    @scala.inline
    def setShearY(value: Double): Self = this.set("shearY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShearY: Self = this.set("shearY", js.undefined)
    
    @scala.inline
    def setTranslateX(value: Double): Self = this.set("translateX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTranslateX: Self = this.set("translateX", js.undefined)
    
    @scala.inline
    def setTranslateY(value: Double): Self = this.set("translateY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTranslateY: Self = this.set("translateY", js.undefined)
    
    @scala.inline
    def setUnit(value: String): Self = this.set("unit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnit: Self = this.set("unit", js.undefined)
  }
}
