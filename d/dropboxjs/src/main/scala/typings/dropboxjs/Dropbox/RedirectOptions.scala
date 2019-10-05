package typings.dropboxjs.Dropbox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RedirectOptions extends js.Object {
  var redirectFile: js.UndefOr[String] = js.undefined
  var redirectUrl: js.UndefOr[String] = js.undefined
  var rememberUser: js.UndefOr[Boolean] = js.undefined
  var scope: js.UndefOr[String] = js.undefined
}

object RedirectOptions {
  @scala.inline
  def apply(
    redirectFile: String = null,
    redirectUrl: String = null,
    rememberUser: js.UndefOr[Boolean] = js.undefined,
    scope: String = null
  ): RedirectOptions = {
    val __obj = js.Dynamic.literal()
    if (redirectFile != null) __obj.updateDynamic("redirectFile")(redirectFile)
    if (redirectUrl != null) __obj.updateDynamic("redirectUrl")(redirectUrl)
    if (!js.isUndefined(rememberUser)) __obj.updateDynamic("rememberUser")(rememberUser)
    if (scope != null) __obj.updateDynamic("scope")(scope)
    __obj.asInstanceOf[RedirectOptions]
  }
}

