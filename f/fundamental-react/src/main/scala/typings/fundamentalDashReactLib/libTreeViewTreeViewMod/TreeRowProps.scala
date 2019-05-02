package typings
package fundamentalDashReactLib.libTreeViewTreeViewMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreeRowProps
  extends /* x */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /* _INTERNAL USE ONLY._ */
  var isExpanded: js.UndefOr[scala.Boolean] = js.undefined
  /* _INTERNAL USE ONLY._ */
  var isParent: js.UndefOr[scala.Boolean] = js.undefined
  /* _INTERNAL USE ONLY._ */
  var onExpandClick: js.UndefOr[js.Function1[/* repeated */ js.Any, scala.Unit]] = js.undefined
  /* _INTERNAL USE ONLY._ */
  var rowId: js.UndefOr[java.lang.String] = js.undefined
}

object TreeRowProps {
  @scala.inline
  def apply(
    StringDictionary: /* x */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    isExpanded: js.UndefOr[scala.Boolean] = js.undefined,
    isParent: js.UndefOr[scala.Boolean] = js.undefined,
    onExpandClick: /* repeated */ js.Any => scala.Unit = null,
    rowId: java.lang.String = null
  ): TreeRowProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(isExpanded)) __obj.updateDynamic("isExpanded")(isExpanded)
    if (!js.isUndefined(isParent)) __obj.updateDynamic("isParent")(isParent)
    if (onExpandClick != null) __obj.updateDynamic("onExpandClick")(js.Any.fromFunction1(onExpandClick))
    if (rowId != null) __obj.updateDynamic("rowId")(rowId)
    __obj.asInstanceOf[TreeRowProps]
  }
}

