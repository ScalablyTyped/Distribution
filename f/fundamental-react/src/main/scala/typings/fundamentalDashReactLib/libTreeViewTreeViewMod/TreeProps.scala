package typings
package fundamentalDashReactLib.libTreeViewTreeViewMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreeProps
  extends /* x */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /* _INTERNAL USE ONLY._ */
  var expandData: js.UndefOr[org.scalablytyped.runtime.StringDictionary[scala.Boolean]] = js.undefined
  /* _INTERNAL USE ONLY._ */
  var isExpanded: js.UndefOr[scala.Boolean] = js.undefined
  /* _INTERNAL USE ONLY._ */
  var onExpandClick: js.UndefOr[js.Function1[/* repeated */ js.Any, scala.Unit]] = js.undefined
}

object TreeProps {
  @scala.inline
  def apply(
    StringDictionary: /* x */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    expandData: org.scalablytyped.runtime.StringDictionary[scala.Boolean] = null,
    isExpanded: js.UndefOr[scala.Boolean] = js.undefined,
    onExpandClick: /* repeated */ js.Any => scala.Unit = null
  ): TreeProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (expandData != null) __obj.updateDynamic("expandData")(expandData)
    if (!js.isUndefined(isExpanded)) __obj.updateDynamic("isExpanded")(isExpanded)
    if (onExpandClick != null) __obj.updateDynamic("onExpandClick")(js.Any.fromFunction1(onExpandClick))
    __obj.asInstanceOf[TreeProps]
  }
}

