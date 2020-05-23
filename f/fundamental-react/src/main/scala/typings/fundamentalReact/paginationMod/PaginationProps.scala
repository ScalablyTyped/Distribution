package typings.fundamentalReact.paginationMod

import org.scalablytyped.runtime.StringDictionary
import typings.fundamentalReact.anon.Next
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaginationProps
  extends /* x */ StringDictionary[js.Any] {
  var className: js.UndefOr[String] = js.undefined
  var disableStyles: js.UndefOr[Boolean] = js.undefined
  var displayTotal: js.UndefOr[Boolean] = js.undefined
  var displayTotalProps: js.UndefOr[js.Any] = js.undefined
  var initialPage: js.UndefOr[Double] = js.undefined
  var itemsPerPage: js.UndefOr[Double] = js.undefined
  var itemsTotal: Double
  var linkProps: js.UndefOr[js.Any] = js.undefined
  var localizedText: js.UndefOr[Next] = js.undefined
  var nextProps: js.UndefOr[js.Any] = js.undefined
  var prevProps: js.UndefOr[js.Any] = js.undefined
  var totalText: js.UndefOr[String] = js.undefined
  var visiblePageTotal: js.UndefOr[Double] = js.undefined
  def onClick(args: js.Any*): js.Any
}

object PaginationProps {
  @scala.inline
  def apply(
    itemsTotal: Double,
    onClick: /* repeated */ js.Any => js.Any,
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    className: String = null,
    disableStyles: js.UndefOr[Boolean] = js.undefined,
    displayTotal: js.UndefOr[Boolean] = js.undefined,
    displayTotalProps: js.Any = null,
    initialPage: js.UndefOr[Double] = js.undefined,
    itemsPerPage: js.UndefOr[Double] = js.undefined,
    linkProps: js.Any = null,
    localizedText: Next = null,
    nextProps: js.Any = null,
    prevProps: js.Any = null,
    totalText: String = null,
    visiblePageTotal: js.UndefOr[Double] = js.undefined
  ): PaginationProps = {
    val __obj = js.Dynamic.literal(itemsTotal = itemsTotal.asInstanceOf[js.Any], onClick = js.Any.fromFunction1(onClick))
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(disableStyles)) __obj.updateDynamic("disableStyles")(disableStyles.get.asInstanceOf[js.Any])
    if (!js.isUndefined(displayTotal)) __obj.updateDynamic("displayTotal")(displayTotal.get.asInstanceOf[js.Any])
    if (displayTotalProps != null) __obj.updateDynamic("displayTotalProps")(displayTotalProps.asInstanceOf[js.Any])
    if (!js.isUndefined(initialPage)) __obj.updateDynamic("initialPage")(initialPage.get.asInstanceOf[js.Any])
    if (!js.isUndefined(itemsPerPage)) __obj.updateDynamic("itemsPerPage")(itemsPerPage.get.asInstanceOf[js.Any])
    if (linkProps != null) __obj.updateDynamic("linkProps")(linkProps.asInstanceOf[js.Any])
    if (localizedText != null) __obj.updateDynamic("localizedText")(localizedText.asInstanceOf[js.Any])
    if (nextProps != null) __obj.updateDynamic("nextProps")(nextProps.asInstanceOf[js.Any])
    if (prevProps != null) __obj.updateDynamic("prevProps")(prevProps.asInstanceOf[js.Any])
    if (totalText != null) __obj.updateDynamic("totalText")(totalText.asInstanceOf[js.Any])
    if (!js.isUndefined(visiblePageTotal)) __obj.updateDynamic("visiblePageTotal")(visiblePageTotal.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaginationProps]
  }
}

