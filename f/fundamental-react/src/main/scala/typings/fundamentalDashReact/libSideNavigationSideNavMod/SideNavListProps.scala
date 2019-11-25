package typings.fundamentalDashReact.libSideNavigationSideNavMod

import org.scalablytyped.runtime.StringDictionary
import typings.fundamentalDashReact.fundamentalDashReactNumbers.`2`
import typings.fundamentalDashReact.fundamentalDashReactNumbers.`3`
import typings.fundamentalDashReact.fundamentalDashReactNumbers.`4`
import typings.fundamentalDashReact.fundamentalDashReactNumbers.`5`
import typings.fundamentalDashReact.fundamentalDashReactNumbers.`6`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SideNavListProps
  extends /* x */ StringDictionary[js.Any] {
  var className: js.UndefOr[String] = js.undefined
  /* _INTERNAL USE ONLY._ */
  var hasParent: js.UndefOr[Boolean] = js.undefined
  var headingLevel: js.UndefOr[`2` | `3` | `4` | `5` | `6`] = js.undefined
  /* _INTERNAL USE ONLY._ */
  var onItemSelect: js.UndefOr[js.Function2[/* e */ js.Any, /* id */ js.Any, Unit]] = js.undefined
  /* _INTERNAL USE ONLY._ */
  var open: js.UndefOr[Boolean] = js.undefined
  /* _INTERNAL USE ONLY._ */
  var selectedId: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var titleProps: js.UndefOr[StringDictionary[js.Any]] = js.undefined
}

object SideNavListProps {
  @scala.inline
  def apply(
    StringDictionary: /* x */ StringDictionary[js.Any] = null,
    className: String = null,
    hasParent: js.UndefOr[Boolean] = js.undefined,
    headingLevel: `2` | `3` | `4` | `5` | `6` = null,
    onItemSelect: (/* e */ js.Any, /* id */ js.Any) => Unit = null,
    open: js.UndefOr[Boolean] = js.undefined,
    selectedId: String = null,
    title: String = null,
    titleProps: StringDictionary[js.Any] = null
  ): SideNavListProps = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(hasParent)) __obj.updateDynamic("hasParent")(hasParent.asInstanceOf[js.Any])
    if (headingLevel != null) __obj.updateDynamic("headingLevel")(headingLevel.asInstanceOf[js.Any])
    if (onItemSelect != null) __obj.updateDynamic("onItemSelect")(js.Any.fromFunction2(onItemSelect))
    if (!js.isUndefined(open)) __obj.updateDynamic("open")(open.asInstanceOf[js.Any])
    if (selectedId != null) __obj.updateDynamic("selectedId")(selectedId.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (titleProps != null) __obj.updateDynamic("titleProps")(titleProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[SideNavListProps]
  }
}

