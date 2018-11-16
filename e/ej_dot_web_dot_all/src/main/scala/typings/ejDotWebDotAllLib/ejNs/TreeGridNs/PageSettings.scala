package typings
package ejDotWebDotAllLib.ejNs.TreeGridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait PageSettings extends js.Object {
  /** Specifies the current page to display at load time.
               * @Default {1}
               */
  var currentPage: js.UndefOr[scala.Double] = js.undefined
  /** Using this property we can specify the number of pages should pager contains, according to this count TreeGrid height will be updated.
               * @Default {8}
               */
  var pageCount: js.UndefOr[scala.Double] = js.undefined
  /** This specifies the number of rows to display in each page.
               * @Default {12}
               */
  var pageSize: js.UndefOr[scala.Double] = js.undefined
  /** Specifies the mode of record count in a page, whether it should count all the records or the root to count zero level parent records.
               * @Default {ej.TreeGrid.PageSizeMode.All}
               */
  var pageSizeMode: js.UndefOr[PageSizeMode | java.lang.String] = js.undefined
  /** Specifies the mode of printing the control, whether it should print the all the records or the current page content.
               * @Default {ej.TreeGrid.PrintMode.AllPages}
               */
  var printMode: js.UndefOr[PrintMode | java.lang.String] = js.undefined
  /** Specifies the Custom template for Pager control.
               * @Default {null}
               */
  var template: js.UndefOr[java.lang.String] = js.undefined
  /** Get the value of records which is bound to TreeGrid. The totalRecordsCount value is calculated based on the datasource bound to TreeGrid.
               * @Default {null}
               */
  var totalRecordsCount: js.UndefOr[scala.Double] = js.undefined
}

