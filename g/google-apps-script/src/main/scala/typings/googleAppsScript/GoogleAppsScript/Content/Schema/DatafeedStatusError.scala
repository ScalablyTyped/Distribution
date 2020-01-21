package typings.googleAppsScript.GoogleAppsScript.Content.Schema

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
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (examples != null) __obj.updateDynamic("examples")(examples.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatafeedStatusError]
  }
}

