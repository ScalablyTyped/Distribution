package typings.fundamentalDashReact.libInlineHelpInlineHelpMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InlineHelpProps
  extends /* x */ StringDictionary[js.Any] {
  var className: js.UndefOr[String] = js.undefined
  /* Location to display the inline help pop-up relative to the image. */
  var placement: InlineHelpPlacement
  /* Localized text to display in the inline help pop-up. */
  var text: String
}

object InlineHelpProps {
  @scala.inline
  def apply(
    placement: InlineHelpPlacement,
    text: String,
    StringDictionary: /* x */ StringDictionary[js.Any] = null,
    className: String = null
  ): InlineHelpProps = {
    val __obj = js.Dynamic.literal(placement = placement, text = text)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (className != null) __obj.updateDynamic("className")(className)
    __obj.asInstanceOf[InlineHelpProps]
  }
}

