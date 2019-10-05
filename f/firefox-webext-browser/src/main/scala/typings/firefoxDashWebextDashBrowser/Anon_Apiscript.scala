package typings.firefoxDashWebextDashBrowser

import typings.firefoxDashWebextDashBrowser.browser._manifest.ExtensionURL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Apiscript extends js.Object {
  var api_script: js.UndefOr[ExtensionURL] = js.undefined
}

object Anon_Apiscript {
  @scala.inline
  def apply(api_script: ExtensionURL = null): Anon_Apiscript = {
    val __obj = js.Dynamic.literal()
    if (api_script != null) __obj.updateDynamic("api_script")(api_script)
    __obj.asInstanceOf[Anon_Apiscript]
  }
}

