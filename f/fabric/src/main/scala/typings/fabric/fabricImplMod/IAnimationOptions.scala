package typings.fabric.fabricImplMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAnimationOptions extends js.Object {
  /**
    *  Value to modify the property by, default: end - start
    */
  var by: js.UndefOr[Double] = js.native
  /**
    * Defaults to 500 (ms). Can be used to change duration of an animation.
    */
  var duration: js.UndefOr[Double] = js.native
  /**
    * Easing function. Default: fabric.util.ease.easeInSine
    */
  var easing: js.UndefOr[js.Function] = js.native
  /**
    * Allows to specify starting value of animatable property (if we don't want current value to be used).
    */
  var from: js.UndefOr[String | Double] = js.native
  /**
    * Callback; invoked on every value change
    */
  var onChange: js.UndefOr[js.Function] = js.native
  /**
    * Callback; invoked when value change is completed
    */
  var onComplete: js.UndefOr[js.Function] = js.native
}

object IAnimationOptions {
  @scala.inline
  def apply(): IAnimationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAnimationOptions]
  }
  @scala.inline
  implicit class IAnimationOptionsOps[Self <: IAnimationOptions] (val x: Self) extends AnyVal {
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
    def setBy(value: Double): Self = this.set("by", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBy: Self = this.set("by", js.undefined)
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    @scala.inline
    def setEasing(value: js.Function): Self = this.set("easing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEasing: Self = this.set("easing", js.undefined)
    @scala.inline
    def setFrom(value: String | Double): Self = this.set("from", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFrom: Self = this.set("from", js.undefined)
    @scala.inline
    def setOnChange(value: js.Function): Self = this.set("onChange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    @scala.inline
    def setOnComplete(value: js.Function): Self = this.set("onComplete", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnComplete: Self = this.set("onComplete", js.undefined)
  }
  
}

