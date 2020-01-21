package typings.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContentOwnerAdvertisingOption extends js.Object {
  var allowedOptions: js.UndefOr[AllowedAdvertisingOptions] = js.undefined
  var claimedVideoOptions: js.UndefOr[ClaimedVideoDefaults] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
}

object ContentOwnerAdvertisingOption {
  @scala.inline
  def apply(
    allowedOptions: AllowedAdvertisingOptions = null,
    claimedVideoOptions: ClaimedVideoDefaults = null,
    id: String = null,
    kind: String = null
  ): ContentOwnerAdvertisingOption = {
    val __obj = js.Dynamic.literal()
    if (allowedOptions != null) __obj.updateDynamic("allowedOptions")(allowedOptions.asInstanceOf[js.Any])
    if (claimedVideoOptions != null) __obj.updateDynamic("claimedVideoOptions")(claimedVideoOptions.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentOwnerAdvertisingOption]
  }
}

