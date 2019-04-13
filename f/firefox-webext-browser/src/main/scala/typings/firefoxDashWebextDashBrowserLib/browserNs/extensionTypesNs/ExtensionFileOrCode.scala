package typings
package firefoxDashWebextDashBrowserLib.browserNs.extensionTypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtensionFileOrCode extends js.Object {
  var code: js.UndefOr[java.lang.String] = js.undefined
  var file: js.UndefOr[firefoxDashWebextDashBrowserLib.browserNs.underscoreManifestNs.ExtensionURL] = js.undefined
}

object ExtensionFileOrCode {
  @scala.inline
  def apply(
    code: java.lang.String = null,
    file: firefoxDashWebextDashBrowserLib.browserNs.underscoreManifestNs.ExtensionURL = null
  ): ExtensionFileOrCode = {
    val __obj = js.Dynamic.literal()
    if (code != null) __obj.updateDynamic("code")(code)
    if (file != null) __obj.updateDynamic("file")(file)
    __obj.asInstanceOf[ExtensionFileOrCode]
  }
}

