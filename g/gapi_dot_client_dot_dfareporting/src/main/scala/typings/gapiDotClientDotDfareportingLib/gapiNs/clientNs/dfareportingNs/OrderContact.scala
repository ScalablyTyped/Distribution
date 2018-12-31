package typings
package gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrderContact extends js.Object {
  /**
    * Free-form information about this contact. It could be any information related to this contact in addition to type, title, name, and signature user
    * profile ID.
    */
  var contactInfo: js.UndefOr[java.lang.String] = js.undefined
  /** Name of this contact. */
  var contactName: js.UndefOr[java.lang.String] = js.undefined
  /** Title of this contact. */
  var contactTitle: js.UndefOr[java.lang.String] = js.undefined
  /** Type of this contact. */
  var contactType: js.UndefOr[java.lang.String] = js.undefined
  /** ID of the user profile containing the signature that will be embedded into order documents. */
  var signatureUserProfileId: js.UndefOr[java.lang.String] = js.undefined
}

