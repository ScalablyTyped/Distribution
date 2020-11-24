package typings.figma.mod.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImageFilters extends js.Object {
  
  val contrast: js.UndefOr[Double] = js.native
  
  val exposure: js.UndefOr[Double] = js.native
  
  val highlights: js.UndefOr[Double] = js.native
  
  val saturation: js.UndefOr[Double] = js.native
  
  val shadows: js.UndefOr[Double] = js.native
  
  val temperature: js.UndefOr[Double] = js.native
  
  val tint: js.UndefOr[Double] = js.native
}
object ImageFilters {
  
  @scala.inline
  def apply(): ImageFilters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageFilters]
  }
  
  @scala.inline
  implicit class ImageFiltersOps[Self <: ImageFilters] (val x: Self) extends AnyVal {
    
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
    def setContrast(value: Double): Self = this.set("contrast", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContrast: Self = this.set("contrast", js.undefined)
    
    @scala.inline
    def setExposure(value: Double): Self = this.set("exposure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExposure: Self = this.set("exposure", js.undefined)
    
    @scala.inline
    def setHighlights(value: Double): Self = this.set("highlights", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHighlights: Self = this.set("highlights", js.undefined)
    
    @scala.inline
    def setSaturation(value: Double): Self = this.set("saturation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSaturation: Self = this.set("saturation", js.undefined)
    
    @scala.inline
    def setShadows(value: Double): Self = this.set("shadows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShadows: Self = this.set("shadows", js.undefined)
    
    @scala.inline
    def setTemperature(value: Double): Self = this.set("temperature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemperature: Self = this.set("temperature", js.undefined)
    
    @scala.inline
    def setTint(value: Double): Self = this.set("tint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTint: Self = this.set("tint", js.undefined)
  }
}
