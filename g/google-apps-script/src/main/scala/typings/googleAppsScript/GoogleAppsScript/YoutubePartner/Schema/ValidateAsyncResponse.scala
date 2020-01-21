package typings.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidateAsyncResponse extends js.Object {
  var kind: js.UndefOr[String] = js.undefined
  var status: js.UndefOr[String] = js.undefined
  var validationId: js.UndefOr[String] = js.undefined
}

object ValidateAsyncResponse {
  @scala.inline
  def apply(kind: String = null, status: String = null, validationId: String = null): ValidateAsyncResponse = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (validationId != null) __obj.updateDynamic("validationId")(validationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidateAsyncResponse]
  }
}

