package typings.firefoxDashWebextDashBrowser.browser.extensionTypes

import typings.firefoxDashWebextDashBrowser.browser._manifest.ExtensionURL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtensionFileOrCode extends js.Object {
  var code: js.UndefOr[String] = js.undefined
  var file: js.UndefOr[ExtensionURL] = js.undefined
}

object ExtensionFileOrCode {
  @scala.inline
  def apply(code: String = null, file: ExtensionURL = null): ExtensionFileOrCode = {
    val __obj = js.Dynamic.literal()
    if (code != null) __obj.updateDynamic("code")(code)
    if (file != null) __obj.updateDynamic("file")(file)
    __obj.asInstanceOf[ExtensionFileOrCode]
  }
}

