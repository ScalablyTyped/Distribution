package typings.gapiClientQpxexpress.gapi.client.qpxexpress

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AircraftData extends js.Object {
  /** The aircraft code. For example, for a Boeing 777 the code would be 777. */
  var code: js.UndefOr[String] = js.undefined
  /** Identifies this as an aircraftData object. Value: the fixed string qpxexpress#aircraftData */
  var kind: js.UndefOr[String] = js.undefined
  /** The name of an aircraft, for example Boeing 777. */
  var name: js.UndefOr[String] = js.undefined
}

object AircraftData {
  @scala.inline
  def apply(code: String = null, kind: String = null, name: String = null): AircraftData = {
    val __obj = js.Dynamic.literal()
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AircraftData]
  }
}

