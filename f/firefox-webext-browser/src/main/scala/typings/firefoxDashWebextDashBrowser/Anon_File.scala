package typings.firefoxDashWebextDashBrowser

import typings.firefoxDashWebextDashBrowser.browser._manifest.ExtensionURL
import typings.firefoxDashWebextDashBrowser.browser.extensionTypes.ExtensionFileOrCode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_File extends ExtensionFileOrCode {
  var file: ExtensionURL
}

object Anon_File {
  @scala.inline
  def apply(file: ExtensionURL): Anon_File = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_File]
  }
}

