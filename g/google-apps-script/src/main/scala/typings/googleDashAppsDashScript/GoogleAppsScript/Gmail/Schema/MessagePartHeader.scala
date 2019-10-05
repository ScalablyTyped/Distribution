package typings.googleDashAppsDashScript.GoogleAppsScript.Gmail.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessagePartHeader extends js.Object {
  var name: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[String] = js.undefined
}

object MessagePartHeader {
  @scala.inline
  def apply(name: String = null, value: String = null): MessagePartHeader = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[MessagePartHeader]
  }
}

