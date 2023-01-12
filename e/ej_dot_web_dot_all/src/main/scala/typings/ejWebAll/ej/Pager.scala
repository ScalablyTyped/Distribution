package typings.ejWebAll.ej

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Pager
  extends StObject
     with Widget_ {
  
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
  
  trait ChangeEventArgs extends StObject {
    
    /** Returns the current page index.
      */
    var currentPage: js.UndefOr[Double] = js.undefined
    
    /** Returns current action event type and its target.
      */
    var event: js.UndefOr[Any] = js.undefined
    
    /** Returns the pager model.
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** Returns the name of event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object ChangeEventArgs {
    
    inline def apply(): ChangeEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChangeEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ChangeEventArgs] (val x: Self) extends AnyVal {
      
      inline def setCurrentPage(value: Double): Self = StObject.set(x, "currentPage", value.asInstanceOf[js.Any])
      
      inline def setCurrentPageUndefined: Self = StObject.set(x, "currentPage", js.undefined)
      
      inline def setEvent(value: Any): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      inline def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait ClickEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the current page index.
      */
    var currentPage: js.UndefOr[Double] = js.undefined
    
    /** Returns current action event type and its target.
      */
    var event: js.UndefOr[Any] = js.undefined
    
    /** Returns the pager model.
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** Returns the name of event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object ClickEventArgs {
    
    inline def apply(): ClickEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClickEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ClickEventArgs] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setCurrentPage(value: Double): Self = StObject.set(x, "currentPage", value.asInstanceOf[js.Any])
      
      inline def setCurrentPageUndefined: Self = StObject.set(x, "currentPage", js.undefined)
      
      inline def setEvent(value: Any): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      inline def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait CreateEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the pager model.
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** Returns the name of event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object CreateEventArgs {
    
    inline def apply(): CreateEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CreateEventArgs] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait DestroyEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the pager model.
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** Returns the name of event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object DestroyEventArgs {
    
    inline def apply(): DestroyEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DestroyEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DestroyEventArgs] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait Model extends StObject {
    
    /** Triggers when the current page value of the Pager control is changed.
      */
    var change: js.UndefOr[js.Function1[/* e */ ChangeEventArgs, Unit]] = js.undefined
    
    /** Triggered when pager numeric item is clicked in pager control.
      */
    var click: js.UndefOr[js.Function1[/* e */ ClickEventArgs, Unit]] = js.undefined
    
    /** Triggered when Pager control is successfully created.
      */
    var create: js.UndefOr[js.Function1[/* e */ CreateEventArgs, Unit]] = js.undefined
    
    /** Sets the root CSS class, which can be used for customization of pager control.
      */
    var cssClass: js.UndefOr[String] = js.undefined
    
    /** Gets or sets a value that indicates whether to define which page to display currently in pager.
      * @Default {1}
      */
    var currentPage: js.UndefOr[Double] = js.undefined
    
    /** Gets or sets a value that indicates whether to display the custom text message in Pager.
      */
    var customText: js.UndefOr[String] = js.undefined
    
    /** Triggered when Pager control is successfully destroyed.
      */
    var destroy: js.UndefOr[js.Function1[/* e */ DestroyEventArgs, Unit]] = js.undefined
    
    /** Gets or sets a value that indicates whether to display the external Message in Pager.
      * @Default {false}
      */
    var enableExternalMessage: js.UndefOr[Boolean] = js.undefined
    
    /** Gets or sets a value that indicates whether to pass the current page information as a query string along with the URL while navigating to other page.
      * @Default {false}
      */
    var enableQueryString: js.UndefOr[Boolean] = js.undefined
    
    /** Align content in the pager control from right to left by setting the property as true.
      * @Default {false}
      */
    var enableRTL: js.UndefOr[Boolean] = js.undefined
    
    /** Enable or disable the Pager control.
      * @Default {true}
      */
    var enabled: js.UndefOr[Boolean] = js.undefined
    
    /** Gets or sets a value that indicates whether to display the external Message in Pager.
      */
    var externalMessage: js.UndefOr[String] = js.undefined
    
    /** Enables or disables responsive support for the Pager control items on window resize.
      * @Default {false}
      */
    var isResponsive: js.UndefOr[Boolean] = js.undefined
    
    /** Gets or sets a value that indicates whether to customizing the user interface (UI) as locale-specific in order to display regional data i.e. in a language and culture specific to
      * a particular country or region.
      * @Default {en-US}
      */
    var locale: js.UndefOr[String] = js.undefined
    
    /** Gets or sets a value that indicates whether to define the number of pages displayed in the pager for navigation.
      * @Default {10}
      */
    var pageCount: js.UndefOr[Double] = js.undefined
    
    /** Gets or sets a value that indicates whether to define the number of records displayed per page.
      * @Default {12}
      */
    var pageSize: js.UndefOr[Double] = js.undefined
    
    /** It allows to have multiple choices of pageSize values for Pager control. The &quot;pageSize&quot; API value of the pager will be updated depending upon the value being selected
      * from the dropdown.
      * @Default {null}
      */
    var pageSizeList: js.UndefOr[js.Array[Any]] = js.undefined
    
    /** Indicates the pageSizeMessage to be displayed in Pager when pageSizeList API is defined.
      */
    var pageSizeMessage: js.UndefOr[String] = js.undefined
    
    /** Triggered when a value is selected in the pageSizeList dropdown.
      */
    var pageSizeSelected: js.UndefOr[js.Function1[/* e */ PageSizeSelectedEventArgs, Unit]] = js.undefined
    
    /** Shows or hides the current page information in pager footer.
      * @Default {true}
      */
    var showPageInfo: js.UndefOr[Boolean] = js.undefined
    
    /** Template option allows to customize UI appearance of the ejPager by defining their own page layout.
      * @Default {null}
      */
    var template: js.UndefOr[String] = js.undefined
    
    /** Get or sets a value of total number of pages in the pager. The totalPages value is calculated based on page size and total records.
      * @Default {null}
      */
    var totalPages: js.UndefOr[Double] = js.undefined
    
    /** Get the value of total number of records which is bound to a data item.
      * @Default {null}
      */
    var totalRecordsCount: js.UndefOr[Double] = js.undefined
  }
  object Model {
    
    inline def apply(): typings.ejWebAll.ej.Pager.Model = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.ejWebAll.ej.Pager.Model]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: typings.ejWebAll.ej.Pager.Model] (val x: Self) extends AnyVal {
      
      inline def setChange(value: /* e */ ChangeEventArgs => Unit): Self = StObject.set(x, "change", js.Any.fromFunction1(value))
      
      inline def setChangeUndefined: Self = StObject.set(x, "change", js.undefined)
      
      inline def setClick(value: /* e */ ClickEventArgs => Unit): Self = StObject.set(x, "click", js.Any.fromFunction1(value))
      
      inline def setClickUndefined: Self = StObject.set(x, "click", js.undefined)
      
      inline def setCreate(value: /* e */ CreateEventArgs => Unit): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
      
      inline def setCreateUndefined: Self = StObject.set(x, "create", js.undefined)
      
      inline def setCssClass(value: String): Self = StObject.set(x, "cssClass", value.asInstanceOf[js.Any])
      
      inline def setCssClassUndefined: Self = StObject.set(x, "cssClass", js.undefined)
      
      inline def setCurrentPage(value: Double): Self = StObject.set(x, "currentPage", value.asInstanceOf[js.Any])
      
      inline def setCurrentPageUndefined: Self = StObject.set(x, "currentPage", js.undefined)
      
      inline def setCustomText(value: String): Self = StObject.set(x, "customText", value.asInstanceOf[js.Any])
      
      inline def setCustomTextUndefined: Self = StObject.set(x, "customText", js.undefined)
      
      inline def setDestroy(value: /* e */ DestroyEventArgs => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction1(value))
      
      inline def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
      
      inline def setEnableExternalMessage(value: Boolean): Self = StObject.set(x, "enableExternalMessage", value.asInstanceOf[js.Any])
      
      inline def setEnableExternalMessageUndefined: Self = StObject.set(x, "enableExternalMessage", js.undefined)
      
      inline def setEnableQueryString(value: Boolean): Self = StObject.set(x, "enableQueryString", value.asInstanceOf[js.Any])
      
      inline def setEnableQueryStringUndefined: Self = StObject.set(x, "enableQueryString", js.undefined)
      
      inline def setEnableRTL(value: Boolean): Self = StObject.set(x, "enableRTL", value.asInstanceOf[js.Any])
      
      inline def setEnableRTLUndefined: Self = StObject.set(x, "enableRTL", js.undefined)
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setExternalMessage(value: String): Self = StObject.set(x, "externalMessage", value.asInstanceOf[js.Any])
      
      inline def setExternalMessageUndefined: Self = StObject.set(x, "externalMessage", js.undefined)
      
      inline def setIsResponsive(value: Boolean): Self = StObject.set(x, "isResponsive", value.asInstanceOf[js.Any])
      
      inline def setIsResponsiveUndefined: Self = StObject.set(x, "isResponsive", js.undefined)
      
      inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      inline def setPageCount(value: Double): Self = StObject.set(x, "pageCount", value.asInstanceOf[js.Any])
      
      inline def setPageCountUndefined: Self = StObject.set(x, "pageCount", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeList(value: js.Array[Any]): Self = StObject.set(x, "pageSizeList", value.asInstanceOf[js.Any])
      
      inline def setPageSizeListUndefined: Self = StObject.set(x, "pageSizeList", js.undefined)
      
      inline def setPageSizeListVarargs(value: Any*): Self = StObject.set(x, "pageSizeList", js.Array(value*))
      
      inline def setPageSizeMessage(value: String): Self = StObject.set(x, "pageSizeMessage", value.asInstanceOf[js.Any])
      
      inline def setPageSizeMessageUndefined: Self = StObject.set(x, "pageSizeMessage", js.undefined)
      
      inline def setPageSizeSelected(value: /* e */ PageSizeSelectedEventArgs => Unit): Self = StObject.set(x, "pageSizeSelected", js.Any.fromFunction1(value))
      
      inline def setPageSizeSelectedUndefined: Self = StObject.set(x, "pageSizeSelected", js.undefined)
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setShowPageInfo(value: Boolean): Self = StObject.set(x, "showPageInfo", value.asInstanceOf[js.Any])
      
      inline def setShowPageInfoUndefined: Self = StObject.set(x, "showPageInfo", js.undefined)
      
      inline def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
      
      inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
      
      inline def setTotalPages(value: Double): Self = StObject.set(x, "totalPages", value.asInstanceOf[js.Any])
      
      inline def setTotalPagesUndefined: Self = StObject.set(x, "totalPages", js.undefined)
      
      inline def setTotalRecordsCount(value: Double): Self = StObject.set(x, "totalRecordsCount", value.asInstanceOf[js.Any])
      
      inline def setTotalRecordsCountUndefined: Self = StObject.set(x, "totalRecordsCount", js.undefined)
    }
  }
  
  trait PageSizeSelectedEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the pager model.
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** Returns the name of event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object PageSizeSelectedEventArgs {
    
    inline def apply(): PageSizeSelectedEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PageSizeSelectedEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PageSizeSelectedEventArgs] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
