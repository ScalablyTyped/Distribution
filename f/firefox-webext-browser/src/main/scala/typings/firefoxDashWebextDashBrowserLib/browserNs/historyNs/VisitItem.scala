package typings
package firefoxDashWebextDashBrowserLib.browserNs.historyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An object encapsulating one visit to a URL. */
trait VisitItem extends js.Object {
  /** The unique identifier for the item. */
  var id: java.lang.String
  /** The visit ID of the referrer. */
  var referringVisitId: java.lang.String
  /** The transition type for this visit from its referrer. */
  var transition: TransitionType
  /** The unique identifier for this visit. */
  var visitId: java.lang.String
  /** When this visit occurred, represented in milliseconds since the epoch. */
  var visitTime: js.UndefOr[scala.Double] = js.undefined
}

object VisitItem {
  @scala.inline
  def apply(
    id: java.lang.String,
    referringVisitId: java.lang.String,
    transition: TransitionType,
    visitId: java.lang.String,
    visitTime: scala.Int | scala.Double = null
  ): VisitItem = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("referringVisitId")(referringVisitId)
    __obj.updateDynamic("transition")(transition)
    __obj.updateDynamic("visitId")(visitId)
    if (visitTime != null) __obj.updateDynamic("visitTime")(visitTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[VisitItem]
  }
}

