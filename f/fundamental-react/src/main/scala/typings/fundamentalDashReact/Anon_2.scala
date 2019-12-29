package typings.fundamentalDashReact

import org.scalablytyped.runtime.StringDictionary
import typings.fundamentalDashReact.fundamentalDashReactNumbers.`2`
import typings.fundamentalDashReact.fundamentalDashReactNumbers.`3`
import typings.fundamentalDashReact.fundamentalDashReactNumbers.`4`
import typings.fundamentalDashReact.fundamentalDashReactNumbers.`5`
import typings.fundamentalDashReact.fundamentalDashReactNumbers.`6`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_2 extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var headingLevel: js.UndefOr[`2` | `3` | `4` | `5` | `6`] = js.undefined
  var title: String
  var titleProps: js.UndefOr[StringDictionary[js.Any]] = js.undefined
}

object Anon_2 {
  @scala.inline
  def apply(
    title: String,
    className: String = null,
    headingLevel: `2` | `3` | `4` | `5` | `6` = null,
    titleProps: StringDictionary[js.Any] = null
  ): Anon_2 = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (headingLevel != null) __obj.updateDynamic("headingLevel")(headingLevel.asInstanceOf[js.Any])
    if (titleProps != null) __obj.updateDynamic("titleProps")(titleProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_2]
  }
}

