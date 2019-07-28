package typings.gapiDotClientDotResourceviews

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CodeData extends js.Object {
  /** [Output only] The warning type identifier for this warning. */
  var code: js.UndefOr[String] = js.undefined
  /** [Output only] Metadata for this warning in key:value format. */
  var data: js.UndefOr[js.Array[Anon_Key]] = js.undefined
  /** [Output only] Optional human-readable details for this warning. */
  var message: js.UndefOr[String] = js.undefined
}

object Anon_CodeData {
  @scala.inline
  def apply(code: String = null, data: js.Array[Anon_Key] = null, message: String = null): Anon_CodeData = {
    val __obj = js.Dynamic.literal()
    if (code != null) __obj.updateDynamic("code")(code)
    if (data != null) __obj.updateDynamic("data")(data)
    if (message != null) __obj.updateDynamic("message")(message)
    __obj.asInstanceOf[Anon_CodeData]
  }
}

