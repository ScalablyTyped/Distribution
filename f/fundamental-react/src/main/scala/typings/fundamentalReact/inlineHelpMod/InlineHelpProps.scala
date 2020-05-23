package typings.fundamentalReact.inlineHelpMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InlineHelpProps
  extends /* x */ StringDictionary[js.Any] {
  var className: js.UndefOr[String] = js.undefined
  var contentClassName: js.UndefOr[String] = js.undefined
  var disableStyles: js.UndefOr[Boolean] = js.undefined
  var placement: InlineHelpPlacement
}

object InlineHelpProps {
  @scala.inline
  def apply(
    placement: InlineHelpPlacement,
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    className: String = null,
    contentClassName: String = null,
    disableStyles: js.UndefOr[Boolean] = js.undefined
  ): InlineHelpProps = {
    val __obj = js.Dynamic.literal(placement = placement.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (contentClassName != null) __obj.updateDynamic("contentClassName")(contentClassName.asInstanceOf[js.Any])
    if (!js.isUndefined(disableStyles)) __obj.updateDynamic("disableStyles")(disableStyles.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[InlineHelpProps]
  }
}

