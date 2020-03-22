package typings.gapiClientClouduseraccounts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonData extends js.Object {
  /** [Output Only] A warning code, if applicable. For example, Compute Engine returns NO_RESULTS_ON_PAGE if there are no results in the response. */
  var code: js.UndefOr[String] = js.undefined
  /**
    * [Output Only] Metadata about this warning in key: value format. For example:
    * "data": [ { "key": "scope", "value": "zones/us-east1-d" }
    */
  var data: js.UndefOr[js.Array[AnonKey]] = js.undefined
  /** [Output Only] A human-readable description of the warning code. */
  var message: js.UndefOr[String] = js.undefined
}

object AnonData {
  @scala.inline
  def apply(code: String = null, data: js.Array[AnonKey] = null, message: String = null): AnonData = {
    val __obj = js.Dynamic.literal()
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonData]
  }
}

