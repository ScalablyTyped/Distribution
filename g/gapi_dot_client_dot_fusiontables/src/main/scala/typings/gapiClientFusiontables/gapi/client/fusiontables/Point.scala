package typings.gapiClientFusiontables.gapi.client.fusiontables

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Point extends js.Object {
  /** The coordinates that define the point. */
  var coordinates: js.UndefOr[js.Array[Double]] = js.undefined
  /** Point: A point geometry. */
  var `type`: js.UndefOr[String] = js.undefined
}

object Point {
  @scala.inline
  def apply(coordinates: js.Array[Double] = null, `type`: String = null): Point = {
    val __obj = js.Dynamic.literal()
    if (coordinates != null) __obj.updateDynamic("coordinates")(coordinates.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Point]
  }
}

