package typings.gapiClientAdexchangebuyer.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DisapprovalReasons extends js.Object {
  /** All known contexts/restrictions. */
  var contexts: js.UndefOr[js.Array[AuctionType]] = js.undefined
  /**
    * The reasons for disapproval within this restriction, if any. Note that not all disapproval reasons may be categorized, so it is possible for the
    * creative to have a status of DISAPPROVED or CONDITIONALLY_APPROVED with an empty list for disapproval_reasons. In this case, please reach out to your
    * TAM to help debug the issue.
    */
  var disapprovalReasons: js.UndefOr[js.Array[Details]] = js.undefined
  /** Why the creative is ineligible to serve in this context (e.g., it has been explicitly disapproved or is pending review). */
  var reason: js.UndefOr[String] = js.undefined
}

object DisapprovalReasons {
  @scala.inline
  def apply(
    contexts: js.Array[AuctionType] = null,
    disapprovalReasons: js.Array[Details] = null,
    reason: String = null
  ): DisapprovalReasons = {
    val __obj = js.Dynamic.literal()
    if (contexts != null) __obj.updateDynamic("contexts")(contexts.asInstanceOf[js.Any])
    if (disapprovalReasons != null) __obj.updateDynamic("disapprovalReasons")(disapprovalReasons.asInstanceOf[js.Any])
    if (reason != null) __obj.updateDynamic("reason")(reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisapprovalReasons]
  }
}

