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

object Anon_TitleTransition {
  @scala.inline
  def apply(
    url: java.lang.String,
    title: java.lang.String = null,
    transition: firefoxDashWebextDashBrowserLib.browserNs.historyNs.TransitionType = null,
    visitTime: firefoxDashWebextDashBrowserLib.browserNs.extensionTypesNs.Date = null
  ): Anon_TitleTransition = {
    val __obj = js.Dynamic.literal(url = url)
    if (title != null) __obj.updateDynamic("title")(title)
    if (transition != null) __obj.updateDynamic("transition")(transition)
    if (visitTime != null) __obj.updateDynamic("visitTime")(visitTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_TitleTransition]
  }
}

