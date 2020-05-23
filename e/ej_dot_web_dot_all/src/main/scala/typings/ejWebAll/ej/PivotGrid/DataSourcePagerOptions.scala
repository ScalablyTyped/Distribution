package typings.ejWebAll.ej.PivotGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataSourcePagerOptions extends js.Object {
  /** Allows to set the page number to be loaded in the categorical axis by default.
    * @Default {1}
    */
  var categoricalCurrentPage: js.UndefOr[Double] = js.undefined
  /** Allows to set the number of categorical columns to be displayed in each page on applying the paging.
    * @Default {0}
    */
  var categoricalPageSize: js.UndefOr[Double] = js.undefined
  /** Allows to set the page number to be loaded in the series axis by default.
    * @Default {1}
    */
  var seriesCurrentPage: js.UndefOr[Double] = js.undefined
  /** Allows to set the number of series rows to be displayed in each page on applying the paging.
    * @Default {0}
    */
  var seriesPageSize: js.UndefOr[Double] = js.undefined
}

object DataSourcePagerOptions {
  @scala.inline
  def apply(
    categoricalCurrentPage: js.UndefOr[Double] = js.undefined,
    categoricalPageSize: js.UndefOr[Double] = js.undefined,
    seriesCurrentPage: js.UndefOr[Double] = js.undefined,
    seriesPageSize: js.UndefOr[Double] = js.undefined
  ): DataSourcePagerOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(categoricalCurrentPage)) __obj.updateDynamic("categoricalCurrentPage")(categoricalCurrentPage.get.asInstanceOf[js.Any])
    if (!js.isUndefined(categoricalPageSize)) __obj.updateDynamic("categoricalPageSize")(categoricalPageSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(seriesCurrentPage)) __obj.updateDynamic("seriesCurrentPage")(seriesCurrentPage.get.asInstanceOf[js.Any])
    if (!js.isUndefined(seriesPageSize)) __obj.updateDynamic("seriesPageSize")(seriesPageSize.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataSourcePagerOptions]
  }
}

