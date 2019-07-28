package typings.firefoxDashWebextDashBrowser

import typings.firefoxDashWebextDashBrowser.browserNs.extensionTypesNs.Date
import typings.firefoxDashWebextDashBrowser.browserNs.historyNs.TransitionType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_TitleTransition extends js.Object {
  /** The title of the page. */
  var title: js.UndefOr[String] = js.undefined
  /** The transition type for this visit from its referrer. */
  var transition: js.UndefOr[TransitionType] = js.undefined
  /** The URL to add. Must be a valid URL that can be added to history. */
  var url: String
  /** The date when this visit occurred. */
  var visitTime: js.UndefOr[Date] = js.undefined
}

object Anon_TitleTransition {
  @scala.inline
  def apply(url: String, title: String = null, transition: TransitionType = null, visitTime: Date = null): Anon_TitleTransition = {
    val __obj = js.Dynamic.literal(url = url)
    if (title != null) __obj.updateDynamic("title")(title)
    if (transition != null) __obj.updateDynamic("transition")(transition)
    if (visitTime != null) __obj.updateDynamic("visitTime")(visitTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_TitleTransition]
  }
}

