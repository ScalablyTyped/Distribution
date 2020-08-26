package typings.ejWebAll.ej.TreeGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PageSettings extends js.Object {
  /** Specifies the current page to display at load time.
    * @Default {1}
    */
  var currentPage: js.UndefOr[Double] = js.native
  /** Using this property we can specify the number of pages should pager contains, according to this count TreeGrid height will be updated.
    * @Default {8}
    */
  var pageCount: js.UndefOr[Double] = js.native
  /** This specifies the number of rows to display in each page.
    * @Default {12}
    */
  var pageSize: js.UndefOr[Double] = js.native
  /** Specifies the mode of record count in a page, whether it should count all the records or the root to count zero level parent records.
    * @Default {ej.TreeGrid.PageSizeMode.All}
    */
  var pageSizeMode: js.UndefOr[PageSizeMode | String] = js.native
  /** Specifies the mode of printing the control, whether it should print the all the records or the current page content.
    * @Default {ej.TreeGrid.PrintMode.AllPages}
    */
  var printMode: js.UndefOr[PrintMode | String] = js.native
  /** Specifies the Custom template for Pager control.
    * @Default {null}
    */
  var template: js.UndefOr[String] = js.native
  /** Get the value of records which is bound to TreeGrid. The totalRecordsCount value is calculated based on the datasource bound to TreeGrid.
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
    def setPageCount(value: Double): Self = this.set("pageCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageCount: Self = this.set("pageCount", js.undefined)
    @scala.inline
    def setPageSize(value: Double): Self = this.set("pageSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageSize: Self = this.set("pageSize", js.undefined)
    @scala.inline
    def setPageSizeMode(value: PageSizeMode | String): Self = this.set("pageSizeMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageSizeMode: Self = this.set("pageSizeMode", js.undefined)
    @scala.inline
    def setPrintMode(value: PrintMode | String): Self = this.set("printMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrintMode: Self = this.set("printMode", js.undefined)
    @scala.inline
    def setTemplate(value: String): Self = this.set("template", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemplate: Self = this.set("template", js.undefined)
    @scala.inline
    def setTotalRecordsCount(value: Double): Self = this.set("totalRecordsCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotalRecordsCount: Self = this.set("totalRecordsCount", js.undefined)
  }
  
}

