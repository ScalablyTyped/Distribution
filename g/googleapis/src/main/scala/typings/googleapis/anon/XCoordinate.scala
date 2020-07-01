package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XCoordinate extends js.Object {
  var id: js.UndefOr[String] = js.native
  var width: js.UndefOr[Double] = js.native
  var xCoordinate: js.UndefOr[Double] = js.native
  var yCoordinate: js.UndefOr[Double] = js.native
}

object XCoordinate {
  @scala.inline
  def apply(
    id: String = null,
    width: js.UndefOr[Double] = js.undefined,
    xCoordinate: js.UndefOr[Double] = js.undefined,
    yCoordinate: js.UndefOr[Double] = js.undefined
  ): XCoordinate = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    if (!js.isUndefined(xCoordinate)) __obj.updateDynamic("xCoordinate")(xCoordinate.get.asInstanceOf[js.Any])
    if (!js.isUndefined(yCoordinate)) __obj.updateDynamic("yCoordinate")(yCoordinate.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[XCoordinate]
  }
}

