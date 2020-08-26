package typings.fabric.fabricImplMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

///////////////////////////////////////////////////////////////////////////////
// Fabric util Interface
//////////////////////////////////////////////////////////////////////////////
@js.native
trait IUtilAnimationOptions extends js.Object {
  /**
    * Value to modify the property by
    */
  var byValue: js.UndefOr[Double] = js.native
  /**
    * Duration of change (in ms)
    */
  var duration: js.UndefOr[Double] = js.native
  /**
    * Easing function
    */
  var easing: js.UndefOr[js.Function] = js.native
  /**
    * Ending value
    */
  var endValue: js.UndefOr[Double] = js.native
  /**
    * Callback; invoked on every value change
    */
  var onChange: js.UndefOr[js.Function1[/* value */ Double, Unit]] = js.native
  /**
    * Callback; invoked when value change is completed
    */
  var onComplete: js.UndefOr[js.Function] = js.native
  /**
    * Starting value
    */
  var startValue: js.UndefOr[Double] = js.native
}

object IUtilAnimationOptions {
  @scala.inline
  def apply(): IUtilAnimationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IUtilAnimationOptions]
  }
  @scala.inline
  implicit class IUtilAnimationOptionsOps[Self <: IUtilAnimationOptions] (val x: Self) extends AnyVal {
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
    def setByValue(value: Double): Self = this.set("byValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteByValue: Self = this.set("byValue", js.undefined)
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    @scala.inline
    def setEasing(value: js.Function): Self = this.set("easing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEasing: Self = this.set("easing", js.undefined)
    @scala.inline
    def setEndValue(value: Double): Self = this.set("endValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndValue: Self = this.set("endValue", js.undefined)
    @scala.inline
    def setOnChange(value: /* value */ Double => Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    @scala.inline
    def setOnComplete(value: js.Function): Self = this.set("onComplete", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnComplete: Self = this.set("onComplete", js.undefined)
    @scala.inline
    def setStartValue(value: Double): Self = this.set("startValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartValue: Self = this.set("startValue", js.undefined)
  }
  
}

