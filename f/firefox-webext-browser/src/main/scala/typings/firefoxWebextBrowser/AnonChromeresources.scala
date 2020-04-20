package typings.firefoxWebextBrowser

import org.scalablytyped.runtime.StringDictionary
import typings.firefoxWebextBrowser.browser.manifest.ExtensionURL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonChromeresources extends js.Object {
  var chrome_resources: StringDictionary[ExtensionURL | StringDictionary[ExtensionURL]]
  var version: String
}

object AnonChromeresources {
  @scala.inline
  def apply(chrome_resources: StringDictionary[ExtensionURL | StringDictionary[ExtensionURL]], version: String): AnonChromeresources = {
    val __obj = js.Dynamic.literal(chrome_resources = chrome_resources.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonChromeresources]
  }
}

