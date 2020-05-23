package typings.googleMapReact.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChildComponentProps extends Coords {
  @JSName("$hover")
  var $hover: js.UndefOr[Boolean] = js.undefined
}

object ChildComponentProps {
  @scala.inline
  def apply(lat: Double, lng: Double, $hover: js.UndefOr[Boolean] = js.undefined): ChildComponentProps = {
    val __obj = js.Dynamic.literal(lat = lat.asInstanceOf[js.Any], lng = lng.asInstanceOf[js.Any])
    if (!js.isUndefined($hover)) __obj.updateDynamic("$hover")($hover.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChildComponentProps]
  }
}

