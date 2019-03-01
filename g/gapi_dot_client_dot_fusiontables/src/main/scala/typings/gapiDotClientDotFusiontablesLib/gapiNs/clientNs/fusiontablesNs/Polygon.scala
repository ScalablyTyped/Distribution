package typings
package gapiDotClientDotFusiontablesLib.gapiNs.clientNs.fusiontablesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Polygon extends js.Object {
  /** The coordinates that define the polygon. */
  var coordinates: js.UndefOr[js.Array[js.Array[js.Array[scala.Double]]]] = js.undefined
  /** Type: A polygon geometry. */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object Polygon {
  @scala.inline
  def apply(coordinates: js.Array[js.Array[js.Array[scala.Double]]] = null, `type`: java.lang.String = null): Polygon = {
    val __obj = js.Dynamic.literal()
    if (coordinates != null) __obj.updateDynamic("coordinates")(coordinates)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Polygon]
  }
}

