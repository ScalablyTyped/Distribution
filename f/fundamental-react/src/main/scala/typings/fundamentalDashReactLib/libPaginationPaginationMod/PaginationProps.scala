package typings
package fundamentalDashReactLib.libPaginationPaginationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaginationProps
  extends /* x */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var className: js.UndefOr[java.lang.String] = js.undefined
  /* Set to **true** to show total number of items along with `totalText` string. */
  var displayTotal: js.UndefOr[scala.Boolean] = js.undefined
  /* Initial page to be selected. */
  var initialPage: js.UndefOr[scala.Double] = js.undefined
  /* Number of items to display on page. */
  var itemsPerPage: js.UndefOr[scala.Double] = js.undefined
  /* Total number of items. itemsTotal / itemsPerPage calculates how many navigation items should be shown in the control. */
  var itemsTotal: scala.Double
  /* Additional props to be spread to the page number `<a>` elements. */
  var linkProps: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  var localizedText: js.UndefOr[fundamentalDashReactLib.Anon_Next] = js.undefined
  /* Additional props to be spread to the next arrow `<a>` element. */
  var nextProps: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  /* Additional props to be spread to the previous arrow `<a>` element. */
  var prevProps: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  /* Localized text to display next to the total number of items.  Used with `displayTotal`. */
  var totalText: js.UndefOr[java.lang.String] = js.undefined
  def onClick(page: scala.Double): scala.Unit
}

object PaginationProps {
  @scala.inline
  def apply(
    itemsTotal: scala.Double,
    onClick: scala.Double => scala.Unit,
    StringDictionary: /* x */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    className: java.lang.String = null,
    displayTotal: js.UndefOr[scala.Boolean] = js.undefined,
    initialPage: scala.Int | scala.Double = null,
    itemsPerPage: scala.Int | scala.Double = null,
    linkProps: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    localizedText: fundamentalDashReactLib.Anon_Next = null,
    nextProps: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    prevProps: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    totalText: java.lang.String = null
  ): PaginationProps = {
    val __obj = js.Dynamic.literal(itemsTotal = itemsTotal, onClick = js.Any.fromFunction1(onClick))
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(displayTotal)) __obj.updateDynamic("displayTotal")(displayTotal)
    if (initialPage != null) __obj.updateDynamic("initialPage")(initialPage.asInstanceOf[js.Any])
    if (itemsPerPage != null) __obj.updateDynamic("itemsPerPage")(itemsPerPage.asInstanceOf[js.Any])
    if (linkProps != null) __obj.updateDynamic("linkProps")(linkProps)
    if (localizedText != null) __obj.updateDynamic("localizedText")(localizedText)
    if (nextProps != null) __obj.updateDynamic("nextProps")(nextProps)
    if (prevProps != null) __obj.updateDynamic("prevProps")(prevProps)
    if (totalText != null) __obj.updateDynamic("totalText")(totalText)
    __obj.asInstanceOf[PaginationProps]
  }
}

