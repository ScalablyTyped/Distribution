package typings.fundamentalDashReact.libTileProductTileMod

import org.scalablytyped.runtime.StringDictionary
import typings.fundamentalDashReact.fundamentalDashReactNumbers.`2`
import typings.fundamentalDashReact.fundamentalDashReactNumbers.`3`
import typings.fundamentalDashReact.fundamentalDashReactNumbers.`4`
import typings.fundamentalDashReact.fundamentalDashReactNumbers.`5`
import typings.fundamentalDashReact.fundamentalDashReactNumbers.`6`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProductTileContentProps
  extends /* x */ StringDictionary[js.Any] {
  var className: js.UndefOr[String] = js.undefined
  var headingLevel: js.UndefOr[`2` | `3` | `4` | `5` | `6`] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var titleProps: js.UndefOr[StringDictionary[js.Any]] = js.undefined
}

object ProductTileContentProps {
  @scala.inline
  def apply(
    StringDictionary: /* x */ StringDictionary[js.Any] = null,
    className: String = null,
    headingLevel: `2` | `3` | `4` | `5` | `6` = null,
    title: String = null,
    titleProps: StringDictionary[js.Any] = null
  ): ProductTileContentProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (className != null) __obj.updateDynamic("className")(className)
    if (headingLevel != null) __obj.updateDynamic("headingLevel")(headingLevel.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title)
    if (titleProps != null) __obj.updateDynamic("titleProps")(titleProps)
    __obj.asInstanceOf[ProductTileContentProps]
  }
}

