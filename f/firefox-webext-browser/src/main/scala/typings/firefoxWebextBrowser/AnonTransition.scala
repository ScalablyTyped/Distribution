package typings.firefoxWebextBrowser

import typings.firefoxWebextBrowser.browser.extensionTypes.Date
import typings.firefoxWebextBrowser.browser.history.TransitionType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTransition extends js.Object {
  /** The title of the page. */
  var title: js.UndefOr[String] = js.undefined
  /** The transition type for this visit from its referrer. */
  var transition: js.UndefOr[TransitionType] = js.undefined
  /** The URL to add. Must be a valid URL that can be added to history. */
  var url: String
  /** The date when this visit occurred. */
  var visitTime: js.UndefOr[Date] = js.undefined
}

object AnonTransition {
  @scala.inline
  def apply(url: String, title: String = null, transition: TransitionType = null, visitTime: Date = null): AnonTransition = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (transition != null) __obj.updateDynamic("transition")(transition.asInstanceOf[js.Any])
    if (visitTime != null) __obj.updateDynamic("visitTime")(visitTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTransition]
  }
}

