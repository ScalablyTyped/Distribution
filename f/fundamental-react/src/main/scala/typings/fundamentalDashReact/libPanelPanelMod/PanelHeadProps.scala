package typings.fundamentalDashReact.libPanelPanelMod

import org.scalablytyped.runtime.StringDictionary
import typings.fundamentalDashReact.fundamentalDashReactNumbers.`2`
import typings.fundamentalDashReact.fundamentalDashReactNumbers.`3`
import typings.fundamentalDashReact.fundamentalDashReactNumbers.`4`
import typings.fundamentalDashReact.fundamentalDashReactNumbers.`5`
import typings.fundamentalDashReact.fundamentalDashReactNumbers.`6`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PanelHeadProps
  extends /* x */ StringDictionary[js.Any] {
  var className: js.UndefOr[String] = js.undefined
  /* Localized text for the description of the panel. */
  var description: js.UndefOr[String] = js.undefined
  var headingLevel: js.UndefOr[`2` | `3` | `4` | `5` | `6`] = js.undefined
  /* Localized text for the title of the panel. */
  var title: js.UndefOr[String] = js.undefined
}

object PanelHeadProps {
  @scala.inline
  def apply(
    StringDictionary: /* x */ StringDictionary[js.Any] = null,
    className: String = null,
    description: String = null,
    headingLevel: `2` | `3` | `4` | `5` | `6` = null,
    title: String = null
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

