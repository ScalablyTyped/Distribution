package typings.firefoxWebextBrowser.anon

import typings.firefoxWebextBrowser.browser.extensionTypes.ExtensionFileOrCode
import typings.firefoxWebextBrowser.browser.manifest.ExtensionURL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait File extends ExtensionFileOrCode {
  var file: ExtensionURL
}

object File {
  @scala.inline
  def apply(file: ExtensionURL): File = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any])
    __obj.asInstanceOf[File]
  }
}

