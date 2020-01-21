package typings.firefoxWebextBrowser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonExtension extends js.Object {
  /** Extensions and packaged applications a user has installed (be _really_ careful!). */
  var extension: js.UndefOr[Boolean] = js.undefined
  /** Websites that have been installed as hosted applications (be careful!). */
  var protectedWeb: js.UndefOr[Boolean] = js.undefined
  /** Normal websites. */
  var unprotectedWeb: js.UndefOr[Boolean] = js.undefined
}

object AnonExtension {
  @scala.inline
  def apply(
    extension: js.UndefOr[Boolean] = js.undefined,
    protectedWeb: js.UndefOr[Boolean] = js.undefined,
    unprotectedWeb: js.UndefOr[Boolean] = js.undefined
  ): AnonExtension = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(extension)) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (!js.isUndefined(protectedWeb)) __obj.updateDynamic("protectedWeb")(protectedWeb.asInstanceOf[js.Any])
    if (!js.isUndefined(unprotectedWeb)) __obj.updateDynamic("unprotectedWeb")(unprotectedWeb.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonExtension]
  }
}

