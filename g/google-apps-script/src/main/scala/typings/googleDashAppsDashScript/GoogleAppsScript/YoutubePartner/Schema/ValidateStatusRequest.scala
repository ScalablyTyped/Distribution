package typings.googleDashAppsDashScript.GoogleAppsScript.YoutubePartner.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidateStatusRequest extends js.Object {
  var kind: js.UndefOr[String] = js.undefined
  var locale: js.UndefOr[String] = js.undefined
  var validationId: js.UndefOr[String] = js.undefined
}

object ValidateStatusRequest {
  @scala.inline
  def apply(kind: String = null, locale: String = null, validationId: String = null): ValidateStatusRequest = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (validationId != null) __obj.updateDynamic("validationId")(validationId)
    __obj.asInstanceOf[ValidateStatusRequest]
  }
}

