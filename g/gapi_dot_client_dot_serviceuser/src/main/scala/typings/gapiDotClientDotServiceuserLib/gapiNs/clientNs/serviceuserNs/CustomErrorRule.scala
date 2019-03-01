package typings
package gapiDotClientDotServiceuserLib.gapiNs.clientNs.serviceuserNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomErrorRule extends js.Object {
  /**
    * Mark this message as possible payload in error response.  Otherwise,
    * objects of this type will be filtered when they appear in error payload.
    */
  var isErrorType: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Selects messages to which this rule applies.
    *
    * Refer to selector for syntax details.
    */
  var selector: js.UndefOr[java.lang.String] = js.undefined
}

object CustomErrorRule {
  @scala.inline
  def apply(isErrorType: js.UndefOr[scala.Boolean] = js.undefined, selector: java.lang.String = null): CustomErrorRule = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(isErrorType)) __obj.updateDynamic("isErrorType")(isErrorType)
    if (selector != null) __obj.updateDynamic("selector")(selector)
    __obj.asInstanceOf[CustomErrorRule]
  }
}

