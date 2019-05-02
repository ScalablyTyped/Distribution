package typings
package fundamentalDashReactLib.libInlineHelpInlineHelpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InlineHelpProps
  extends /* x */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var className: js.UndefOr[java.lang.String] = js.undefined
  /* Location to display the inline help pop-up relative to the image. */
  var placement: InlineHelpPlacement
  /* Localized text to display in the inline help pop-up. */
  var text: java.lang.String
}

object InlineHelpProps {
  @scala.inline
  def apply(
    placement: InlineHelpPlacement,
    text: java.lang.String,
    StringDictionary: /* x */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    className: java.lang.String = null
  ): InlineHelpProps = {
    val __obj = js.Dynamic.literal(placement = placement, text = text)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (className != null) __obj.updateDynamic("className")(className)
    __obj.asInstanceOf[InlineHelpProps]
  }
}

