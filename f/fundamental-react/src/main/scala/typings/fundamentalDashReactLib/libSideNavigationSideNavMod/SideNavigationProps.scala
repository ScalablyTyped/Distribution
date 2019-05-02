package typings
package fundamentalDashReactLib.libSideNavigationSideNavMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SideNavigationProps
  extends /* x */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var className: js.UndefOr[java.lang.String] = js.undefined
  /* Set to **true** to only render icons for each `SideNavListItem`. */
  var icons: js.UndefOr[scala.Boolean] = js.undefined
  /* Callback function when a navigation item is selected. Arguments passed are the event and the id of the selected item. */
  var onItemSelect: js.UndefOr[js.Function2[/* e */ js.Any, /* id */ js.Any, scala.Unit]] = js.undefined
  /* The `id` of the selected `SideNavListItem`. */
  var selectedId: js.UndefOr[java.lang.String] = js.undefined
}

object SideNavigationProps {
  @scala.inline
  def apply(
    StringDictionary: /* x */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    className: java.lang.String = null,
    icons: js.UndefOr[scala.Boolean] = js.undefined,
    onItemSelect: (/* e */ js.Any, /* id */ js.Any) => scala.Unit = null,
    selectedId: java.lang.String = null
  ): SideNavigationProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(icons)) __obj.updateDynamic("icons")(icons)
    if (onItemSelect != null) __obj.updateDynamic("onItemSelect")(js.Any.fromFunction2(onItemSelect))
    if (selectedId != null) __obj.updateDynamic("selectedId")(selectedId)
    __obj.asInstanceOf[SideNavigationProps]
  }
}

