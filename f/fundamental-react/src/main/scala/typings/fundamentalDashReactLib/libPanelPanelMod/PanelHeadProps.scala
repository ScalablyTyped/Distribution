package typings
package fundamentalDashReactLib.libPanelPanelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PanelHeadProps
  extends /* x */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var className: js.UndefOr[java.lang.String] = js.undefined
  /* Localized text for the description of the panel. */
  var description: js.UndefOr[java.lang.String] = js.undefined
  var headingLevel: js.UndefOr[
    fundamentalDashReactLib.fundamentalDashReactLibNumbers.`2` | fundamentalDashReactLib.fundamentalDashReactLibNumbers.`3` | fundamentalDashReactLib.fundamentalDashReactLibNumbers.`4` | fundamentalDashReactLib.fundamentalDashReactLibNumbers.`5` | fundamentalDashReactLib.fundamentalDashReactLibNumbers.`6`
  ] = js.undefined
  /* Localized text for the title of the panel. */
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object PanelHeadProps {
  @scala.inline
  def apply(
    StringDictionary: /* x */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    className: java.lang.String = null,
    description: java.lang.String = null,
    headingLevel: fundamentalDashReactLib.fundamentalDashReactLibNumbers.`2` | fundamentalDashReactLib.fundamentalDashReactLibNumbers.`3` | fundamentalDashReactLib.fundamentalDashReactLibNumbers.`4` | fundamentalDashReactLib.fundamentalDashReactLibNumbers.`5` | fundamentalDashReactLib.fundamentalDashReactLibNumbers.`6` = null,
    title: java.lang.String = null
  ): PanelHeadProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (className != null) __obj.updateDynamic("className")(className)
    if (description != null) __obj.updateDynamic("description")(description)
    if (headingLevel != null) __obj.updateDynamic("headingLevel")(headingLevel.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[PanelHeadProps]
  }
}

