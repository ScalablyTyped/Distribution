package typings
package gapiDotClientDotAdexchangebuyerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Anon_DisapprovalReasons extends js.Object {
  /** All known contexts/restrictions. */
  var contexts: js.UndefOr[js.Array[Anon_Platform]] = js.undefined
  /**
                   * The reasons for disapproval within this restriction, if any. Note that not all disapproval reasons may be categorized, so it is possible for the
                   * creative to have a status of DISAPPROVED or CONDITIONALLY_APPROVED with an empty list for disapproval_reasons. In this case, please reach out to your
                   * TAM to help debug the issue.
                   */
  var disapprovalReasons: js.UndefOr[js.Array[Anon_Details]] = js.undefined
  /** Why the creative is ineligible to serve in this context (e.g., it has been explicitly disapproved or is pending review). */
  var reason: js.UndefOr[java.lang.String] = js.undefined
}

