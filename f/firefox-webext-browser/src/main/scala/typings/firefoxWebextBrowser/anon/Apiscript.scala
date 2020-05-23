package typings.firefoxWebextBrowser.anon

import typings.firefoxWebextBrowser.browser.manifest.ExtensionURL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Apiscript extends js.Object {
  var api_script: js.UndefOr[ExtensionURL] = js.undefined
}

object Apiscript {
  @scala.inline
  def apply(api_script: ExtensionURL = null): Apiscript = {
    val __obj = js.Dynamic.literal()
    if (api_script != null) __obj.updateDynamic("api_script")(api_script.asInstanceOf[js.Any])
    __obj.asInstanceOf[Apiscript]
  }
}

