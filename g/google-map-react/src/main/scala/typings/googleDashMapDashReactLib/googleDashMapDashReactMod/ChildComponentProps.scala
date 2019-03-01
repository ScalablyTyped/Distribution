package typings
package googleDashMapDashReactLib.googleDashMapDashReactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChildComponentProps extends Coords {
  @JSName("$hover")
  var $hover: js.UndefOr[scala.Boolean] = js.undefined
}

object ChildComponentProps {
  @scala.inline
  def apply(lat: scala.Double, lng: scala.Double, $hover: js.UndefOr[scala.Boolean] = js.undefined): ChildComponentProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("lat")(lat)
    __obj.updateDynamic("lng")(lng)
    if (!js.isUndefined($hover)) __obj.updateDynamic("$hover")($hover)
    __obj.asInstanceOf[ChildComponentProps]
  }
}

