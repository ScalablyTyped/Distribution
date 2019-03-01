package typings
package gapiDotClientDotFusiontablesLib.gapiNs.clientNs.fusiontablesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Line extends js.Object {
  /** The coordinates that define the line. */
  var coordinates: js.UndefOr[js.Array[js.Array[scala.Double]]] = js.undefined
  /** Type: A line geometry. */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object Line {
  @scala.inline
  def apply(coordinates: js.Array[js.Array[scala.Double]] = null, `type`: java.lang.String = null): Line = {
    val __obj = js.Dynamic.literal()
    if (coordinates != null) __obj.updateDynamic("coordinates")(coordinates)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Line]
  }
}

