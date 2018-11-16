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

