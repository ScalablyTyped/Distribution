package typings.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PackageInsertResponse extends js.Object {
  var errors: js.UndefOr[js.Array[ValidateError]] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var resource: js.UndefOr[Package] = js.undefined
  var status: js.UndefOr[String] = js.undefined
}

object PackageInsertResponse {
  @scala.inline
  def apply(
    errors: js.Array[ValidateError] = null,
    kind: String = null,
    resource: Package = null,
    status: String = null
  ): PackageInsertResponse = {
    val __obj = js.Dynamic.literal()
    if (errors != null) __obj.updateDynamic("errors")(errors.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (resource != null) __obj.updateDynamic("resource")(resource.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[PackageInsertResponse]
  }
}

