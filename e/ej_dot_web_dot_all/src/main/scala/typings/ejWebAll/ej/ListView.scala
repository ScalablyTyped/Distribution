package typings.ejWebAll.ej

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListView
  extends StObject
     with Widget_ {
  
  /** To add item in the given index. If you have enabled grouping in ListView then you need to pass the corresponding group list title to add item in it. Depending on the data bound to
    * ListView, we need to pass either an HTML element or JSON objects in this method.
    * @param {string|any} To pass the list item as element/ JSON object
    * @param {number} Specifies the index where item to be added
    * @param {string} optionalThis is an optional parameter. You must pass the group list title here if grouping is enabled in the ListView
    * @returns {void}
    */
  def addItem(item: String, index: Double, groupid: String): Unit = js.native
  def addItem(item: Any, index: Double, groupid: String): Unit = js.native
  
  /** To check all the items.
    * @returns {void}
    */
  def checkAllItem(): Unit = js.native
  
  /** To check item in the given index.
    * @param {number} Specifies the index of the item to be checked
    * @returns {void}
    */
  def checkItem(index: Double): Unit = js.native
  
  /** To clear all the list item in the control before updating with new datasource.
    * @returns {void}
    */
  def clear(): Unit = js.native
  
  /** To make the item in the given index to be default state.
    * @param {number} Specifies the index to make the item to be in default state.
    * @returns {void}
    */
  def deActive(index: Double): Unit = js.native
  
  var defaults: Model = js.native
  
  /** To disable item in the given index.
    * @param {number} Specifies the index value to be disabled.
    * @returns {void}
    */
  def disableItem(index: Double): Unit = js.native
  
  /** To enable item in the given index.
    * @param {number} Specifies the index value to be enabled.
    * @returns {void}
    */
  def enableItem(index: Double): Unit = js.native
  
  /** To get the active item.
    * @returns {HTMLElement}
    */
  def getActiveItem(): HTMLElement = js.native
  
  /** To get the text of the active item.
    * @returns {string}
    */
  def getActiveItemText(): String = js.native
  
  /** To get all the checked items.
    * @returns {any[]}
    */
  def getCheckedItems(): js.Array[Any] = js.native
  
  /** To get the text of all the checked items.
    * @returns {any[]}
    */
  def getCheckedItemsText(): js.Array[Any] = js.native
  
  /** To get the text of the item in the given index.
    * @param {string|number} Specifies the index value to get the text value.
    * @returns {string}
    */
  def getItemText(index: String): String = js.native
  def getItemText(index: Double): String = js.native
  
  /** To get the total item count.
    * @returns {number}
    */
  def getItemsCount(): Double = js.native
  
  /** To check whether the item in the given index has child item.
    * @param {number} Specifies the index value to check the item has child or not.
    * @returns {boolean}
    */
  def hasChild(index: Double): Boolean = js.native
  
  /** To hide the list.
    * @returns {void}
    */
  def hide(): Unit = js.native
  
  /** To hide item in the given index.
    * @param {number} Specifies the index value to hide the item.
    * @returns {void}
    */
  def hideItem(index: Double): Unit = js.native
  
  /** To check whether item in the given index is checked.
    * @returns {boolean}
    */
  def isChecked(): Boolean = js.native
  
  /** To load the AJAX content while selecting the item.
    * @param {string} Specifies the item to load the AJAX content.
    * @returns {void}
    */
  def loadAjaxContent(item: String): Unit = js.native
  
  @JSName("model")
  var model_ListView: Model = js.native
  
  /** To remove the check mark either for specific item in the given index or for all items.
    * @param {number} Specifies the index value to remove the checkbox.
    * @returns {void}
    */
  def removeCheckMark(index: Double): Unit = js.native
  
  /** To remove item in the given index.
    * @param {number} Specifies the index value to remove the item.
    * @returns {void}
    */
  def removeItem(index: Double): Unit = js.native
  
  /** To select item in the given index.
    * @param {number} Specifies the index value to select the item.
    * @returns {void}
    */
  def selectItem(index: Double): Unit = js.native
  
  /** To make the item in the given index to be active state.
    * @param {number} Specifies the index value to make the item in active state.
    * @returns {void}
    */
  def setActive(index: Double): Unit = js.native
  
  /** To show the list.
    * @returns {void}
    */
  def show(): Unit = js.native
  
  /** To show item in the given index.
    * @param {number} Specifies the index value to show the hidden item.
    * @returns {void}
    */
  def showItem(index: Double): Unit = js.native
  
  /** To uncheck all the items.
    * @returns {void}
    */
  def unCheckAllItem(): Unit = js.native
  
  /** To uncheck item in the given index.
    * @param {number} Specifies the index value to uncheck the item.
    * @returns {void}
    */
  def unCheckItem(index: Double): Unit = js.native
}
object ListView {
  
  trait AjaxBeforeLoadEventArgs extends StObject {
    
    /** returns the AJAX settings.
      */
    var ajaxData: js.UndefOr[Any] = js.undefined
    
    /** returns true if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the model value of the control.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object AjaxBeforeLoadEventArgs {
    
    inline def apply(): AjaxBeforeLoadEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AjaxBeforeLoadEventArgs]
    }
    
    extension [Self <: AjaxBeforeLoadEventArgs](x: Self) {
      
      inline def setAjaxData(value: Any): Self = StObject.set(x, "ajaxData", value.asInstanceOf[js.Any])
      
      inline def setAjaxDataUndefined: Self = StObject.set(x, "ajaxData", js.undefined)
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait AjaxCompleteEventArgs extends StObject {
    
    /** returns true if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the model value of the control.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object AjaxCompleteEventArgs {
    
    inline def apply(): AjaxCompleteEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AjaxCompleteEventArgs]
    }
    
    extension [Self <: AjaxCompleteEventArgs](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait AjaxErrorEventArgs extends StObject {
    
    /** returns true if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the error thrown in the AJAX post.
      */
    var errorThrown: js.UndefOr[Any] = js.undefined
    
    /** returns the current item index.
      */
    var index: js.UndefOr[Double] = js.undefined
    
    /** returns the current list item.
      */
    var item: js.UndefOr[Any] = js.undefined
    
    /** returns the model value of the control.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** returns the current item text.
      */
    var text: js.UndefOr[String] = js.undefined
    
    /** returns the status.
      */
    var textStatus: js.UndefOr[Any] = js.undefined
    
    /** returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object AjaxErrorEventArgs {
    
    inline def apply(): AjaxErrorEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AjaxErrorEventArgs]
    }
    
    extension [Self <: AjaxErrorEventArgs](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setErrorThrown(value: Any): Self = StObject.set(x, "errorThrown", value.asInstanceOf[js.Any])
      
      inline def setErrorThrownUndefined: Self = StObject.set(x, "errorThrown", js.undefined)
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      inline def setItem(value: Any): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
      
      inline def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextStatus(value: Any): Self = StObject.set(x, "textStatus", value.asInstanceOf[js.Any])
      
      inline def setTextStatusUndefined: Self = StObject.set(x, "textStatus", js.undefined)
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait AjaxSettings extends StObject {
    
    /** It specifies, whether to enable or disable asynchronous request.
      */
    var async: js.UndefOr[Boolean] = js.undefined
    
    /** It specifies the page will be cached in the web browser.
      */
    var cache: js.UndefOr[Boolean] = js.undefined
    
    /** It specifies the type of data is send in the query string.
      */
    var contentType: js.UndefOr[String] = js.undefined
    
    /** It specifies the data as an object, will be passed in the query string.
      */
    var data: js.UndefOr[Any] = js.undefined
    
    /** It specifies the type of data that you're expecting back from the response.
      */
    var dataType: js.UndefOr[String] = js.undefined
    
    /** It specifies the HTTP request type.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object AjaxSettings {
    
    inline def apply(): typings.ejWebAll.ej.ListView.AjaxSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.ejWebAll.ej.ListView.AjaxSettings]
    }
    
    extension [Self <: typings.ejWebAll.ej.ListView.AjaxSettings](x: Self) {
      
      inline def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
      
      inline def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
      
      inline def setCache(value: Boolean): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      inline def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
      
      inline def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
      
      inline def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataType(value: String): Self = StObject.set(x, "dataType", value.asInstanceOf[js.Any])
      
      inline def setDataTypeUndefined: Self = StObject.set(x, "dataType", js.undefined)
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait AjaxSuccessEventArgs extends StObject {
    
    /** returns the current URL of the AJAX post.
      */
    var URL: js.UndefOr[String] = js.undefined
    
    /** returns true if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the AJAX current content.
      */
    var content: js.UndefOr[String] = js.undefined
    
    /** returns the current item index.
      */
    var index: js.UndefOr[Double] = js.undefined
    
    /** returns the current list item.
      */
    var item: js.UndefOr[Any] = js.undefined
    
    /** returns the model value of the control.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** returns the current item text.
      */
    var text: js.UndefOr[String] = js.undefined
    
    /** returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object AjaxSuccessEventArgs {
    
    inline def apply(): AjaxSuccessEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AjaxSuccessEventArgs]
    }
    
    extension [Self <: AjaxSuccessEventArgs](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      inline def setItem(value: Any): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
      
      inline def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setURL(value: String): Self = StObject.set(x, "URL", value.asInstanceOf[js.Any])
      
      inline def setURLUndefined: Self = StObject.set(x, "URL", js.undefined)
    }
  }
  
  trait FieldSettings extends StObject {
    
    /** Defines the HTML attributes such as id, class, styles for the specific list item.
      */
    var attributes: js.UndefOr[Any] = js.undefined
    
    /** Defines the specific field name which contains Boolean values to specify whether the list items to be checked by default or not.
      */
    var checked: js.UndefOr[Boolean] = js.undefined
    
    /** Defines the specific field name which contains id values for the list items.
      */
    var id: js.UndefOr[String] = js.undefined
    
    /** Defines the class name for image in that specific list items.
      */
    var imageClass: js.UndefOr[String] = js.undefined
    
    /** Defines the URL for the image to be displayed in the list item.
      */
    var imageUrl: js.UndefOr[String] = js.undefined
    
    /** To trigger the mousedown event for specific list items.
      */
    var mouseDown: js.UndefOr[String] = js.undefined
    
    /** To trigger the mouseup event for specific list items.
      */
    var mouseUP: js.UndefOr[String] = js.undefined
    
    /** Defines the URL to be navigated while clicking the list item.
      */
    var navigateUrl: js.UndefOr[String] = js.undefined
    
    /** To define the child level of list items inside the parent items.
      */
    var parentPrimaryKey: js.UndefOr[String] = js.undefined
    
    /** Specifies whether to retain the selection of the list item.
      */
    var persistSelection: js.UndefOr[Boolean] = js.undefined
    
    /** Specifies whether to prevent the selection of the list item.
      */
    var preventSelection: js.UndefOr[Boolean] = js.undefined
    
    /** To define the first level of list items.
      */
    var primaryKey: js.UndefOr[String] = js.undefined
    
    /** Defines the specific field name in the data source to load the list with data.
      */
    var text: js.UndefOr[String] = js.undefined
  }
  object FieldSettings {
    
    inline def apply(): FieldSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FieldSettings]
    }
    
    extension [Self <: FieldSettings](x: Self) {
      
      inline def setAttributes(value: Any): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
      
      inline def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
      
      inline def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setImageClass(value: String): Self = StObject.set(x, "imageClass", value.asInstanceOf[js.Any])
      
      inline def setImageClassUndefined: Self = StObject.set(x, "imageClass", js.undefined)
      
      inline def setImageUrl(value: String): Self = StObject.set(x, "imageUrl", value.asInstanceOf[js.Any])
      
      inline def setImageUrlUndefined: Self = StObject.set(x, "imageUrl", js.undefined)
      
      inline def setMouseDown(value: String): Self = StObject.set(x, "mouseDown", value.asInstanceOf[js.Any])
      
      inline def setMouseDownUndefined: Self = StObject.set(x, "mouseDown", js.undefined)
      
      inline def setMouseUP(value: String): Self = StObject.set(x, "mouseUP", value.asInstanceOf[js.Any])
      
      inline def setMouseUPUndefined: Self = StObject.set(x, "mouseUP", js.undefined)
      
      inline def setNavigateUrl(value: String): Self = StObject.set(x, "navigateUrl", value.asInstanceOf[js.Any])
      
      inline def setNavigateUrlUndefined: Self = StObject.set(x, "navigateUrl", js.undefined)
      
      inline def setParentPrimaryKey(value: String): Self = StObject.set(x, "parentPrimaryKey", value.asInstanceOf[js.Any])
      
      inline def setParentPrimaryKeyUndefined: Self = StObject.set(x, "parentPrimaryKey", js.undefined)
      
      inline def setPersistSelection(value: Boolean): Self = StObject.set(x, "persistSelection", value.asInstanceOf[js.Any])
      
      inline def setPersistSelectionUndefined: Self = StObject.set(x, "persistSelection", js.undefined)
      
      inline def setPreventSelection(value: Boolean): Self = StObject.set(x, "preventSelection", value.asInstanceOf[js.Any])
      
      inline def setPreventSelectionUndefined: Self = StObject.set(x, "preventSelection", js.undefined)
      
      inline def setPrimaryKey(value: String): Self = StObject.set(x, "primaryKey", value.asInstanceOf[js.Any])
      
      inline def setPrimaryKeyUndefined: Self = StObject.set(x, "primaryKey", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
  
  trait LoadCompleteEventArgs extends StObject {
    
    /** returns true if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the model value of the control.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object LoadCompleteEventArgs {
    
    inline def apply(): LoadCompleteEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LoadCompleteEventArgs]
    }
    
    extension [Self <: LoadCompleteEventArgs](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait LoadEventArgs extends StObject {
    
    /** returns true if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the model value of the control.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object LoadEventArgs {
    
    inline def apply(): LoadEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LoadEventArgs]
    }
    
    extension [Self <: LoadEventArgs](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait Model extends StObject {
    
    /** Event triggers before the AJAX request happens.
      */
    var ajaxBeforeLoad: js.UndefOr[js.Function1[/* e */ AjaxBeforeLoadEventArgs, Unit]] = js.undefined
    
    /** Event triggers after the AJAX content loaded completely.
      */
    var ajaxComplete: js.UndefOr[js.Function1[/* e */ AjaxCompleteEventArgs, Unit]] = js.undefined
    
    /** Event triggers when the AJAX request failed.
      */
    var ajaxError: js.UndefOr[js.Function1[/* e */ AjaxErrorEventArgs, Unit]] = js.undefined
    
    /** Specifies the ajaxSettings option to load the items to the ListView control.
      * @Default {null}
      */
    var ajaxSettings: js.UndefOr[typings.ejWebAll.ej.ListView.AjaxSettings] = js.undefined
    
    /** Event triggers after the AJAX content loaded successfully.
      */
    var ajaxSuccess: js.UndefOr[js.Function1[/* e */ AjaxSuccessEventArgs, Unit]] = js.undefined
    
    /** Loads the list data on demand via scrolling behavior to improve the applicationâ€™s performance. There are two ways to load data which can be defined using virtualScrollMode
      * property.
      * @Default {false}
      */
    var allowVirtualScrolling: js.UndefOr[Boolean] = js.undefined
    
    /** Set the index values to be selected on initial loading. This works only when enableCheckMark is set true.
      * @Default {[]}
      */
    var checkedIndices: js.UndefOr[js.Array[Any]] = js.undefined
    
    /** Sets the root class for ListView theme. This cssClass API helps to use custom skinning option for ListView control. By defining the root class using this API, we need to include
      * this root class in CSS.
      */
    var cssClass: js.UndefOr[String] = js.undefined
    
    /** Contains the list of data for generating the ListView items.
      * @Default {[]}
      */
    var dataSource: js.UndefOr[js.Array[Any]] = js.undefined
    
    /** Specifies whether to load AJAX content while selecting item.
      * @Default {false}
      */
    var enableAjax: js.UndefOr[Boolean] = js.undefined
    
    /** Specifies whether to enable caching the content.
      * @Default {false}
      */
    var enableCache: js.UndefOr[Boolean] = js.undefined
    
    /** Specifies whether to enable check mark for the item.
      * @Default {false}
      */
    var enableCheckMark: js.UndefOr[Boolean] = js.undefined
    
    /** Specifies whether to enable the filtering feature to filter the item.
      * @Default {false}
      */
    var enableFiltering: js.UndefOr[Boolean] = js.undefined
    
    /** Specifies whether to group the list item.
      * @Default {false}
      */
    var enableGroupList: js.UndefOr[Boolean] = js.undefined
    
    /** Specifies to maintain the current model value to browser cookies for state maintenance. While refresh the page, the model value will get apply to the control from browser cookies.
      * @Default {false}
      */
    var enablePersistence: js.UndefOr[Boolean] = js.undefined
    
    /** Specifies the field settings to map the datasource.
      */
    var fieldSettings: js.UndefOr[FieldSettings] = js.undefined
    
    /** Specifies the text of the back button in the header.
      * @Default {null}
      */
    var headerBackButtonText: js.UndefOr[String] = js.undefined
    
    /** Specifies the title of the header.
      * @Default {Title}
      */
    var headerTitle: js.UndefOr[String] = js.undefined
    
    /** Specifies the height.
      * @Default {null}
      */
    var height: js.UndefOr[String | Double] = js.undefined
    
    /** Specifies the number of items to be fetched on each scroll. Note: This property works only with Virtual scrolling.
      * @Default {5}
      */
    var itemRequestCount: js.UndefOr[Double] = js.undefined
    
    /** Contains the array of items to be added in ListView.
      * @Default {[]}
      */
    var items: js.UndefOr[js.Array[Any]] = js.undefined
    
    /** Event triggers before the items loaded.
      */
    var load: js.UndefOr[js.Function1[/* e */ LoadEventArgs, Unit]] = js.undefined
    
    /** Event triggers after the items loaded.
      */
    var loadComplete: js.UndefOr[js.Function1[/* e */ LoadCompleteEventArgs, Unit]] = js.undefined
    
    /** Set the localization culture for ListView Widget.
      */
    var locale: js.UndefOr[String] = js.undefined
    
    /** Event triggers when mouse down happens on the item.
      */
    var mouseDown: js.UndefOr[js.Function1[/* e */ MouseDownEventArgs, Unit]] = js.undefined
    
    /** Event triggers when mouse up happens on the item.
      */
    var mouseUp: js.UndefOr[js.Function1[/* e */ MouseUpEventArgs, Unit]] = js.undefined
    
    /** Specifies whether to retain the selection of the item.
      * @Default {false}
      */
    var persistSelection: js.UndefOr[Boolean] = js.undefined
    
    /** Specifies whether to prevent the selection of the item.
      * @Default {false}
      */
    var preventSelection: js.UndefOr[Boolean] = js.undefined
    
    /** Specifies the query to execute with the datasource.
      * @Default {null}
      */
    var query: js.UndefOr[Any] = js.undefined
    
    /** Specifies whether need to render the control with the template contents.
      * @Default {false}
      */
    var renderTemplate: js.UndefOr[Boolean] = js.undefined
    
    /** Specifies the index of item which need to be in selected state initially while loading.
      * @Default {0}
      */
    var selectedItemIndex: js.UndefOr[Double] = js.undefined
    
    /** Specifies whether to show the header.
      * @Default {true}
      */
    var showHeader: js.UndefOr[Boolean] = js.undefined
    
    /** Specifies whether to show the back button header.
      * @Default {false}
      */
    var showHeaderBackButton: js.UndefOr[Boolean] = js.undefined
    
    /** Specifies ID of the element contains template contents.
      * @Default {null}
      */
    var templateId: js.UndefOr[String] = js.undefined
    
    /** Specifies the maximum number of items to be fetched. Note: This will work only with Virtual scrolling
      * @Default {5}
      */
    var totalItemsCount: js.UndefOr[Double] = js.undefined
    
    /** Specifies the virtual scroll mode to load the list data on demand via scrolling behavior. There are two types of mode.
      * @Default {ej.VirtualScrollMode.Normal}
      */
    var virtualScrollMode: js.UndefOr[VirtualScrollMode | String] = js.undefined
    
    /** Specifies the width.
      * @Default {null}
      */
    var width: js.UndefOr[String | Double] = js.undefined
  }
  object Model {
    
    inline def apply(): typings.ejWebAll.ej.ListView.Model = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.ejWebAll.ej.ListView.Model]
    }
    
    extension [Self <: typings.ejWebAll.ej.ListView.Model](x: Self) {
      
      inline def setAjaxBeforeLoad(value: /* e */ AjaxBeforeLoadEventArgs => Unit): Self = StObject.set(x, "ajaxBeforeLoad", js.Any.fromFunction1(value))
      
      inline def setAjaxBeforeLoadUndefined: Self = StObject.set(x, "ajaxBeforeLoad", js.undefined)
      
      inline def setAjaxComplete(value: /* e */ AjaxCompleteEventArgs => Unit): Self = StObject.set(x, "ajaxComplete", js.Any.fromFunction1(value))
      
      inline def setAjaxCompleteUndefined: Self = StObject.set(x, "ajaxComplete", js.undefined)
      
      inline def setAjaxError(value: /* e */ AjaxErrorEventArgs => Unit): Self = StObject.set(x, "ajaxError", js.Any.fromFunction1(value))
      
      inline def setAjaxErrorUndefined: Self = StObject.set(x, "ajaxError", js.undefined)
      
      inline def setAjaxSettings(value: typings.ejWebAll.ej.ListView.AjaxSettings): Self = StObject.set(x, "ajaxSettings", value.asInstanceOf[js.Any])
      
      inline def setAjaxSettingsUndefined: Self = StObject.set(x, "ajaxSettings", js.undefined)
      
      inline def setAjaxSuccess(value: /* e */ AjaxSuccessEventArgs => Unit): Self = StObject.set(x, "ajaxSuccess", js.Any.fromFunction1(value))
      
      inline def setAjaxSuccessUndefined: Self = StObject.set(x, "ajaxSuccess", js.undefined)
      
      inline def setAllowVirtualScrolling(value: Boolean): Self = StObject.set(x, "allowVirtualScrolling", value.asInstanceOf[js.Any])
      
      inline def setAllowVirtualScrollingUndefined: Self = StObject.set(x, "allowVirtualScrolling", js.undefined)
      
      inline def setCheckedIndices(value: js.Array[Any]): Self = StObject.set(x, "checkedIndices", value.asInstanceOf[js.Any])
      
      inline def setCheckedIndicesUndefined: Self = StObject.set(x, "checkedIndices", js.undefined)
      
      inline def setCheckedIndicesVarargs(value: Any*): Self = StObject.set(x, "checkedIndices", js.Array(value*))
      
      inline def setCssClass(value: String): Self = StObject.set(x, "cssClass", value.asInstanceOf[js.Any])
      
      inline def setCssClassUndefined: Self = StObject.set(x, "cssClass", js.undefined)
      
      inline def setDataSource(value: js.Array[Any]): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
      
      inline def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
      
      inline def setDataSourceVarargs(value: Any*): Self = StObject.set(x, "dataSource", js.Array(value*))
      
      inline def setEnableAjax(value: Boolean): Self = StObject.set(x, "enableAjax", value.asInstanceOf[js.Any])
      
      inline def setEnableAjaxUndefined: Self = StObject.set(x, "enableAjax", js.undefined)
      
      inline def setEnableCache(value: Boolean): Self = StObject.set(x, "enableCache", value.asInstanceOf[js.Any])
      
      inline def setEnableCacheUndefined: Self = StObject.set(x, "enableCache", js.undefined)
      
      inline def setEnableCheckMark(value: Boolean): Self = StObject.set(x, "enableCheckMark", value.asInstanceOf[js.Any])
      
      inline def setEnableCheckMarkUndefined: Self = StObject.set(x, "enableCheckMark", js.undefined)
      
      inline def setEnableFiltering(value: Boolean): Self = StObject.set(x, "enableFiltering", value.asInstanceOf[js.Any])
      
      inline def setEnableFilteringUndefined: Self = StObject.set(x, "enableFiltering", js.undefined)
      
      inline def setEnableGroupList(value: Boolean): Self = StObject.set(x, "enableGroupList", value.asInstanceOf[js.Any])
      
      inline def setEnableGroupListUndefined: Self = StObject.set(x, "enableGroupList", js.undefined)
      
      inline def setEnablePersistence(value: Boolean): Self = StObject.set(x, "enablePersistence", value.asInstanceOf[js.Any])
      
      inline def setEnablePersistenceUndefined: Self = StObject.set(x, "enablePersistence", js.undefined)
      
      inline def setFieldSettings(value: FieldSettings): Self = StObject.set(x, "fieldSettings", value.asInstanceOf[js.Any])
      
      inline def setFieldSettingsUndefined: Self = StObject.set(x, "fieldSettings", js.undefined)
      
      inline def setHeaderBackButtonText(value: String): Self = StObject.set(x, "headerBackButtonText", value.asInstanceOf[js.Any])
      
      inline def setHeaderBackButtonTextUndefined: Self = StObject.set(x, "headerBackButtonText", js.undefined)
      
      inline def setHeaderTitle(value: String): Self = StObject.set(x, "headerTitle", value.asInstanceOf[js.Any])
      
      inline def setHeaderTitleUndefined: Self = StObject.set(x, "headerTitle", js.undefined)
      
      inline def setHeight(value: String | Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setItemRequestCount(value: Double): Self = StObject.set(x, "itemRequestCount", value.asInstanceOf[js.Any])
      
      inline def setItemRequestCountUndefined: Self = StObject.set(x, "itemRequestCount", js.undefined)
      
      inline def setItems(value: js.Array[Any]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      inline def setItemsVarargs(value: Any*): Self = StObject.set(x, "items", js.Array(value*))
      
      inline def setLoad(value: /* e */ LoadEventArgs => Unit): Self = StObject.set(x, "load", js.Any.fromFunction1(value))
      
      inline def setLoadComplete(value: /* e */ LoadCompleteEventArgs => Unit): Self = StObject.set(x, "loadComplete", js.Any.fromFunction1(value))
      
      inline def setLoadCompleteUndefined: Self = StObject.set(x, "loadComplete", js.undefined)
      
      inline def setLoadUndefined: Self = StObject.set(x, "load", js.undefined)
      
      inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      inline def setMouseDown(value: /* e */ MouseDownEventArgs => Unit): Self = StObject.set(x, "mouseDown", js.Any.fromFunction1(value))
      
      inline def setMouseDownUndefined: Self = StObject.set(x, "mouseDown", js.undefined)
      
      inline def setMouseUp(value: /* e */ MouseUpEventArgs => Unit): Self = StObject.set(x, "mouseUp", js.Any.fromFunction1(value))
      
      inline def setMouseUpUndefined: Self = StObject.set(x, "mouseUp", js.undefined)
      
      inline def setPersistSelection(value: Boolean): Self = StObject.set(x, "persistSelection", value.asInstanceOf[js.Any])
      
      inline def setPersistSelectionUndefined: Self = StObject.set(x, "persistSelection", js.undefined)
      
      inline def setPreventSelection(value: Boolean): Self = StObject.set(x, "preventSelection", value.asInstanceOf[js.Any])
      
      inline def setPreventSelectionUndefined: Self = StObject.set(x, "preventSelection", js.undefined)
      
      inline def setQuery(value: Any): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
      
      inline def setRenderTemplate(value: Boolean): Self = StObject.set(x, "renderTemplate", value.asInstanceOf[js.Any])
      
      inline def setRenderTemplateUndefined: Self = StObject.set(x, "renderTemplate", js.undefined)
      
      inline def setSelectedItemIndex(value: Double): Self = StObject.set(x, "selectedItemIndex", value.asInstanceOf[js.Any])
      
      inline def setSelectedItemIndexUndefined: Self = StObject.set(x, "selectedItemIndex", js.undefined)
      
      inline def setShowHeader(value: Boolean): Self = StObject.set(x, "showHeader", value.asInstanceOf[js.Any])
      
      inline def setShowHeaderBackButton(value: Boolean): Self = StObject.set(x, "showHeaderBackButton", value.asInstanceOf[js.Any])
      
      inline def setShowHeaderBackButtonUndefined: Self = StObject.set(x, "showHeaderBackButton", js.undefined)
      
      inline def setShowHeaderUndefined: Self = StObject.set(x, "showHeader", js.undefined)
      
      inline def setTemplateId(value: String): Self = StObject.set(x, "templateId", value.asInstanceOf[js.Any])
      
      inline def setTemplateIdUndefined: Self = StObject.set(x, "templateId", js.undefined)
      
      inline def setTotalItemsCount(value: Double): Self = StObject.set(x, "totalItemsCount", value.asInstanceOf[js.Any])
      
      inline def setTotalItemsCountUndefined: Self = StObject.set(x, "totalItemsCount", js.undefined)
      
      inline def setVirtualScrollMode(value: VirtualScrollMode | String): Self = StObject.set(x, "virtualScrollMode", value.asInstanceOf[js.Any])
      
      inline def setVirtualScrollModeUndefined: Self = StObject.set(x, "virtualScrollMode", js.undefined)
      
      inline def setWidth(value: String | Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait MouseDownEventArgs extends StObject {
    
    /** returns true if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the list of checked items.
      */
    var checkedItems: js.UndefOr[Double] = js.undefined
    
    /** returns the current checked item text.
      */
    var checkedItemsText: js.UndefOr[String] = js.undefined
    
    /** If the child element exist return true; otherwise, false.
      */
    var hasChild: js.UndefOr[Boolean] = js.undefined
    
    /** returns the current Index of the item.
      */
    var index: js.UndefOr[Double] = js.undefined
    
    /** If checked return true; otherwise, false.
      */
    var isChecked: js.UndefOr[Boolean] = js.undefined
    
    /** returns the current list item.
      */
    var item: js.UndefOr[String] = js.undefined
    
    /** returns the model value of the control.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** returns the current text of item.
      */
    var text: js.UndefOr[String] = js.undefined
    
    /** returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object MouseDownEventArgs {
    
    inline def apply(): MouseDownEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MouseDownEventArgs]
    }
    
    extension [Self <: MouseDownEventArgs](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setCheckedItems(value: Double): Self = StObject.set(x, "checkedItems", value.asInstanceOf[js.Any])
      
      inline def setCheckedItemsText(value: String): Self = StObject.set(x, "checkedItemsText", value.asInstanceOf[js.Any])
      
      inline def setCheckedItemsTextUndefined: Self = StObject.set(x, "checkedItemsText", js.undefined)
      
      inline def setCheckedItemsUndefined: Self = StObject.set(x, "checkedItems", js.undefined)
      
      inline def setHasChild(value: Boolean): Self = StObject.set(x, "hasChild", value.asInstanceOf[js.Any])
      
      inline def setHasChildUndefined: Self = StObject.set(x, "hasChild", js.undefined)
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      inline def setIsChecked(value: Boolean): Self = StObject.set(x, "isChecked", value.asInstanceOf[js.Any])
      
      inline def setIsCheckedUndefined: Self = StObject.set(x, "isChecked", js.undefined)
      
      inline def setItem(value: String): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
      
      inline def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait MouseUpEventArgs extends StObject {
    
    /** returns true if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the list of checked items.
      */
    var checkedItems: js.UndefOr[Double] = js.undefined
    
    /** returns the current checked item text.
      */
    var checkedItemsText: js.UndefOr[String] = js.undefined
    
    /** If the child element exist return true; otherwise, false.
      */
    var hasChild: js.UndefOr[Boolean] = js.undefined
    
    /** returns the current Index of the item.
      */
    var index: js.UndefOr[Double] = js.undefined
    
    /** If checked return true; otherwise, false.
      */
    var isChecked: js.UndefOr[Boolean] = js.undefined
    
    /** returns the current list item.
      */
    var item: js.UndefOr[String] = js.undefined
    
    /** returns the model value of the control.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** returns the current text of item.
      */
    var text: js.UndefOr[String] = js.undefined
    
    /** returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object MouseUpEventArgs {
    
    inline def apply(): MouseUpEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MouseUpEventArgs]
    }
    
    extension [Self <: MouseUpEventArgs](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setCheckedItems(value: Double): Self = StObject.set(x, "checkedItems", value.asInstanceOf[js.Any])
      
      inline def setCheckedItemsText(value: String): Self = StObject.set(x, "checkedItemsText", value.asInstanceOf[js.Any])
      
      inline def setCheckedItemsTextUndefined: Self = StObject.set(x, "checkedItemsText", js.undefined)
      
      inline def setCheckedItemsUndefined: Self = StObject.set(x, "checkedItems", js.undefined)
      
      inline def setHasChild(value: Boolean): Self = StObject.set(x, "hasChild", value.asInstanceOf[js.Any])
      
      inline def setHasChildUndefined: Self = StObject.set(x, "hasChild", js.undefined)
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      inline def setIsChecked(value: Boolean): Self = StObject.set(x, "isChecked", value.asInstanceOf[js.Any])
      
      inline def setIsCheckedUndefined: Self = StObject.set(x, "isChecked", js.undefined)
      
      inline def setItem(value: String): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
      
      inline def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
