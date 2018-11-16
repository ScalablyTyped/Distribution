package typings
package firefoxDashWebextDashBrowserLib.browserNs.historyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An object encapsulating one result of a history query. */

trait HistoryItem extends js.Object {
  /** The unique identifier for the item. */
  var id: java.lang.String
  /** When this page was last loaded, represented in milliseconds since the epoch. */
  var lastVisitTime: js.UndefOr[scala.Double] = js.undefined
  /** The title of the page when it was last loaded. */
  var title: js.UndefOr[java.lang.String] = js.undefined
  /** The number of times the user has navigated to this page by typing in the address. */
  var typedCount: js.UndefOr[scala.Double] = js.undefined
  /** The URL navigated to by a user. */
  var url: js.UndefOr[java.lang.String] = js.undefined
  /** The number of times the user has navigated to this page. */
  var visitCount: js.UndefOr[scala.Double] = js.undefined
}

