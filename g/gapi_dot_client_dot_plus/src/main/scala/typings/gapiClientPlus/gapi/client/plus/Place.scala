package typings.gapiClientPlus.gapi.client.plus

import typings.gapiClientPlus.AnonFormattedString
import typings.gapiClientPlus.AnonLatitude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Place extends js.Object {
  /** The physical address of the place. */
  var address: js.UndefOr[AnonFormattedString] = js.undefined
  /** The display name of the place. */
  var displayName: js.UndefOr[String] = js.undefined
  /** The id of the place. */
  var id: js.UndefOr[String] = js.undefined
  /** Identifies this resource as a place. Value: "plus#place". */
  var kind: js.UndefOr[String] = js.undefined
  /** The position of the place. */
  var position: js.UndefOr[AnonLatitude] = js.undefined
}

object Place {
  @scala.inline
  def apply(
    address: AnonFormattedString = null,
    displayName: String = null,
    id: String = null,
    kind: String = null,
    position: AnonLatitude = null
  ): Place = {
    val __obj = js.Dynamic.literal()
    if (address != null) __obj.updateDynamic("address")(address.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[Place]
  }
}

