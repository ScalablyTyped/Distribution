package typings
package fundamentalDashReactLib.libTreeViewTreeViewMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreeViewProps
  extends /* x */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /* Object with rowId keys and boolean values representing whether that row is expanded. This variable is handled internally, but can be overridden by the consumer through this prop. */
  var expandData: js.UndefOr[org.scalablytyped.runtime.StringDictionary[scala.Boolean]] = js.undefined
  /* Set to *true* for an expanded tree. This variable is handled internally, but can be overridden by the consumer through this prop */
  var isExpandAll: js.UndefOr[scala.Boolean] = js.undefined
  /* Callback that is called whenever the internal expand/collapse state changes. The argument is an an object with rowId keys and boolean values representing whether that row is expanded. */
  var onExpandChange: js.UndefOr[
    js.Function1[
      /* expandData */ org.scalablytyped.runtime.StringDictionary[scala.Boolean], 
      scala.Unit
    ]
  ] = js.undefined
}

object TreeViewProps {
  @scala.inline
  def apply(
    StringDictionary: /* x */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    expandData: org.scalablytyped.runtime.StringDictionary[scala.Boolean] = null,
    isExpandAll: js.UndefOr[scala.Boolean] = js.undefined,
    onExpandChange: /* expandData */ org.scalablytyped.runtime.StringDictionary[scala.Boolean] => scala.Unit = null
  ): TreeViewProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (expandData != null) __obj.updateDynamic("expandData")(expandData)
    if (!js.isUndefined(isExpandAll)) __obj.updateDynamic("isExpandAll")(isExpandAll)
    if (onExpandChange != null) __obj.updateDynamic("onExpandChange")(js.Any.fromFunction1(onExpandChange))
    __obj.asInstanceOf[TreeViewProps]
  }
}

