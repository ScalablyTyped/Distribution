package typings.firefoxWebextBrowser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMessageString extends js.Object {
  /** Details about the error which occurred. */
  var message: js.UndefOr[String] = js.undefined
}

object AnonMessageString {
  @scala.inline
  def apply(message: String = null): AnonMessageString = {
    val __obj = js.Dynamic.literal()
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMessageString]
  }
}

