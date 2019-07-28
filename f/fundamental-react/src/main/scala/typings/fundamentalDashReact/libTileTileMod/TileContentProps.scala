package typings.fundamentalDashReact.libTileTileMod

import org.scalablytyped.runtime.StringDictionary
import typings.fundamentalDashReact.fundamentalDashReactNumbers.`2`
import typings.fundamentalDashReact.fundamentalDashReactNumbers.`3`
import typings.fundamentalDashReact.fundamentalDashReactNumbers.`4`
import typings.fundamentalDashReact.fundamentalDashReactNumbers.`5`
import typings.fundamentalDashReact.fundamentalDashReactNumbers.`6`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TileContentProps
  extends /* x */ StringDictionary[js.Any] {
  var className: js.UndefOr[String] = js.undefined
  var headingLevel: js.UndefOr[`2` | `3` | `4` | `5` | `6`] = js.undefined
  var title: String
  var titleProps: js.UndefOr[StringDictionary[js.Any]] = js.undefined
}

object TileContentProps {
  @scala.inline
  def apply(
    title: String,
    StringDictionary: /* x */ StringDictionary[js.Any] = null,
    className: String = null,
    headingLevel: `2` | `3` | `4` | `5` | `6` = null,
    titleProps: StringDictionary[js.Any] = null
  ): TileContentProps = {
    val __obj = js.Dynamic.literal(title = title)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (className != null) __obj.updateDynamic("className")(className)
    if (headingLevel != null) __obj.updateDynamic("headingLevel")(headingLevel.asInstanceOf[js.Any])
    if (titleProps != null) __obj.updateDynamic("titleProps")(titleProps)
    __obj.asInstanceOf[TileContentProps]
  }
}

