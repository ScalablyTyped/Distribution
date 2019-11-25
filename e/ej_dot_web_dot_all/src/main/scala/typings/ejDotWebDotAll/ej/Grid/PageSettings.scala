package typings.ejDotWebDotAll.ej.Grid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PageSettings extends js.Object {
  /** Gets or sets a value that indicates whether to define which page to display currently in the grid
    * @Default {1}
    */
  var currentPage: js.UndefOr[Double] = js.undefined
  /** Gets or sets a value that indicates whether to pass the current page information as a query string along with the URL while navigating to other page.
    * @Default {false}
    */
  var enableQueryString: js.UndefOr[Boolean] = js.undefined
  /** Gets or sets a value that indicates whether to enables pager template for the grid.
    * @Default {false}
    */
  var enableTemplates: js.UndefOr[Boolean] = js.undefined
  /** Gets or sets a value that indicates whether to define the number of pages displayed in the pager for navigation
    * @Default {8}
    */
  var pageCount: js.UndefOr[Double] = js.undefined
  /** Gets or sets a value that indicates whether to define the number of records displayed per page
    * @Default {12}
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  /** Gets or sets different page size values to the Dropdown in Grid Pager, by which number of records in a page can be changed dynamically.
    * @Default {[]}
    */
  var pageSizeList: js.UndefOr[js.Array[_]] = js.undefined
  /** Gets or sets a value that indicates whether to define the number of pages to print. See printMode.
    * @Default {ej.Grid.PrintMode.AllPages}
    */
  var printMode: js.UndefOr[PrintMode | String] = js.undefined
  /** Gets or sets a value that indicates whether to enables default pager for the grid.
    * @Default {false}
    */
  var showDefaults: js.UndefOr[Boolean] = js.undefined
  /** Gets or sets a value that indicates to add the template as a pager template for grid.
    * @Default {null}
    */
  var template: js.UndefOr[String] = js.undefined
  /** Get the value of total number of pages in the grid. The totalPages value is calculated based on page size and total records of grid
    * @Default {null}
    */
  var totalPages: js.UndefOr[Double] = js.undefined
  /** Get the value of total number of records which is bound to the grid. The totalRecordsCount value is calculated based on dataSource bound to the grid.
    * @Default {null}
    */
  var totalRecordsCount: js.UndefOr[Double] = js.undefined
}

object PageSettings {
  @scala.inline
  def apply(
    currentPage: Int | Double = null,
    enableQueryString: js.UndefOr[Boolean] = js.undefined,
    enableTemplates: js.UndefOr[Boolean] = js.undefined,
    pageCount: Int | Double = null,
    pageSize: Int | Double = null,
    pageSizeList: js.Array[_] = null,
    printMode: PrintMode | String = null,
    showDefaults: js.UndefOr[Boolean] = js.undefined,
    template: String = null,
    totalPages: Int | Double = null,
    totalRecordsCount: Int | Double = null
  ): PageSettings = {
    val __obj = js.Dynamic.literal()
    if (currentPage != null) __obj.updateDynamic("currentPage")(currentPage.asInstanceOf[js.Any])
    if (!js.isUndefined(enableQueryString)) __obj.updateDynamic("enableQueryString")(enableQueryString.asInstanceOf[js.Any])
    if (!js.isUndefined(enableTemplates)) __obj.updateDynamic("enableTemplates")(enableTemplates.asInstanceOf[js.Any])
    if (pageCount != null) __obj.updateDynamic("pageCount")(pageCount.asInstanceOf[js.Any])
    if (pageSize != null) __obj.updateDynamic("pageSize")(pageSize.asInstanceOf[js.Any])
    if (pageSizeList != null) __obj.updateDynamic("pageSizeList")(pageSizeList.asInstanceOf[js.Any])
    if (printMode != null) __obj.updateDynamic("printMode")(printMode.asInstanceOf[js.Any])
    if (!js.isUndefined(showDefaults)) __obj.updateDynamic("showDefaults")(showDefaults.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    if (totalPages != null) __obj.updateDynamic("totalPages")(totalPages.asInstanceOf[js.Any])
    if (totalRecordsCount != null) __obj.updateDynamic("totalRecordsCount")(totalRecordsCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageSettings]
  }
}

