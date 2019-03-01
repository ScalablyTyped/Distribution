package typings
package gapiDotClientDotServiceuserLib.gapiNs.clientNs.serviceuserNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Step extends js.Object {
  /** The short description of the step. */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /** The status code. */
  var status: js.UndefOr[java.lang.String] = js.undefined
}

object Step {
  @scala.inline
  def apply(description: java.lang.String = null, status: java.lang.String = null): Step = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description)
    if (status != null) __obj.updateDynamic("status")(status)
    __obj.asInstanceOf[Step]
  }
}

