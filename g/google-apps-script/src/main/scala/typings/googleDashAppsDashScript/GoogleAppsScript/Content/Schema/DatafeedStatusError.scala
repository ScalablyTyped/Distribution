package typings.googleDashAppsDashScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatafeedStatusError extends js.Object {
  var code: js.UndefOr[String] = js.undefined
  var count: js.UndefOr[String] = js.undefined
  var examples: js.UndefOr[js.Array[DatafeedStatusExample]] = js.undefined
  var message: js.UndefOr[String] = js.undefined
}

object DatafeedStatusError {
  @scala.inline
  def apply(
    code: String = null,
    count: String = null,
    examples: js.Array[DatafeedStatusExample] = null,
    message: String = null
  ): DatafeedStatusError = {
    val __obj = js.Dynamic.literal()
    if (code != null) __obj.updateDynamic("code")(code)
    if (count != null) __obj.updateDynamic("count")(count)
    if (examples != null) __obj.updateDynamic("examples")(examples)
    if (message != null) __obj.updateDynamic("message")(message)
    __obj.asInstanceOf[DatafeedStatusError]
  }
}

