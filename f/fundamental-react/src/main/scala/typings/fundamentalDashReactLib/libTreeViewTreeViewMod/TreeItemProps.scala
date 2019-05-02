package typings
package fundamentalDashReactLib.libTreeViewTreeViewMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreeItemProps
  extends /* x */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /* _INTERNAL USE ONLY._ */
  var expandData: js.UndefOr[org.scalablytyped.runtime.StringDictionary[scala.Boolean]] = js.undefined
  /* Set to *true* for expanded tree item. This variable is handled internally, but can be overridden by the consumer through this prop. */
  var isExpanded: js.UndefOr[scala.Boolean] = js.undefined
  /* _INTERNAL USE ONLY._ */
  var level: js.UndefOr[scala.Double] = js.undefined
  /* _INTERNAL USE ONLY._ */
  var onExpandClick: js.UndefOr[js.Function1[/* repeated */ js.Any, scala.Unit]] = js.undefined
  /* ID used to track the expanded/collapsed state of the row. This variable is handled internally, but can be overridden by the consumer through this prop. */
  var rowId: js.UndefOr[java.lang.String] = js.undefined
}

object TreeItemProps {
  @scala.inline
  def apply(
    StringDictionary: /* x */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    expandData: org.scalablytyped.runtime.StringDictionary[scala.Boolean] = null,
    isExpanded: js.UndefOr[scala.Boolean] = js.undefined,
    level: scala.Int | scala.Double = null,
    onExpandClick: /* repeated */ js.Any => scala.Unit = null,
    rowId: java.lang.String = null
  ): TreeItemProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (expandData != null) __obj.updateDynamic("expandData")(expandData)
    if (!js.isUndefined(isExpanded)) __obj.updateDynamic("isExpanded")(isExpanded)
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (onExpandClick != null) __obj.updateDynamic("onExpandClick")(js.Any.fromFunction1(onExpandClick))
    if (rowId != null) __obj.updateDynamic("rowId")(rowId)
    __obj.asInstanceOf[TreeItemProps]
  }
}

