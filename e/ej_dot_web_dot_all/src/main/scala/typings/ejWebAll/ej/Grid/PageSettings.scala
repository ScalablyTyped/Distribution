package typings.ejWebAll.ej.Grid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PageSettings extends js.Object {
  /** Gets or sets a value that indicates whether to define which page to display currently in the grid
    * @Default {1}
    */
  var currentPage: js.UndefOr[Double] = js.native
  /** Gets or sets a value that indicates whether to pass the current page information as a query string along with the URL while navigating to other page.
    * @Default {false}
    */
  var enableQueryString: js.UndefOr[Boolean] = js.native
  /** Gets or sets a value that indicates whether to enables pager template for the grid.
    * @Default {false}
    */
  var enableTemplates: js.UndefOr[Boolean] = js.native
  /** Gets or sets a value that indicates whether to define the number of pages displayed in the pager for navigation
    * @Default {8}
    */
  var pageCount: js.UndefOr[Double] = js.native
  /** Gets or sets a value that indicates whether to define the number of records displayed per page
    * @Default {12}
    */
  var pageSize: js.UndefOr[Double] = js.native
  /** Gets or sets different page size values to the Dropdown in Grid Pager, by which number of records in a page can be changed dynamically.
    * @Default {[]}
    */
  var pageSizeList: js.UndefOr[js.Array[_]] = js.native
  /** Gets or sets a value that indicates whether to define the number of pages to print. See printMode.
    * @Default {ej.Grid.PrintMode.AllPages}
    */
  var printMode: js.UndefOr[PrintMode | String] = js.native
  /** Gets or sets a value that indicates whether to enables default pager for the grid.
    * @Default {false}
    */
  var showDefaults: js.UndefOr[Boolean] = js.native
  /** Gets or sets a value that indicates to add the template as a pager template for grid.
    * @Default {null}
    */
  var template: js.UndefOr[String] = js.native
  /** Get the value of total number of pages in the grid. The totalPages value is calculated based on page size and total records of grid
    * @Default {null}
    */
  var totalPages: js.UndefOr[Double] = js.native
  /** Get the value of total number of records which is bound to the grid. The totalRecordsCount value is calculated based on dataSource bound to the grid.
    * @Default {null}
    */
  var totalRecordsCount: js.UndefOr[Double] = js.native
}

object PageSettings {
  @scala.inline
  def apply(): PageSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PageSettings]
  }
  @scala.inline
  implicit class PageSettingsOps[Self <: PageSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCurrentPage(value: Double): Self = this.set("currentPage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrentPage: Self = this.set("currentPage", js.undefined)
    @scala.inline
    def setEnableQueryString(value: Boolean): Self = this.set("enableQueryString", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableQueryString: Self = this.set("enableQueryString", js.undefined)
    @scala.inline
    def setEnableTemplates(value: Boolean): Self = this.set("enableTemplates", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableTemplates: Self = this.set("enableTemplates", js.undefined)
    @scala.inline
    def setPageCount(value: Double): Self = this.set("pageCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageCount: Self = this.set("pageCount", js.undefined)
    @scala.inline
    def setPageSize(value: Double): Self = this.set("pageSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageSize: Self = this.set("pageSize", js.undefined)
    @scala.inline
    def setPageSizeListVarargs(value: js.Any*): Self = this.set("pageSizeList", js.Array(value :_*))
    @scala.inline
    def setPageSizeList(value: js.Array[_]): Self = this.set("pageSizeList", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageSizeList: Self = this.set("pageSizeList", js.undefined)
    @scala.inline
    def setPrintMode(value: PrintMode | String): Self = this.set("printMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrintMode: Self = this.set("printMode", js.undefined)
    @scala.inline
    def setShowDefaults(value: Boolean): Self = this.set("showDefaults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowDefaults: Self = this.set("showDefaults", js.undefined)
    @scala.inline
    def setTemplate(value: String): Self = this.set("template", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemplate: Self = this.set("template", js.undefined)
    @scala.inline
    def setTotalPages(value: Double): Self = this.set("totalPages", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotalPages: Self = this.set("totalPages", js.undefined)
    @scala.inline
    def setTotalRecordsCount(value: Double): Self = this.set("totalRecordsCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotalRecordsCount: Self = this.set("totalRecordsCount", js.undefined)
  }
  
}

