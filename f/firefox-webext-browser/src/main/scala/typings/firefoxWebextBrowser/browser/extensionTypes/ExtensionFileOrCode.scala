package typings.firefoxWebextBrowser.browser.extensionTypes

import typings.firefoxWebextBrowser.browser.manifest.ExtensionURL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.firefoxWebextBrowser.anon.File
  - typings.firefoxWebextBrowser.anon.Code
*/
trait ExtensionFileOrCode extends js.Object

object ExtensionFileOrCode {
  @scala.inline
  def File(file: ExtensionURL): ExtensionFileOrCode = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtensionFileOrCode]
  }
  @scala.inline
  def Code(code: String): ExtensionFileOrCode = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtensionFileOrCode]
  }
}

