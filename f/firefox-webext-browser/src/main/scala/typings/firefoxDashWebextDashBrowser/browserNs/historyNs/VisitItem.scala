package typings.firefoxDashWebextDashBrowser.browserNs.historyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An object encapsulating one visit to a URL. */
trait VisitItem extends js.Object {
  /** The unique identifier for the item. */
  var id: String
  /** The visit ID of the referrer. */
  var referringVisitId: String
  /** The transition type for this visit from its referrer. */
  var transition: TransitionType
  /** The unique identifier for this visit. */
  var visitId: String
  /** When this visit occurred, represented in milliseconds since the epoch. */
  var visitTime: js.UndefOr[Double] = js.undefined
}

object VisitItem {
  @scala.inline
  def apply(
    id: String,
    referringVisitId: String,
    transition: TransitionType,
    visitId: String,
    visitTime: Int | Double = null
  ): VisitItem = {
    val __obj = js.Dynamic.literal(id = id, referringVisitId = referringVisitId, transition = transition, visitId = visitId)
    if (visitTime != null) __obj.updateDynamic("visitTime")(visitTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[VisitItem]
  }
}

