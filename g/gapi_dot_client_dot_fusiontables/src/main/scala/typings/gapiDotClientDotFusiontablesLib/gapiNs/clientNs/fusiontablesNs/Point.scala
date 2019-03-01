package typings
package gapiDotClientDotFusiontablesLib.gapiNs.clientNs.fusiontablesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Point extends js.Object {
  /** The coordinates that define the point. */
  var coordinates: js.UndefOr[js.Array[scala.Double]] = js.undefined
  /** Point: A point geometry. */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object Point {
  @scala.inline
  def apply(coordinates: js.Array[scala.Double] = null, `type`: java.lang.String = null): Point = {
    val __obj = js.Dynamic.literal()
    if (coordinates != null) __obj.updateDynamic("coordinates")(coordinates)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Point]
  }
}

