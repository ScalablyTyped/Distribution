package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_IdWidth extends js.Object {
  var id: js.UndefOr[String] = js.native
  var width: js.UndefOr[Double] = js.native
  var xCoordinate: js.UndefOr[Double] = js.native
  var yCoordinate: js.UndefOr[Double] = js.native
}

object Anon_IdWidth {
  @scala.inline
  def apply(
    id: String = null,
    width: Int | Double = null,
    xCoordinate: Int | Double = null,
    yCoordinate: Int | Double = null
  ): Anon_IdWidth = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (xCoordinate != null) __obj.updateDynamic("xCoordinate")(xCoordinate.asInstanceOf[js.Any])
    if (yCoordinate != null) __obj.updateDynamic("yCoordinate")(yCoordinate.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_IdWidth]
  }
}

