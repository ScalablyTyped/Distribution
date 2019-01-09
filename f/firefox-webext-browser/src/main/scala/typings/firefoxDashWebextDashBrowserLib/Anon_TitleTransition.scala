package typings
package firefoxDashWebextDashBrowserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_TitleTransition extends js.Object {
  /** The title of the page. */
  var title: js.UndefOr[java.lang.String] = js.undefined
  /** The transition type for this visit from its referrer. */
  var transition: js.UndefOr[firefoxDashWebextDashBrowserLib.browserNs.historyNs.TransitionType] = js.undefined
  /** The URL to add. Must be a valid URL that can be added to history. */
  var url: java.lang.String
  /** The date when this visit occurred. */
  var visitTime: js.UndefOr[firefoxDashWebextDashBrowserLib.browserNs.extensionTypesNs.Date] = js.undefined
}

