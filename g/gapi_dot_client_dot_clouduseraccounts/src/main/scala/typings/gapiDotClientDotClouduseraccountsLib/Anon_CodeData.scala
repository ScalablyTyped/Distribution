package typings
package gapiDotClientDotClouduseraccountsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CodeData extends js.Object {
  /** [Output Only] A warning code, if applicable. For example, Compute Engine returns NO_RESULTS_ON_PAGE if there are no results in the response. */
  var code: js.UndefOr[java.lang.String] = js.undefined
  /**
    * [Output Only] Metadata about this warning in key: value format. For example:
    * "data": [ { "key": "scope", "value": "zones/us-east1-d" }
    */
  var data: js.UndefOr[js.Array[Anon_Key]] = js.undefined
  /** [Output Only] A human-readable description of the warning code. */
  var message: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_CodeData {
  @scala.inline
  def apply(code: java.lang.String = null, data: js.Array[Anon_Key] = null, message: java.lang.String = null): Anon_CodeData = {
    val __obj = js.Dynamic.literal()
    if (code != null) __obj.updateDynamic("code")(code)
    if (data != null) __obj.updateDynamic("data")(data)
    if (message != null) __obj.updateDynamic("message")(message)
    __obj.asInstanceOf[Anon_CodeData]
  }
}

