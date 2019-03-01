package typings
package dropboxjsLib.DropboxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RedirectOptions extends js.Object {
  var redirectFile: js.UndefOr[java.lang.String] = js.undefined
  var redirectUrl: js.UndefOr[java.lang.String] = js.undefined
  var rememberUser: js.UndefOr[scala.Boolean] = js.undefined
  var scope: js.UndefOr[java.lang.String] = js.undefined
}

object RedirectOptions {
  @scala.inline
  def apply(
    redirectFile: java.lang.String = null,
    redirectUrl: java.lang.String = null,
    rememberUser: js.UndefOr[scala.Boolean] = js.undefined,
    scope: java.lang.String = null
  ): RedirectOptions = {
    val __obj = js.Dynamic.literal()
    if (redirectFile != null) __obj.updateDynamic("redirectFile")(redirectFile)
    if (redirectUrl != null) __obj.updateDynamic("redirectUrl")(redirectUrl)
    if (!js.isUndefined(rememberUser)) __obj.updateDynamic("rememberUser")(rememberUser)
    if (scope != null) __obj.updateDynamic("scope")(scope)
    __obj.asInstanceOf[RedirectOptions]
  }
}

