package typings
package gapiDotClientDotQpxexpressLib.gapiNs.clientNs.qpxexpressNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AircraftData extends js.Object {
  /** The aircraft code. For example, for a Boeing 777 the code would be 777. */
  var code: js.UndefOr[java.lang.String] = js.undefined
  /** Identifies this as an aircraftData object. Value: the fixed string qpxexpress#aircraftData */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** The name of an aircraft, for example Boeing 777. */
  var name: js.UndefOr[java.lang.String] = js.undefined
}

object AircraftData {
  @scala.inline
  def apply(code: java.lang.String = null, kind: java.lang.String = null, name: java.lang.String = null): AircraftData = {
    val __obj = js.Dynamic.literal()
    if (code != null) __obj.updateDynamic("code")(code)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[AircraftData]
  }
}

