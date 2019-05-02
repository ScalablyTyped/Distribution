package typings
package fundamentalDashReactLib.libSideNavigationSideNavMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SideNavListProps
  extends /* x */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var className: js.UndefOr[java.lang.String] = js.undefined
  /* _INTERNAL USE ONLY._ */
  var hasParent: js.UndefOr[scala.Boolean] = js.undefined
  var headingLevel: js.UndefOr[
    fundamentalDashReactLib.fundamentalDashReactLibNumbers.`2` | fundamentalDashReactLib.fundamentalDashReactLibNumbers.`3` | fundamentalDashReactLib.fundamentalDashReactLibNumbers.`4` | fundamentalDashReactLib.fundamentalDashReactLibNumbers.`5` | fundamentalDashReactLib.fundamentalDashReactLibNumbers.`6`
  ] = js.undefined
  /* _INTERNAL USE ONLY._ */
  var onItemSelect: js.UndefOr[js.Function2[/* e */ js.Any, /* id */ js.Any, scala.Unit]] = js.undefined
  /* _INTERNAL USE ONLY._ */
  var open: js.UndefOr[scala.Boolean] = js.undefined
  /* _INTERNAL USE ONLY._ */
  var selectedId: js.UndefOr[java.lang.String] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
  var titleProps: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
}

object SideNavListProps {
  @scala.inline
  def apply(
    StringDictionary: /* x */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    className: java.lang.String = null,
    hasParent: js.UndefOr[scala.Boolean] = js.undefined,
    headingLevel: fundamentalDashReactLib.fundamentalDashReactLibNumbers.`2` | fundamentalDashReactLib.fundamentalDashReactLibNumbers.`3` | fundamentalDashReactLib.fundamentalDashReactLibNumbers.`4` | fundamentalDashReactLib.fundamentalDashReactLibNumbers.`5` | fundamentalDashReactLib.fundamentalDashReactLibNumbers.`6` = null,
    onItemSelect: (/* e */ js.Any, /* id */ js.Any) => scala.Unit = null,
    open: js.UndefOr[scala.Boolean] = js.undefined,
    selectedId: java.lang.String = null,
    title: java.lang.String = null,
    titleProps: org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): SideNavListProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(hasParent)) __obj.updateDynamic("hasParent")(hasParent)
    if (headingLevel != null) __obj.updateDynamic("headingLevel")(headingLevel.asInstanceOf[js.Any])
    if (onItemSelect != null) __obj.updateDynamic("onItemSelect")(js.Any.fromFunction2(onItemSelect))
    if (!js.isUndefined(open)) __obj.updateDynamic("open")(open)
    if (selectedId != null) __obj.updateDynamic("selectedId")(selectedId)
    if (title != null) __obj.updateDynamic("title")(title)
    if (titleProps != null) __obj.updateDynamic("titleProps")(titleProps)
    __obj.asInstanceOf[SideNavListProps]
  }
}

