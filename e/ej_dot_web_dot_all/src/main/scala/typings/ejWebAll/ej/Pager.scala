package typings.ejWebAll.ej

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Pager extends Widget_ {
  
  var defaults: Model = js.native
  
  /** goToFirstPage() helps to navigate to the first page of the pager.
    * @returns {void}
    */
  def goToFirstPage(): Unit = js.native
  
  /** goToLastPage() helps to navigate to the Last page of the pager.
    * @returns {void}
    */
  def goToLastPage(): Unit = js.native
  
  /** goToNextPage() helps to navigate to the next page to the current page of the pager.
    * @returns {void}
    */
  def goToNextPage(): Unit = js.native
  
  /** goToPrevPage() helps to navigate to the previous page to the current page of the pager.
    * @returns {void}
    */
  def goToPrevPage(): Unit = js.native
  
  /** Send a paging request to specified page through the pager control.
    * @param {number} Specifies the index to be navigated
    * @returns {void}
    */
  def gotoPage(pageIndex: Double): Unit = js.native
  
  @JSName("model")
  var model_Pager: Model = js.native
  
  /** refreshPager() helps to refresh the model value of pager control.
    * @returns {void}
    */
  def refreshPager(): Unit = js.native
}
object Pager {
  
  @js.native
  trait ChangeEventArgs extends StObject {
    
    /** Returns the current page index.
      */
    var currentPage: js.UndefOr[Double] = js.native
    
    /** Returns current action event type and its target.
      */
    var event: js.UndefOr[js.Any] = js.native
    
    /** Returns the pager model.
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** Returns the name of event
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object ChangeEventArgs {
    
    @scala.inline
    def apply(): ChangeEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChangeEventArgs]
    }
    
    @scala.inline
    implicit class ChangeEventArgsMutableBuilder[Self <: ChangeEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCurrentPage(value: Double): Self = StObject.set(x, "currentPage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrentPageUndefined: Self = StObject.set(x, "currentPage", js.undefined)
      
      @scala.inline
      def setEvent(value: js.Any): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait ClickEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** Returns the current page index.
      */
    var currentPage: js.UndefOr[Double] = js.native
    
    /** Returns current action event type and its target.
      */
    var event: js.UndefOr[js.Any] = js.native
    
    /** Returns the pager model.
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** Returns the name of event
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object ClickEventArgs {
    
    @scala.inline
    def apply(): ClickEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClickEventArgs]
    }
    
    @scala.inline
    implicit class ClickEventArgsMutableBuilder[Self <: ClickEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setCurrentPage(value: Double): Self = StObject.set(x, "currentPage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrentPageUndefined: Self = StObject.set(x, "currentPage", js.undefined)
      
      @scala.inline
      def setEvent(value: js.Any): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait CreateEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** Returns the pager model.
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** Returns the name of event
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object CreateEventArgs {
    
    @scala.inline
    def apply(): CreateEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateEventArgs]
    }
    
    @scala.inline
    implicit class CreateEventArgsMutableBuilder[Self <: CreateEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait DestroyEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** Returns the pager model.
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** Returns the name of event
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object DestroyEventArgs {
    
    @scala.inline
    def apply(): DestroyEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DestroyEventArgs]
    }
    
    @scala.inline
    implicit class DestroyEventArgsMutableBuilder[Self <: DestroyEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait Model extends StObject {
    
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
    def apply(): typings.ejWebAll.ej.Pager.Model = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.ejWebAll.ej.Pager.Model]
    }
    
    @scala.inline
    implicit class ModelMutableBuilder[Self <: typings.ejWebAll.ej.Pager.Model] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChange(value: /* e */ ChangeEventArgs => Unit): Self = StObject.set(x, "change", js.Any.fromFunction1(value))
      
      @scala.inline
      def setChangeUndefined: Self = StObject.set(x, "change", js.undefined)
      
      @scala.inline
      def setClick(value: /* e */ ClickEventArgs => Unit): Self = StObject.set(x, "click", js.Any.fromFunction1(value))
      
      @scala.inline
      def setClickUndefined: Self = StObject.set(x, "click", js.undefined)
      
      @scala.inline
      def setCreate(value: /* e */ CreateEventArgs => Unit): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCreateUndefined: Self = StObject.set(x, "create", js.undefined)
      
      @scala.inline
      def setCssClass(value: String): Self = StObject.set(x, "cssClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCssClassUndefined: Self = StObject.set(x, "cssClass", js.undefined)
      
      @scala.inline
      def setCurrentPage(value: Double): Self = StObject.set(x, "currentPage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrentPageUndefined: Self = StObject.set(x, "currentPage", js.undefined)
      
      @scala.inline
      def setCustomText(value: String): Self = StObject.set(x, "customText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomTextUndefined: Self = StObject.set(x, "customText", js.undefined)
      
      @scala.inline
      def setDestroy(value: /* e */ DestroyEventArgs => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
      
      @scala.inline
      def setEnableExternalMessage(value: Boolean): Self = StObject.set(x, "enableExternalMessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableExternalMessageUndefined: Self = StObject.set(x, "enableExternalMessage", js.undefined)
      
      @scala.inline
      def setEnableQueryString(value: Boolean): Self = StObject.set(x, "enableQueryString", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableQueryStringUndefined: Self = StObject.set(x, "enableQueryString", js.undefined)
      
      @scala.inline
      def setEnableRTL(value: Boolean): Self = StObject.set(x, "enableRTL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableRTLUndefined: Self = StObject.set(x, "enableRTL", js.undefined)
      
      @scala.inline
      def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      @scala.inline
      def setExternalMessage(value: String): Self = StObject.set(x, "externalMessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExternalMessageUndefined: Self = StObject.set(x, "externalMessage", js.undefined)
      
      @scala.inline
      def setIsResponsive(value: Boolean): Self = StObject.set(x, "isResponsive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsResponsiveUndefined: Self = StObject.set(x, "isResponsive", js.undefined)
      
      @scala.inline
      def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      @scala.inline
      def setPageCount(value: Double): Self = StObject.set(x, "pageCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageCountUndefined: Self = StObject.set(x, "pageCount", js.undefined)
      
      @scala.inline
      def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageSizeList(value: js.Array[_]): Self = StObject.set(x, "pageSizeList", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageSizeListUndefined: Self = StObject.set(x, "pageSizeList", js.undefined)
      
      @scala.inline
      def setPageSizeListVarargs(value: js.Any*): Self = StObject.set(x, "pageSizeList", js.Array(value :_*))
      
      @scala.inline
      def setPageSizeMessage(value: String): Self = StObject.set(x, "pageSizeMessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageSizeMessageUndefined: Self = StObject.set(x, "pageSizeMessage", js.undefined)
      
      @scala.inline
      def setPageSizeSelected(value: /* e */ PageSizeSelectedEventArgs => Unit): Self = StObject.set(x, "pageSizeSelected", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPageSizeSelectedUndefined: Self = StObject.set(x, "pageSizeSelected", js.undefined)
      
      @scala.inline
      def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      @scala.inline
      def setShowPageInfo(value: Boolean): Self = StObject.set(x, "showPageInfo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowPageInfoUndefined: Self = StObject.set(x, "showPageInfo", js.undefined)
      
      @scala.inline
      def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
      
      @scala.inline
      def setTotalPages(value: Double): Self = StObject.set(x, "totalPages", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotalPagesUndefined: Self = StObject.set(x, "totalPages", js.undefined)
      
      @scala.inline
      def setTotalRecordsCount(value: Double): Self = StObject.set(x, "totalRecordsCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotalRecordsCountUndefined: Self = StObject.set(x, "totalRecordsCount", js.undefined)
    }
  }
  
  @js.native
  trait PageSizeSelectedEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** Returns the pager model.
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** Returns the name of event
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object PageSizeSelectedEventArgs {
    
    @scala.inline
    def apply(): PageSizeSelectedEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PageSizeSelectedEventArgs]
    }
    
    @scala.inline
    implicit class PageSizeSelectedEventArgsMutableBuilder[Self <: PageSizeSelectedEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
