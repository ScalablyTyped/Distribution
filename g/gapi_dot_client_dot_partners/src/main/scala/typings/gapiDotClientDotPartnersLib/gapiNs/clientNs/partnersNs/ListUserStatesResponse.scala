package typings
package gapiDotClientDotPartnersLib.gapiNs.clientNs.partnersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListUserStatesResponse extends js.Object {
  /** Current response metadata. */
  var responseMetadata: js.UndefOr[ResponseMetadata] = js.undefined
  /** User's states. */
  var userStates: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object ListUserStatesResponse {
  @scala.inline
  def apply(responseMetadata: ResponseMetadata = null, userStates: js.Array[java.lang.String] = null): ListUserStatesResponse = {
    val __obj = js.Dynamic.literal()
    if (responseMetadata != null) __obj.updateDynamic("responseMetadata")(responseMetadata)
    if (userStates != null) __obj.updateDynamic("userStates")(userStates)
    __obj.asInstanceOf[ListUserStatesResponse]
  }
}

