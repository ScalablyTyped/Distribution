package typings.gapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import typings.gapiClientAdexchangebuyer.anon.ArcStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreativeDealIds extends js.Object {
  /** A list of external deal ids and ARC approval status. */
  var dealStatuses: js.UndefOr[js.Array[ArcStatus]] = js.undefined
  /** Resource type. */
  var kind: js.UndefOr[String] = js.undefined
}

object CreativeDealIds {
  @scala.inline
  def apply(dealStatuses: js.Array[ArcStatus] = null, kind: String = null): CreativeDealIds = {
    val __obj = js.Dynamic.literal()
    if (dealStatuses != null) __obj.updateDynamic("dealStatuses")(dealStatuses.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreativeDealIds]
  }
}

