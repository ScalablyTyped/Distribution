package typings.flipsnap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlipsnapOptions extends js.Object {
  /**
    * When support 3D transform browser and this option set true, it is not used 3D transform and use 2D transform. You should set true, when it is a device which has a bug in 3D transform(old Android or BlackBerry etc). default is false.
    */
  var disable3d: js.UndefOr[Boolean] = js.native
  /**
    * When set true, touch event is disabled. Only handling button or etc interface. default is false.
    */
  var disableTouch: js.UndefOr[Boolean] = js.native
  /**
    * Move distance. default is auto calculate from element width and maxPont.
    */
  var distance: js.UndefOr[Double] = js.native
  /**
    * Stop point count. default is auto calculate from element item count.
    */
  var maxPoint: js.UndefOr[Double] = js.native
  /**
    * Transition duration (millisecond). default is 350.
    */
  var transitionDuration: js.UndefOr[Double] = js.native
}

object FlipsnapOptions {
  @scala.inline
  def apply(): FlipsnapOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FlipsnapOptions]
  }
  @scala.inline
  implicit class FlipsnapOptionsOps[Self <: FlipsnapOptions] (val x: Self) extends AnyVal {
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
    def setDisable3d(value: Boolean): Self = this.set("disable3d", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisable3d: Self = this.set("disable3d", js.undefined)
    @scala.inline
    def setDisableTouch(value: Boolean): Self = this.set("disableTouch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableTouch: Self = this.set("disableTouch", js.undefined)
    @scala.inline
    def setDistance(value: Double): Self = this.set("distance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDistance: Self = this.set("distance", js.undefined)
    @scala.inline
    def setMaxPoint(value: Double): Self = this.set("maxPoint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxPoint: Self = this.set("maxPoint", js.undefined)
    @scala.inline
    def setTransitionDuration(value: Double): Self = this.set("transitionDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransitionDuration: Self = this.set("transitionDuration", js.undefined)
  }
  
}

