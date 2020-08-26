package typings.ejWebAll.ej.Pager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Model extends js.Object {
  /** Triggers when the current page value of the Pager control is changed.
    */
  var change: js.UndefOr[js.Function1[/* e */ ChangeEventArgs, Unit]] = js.native
  /** Triggered when pager numeric item is clicked in pager control.
    */
  var click: js.UndefOr[js.Function1[/* e */ ClickEventArgs, Unit]] = js.native
  /** Triggered when Pager control is successfully created.
    */
  var create: js.UndefOr[js.Function1[/* e */ CreateEventArgs, Unit]] = js.native
  /** Sets the root CSS class, which can be used for customization of pager control.
    */
  var cssClass: js.UndefOr[String] = js.native
  /** Gets or sets a value that indicates whether to define which page to display currently in pager.
    * @Default {1}
    */
  var currentPage: js.UndefOr[Double] = js.native
  /** Gets or sets a value that indicates whether to display the custom text message in Pager.
    */
  var customText: js.UndefOr[String] = js.native
  /** Triggered when Pager control is successfully destroyed.
    */
  var destroy: js.UndefOr[js.Function1[/* e */ DestroyEventArgs, Unit]] = js.native
  /** Gets or sets a value that indicates whether to display the external Message in Pager.
    * @Default {false}
    */
  var enableExternalMessage: js.UndefOr[Boolean] = js.native
  /** Gets or sets a value that indicates whether to pass the current page information as a query string along with the URL while navigating to other page.
    * @Default {false}
    */
  var enableQueryString: js.UndefOr[Boolean] = js.native
  /** Align content in the pager control from right to left by setting the property as true.
    * @Default {false}
    */
  var enableRTL: js.UndefOr[Boolean] = js.native
  /** Enable or disable the Pager control.
    * @Default {true}
    */
  var enabled: js.UndefOr[Boolean] = js.native
  /** Gets or sets a value that indicates whether to display the external Message in Pager.
    */
  var externalMessage: js.UndefOr[String] = js.native
  /** Enables or disables responsive support for the Pager control items on window resize.
    * @Default {false}
    */
  var isResponsive: js.UndefOr[Boolean] = js.native
  /** Gets or sets a value that indicates whether to customizing the user interface (UI) as locale-specific in order to display regional data i.e. in a language and culture specific to
    * a particular country or region.
    * @Default {en-US}
    */
  var locale: js.UndefOr[String] = js.native
  /** Gets or sets a value that indicates whether to define the number of pages displayed in the pager for navigation.
    * @Default {10}
    */
  var pageCount: js.UndefOr[Double] = js.native
  /** Gets or sets a value that indicates whether to define the number of records displayed per page.
    * @Default {12}
    */
  var pageSize: js.UndefOr[Double] = js.native
  /** It allows to have multiple choices of pageSize values for Pager control. The &quot;pageSize&quot; API value of the pager will be updated depending upon the value being selected
    * from the dropdown.
    * @Default {null}
    */
  var pageSizeList: js.UndefOr[js.Array[_]] = js.native
  /** Indicates the pageSizeMessage to be displayed in Pager when pageSizeList API is defined.
    */
  var pageSizeMessage: js.UndefOr[String] = js.native
  /** Triggered when a value is selected in the pageSizeList dropdown.
    */
  var pageSizeSelected: js.UndefOr[js.Function1[/* e */ PageSizeSelectedEventArgs, Unit]] = js.native
  /** Shows or hides the current page information in pager footer.
    * @Default {true}
    */
  var showPageInfo: js.UndefOr[Boolean] = js.native
  /** Template option allows to customize UI appearance of the ejPager by defining their own page layout.
    * @Default {null}
    */
  var template: js.UndefOr[String] = js.native
  /** Get or sets a value of total number of pages in the pager. The totalPages value is calculated based on page size and total records.
    * @Default {null}
    */
  var totalPages: js.UndefOr[Double] = js.native
  /** Get the value of total number of records which is bound to a data item.
    * @Default {null}
    */
  var totalRecordsCount: js.UndefOr[Double] = js.native
}

object Model {
  @scala.inline
  def apply(): Model = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Model]
  }
  @scala.inline
  implicit class ModelOps[Self <: Model] (val x: Self) extends AnyVal {
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
    def setChange(value: /* e */ ChangeEventArgs => Unit): Self = this.set("change", js.Any.fromFunction1(value))
    @scala.inline
    def deleteChange: Self = this.set("change", js.undefined)
    @scala.inline
    def setClick(value: /* e */ ClickEventArgs => Unit): Self = this.set("click", js.Any.fromFunction1(value))
    @scala.inline
    def deleteClick: Self = this.set("click", js.undefined)
    @scala.inline
    def setCreate(value: /* e */ CreateEventArgs => Unit): Self = this.set("create", js.Any.fromFunction1(value))
    @scala.inline
    def deleteCreate: Self = this.set("create", js.undefined)
    @scala.inline
    def setCssClass(value: String): Self = this.set("cssClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCssClass: Self = this.set("cssClass", js.undefined)
    @scala.inline
    def setCurrentPage(value: Double): Self = this.set("currentPage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrentPage: Self = this.set("currentPage", js.undefined)
    @scala.inline
    def setCustomText(value: String): Self = this.set("customText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomText: Self = this.set("customText", js.undefined)
    @scala.inline
    def setDestroy(value: /* e */ DestroyEventArgs => Unit): Self = this.set("destroy", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDestroy: Self = this.set("destroy", js.undefined)
    @scala.inline
    def setEnableExternalMessage(value: Boolean): Self = this.set("enableExternalMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableExternalMessage: Self = this.set("enableExternalMessage", js.undefined)
    @scala.inline
    def setEnableQueryString(value: Boolean): Self = this.set("enableQueryString", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableQueryString: Self = this.set("enableQueryString", js.undefined)
    @scala.inline
    def setEnableRTL(value: Boolean): Self = this.set("enableRTL", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableRTL: Self = this.set("enableRTL", js.undefined)
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    @scala.inline
    def setExternalMessage(value: String): Self = this.set("externalMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExternalMessage: Self = this.set("externalMessage", js.undefined)
    @scala.inline
    def setIsResponsive(value: Boolean): Self = this.set("isResponsive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsResponsive: Self = this.set("isResponsive", js.undefined)
    @scala.inline
    def setLocale(value: String): Self = this.set("locale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
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
    def setPageSizeMessage(value: String): Self = this.set("pageSizeMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageSizeMessage: Self = this.set("pageSizeMessage", js.undefined)
    @scala.inline
    def setPageSizeSelected(value: /* e */ PageSizeSelectedEventArgs => Unit): Self = this.set("pageSizeSelected", js.Any.fromFunction1(value))
    @scala.inline
    def deletePageSizeSelected: Self = this.set("pageSizeSelected", js.undefined)
    @scala.inline
    def setShowPageInfo(value: Boolean): Self = this.set("showPageInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowPageInfo: Self = this.set("showPageInfo", js.undefined)
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

