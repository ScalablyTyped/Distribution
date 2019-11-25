package typings.fundamentalDashReact.libBadgeCounterMod

import org.scalablytyped.runtime.StringDictionary
import typings.fundamentalDashReact.Anon_CounterLabel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CounterProps
  extends /* x */ StringDictionary[js.Any] {
  var className: js.UndefOr[String] = js.undefined
  var localizedText: js.UndefOr[Anon_CounterLabel] = js.undefined
  /* Set to **true** to enable counter with notification. */
  var notification: js.UndefOr[Boolean] = js.undefined
}

object CounterProps {
  @scala.inline
  def apply(
    StringDictionary: /* x */ StringDictionary[js.Any] = null,
    className: String = null,
    localizedText: Anon_CounterLabel = null,
    notification: js.UndefOr[Boolean] = js.undefined
  ): CounterProps = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (localizedText != null) __obj.updateDynamic("localizedText")(localizedText.asInstanceOf[js.Any])
    if (!js.isUndefined(notification)) __obj.updateDynamic("notification")(notification.asInstanceOf[js.Any])
    __obj.asInstanceOf[CounterProps]
  }
}

