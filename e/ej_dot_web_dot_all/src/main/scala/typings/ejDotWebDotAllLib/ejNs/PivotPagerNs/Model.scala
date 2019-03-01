package typings
package ejDotWebDotAllLib.ejNs.PivotPagerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Model extends js.Object {
  /** Contains the current page number in categorical axis.
    * @Default {1}
    */
  var categoricalCurrentPage: js.UndefOr[scala.Double] = js.undefined
  /** Contains the total page count in categorical axis.
    * @Default {1}
    */
  var categoricalPageCount: js.UndefOr[scala.Double] = js.undefined
  /** Allows the user to set the localized language for the widget.
    * @Default {en-US}
    */
  var locale: js.UndefOr[java.lang.String] = js.undefined
  /** Sets the pager mode (Only Categorical Pager/Only Series Pager/Both) for the PivotPager.
    * @Default {ej.PivotPager.Mode.Both}
    */
  var mode: js.UndefOr[Mode | java.lang.String] = js.undefined
  /** Contains the current page number in series axis.
    * @Default {1}
    */
  var seriesCurrentPage: js.UndefOr[scala.Double] = js.undefined
  /** Contains the total page count in series axis.
    * @Default {1}
    */
  var seriesPageCount: js.UndefOr[scala.Double] = js.undefined
  /** Contains the ID of the target element for which paging needs to be done.
    * @Default {â€œâ€}
    */
  var targetControlID: js.UndefOr[java.lang.String] = js.undefined
}

object Model {
  @scala.inline
  def apply(
    categoricalCurrentPage: scala.Int | scala.Double = null,
    categoricalPageCount: scala.Int | scala.Double = null,
    locale: java.lang.String = null,
    mode: Mode | java.lang.String = null,
    seriesCurrentPage: scala.Int | scala.Double = null,
    seriesPageCount: scala.Int | scala.Double = null,
    targetControlID: java.lang.String = null
  ): Model = {
    val __obj = js.Dynamic.literal()
    if (categoricalCurrentPage != null) __obj.updateDynamic("categoricalCurrentPage")(categoricalCurrentPage.asInstanceOf[js.Any])
    if (categoricalPageCount != null) __obj.updateDynamic("categoricalPageCount")(categoricalPageCount.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (seriesCurrentPage != null) __obj.updateDynamic("seriesCurrentPage")(seriesCurrentPage.asInstanceOf[js.Any])
    if (seriesPageCount != null) __obj.updateDynamic("seriesPageCount")(seriesPageCount.asInstanceOf[js.Any])
    if (targetControlID != null) __obj.updateDynamic("targetControlID")(targetControlID)
    __obj.asInstanceOf[Model]
  }
}

