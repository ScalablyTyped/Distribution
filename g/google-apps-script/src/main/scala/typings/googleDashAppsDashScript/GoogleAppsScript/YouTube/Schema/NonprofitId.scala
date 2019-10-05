package typings.googleDashAppsDashScript.GoogleAppsScript.YouTube.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NonprofitId extends js.Object {
  var value: js.UndefOr[String] = js.undefined
}

object NonprofitId {
  @scala.inline
  def apply(value: String = null): NonprofitId = {
    val __obj = js.Dynamic.literal()
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[NonprofitId]
  }
}

