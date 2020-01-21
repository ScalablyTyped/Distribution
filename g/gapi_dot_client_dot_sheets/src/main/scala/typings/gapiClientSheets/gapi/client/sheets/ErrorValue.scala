package typings.gapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrorValue extends js.Object {
  /**
    * A message with more information about the error
    * (in the spreadsheet's locale).
    */
  var message: js.UndefOr[String] = js.undefined
  /** The type of error. */
  var `type`: js.UndefOr[String] = js.undefined
}

object ErrorValue {
  @scala.inline
  def apply(message: String = null, `type`: String = null): ErrorValue = {
    val __obj = js.Dynamic.literal()
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorValue]
  }
}

