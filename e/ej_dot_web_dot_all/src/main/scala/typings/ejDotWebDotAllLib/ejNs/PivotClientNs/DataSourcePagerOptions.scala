package typings
package ejDotWebDotAllLib.ejNs.PivotClientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataSourcePagerOptions extends js.Object {
  /** Allows to set the page number in the categorical axis to be loaded by default.
    * @Default {1}
    */
  var categoricalCurrentPage: js.UndefOr[scala.Double] = js.undefined
  /** Allows to set the number of categorical columns to be displayed in each page on applying the paging.
    * @Default {0}
    */
  var categoricalPageSize: js.UndefOr[scala.Double] = js.undefined
  /** Allows to set the page number in the series axis to be loaded by default.
    * @Default {1}
    */
  var seriesCurrentPage: js.UndefOr[scala.Double] = js.undefined
  /** Allows to set the number of series rows to be displayed in each page on applying the paging.
    * @Default {0}
    */
  var seriesPageSize: js.UndefOr[scala.Double] = js.undefined
}

