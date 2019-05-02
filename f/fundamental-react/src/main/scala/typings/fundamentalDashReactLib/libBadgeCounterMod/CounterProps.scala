package typings
package fundamentalDashReactLib.libBadgeCounterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CounterProps
  extends /* x */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var localizedText: js.UndefOr[fundamentalDashReactLib.Anon_CounterLabel] = js.undefined
  /* Set to **true** to enable counter with notification. */
  var notification: js.UndefOr[scala.Boolean] = js.undefined
}

object CounterProps {
  @scala.inline
  def apply(
    StringDictionary: /* x */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    className: java.lang.String = null,
    localizedText: fundamentalDashReactLib.Anon_CounterLabel = null,
    notification: js.UndefOr[scala.Boolean] = js.undefined
  ): CounterProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (className != null) __obj.updateDynamic("className")(className)
    if (localizedText != null) __obj.updateDynamic("localizedText")(localizedText)
    if (!js.isUndefined(notification)) __obj.updateDynamic("notification")(notification)
    __obj.asInstanceOf[CounterProps]
  }
}

