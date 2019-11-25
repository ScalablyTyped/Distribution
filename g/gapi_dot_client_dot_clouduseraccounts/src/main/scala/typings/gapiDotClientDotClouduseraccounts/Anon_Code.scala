package typings.gapiDotClientDotClouduseraccounts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Code extends js.Object {
  /** [Output Only] The error type identifier for this error. */
  var code: js.UndefOr[String] = js.undefined
  /** [Output Only] Indicates the field in the request that caused the error. This property is optional. */
  var location: js.UndefOr[String] = js.undefined
  /** [Output Only] An optional, human-readable error message. */
  var message: js.UndefOr[String] = js.undefined
}

object Anon_Code {
  @scala.inline
  def apply(code: String = null, location: String = null, message: String = null): Anon_Code = {
    val __obj = js.Dynamic.literal()
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Code]
  }
}

