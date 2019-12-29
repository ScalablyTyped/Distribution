package typings.fundamentalDashReact.libSideNavigationSideNavMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SideNavProps
  extends /* x */ StringDictionary[js.Any] {
  var className: js.UndefOr[String] = js.undefined
  var customStyles: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var disableStyles: js.UndefOr[Boolean] = js.undefined
  /* Set to **true** to only render icons for each `SideNavListItem`. */
  var icons: js.UndefOr[Boolean] = js.undefined
  /* Callback function when a navigation item is selected. Arguments passed are the event and the id of the selected item. */
  var onItemSelect: js.UndefOr[js.Function2[/* e */ js.Any, /* id */ js.Any, Unit]] = js.undefined
  /* The `id` of the selected `SideNavListItem`. */
  var selectedId: js.UndefOr[String] = js.undefined
}

object SideNavProps {
  @scala.inline
  def apply(
    StringDictionary: /* x */ StringDictionary[js.Any] = null,
    className: String = null,
    customStyles: StringDictionary[js.Any] = null,
    disableStyles: js.UndefOr[Boolean] = js.undefined,
    icons: js.UndefOr[Boolean] = js.undefined,
    onItemSelect: (/* e */ js.Any, /* id */ js.Any) => Unit = null,
    selectedId: String = null
  ): SideNavProps = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (customStyles != null) __obj.updateDynamic("customStyles")(customStyles.asInstanceOf[js.Any])
    if (!js.isUndefined(disableStyles)) __obj.updateDynamic("disableStyles")(disableStyles.asInstanceOf[js.Any])
    if (!js.isUndefined(icons)) __obj.updateDynamic("icons")(icons.asInstanceOf[js.Any])
    if (onItemSelect != null) __obj.updateDynamic("onItemSelect")(js.Any.fromFunction2(onItemSelect))
    if (selectedId != null) __obj.updateDynamic("selectedId")(selectedId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SideNavProps]
  }
}

