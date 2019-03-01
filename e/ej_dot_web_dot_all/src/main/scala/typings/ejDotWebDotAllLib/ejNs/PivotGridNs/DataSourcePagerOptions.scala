package typings
package ejDotWebDotAllLib.ejNs.PivotGridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataSourcePagerOptions extends js.Object {
  /** Allows to set the page number to be loaded in the categorical axis by default.
    * @Default {1}
    */
  var categoricalCurrentPage: js.UndefOr[scala.Double] = js.undefined
  /** Allows to set the number of categorical columns to be displayed in each page on applying the paging.
    * @Default {0}
    */
  var categoricalPageSize: js.UndefOr[scala.Double] = js.undefined
  /** Allows to set the page number to be loaded in the series axis by default.
    * @Default {1}
    */
  var seriesCurrentPage: js.UndefOr[scala.Double] = js.undefined
  /** Allows to set the number of series rows to be displayed in each page on applying the paging.
    * @Default {0}
    */
  var seriesPageSize: js.UndefOr[scala.Double] = js.undefined
}

object DataSourcePagerOptions {
  @scala.inline
  def apply(
    categoricalCurrentPage: scala.Int | scala.Double = null,
    categoricalPageSize: scala.Int | scala.Double = null,
    seriesCurrentPage: scala.Int | scala.Double = null,
    seriesPageSize: scala.Int | scala.Double = null
  ): DataSourcePagerOptions = {
    val __obj = js.Dynamic.literal()
    if (categoricalCurrentPage != null) __obj.updateDynamic("categoricalCurrentPage")(categoricalCurrentPage.asInstanceOf[js.Any])
    if (categoricalPageSize != null) __obj.updateDynamic("categoricalPageSize")(categoricalPageSize.asInstanceOf[js.Any])
    if (seriesCurrentPage != null) __obj.updateDynamic("seriesCurrentPage")(seriesCurrentPage.asInstanceOf[js.Any])
    if (seriesPageSize != null) __obj.updateDynamic("seriesPageSize")(seriesPageSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataSourcePagerOptions]
  }
}

