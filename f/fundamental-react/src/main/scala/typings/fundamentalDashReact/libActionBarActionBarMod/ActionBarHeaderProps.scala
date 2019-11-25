package typings.fundamentalDashReact.libActionBarActionBarMod

import org.scalablytyped.runtime.StringDictionary
import typings.fundamentalDashReact.fundamentalDashReactNumbers.`1`
import typings.fundamentalDashReact.fundamentalDashReactNumbers.`2`
import typings.fundamentalDashReact.fundamentalDashReactNumbers.`3`
import typings.fundamentalDashReact.fundamentalDashReactNumbers.`4`
import typings.fundamentalDashReact.fundamentalDashReactNumbers.`5`
import typings.fundamentalDashReact.fundamentalDashReactNumbers.`6`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionBarHeaderProps
  extends /* x */ StringDictionary[js.Any] {
  var className: js.UndefOr[String] = js.undefined
  /* Localized text for the description. */
  var description: js.UndefOr[String] = js.undefined
  /* Additional props to be spread to the description's `<p>` element. */
  var descriptionProps: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  /* Heading level. `<h1>` is reserved for the page title. */
  var headingLevel: js.UndefOr[`1` | `2` | `3` | `4` | `5` | `6`] = js.undefined
  var title: String
  var titleProps: js.UndefOr[StringDictionary[js.Any]] = js.undefined
}

object ActionBarHeaderProps {
  @scala.inline
  def apply(
    title: String,
    StringDictionary: /* x */ StringDictionary[js.Any] = null,
    className: String = null,
    description: String = null,
    descriptionProps: StringDictionary[js.Any] = null,
    headingLevel: `1` | `2` | `3` | `4` | `5` | `6` = null,
    titleProps: StringDictionary[js.Any] = null
  ): ActionBarHeaderProps = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (descriptionProps != null) __obj.updateDynamic("descriptionProps")(descriptionProps.asInstanceOf[js.Any])
    if (headingLevel != null) __obj.updateDynamic("headingLevel")(headingLevel.asInstanceOf[js.Any])
    if (titleProps != null) __obj.updateDynamic("titleProps")(titleProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionBarHeaderProps]
  }
}

