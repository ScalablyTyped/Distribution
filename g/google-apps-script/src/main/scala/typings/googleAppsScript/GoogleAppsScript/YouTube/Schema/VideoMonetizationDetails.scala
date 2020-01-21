package typings.googleAppsScript.GoogleAppsScript.YouTube.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VideoMonetizationDetails extends js.Object {
  var access: js.UndefOr[AccessPolicy] = js.undefined
}

object VideoMonetizationDetails {
  @scala.inline
  def apply(access: AccessPolicy = null): VideoMonetizationDetails = {
    val __obj = js.Dynamic.literal()
    if (access != null) __obj.updateDynamic("access")(access.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoMonetizationDetails]
  }
}

