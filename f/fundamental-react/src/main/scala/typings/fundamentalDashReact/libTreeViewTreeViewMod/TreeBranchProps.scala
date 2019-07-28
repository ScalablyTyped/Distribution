package typings.fundamentalDashReact.libTreeViewTreeViewMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreeBranchProps
  extends /* x */ StringDictionary[js.Any] {
  /* _INTERNAL USE ONLY._ */
  var expandData: js.UndefOr[StringDictionary[Boolean]] = js.undefined
  /* _INTERNAL USE ONLY._ */
  var isExpanded: js.UndefOr[Boolean] = js.undefined
  /* _INTERNAL USE ONLY._ */
  var level: js.UndefOr[Double] = js.undefined
  /* _INTERNAL USE ONLY._ */
  var onExpandClick: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.undefined
}

object TreeBranchProps {
  @scala.inline
  def apply(
    StringDictionary: /* x */ StringDictionary[js.Any] = null,
    expandData: StringDictionary[Boolean] = null,
    isExpanded: js.UndefOr[Boolean] = js.undefined,
    level: Int | Double = null,
    onExpandClick: /* repeated */ js.Any => Unit = null
  ): TreeBranchProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (expandData != null) __obj.updateDynamic("expandData")(expandData)
    if (!js.isUndefined(isExpanded)) __obj.updateDynamic("isExpanded")(isExpanded)
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (onExpandClick != null) __obj.updateDynamic("onExpandClick")(js.Any.fromFunction1(onExpandClick))
    __obj.asInstanceOf[TreeBranchProps]
  }
}

