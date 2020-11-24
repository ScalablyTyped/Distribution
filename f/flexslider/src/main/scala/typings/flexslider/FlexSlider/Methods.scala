package typings.flexslider.FlexSlider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Methods extends js.Object {
  
  /**
    * Fires after a slide is added
    */
  var added: js.UndefOr[js.Function1[/* slider */ SliderObject, Unit]] = js.native
  
  /**
    * Fires after each slider animation completes
    */
  var after: js.UndefOr[js.Function1[/* slider */ SliderObject, Unit]] = js.native
  
  /**
    * Fires asynchronously with each slider animation
    */
  var before: js.UndefOr[js.Function1[/* slider */ SliderObject, Unit]] = js.native
  
  /**
    * Fires when the slider reaches the last slide (asynchronous)
    */
  var end: js.UndefOr[js.Function1[/* slider */ SliderObject, Unit]] = js.native
  
  /**
    * Fires after the slider is initially setup
    */
  var init: js.UndefOr[js.Function1[/* slider */ SliderObject, Unit]] = js.native
  
  /**
    * Fires after a slide is removed
    */
  var removed: js.UndefOr[js.Function1[/* slider */ SliderObject, Unit]] = js.native
  
  /**
    * Fires when the slider loads the first slide
    */
  var start: js.UndefOr[js.Function1[/* slider */ SliderObject, Unit]] = js.native
}
object Methods {
  
  @scala.inline
  def apply(): Methods = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Methods]
  }
  
  @scala.inline
  implicit class MethodsOps[Self <: Methods] (val x: Self) extends AnyVal {
    
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
    def setAdded(value: /* slider */ SliderObject => Unit): Self = this.set("added", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteAdded: Self = this.set("added", js.undefined)
    
    @scala.inline
    def setAfter(value: /* slider */ SliderObject => Unit): Self = this.set("after", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteAfter: Self = this.set("after", js.undefined)
    
    @scala.inline
    def setBefore(value: /* slider */ SliderObject => Unit): Self = this.set("before", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteBefore: Self = this.set("before", js.undefined)
    
    @scala.inline
    def setEnd(value: /* slider */ SliderObject => Unit): Self = this.set("end", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteEnd: Self = this.set("end", js.undefined)
    
    @scala.inline
    def setInit(value: /* slider */ SliderObject => Unit): Self = this.set("init", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteInit: Self = this.set("init", js.undefined)
    
    @scala.inline
    def setRemoved(value: /* slider */ SliderObject => Unit): Self = this.set("removed", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRemoved: Self = this.set("removed", js.undefined)
    
    @scala.inline
    def setStart(value: /* slider */ SliderObject => Unit): Self = this.set("start", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
  }
}
