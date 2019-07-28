package typings.fundamentalDashReact.libTreeViewTreeViewMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreeHeadProps
  extends /* x */ StringDictionary[js.Any] {
  /* Additional props to be spread to the header expand/collapse `<button>` element. */
  var buttonProps: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  /* _INTERNAL USE ONLY._ */
  var isExpanded: js.UndefOr[Boolean] = js.undefined
  /* _INTERNAL USE ONLY._ */
  var onExpandAll: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.undefined
}

object TreeHeadProps {
  @scala.inline
  def apply(
    StringDictionary: /* x */ StringDictionary[js.Any] = null,
    buttonProps: StringDictionary[js.Any] = null,
    className: String = null,
    isExpanded: js.UndefOr[Boolean] = js.undefined,
    onExpandAll: /* repeated */ js.Any => Unit = null
  ): TreeHeadProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (buttonProps != null) __obj.updateDynamic("buttonProps")(buttonProps)
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(isExpanded)) __obj.updateDynamic("isExpanded")(isExpanded)
    if (onExpandAll != null) __obj.updateDynamic("onExpandAll")(js.Any.fromFunction1(onExpandAll))
    __obj.asInstanceOf[TreeHeadProps]
  }
}

