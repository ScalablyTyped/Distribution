package typings.gapiClientResourceviews.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Data extends js.Object {
  /** [Output only] The warning type identifier for this warning. */
  var code: js.UndefOr[String] = js.undefined
  /** [Output only] Metadata for this warning in key:value format. */
  var data: js.UndefOr[js.Array[Key]] = js.undefined
  /** [Output only] Optional human-readable details for this warning. */
  var message: js.UndefOr[String] = js.undefined
}

object Data {
  @scala.inline
  def apply(code: String = null, data: js.Array[Key] = null, message: String = null): Data = {
    val __obj = js.Dynamic.literal()
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data]
  }
}

