package typings
package gapiDotClientDotSafebrowsingLib.gapiNs.clientNs.safebrowsingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListUpdateRequest extends js.Object {
  /** The constraints associated with this request. */
  var constraints: js.UndefOr[Constraints] = js.undefined
  /** The type of platform at risk by entries present in the list. */
  var platformType: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The current state of the client for the requested list (the encrypted
    * client state that was received from the last successful list update).
    */
  var state: js.UndefOr[java.lang.String] = js.undefined
  /** The types of entries present in the list. */
  var threatEntryType: js.UndefOr[java.lang.String] = js.undefined
  /** The type of threat posed by entries present in the list. */
  var threatType: js.UndefOr[java.lang.String] = js.undefined
}

object ListUpdateRequest {
  @scala.inline
  def apply(
    constraints: Constraints = null,
    platformType: java.lang.String = null,
    state: java.lang.String = null,
    threatEntryType: java.lang.String = null,
    threatType: java.lang.String = null
  ): ListUpdateRequest = {
    val __obj = js.Dynamic.literal()
    if (constraints != null) __obj.updateDynamic("constraints")(constraints)
    if (platformType != null) __obj.updateDynamic("platformType")(platformType)
    if (state != null) __obj.updateDynamic("state")(state)
    if (threatEntryType != null) __obj.updateDynamic("threatEntryType")(threatEntryType)
    if (threatType != null) __obj.updateDynamic("threatType")(threatType)
    __obj.asInstanceOf[ListUpdateRequest]
  }
}

