package typings
package flipsnapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait FlipsnapOptions extends js.Object {
  /**
       * When support 3D transform browser and this option set true, it is not used 3D transform and use 2D transform. You should set true, when it is a device which has a bug in 3D transform(old Android or BlackBerry etc). default is false.
       */
  var disable3d: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * When set true, touch event is disabled. Only handling button or etc interface. default is false.
       */
  var disableTouch: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Move distance. default is auto calculate from element width and maxPont.
       */
  var distance: js.UndefOr[scala.Double] = js.undefined
  /**
       * Stop point count. default is auto calculate from element item count.
       */
  var maxPoint: js.UndefOr[scala.Double] = js.undefined
  /**
       * Transition duration (millisecond). default is 350.
       */
  var transitionDuration: js.UndefOr[scala.Double] = js.undefined
}

