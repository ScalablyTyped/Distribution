package typings.fundamentalDashReact.libTreeViewTreeViewMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreeItemProps
  extends /* x */ StringDictionary[js.Any] {
  /* _INTERNAL USE ONLY._ */
  var expandData: js.UndefOr[StringDictionary[Boolean]] = js.undefined
  /* Set to *true* for expanded tree item. This variable is handled internally, but can be overridden by the consumer through this prop. */
  var isExpanded: js.UndefOr[Boolean] = js.undefined
  /* _INTERNAL USE ONLY._ */
  var level: js.UndefOr[Double] = js.undefined
  /* _INTERNAL USE ONLY._ */
  var onExpandClick: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.undefined
  /* ID used to track the expanded/collapsed state of the row. This variable is handled internally, but can be overridden by the consumer through this prop. */
  var rowId: js.UndefOr[String] = js.undefined
}

object TreeItemProps {
  @scala.inline
  def apply(
    StringDictionary: /* x */ StringDictionary[js.Any] = null,
    expandData: StringDictionary[Boolean] = null,
    isExpanded: js.UndefOr[Boolean] = js.undefined,
    level: Int | Double = null,
    onExpandClick: /* repeated */ js.Any => Unit = null,
    rowId: String = null
  ): TreeItemProps = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (expandData != null) __obj.updateDynamic("expandData")(expandData.asInstanceOf[js.Any])
    if (!js.isUndefined(isExpanded)) __obj.updateDynamic("isExpanded")(isExpanded.asInstanceOf[js.Any])
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (onExpandClick != null) __obj.updateDynamic("onExpandClick")(js.Any.fromFunction1(onExpandClick))
    if (rowId != null) __obj.updateDynamic("rowId")(rowId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeItemProps]
  }
}

