package typings.flipsnap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlipsnapOptions extends js.Object {
  /**
    * When support 3D transform browser and this option set true, it is not used 3D transform and use 2D transform. You should set true, when it is a device which has a bug in 3D transform(old Android or BlackBerry etc). default is false.
    */
  var disable3d: js.UndefOr[Boolean] = js.undefined
  /**
    * When set true, touch event is disabled. Only handling button or etc interface. default is false.
    */
  var disableTouch: js.UndefOr[Boolean] = js.undefined
  /**
    * Move distance. default is auto calculate from element width and maxPont.
    */
  var distance: js.UndefOr[Double] = js.undefined
  /**
    * Stop point count. default is auto calculate from element item count.
    */
  var maxPoint: js.UndefOr[Double] = js.undefined
  /**
    * Transition duration (millisecond). default is 350.
    */
  var transitionDuration: js.UndefOr[Double] = js.undefined
}

object FlipsnapOptions {
  @scala.inline
  def apply(
    disable3d: js.UndefOr[Boolean] = js.undefined,
    disableTouch: js.UndefOr[Boolean] = js.undefined,
    distance: Int | Double = null,
    maxPoint: Int | Double = null,
    transitionDuration: Int | Double = null
  ): FlipsnapOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(disable3d)) __obj.updateDynamic("disable3d")(disable3d)
    if (!js.isUndefined(disableTouch)) __obj.updateDynamic("disableTouch")(disableTouch)
    if (distance != null) __obj.updateDynamic("distance")(distance.asInstanceOf[js.Any])
    if (maxPoint != null) __obj.updateDynamic("maxPoint")(maxPoint.asInstanceOf[js.Any])
    if (transitionDuration != null) __obj.updateDynamic("transitionDuration")(transitionDuration.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlipsnapOptions]
  }
}

