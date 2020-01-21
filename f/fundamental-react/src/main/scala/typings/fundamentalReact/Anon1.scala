package typings.fundamentalReact

import org.scalablytyped.runtime.StringDictionary
import typings.fundamentalReact.fundamentalReactNumbers.`1`
import typings.fundamentalReact.fundamentalReactNumbers.`2`
import typings.fundamentalReact.fundamentalReactNumbers.`3`
import typings.fundamentalReact.fundamentalReactNumbers.`4`
import typings.fundamentalReact.fundamentalReactNumbers.`5`
import typings.fundamentalReact.fundamentalReactNumbers.`6`
import typings.react.mod.Ref
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon1 extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  /* Localized text for the description. */
  var description: js.UndefOr[String] = js.undefined
  /* Additional props to be spread to the description's `<p>` element. */
  var descriptionProps: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  /* Heading level. `<h1>` is reserved for the page title. */
  var headingLevel: js.UndefOr[`1` | `2` | `3` | `4` | `5` | `6`] = js.undefined
  var ref: js.UndefOr[Ref[HTMLDivElement]] = js.undefined
  var title: String
  var titleProps: js.UndefOr[StringDictionary[js.Any]] = js.undefined
}

object Anon1 {
  @scala.inline
  def apply(
    title: String,
    className: String = null,
    description: String = null,
    descriptionProps: StringDictionary[js.Any] = null,
    headingLevel: `1` | `2` | `3` | `4` | `5` | `6` = null,
    ref: Ref[HTMLDivElement] = null,
    titleProps: StringDictionary[js.Any] = null
  ): Anon1 = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (descriptionProps != null) __obj.updateDynamic("descriptionProps")(descriptionProps.asInstanceOf[js.Any])
    if (headingLevel != null) __obj.updateDynamic("headingLevel")(headingLevel.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (titleProps != null) __obj.updateDynamic("titleProps")(titleProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon1]
  }
}

