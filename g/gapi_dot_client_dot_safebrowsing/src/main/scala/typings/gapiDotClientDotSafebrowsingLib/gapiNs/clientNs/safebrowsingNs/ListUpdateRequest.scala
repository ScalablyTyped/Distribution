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

