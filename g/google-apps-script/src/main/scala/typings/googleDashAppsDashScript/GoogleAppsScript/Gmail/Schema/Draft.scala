package typings.googleDashAppsDashScript.GoogleAppsScript.Gmail.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Draft extends js.Object {
  var id: js.UndefOr[String] = js.undefined
  var message: js.UndefOr[Message] = js.undefined
}

object Draft {
  @scala.inline
  def apply(id: String = null, message: Message = null): Draft = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    __obj.asInstanceOf[Draft]
  }
}

