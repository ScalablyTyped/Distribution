package typings.ejWebAll.ej.TreeGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PageSettings extends js.Object {
  /** Specifies the current page to display at load time.
    * @Default {1}
    */
  var currentPage: js.UndefOr[Double] = js.undefined
  /** Using this property we can specify the number of pages should pager contains, according to this count TreeGrid height will be updated.
    * @Default {8}
    */
  var pageCount: js.UndefOr[Double] = js.undefined
  /** This specifies the number of rows to display in each page.
    * @Default {12}
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  /** Specifies the mode of record count in a page, whether it should count all the records or the root to count zero level parent records.
    * @Default {ej.TreeGrid.PageSizeMode.All}
    */
  var pageSizeMode: js.UndefOr[PageSizeMode | String] = js.undefined
  /** Specifies the mode of printing the control, whether it should print the all the records or the current page content.
    * @Default {ej.TreeGrid.PrintMode.AllPages}
    */
  var printMode: js.UndefOr[PrintMode | String] = js.undefined
  /** Specifies the Custom template for Pager control.
    * @Default {null}
    */
  var template: js.UndefOr[String] = js.undefined
  /** Get the value of records which is bound to TreeGrid. The totalRecordsCount value is calculated based on the datasource bound to TreeGrid.
    * @Default {null}
    */
  var totalRecordsCount: js.UndefOr[Double] = js.undefined
}

object PageSettings {
  @scala.inline
  def apply(
    currentPage: js.UndefOr[Double] = js.undefined,
    pageCount: js.UndefOr[Double] = js.undefined,
    pageSize: js.UndefOr[Double] = js.undefined,
    pageSizeMode: PageSizeMode | String = null,
    printMode: PrintMode | String = null,
    template: String = null,
    totalRecordsCount: js.UndefOr[Double] = js.undefined
  ): PageSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(currentPage)) __obj.updateDynamic("currentPage")(currentPage.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pageCount)) __obj.updateDynamic("pageCount")(pageCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pageSize)) __obj.updateDynamic("pageSize")(pageSize.get.asInstanceOf[js.Any])
    if (pageSizeMode != null) __obj.updateDynamic("pageSizeMode")(pageSizeMode.asInstanceOf[js.Any])
    if (printMode != null) __obj.updateDynamic("printMode")(printMode.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    if (!js.isUndefined(totalRecordsCount)) __obj.updateDynamic("totalRecordsCount")(totalRecordsCount.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageSettings]
  }
}

