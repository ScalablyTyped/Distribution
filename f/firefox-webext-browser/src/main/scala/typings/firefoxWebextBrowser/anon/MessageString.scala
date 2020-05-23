package typings.firefoxWebextBrowser.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessageString extends js.Object {
  /** Details about the error which occurred. */
  var message: js.UndefOr[String] = js.undefined
}

object MessageString {
  @scala.inline
  def apply(message: String = null): MessageString = {
    val __obj = js.Dynamic.literal()
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageString]
  }
}

