package typings.ejWebAll.ej.Slider_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SlideEventArgs extends js.Object {
  
  /** if the event should be canceled; otherwise, false.
    */
  var cancel: js.UndefOr[Boolean] = js.native
  
  /** returns slider id
    */
  var id: js.UndefOr[String] = js.native
  
  /** returns the slider model
    */
  var model: js.UndefOr[Model] = js.native
  
  /** returns current handle number or index
    */
  var sliderIndex: js.UndefOr[Double] = js.native
  
  /** returns the name of the event
    */
  var `type`: js.UndefOr[String] = js.native
  
  /** returns the slider value
    */
  var value: js.UndefOr[Double] = js.native
}
object SlideEventArgs {
  
  @scala.inline
  def apply(): SlideEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SlideEventArgs]
  }
  
  @scala.inline
  implicit class SlideEventArgsOps[Self <: SlideEventArgs] (val x: Self) extends AnyVal {
    
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
    def setCancel(value: Boolean): Self = this.set("cancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCancel: Self = this.set("cancel", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setModel(value: Model): Self = this.set("model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModel: Self = this.set("model", js.undefined)
    
    @scala.inline
    def setSliderIndex(value: Double): Self = this.set("sliderIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSliderIndex: Self = this.set("sliderIndex", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
