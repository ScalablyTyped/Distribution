package typings.googleAppsScript.GoogleAppsScript.Slides.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CropProperties extends js.Object {
  
  var angle: js.UndefOr[Double] = js.native
  
  var bottomOffset: js.UndefOr[Double] = js.native
  
  var leftOffset: js.UndefOr[Double] = js.native
  
  var rightOffset: js.UndefOr[Double] = js.native
  
  var topOffset: js.UndefOr[Double] = js.native
}
object CropProperties {
  
  @scala.inline
  def apply(): CropProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CropProperties]
  }
  
  @scala.inline
  implicit class CropPropertiesOps[Self <: CropProperties] (val x: Self) extends AnyVal {
    
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
    def setAngle(value: Double): Self = this.set("angle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAngle: Self = this.set("angle", js.undefined)
    
    @scala.inline
    def setBottomOffset(value: Double): Self = this.set("bottomOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBottomOffset: Self = this.set("bottomOffset", js.undefined)
    
    @scala.inline
    def setLeftOffset(value: Double): Self = this.set("leftOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLeftOffset: Self = this.set("leftOffset", js.undefined)
    
    @scala.inline
    def setRightOffset(value: Double): Self = this.set("rightOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRightOffset: Self = this.set("rightOffset", js.undefined)
    
    @scala.inline
    def setTopOffset(value: Double): Self = this.set("topOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTopOffset: Self = this.set("topOffset", js.undefined)
  }
}
