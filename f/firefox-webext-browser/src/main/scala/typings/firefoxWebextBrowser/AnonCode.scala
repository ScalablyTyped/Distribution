package typings.firefoxWebextBrowser

import typings.firefoxWebextBrowser.browser.extensionTypes.ExtensionFileOrCode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCode extends ExtensionFileOrCode {
  var code: String
}

object AnonCode {
  @scala.inline
  def apply(code: String): AnonCode = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCode]
  }
}

