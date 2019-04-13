package typings
package electronDashPackagerLib.electronDashPackagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ElectronDownloadOptions extends js.Object {
  var cache: js.UndefOr[java.lang.String] = js.undefined
  var mirror: js.UndefOr[java.lang.String] = js.undefined
  var quiet: js.UndefOr[scala.Boolean] = js.undefined
  var strictSSL: js.UndefOr[scala.Boolean] = js.undefined
}

object ElectronDownloadOptions {
  @scala.inline
  def apply(
    cache: java.lang.String = null,
    mirror: java.lang.String = null,
    quiet: js.UndefOr[scala.Boolean] = js.undefined,
    strictSSL: js.UndefOr[scala.Boolean] = js.undefined
  ): ElectronDownloadOptions = {
    val __obj = js.Dynamic.literal()
    if (cache != null) __obj.updateDynamic("cache")(cache)
    if (mirror != null) __obj.updateDynamic("mirror")(mirror)
    if (!js.isUndefined(quiet)) __obj.updateDynamic("quiet")(quiet)
    if (!js.isUndefined(strictSSL)) __obj.updateDynamic("strictSSL")(strictSSL)
    __obj.asInstanceOf[ElectronDownloadOptions]
  }
}

