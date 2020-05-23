package typings.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidateStatusResponse extends js.Object {
  var errors: js.UndefOr[js.Array[ValidateError]] = js.undefined
  var isMetadataOnly: js.UndefOr[Boolean] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var status: js.UndefOr[String] = js.undefined
}

object ValidateStatusResponse {
  @scala.inline
  def apply(
    errors: js.Array[ValidateError] = null,
    isMetadataOnly: js.UndefOr[Boolean] = js.undefined,
    kind: String = null,
    status: String = null
  ): ValidateStatusResponse = {
    val __obj = js.Dynamic.literal()
    if (errors != null) __obj.updateDynamic("errors")(errors.asInstanceOf[js.Any])
    if (!js.isUndefined(isMetadataOnly)) __obj.updateDynamic("isMetadataOnly")(isMetadataOnly.get.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidateStatusResponse]
  }
}

