package typings.expoWebBrowser.anon

import typings.expoWebBrowser.expoWebBrowserStrings.failed
import typings.expoWebBrowser.expoWebBrowserStrings.success
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Message extends js.Object {
  var message: String
  var `type`: success | failed
}

object Message {
  @scala.inline
  def apply(message: String, `type`: success | failed): Message = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Message]
  }
}

