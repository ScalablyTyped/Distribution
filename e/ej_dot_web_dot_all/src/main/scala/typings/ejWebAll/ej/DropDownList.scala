package typings.ejWebAll.ej

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DropDownList
  extends StObject
     with Widget_ {
  
  def addItem(data: js.Array[Any]): Unit = js.native
  /** Adding a single item or an array of items into the DropDownList allows you to specify all the field attributes such as value, template, image URL, and HTML attributes for those
    * items.Grouping and sorting will not be supported when we add items through this method.
    * @param {any|any[]}  this parameter should have field attributes with respect to mapped field attributes and it's corresponding values to fields
    * @returns {void}
    */
  def addItem(data: Any): Unit = js.native
  
  /** This method is used to select all the items in the DropDownList.
    * @returns {void}
    */
  def checkAll(): Unit = js.native
  
  /** Clears the text in the DropDownList textbox.
    * @returns {void}
    */
  def clearText(): Unit = js.native
  
  var defaults: Model = js.native
  
  /** This property is used to disable the DropDownList widget.
    * @returns {void}
    */
  def disable(): Unit = js.native
  
  /** This property disables the set of items in the DropDownList.
    * @param {string|number|any[]}  disable the given index list items
    * @returns {void}
    */
  def disableItemsByIndices(index: String): Unit = js.native
  def disableItemsByIndices(index: js.Array[Any]): Unit = js.native
  def disableItemsByIndices(index: Double): Unit = js.native
  
  /** This property enables the DropDownList control.
    * @returns {void}
    */
  def enable(): Unit = js.native
  
  /** Enables an Item or set of Items that are disabled in the DropDownList
    * @param {string|number|any[]}  enable the given index list items if it's disabled
    * @returns {void}
    */
  def enableItemsByIndices(index: String): Unit = js.native
  def enableItemsByIndices(index: js.Array[Any]): Unit = js.native
  def enableItemsByIndices(index: Double): Unit = js.native
  
  /** This method retrieves the items using given value.
    * @param {string|number|any}  Return the whole object of data based on given value
    * @returns {any[]}
    */
  def getItemDataByValue(value: String): js.Array[Any] = js.native
  def getItemDataByValue(value: Any): js.Array[Any] = js.native
  def getItemDataByValue(value: Double): js.Array[Any] = js.native
  
  /** This method is used to retrieve the items that are bound with the DropDownList.
    * @returns {any}
    */
  def getListData(): Any = js.native
  
  /** This method is used to get the selected items in the DropDownList.
    * @returns {any[]}
    */
  def getSelectedItem(): js.Array[Any] = js.native
  
  /** This method is used to retrieve the items value that are selected in the DropDownList.
    * @returns {string}
    */
  def getSelectedValue(): String = js.native
  
  /** This method hides the suggestion popup in the DropDownList.
    * @returns {void}
    */
  def hidePopup(): Unit = js.native
  
  @JSName("model")
  var model_DropDownList: Model = js.native
  
  /** This method is used to select an item in the DropDownList by using the given text value.
    * @param {string|number|any[]}  select the list items relates to given text
    * @returns {void}
    */
  def selectItemByText(index: String): Unit = js.native
  def selectItemByText(index: js.Array[Any]): Unit = js.native
  def selectItemByText(index: Double): Unit = js.native
  
  /** This method is used to select an item in the DropDownList by using the given value.
    * @param {string|number|any[]}  select the list items relates to given values
    * @returns {void}
    */
  def selectItemByValue(index: String): Unit = js.native
  def selectItemByValue(index: js.Array[Any]): Unit = js.native
  def selectItemByValue(index: Double): Unit = js.native
  
  /** This method is used to select the list of items in the DropDownList through the Index of the items.
    * @param {string|number|any[]}  select the given index list items
    * @returns {void}
    */
  def selectItemsByIndices(index: String): Unit = js.native
  def selectItemsByIndices(index: js.Array[Any]): Unit = js.native
  def selectItemsByIndices(index: Double): Unit = js.native
  
  /** This method shows the DropDownList control with the suggestion popup.
    * @returns {void}
    */
  def showPopup(): Unit = js.native
  
  /** This method is used to unselect all the items in the DropDownList.
    * @returns {void}
    */
  def unCheckAll(): Unit = js.native
  
  /** This method is used to unselect an item in the DropDownList by using the given text value.
    * @param {string|number|any[]}  unselect the list items relates to given text
    * @returns {void}
    */
  def unselectItemByText(index: String): Unit = js.native
  def unselectItemByText(index: js.Array[Any]): Unit = js.native
  def unselectItemByText(index: Double): Unit = js.native
  
  /** This method is used to unselect an item in the DropDownList by using the given value.
    * @param {string|number|any[]}  unselect the list items relates to given values
    * @returns {void}
    */
  def unselectItemByValue(index: String): Unit = js.native
  def unselectItemByValue(index: js.Array[Any]): Unit = js.native
  def unselectItemByValue(index: Double): Unit = js.native
  
  /** This method is used to unselect the list of items in the DropDownList through Index of the items.
    * @param {string|number|any[]}  unselect the given index list items
    * @returns {void}
    */
  def unselectItemsByIndices(index: String): Unit = js.native
  def unselectItemsByIndices(index: js.Array[Any]): Unit = js.native
  def unselectItemsByIndices(index: Double): Unit = js.native
}
object DropDownList {
  
  trait ActionBeginEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the DropDownList model
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object ActionBeginEventArgs {
    
    inline def apply(): ActionBeginEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ActionBeginEventArgs]
    }
    
    extension [Self <: ActionBeginEventArgs](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait ActionCompleteEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns number of times trying to fetch the data
      */
    var count: js.UndefOr[Double] = js.undefined
    
    /** returns the DropDownList model
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** Returns the query for data retrieval
      */
    var query: js.UndefOr[Any] = js.undefined
    
    /** Returns the query for data retrieval from the Database
      */
    var request: js.UndefOr[Any] = js.undefined
    
    /** Returns the number of items fetched from remote data
      */
    var result: js.UndefOr[js.Array[Any]] = js.undefined
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
    
    /** Returns the requested data
      */
    var xhr: js.UndefOr[Any] = js.undefined
  }
  object ActionCompleteEventArgs {
    
    inline def apply(): ActionCompleteEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ActionCompleteEventArgs]
    }
    
    extension [Self <: ActionCompleteEventArgs](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setQuery(value: Any): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
      
      inline def setRequest(value: Any): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      inline def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
      
      inline def setResult(value: js.Array[Any]): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
      
      inline def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
      
      inline def setResultVarargs(value: Any*): Self = StObject.set(x, "result", js.Array(value*))
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setXhr(value: Any): Self = StObject.set(x, "xhr", value.asInstanceOf[js.Any])
      
      inline def setXhrUndefined: Self = StObject.set(x, "xhr", js.undefined)
    }
  }
  
  trait ActionFailureEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the error message
      */
    var error: js.UndefOr[Any] = js.undefined
    
    /** returns the DropDownList model
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** Returns the query for data retrieval
      */
    var query: js.UndefOr[Any] = js.undefined
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object ActionFailureEventArgs {
    
    inline def apply(): ActionFailureEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ActionFailureEventArgs]
    }
    
    extension [Self <: ActionFailureEventArgs](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setError(value: Any): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setQuery(value: Any): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait ActionSuccessEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns number of times trying to fetch the data
      */
    var count: js.UndefOr[Double] = js.undefined
    
    /** returns the DropDownList model
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** Returns the query for data retrieval
      */
    var query: js.UndefOr[Any] = js.undefined
    
    /** Returns the query for data retrieval from the Database
      */
    var request: js.UndefOr[Any] = js.undefined
    
    /** Returns the number of items fetched from remote data
      */
    var result: js.UndefOr[js.Array[Any]] = js.undefined
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
    
    /** Returns the requested data
      */
    var xhr: js.UndefOr[Any] = js.undefined
  }
  object ActionSuccessEventArgs {
    
    inline def apply(): ActionSuccessEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ActionSuccessEventArgs]
    }
    
    extension [Self <: ActionSuccessEventArgs](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setQuery(value: Any): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
      
      inline def setRequest(value: Any): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      inline def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
      
      inline def setResult(value: js.Array[Any]): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
      
      inline def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
      
      inline def setResultVarargs(value: Any*): Self = StObject.set(x, "result", js.Array(value*))
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setXhr(value: Any): Self = StObject.set(x, "xhr", value.asInstanceOf[js.Any])
      
      inline def setXhrUndefined: Self = StObject.set(x, "xhr", js.undefined)
    }
  }
  
  trait BeforePopupHideEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the DropDownList model
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** returns the selected text
      */
    var text: js.UndefOr[String] = js.undefined
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
    
    /** returns the selected value
      */
    var value: js.UndefOr[String] = js.undefined
  }
  object BeforePopupHideEventArgs {
    
    inline def apply(): BeforePopupHideEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BeforePopupHideEventArgs]
    }
    
    extension [Self <: BeforePopupHideEventArgs](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait BeforePopupShownEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the DropDownList model
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** returns the selected text
      */
    var text: js.UndefOr[String] = js.undefined
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
    
    /** returns the selected value
      */
    var value: js.UndefOr[String] = js.undefined
  }
  object BeforePopupShownEventArgs {
    
    inline def apply(): BeforePopupShownEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BeforePopupShownEventArgs]
    }
    
    extension [Self <: BeforePopupShownEventArgs](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait CascadeEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the cascading dropdown model.
      */
    var cascadeModel: js.UndefOr[Any] = js.undefined
    
    /** returns the current selected value in first dropdown.
      */
    var cascadeValue: js.UndefOr[String] = js.undefined
    
    /** returns the DropDownList model
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** returns the default filter action for second dropdown data should happen or not.
      */
    var requiresDefaultFilter: js.UndefOr[Boolean] = js.undefined
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object CascadeEventArgs {
    
    inline def apply(): CascadeEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CascadeEventArgs]
    }
    
    extension [Self <: CascadeEventArgs](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setCascadeModel(value: Any): Self = StObject.set(x, "cascadeModel", value.asInstanceOf[js.Any])
      
      inline def setCascadeModelUndefined: Self = StObject.set(x, "cascadeModel", js.undefined)
      
      inline def setCascadeValue(value: String): Self = StObject.set(x, "cascadeValue", value.asInstanceOf[js.Any])
      
      inline def setCascadeValueUndefined: Self = StObject.set(x, "cascadeValue", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setRequiresDefaultFilter(value: Boolean): Self = StObject.set(x, "requiresDefaultFilter", value.asInstanceOf[js.Any])
      
      inline def setRequiresDefaultFilterUndefined: Self = StObject.set(x, "requiresDefaultFilter", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait ChangeEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the selected item with checkbox checked or not.
      */
    var isChecked: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the selected item ID.
      */
    var itemId: js.UndefOr[String] = js.undefined
    
    /** returns the DropDownList model
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** Returns the selected item text.
      */
    var selectedText: js.UndefOr[String] = js.undefined
    
    /** Returns the selected text.
      */
    var text: js.UndefOr[String] = js.undefined
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
    
    /** Returns the selected value.
      */
    var value: js.UndefOr[String] = js.undefined
  }
  object ChangeEventArgs {
    
    inline def apply(): ChangeEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChangeEventArgs]
    }
    
    extension [Self <: ChangeEventArgs](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setIsChecked(value: Boolean): Self = StObject.set(x, "isChecked", value.asInstanceOf[js.Any])
      
      inline def setIsCheckedUndefined: Self = StObject.set(x, "isChecked", js.undefined)
      
      inline def setItemId(value: String): Self = StObject.set(x, "itemId", value.asInstanceOf[js.Any])
      
      inline def setItemIdUndefined: Self = StObject.set(x, "itemId", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setSelectedText(value: String): Self = StObject.set(x, "selectedText", value.asInstanceOf[js.Any])
      
      inline def setSelectedTextUndefined: Self = StObject.set(x, "selectedText", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait CheckChangeEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the selected item with checkbox checked or not.
      */
    var isChecked: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the selected item ID.
      */
    var itemId: js.UndefOr[String] = js.undefined
    
    /** returns the DropDownList model
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** Returns the selected item text.
      */
    var selectedText: js.UndefOr[String] = js.undefined
    
    /** Returns the selected text.
      */
    var text: js.UndefOr[String] = js.undefined
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
    
    /** Returns the selected value.
      */
    var value: js.UndefOr[String] = js.undefined
  }
  object CheckChangeEventArgs {
    
    inline def apply(): CheckChangeEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CheckChangeEventArgs]
    }
    
    extension [Self <: CheckChangeEventArgs](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setIsChecked(value: Boolean): Self = StObject.set(x, "isChecked", value.asInstanceOf[js.Any])
      
      inline def setIsCheckedUndefined: Self = StObject.set(x, "isChecked", js.undefined)
      
      inline def setItemId(value: String): Self = StObject.set(x, "itemId", value.asInstanceOf[js.Any])
      
      inline def setItemIdUndefined: Self = StObject.set(x, "itemId", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setSelectedText(value: String): Self = StObject.set(x, "selectedText", value.asInstanceOf[js.Any])
      
      inline def setSelectedTextUndefined: Self = StObject.set(x, "selectedText", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait CreateEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the DropDownList model
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object CreateEventArgs {
    
    inline def apply(): CreateEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateEventArgs]
    }
    
    extension [Self <: CreateEventArgs](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait DataBoundEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the data that is bound to DropDownList
      */
    var data: js.UndefOr[Any] = js.undefined
    
    /** returns the DropDownList model
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object DataBoundEventArgs {
    
    inline def apply(): DataBoundEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DataBoundEventArgs]
    }
    
    extension [Self <: DataBoundEventArgs](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait DestroyEventArgs extends StObject {
    
    /** its value is set as true,if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the DropDownList model
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object DestroyEventArgs {
    
    inline def apply(): DestroyEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DestroyEventArgs]
    }
    
    extension [Self <: DestroyEventArgs](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait Fields extends StObject {
    
    /** Used to group the items.
      */
    var groupBy: js.UndefOr[String] = js.undefined
    
    /** Defines the HTML attributes such as ID, class, and styles for the item.
      */
    var htmlAttributes: js.UndefOr[Any] = js.undefined
    
    /** Defines the ID for the tag.
      */
    var id: js.UndefOr[String] = js.undefined
    
    /** Defines the image attributes such as height, width, styles, and so on.
      */
    var imageAttributes: js.UndefOr[String] = js.undefined
    
    /** Defines the imageURL for the image location.
      */
    var imageUrl: js.UndefOr[String] = js.undefined
    
    /** Defines the tag value to be selected initially.
      */
    var selected: js.UndefOr[Boolean] = js.undefined
    
    /** Defines the sprite CSS for the image tag.
      */
    var spriteCssClass: js.UndefOr[String] = js.undefined
    
    /** Defines the table name for tag value or display text while rendering remote data.
      */
    var tableName: js.UndefOr[String] = js.undefined
    
    /** Defines the text content for the tag.
      */
    var text: js.UndefOr[String] = js.undefined
    
    /** Defines the tag value.
      */
    var value: js.UndefOr[String] = js.undefined
  }
  object Fields {
    
    inline def apply(): Fields = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Fields]
    }
    
    extension [Self <: Fields](x: Self) {
      
      inline def setGroupBy(value: String): Self = StObject.set(x, "groupBy", value.asInstanceOf[js.Any])
      
      inline def setGroupByUndefined: Self = StObject.set(x, "groupBy", js.undefined)
      
      inline def setHtmlAttributes(value: Any): Self = StObject.set(x, "htmlAttributes", value.asInstanceOf[js.Any])
      
      inline def setHtmlAttributesUndefined: Self = StObject.set(x, "htmlAttributes", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setImageAttributes(value: String): Self = StObject.set(x, "imageAttributes", value.asInstanceOf[js.Any])
      
      inline def setImageAttributesUndefined: Self = StObject.set(x, "imageAttributes", js.undefined)
      
      inline def setImageUrl(value: String): Self = StObject.set(x, "imageUrl", value.asInstanceOf[js.Any])
      
      inline def setImageUrlUndefined: Self = StObject.set(x, "imageUrl", js.undefined)
      
      inline def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
      
      inline def setSpriteCssClass(value: String): Self = StObject.set(x, "spriteCssClass", value.asInstanceOf[js.Any])
      
      inline def setSpriteCssClassUndefined: Self = StObject.set(x, "spriteCssClass", js.undefined)
      
      inline def setTableName(value: String): Self = StObject.set(x, "tableName", value.asInstanceOf[js.Any])
      
      inline def setTableNameUndefined: Self = StObject.set(x, "tableName", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait FocusInEventArgs extends StObject {
    
    /** its value is set as true,if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the DropDownList model
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object FocusInEventArgs {
    
    inline def apply(): FocusInEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FocusInEventArgs]
    }
    
    extension [Self <: FocusInEventArgs](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait FocusOutEventArgs extends StObject {
    
    /** its value is set as true,if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the DropDownList model
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object FocusOutEventArgs {
    
    inline def apply(): FocusOutEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FocusOutEventArgs]
    }
    
    extension [Self <: FocusOutEventArgs](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait Model extends StObject {
    
    /** Fires the action before the XHR request.
      */
    var actionBegin: js.UndefOr[js.Function1[/* e */ ActionBeginEventArgs, Unit]] = js.undefined
    
    /** Fires the action when the list of items is bound to the DropDownList by xhr post calling
      */
    var actionComplete: js.UndefOr[js.Function1[/* e */ ActionCompleteEventArgs, Unit]] = js.undefined
    
    /** Fires the action when the xhr post calling failed on remote data binding with the DropDownList control.
      */
    var actionFailure: js.UndefOr[js.Function1[/* e */ ActionFailureEventArgs, Unit]] = js.undefined
    
    /** Fires the action when the xhr post calling succeed on remote data binding with the DropDownList control
      */
    var actionSuccess: js.UndefOr[js.Function1[/* e */ ActionSuccessEventArgs, Unit]] = js.undefined
    
    /** The Virtual Scrolling(lazy loading) feature is used to display a large amount of data that you require without buffering the entire load of a huge database records in the
      * DropDownList, that is, when scrolling, an AJAX request is sent to fetch some amount of data from the server dynamically. To achieve this scenario with DropDownList, set the
      * allowVirtualScrolling to true.
      * @Default {false}
      */
    var allowVirtualScrolling: js.UndefOr[Boolean] = js.undefined
    
    /** Fires the action before the popup is ready to hide.
      */
    var beforePopupHide: js.UndefOr[js.Function1[/* e */ BeforePopupHideEventArgs, Unit]] = js.undefined
    
    /** Fires the action before the popup is ready to be displayed.
      */
    var beforePopupShown: js.UndefOr[js.Function1[/* e */ BeforePopupShownEventArgs, Unit]] = js.undefined
    
    /** Fires when the cascading happens between two DropDownList exactly after the value changes in the first dropdown and before filtering in the second Dropdown.
      */
    var cascade: js.UndefOr[js.Function1[/* e */ CascadeEventArgs, Unit]] = js.undefined
    
    /** The cascading DropDownLists is a series of two or more DropDownLists in which each DropDownList is filtered according to the previous DropDownListâ€™s value.
      * @Default {null}
      */
    var cascadeTo: js.UndefOr[String] = js.undefined
    
    /** Sets the case sensitivity of the search operation. It supports both enableFilterSearch and enableIncrementalSearch property.
      * @Default {false}
      */
    var caseSensitiveSearch: js.UndefOr[Boolean] = js.undefined
    
    /** Fires the action when the DropDownList controlâ€™s value is changed.
      */
    var change: js.UndefOr[js.Function1[/* e */ ChangeEventArgs, Unit]] = js.undefined
    
    /** Fires the action when the list item checkbox value is changed.
      */
    var checkChange: js.UndefOr[js.Function1[/* e */ CheckChangeEventArgs, Unit]] = js.undefined
    
    /** Fires the action once the DropDownList is created.
      */
    var create: js.UndefOr[js.Function1[/* e */ CreateEventArgs, Unit]] = js.undefined
    
    /** Dropdown widget's style and appearance can be controlled based on 13 different default built-in themes.You can customize the appearance of the dropdown by using the cssClass
      * property. You need to specify a class name in the cssClass property and the same class name is used before the class definitions wherever the custom styles are applied.
      */
    var cssClass: js.UndefOr[String] = js.undefined
    
    /** Fires the action when the list items is bound to the DropDownList.
      */
    var dataBound: js.UndefOr[js.Function1[/* e */ DataBoundEventArgs, Unit]] = js.undefined
    
    /** This property is used to serve data from the data services based on the query provided. To bind the data to the dropdown widget, the dataSource property is assigned with the
      * instance of the ej.DataManager.
      * @Default {null}
      */
    var dataSource: js.UndefOr[Any] = js.undefined
    
    /** Sets the separator when the multiSelectMode with delimiter option or checkbox is enabled with the dropdown. When you enter the delimiter value, the texts after the delimiter are
      * considered as a separate word or query. The delimiter string is a single character and must be a symbol. Mostly, the delimiter symbol is used as comma (,) or semi-colon (;) or
      * any other special character.
      * @Default {','}
      */
    var delimiterChar: js.UndefOr[String] = js.undefined
    
    /** Fires the action when the DropDownList is destroyed.
      */
    var destroy: js.UndefOr[js.Function1[/* e */ DestroyEventArgs, Unit]] = js.undefined
    
    /** The enabled Animation property uses the easeOutQuad animation to SlideDown and SlideUp the Popup list in 200 and 100 milliseconds, respectively.
      * @Default {false}
      */
    var enableAnimation: js.UndefOr[Boolean] = js.undefined
    
    /** This property selects the item in the DropDownList when the item is entered in the Search textbox.
      * @Default {false}
      */
    var enableFilterSearch: js.UndefOr[Boolean] = js.undefined
    
    /** Specifies to perform incremental search for the selection of items from the DropDownList with the help of this property. This helps in selecting the item by using the typed
      * character.
      * @Default {true}
      */
    var enableIncrementalSearch: js.UndefOr[Boolean] = js.undefined
    
    /** Saves the current model value to the browser cookies for state maintenance. While refreshing the DropDownList control page, it retains the model value and it is applied from the
      * browser cookies.
      * @Default {false}
      */
    var enablePersistence: js.UndefOr[Boolean] = js.undefined
    
    /** This enables the resize handler to resize the popup to any size.
      * @Default {false}
      */
    var enablePopupResize: js.UndefOr[Boolean] = js.undefined
    
    /** Sets the DropDownList textbox direction from right to left align.
      * @Default {false}
      */
    var enableRTL: js.UndefOr[Boolean] = js.undefined
    
    /** The serverfiltering is to perform filter action when text is typed in the search box and filtering will be done based on the collection which contains the matched item from entire
      * datasource. Serverfiltering will be done based on the entire items in DataSource.
      * @Default {false}
      */
    var enableServerFiltering: js.UndefOr[Boolean] = js.undefined
    
    /** This property is used to sort the Items in the DropDownList. By default, it sorts the items in an ascending order.
      * @Default {false}
      */
    var enableSorting: js.UndefOr[Boolean] = js.undefined
    
    /** This property is used to indicate whether the DropDownList control responds to the user interaction or not. By default, the control is in the enabled mode and you can disable it
      * by setting it to false.
      * @Default {true}
      */
    var enabled: js.UndefOr[Boolean] = js.undefined
    
    /** Specifies the mapping fields for the data items of the DropDownList.
      * @Default {null}
      */
    var fields: js.UndefOr[Fields] = js.undefined
    
    /** When the enableFilterSearch property value is set to true, the values in the DropDownList shows the items starting with or containing the key word/letter typed in the Search
      * textbox.
      * @Default {ej.FilterType.Contains}
      */
    var filterType: js.UndefOr[FilterType_ | String] = js.undefined
    
    /** Fires the action when the DropDownList is focused.
      */
    var focusIn: js.UndefOr[js.Function1[/* e */ FocusInEventArgs, Unit]] = js.undefined
    
    /** Fires the action when the DropDownList is about to lose focus.
      */
    var focusOut: js.UndefOr[js.Function1[/* e */ FocusOutEventArgs, Unit]] = js.undefined
    
    /** Used to create visualized header for dropdown items
      * @Default {null}
      */
    var headerTemplate: js.UndefOr[String] = js.undefined
    
    /** Defines the height of the DropDownList textbox.
      * @Default {null}
      */
    var height: js.UndefOr[String | Double] = js.undefined
    
    /** It sets the given HTML attributes for the DropDownList control such as ID, name, disabled, etc.
      * @Default {null}
      */
    var htmlAttributes: js.UndefOr[Any] = js.undefined
    
    /** Data can be fetched in the DropDownList control by using the DataSource, specifying the number of items.
      * @Default {5}
      */
    var itemsCount: js.UndefOr[Double] = js.undefined
    
    /** The property is used to determine whether the popup list is generated dynamically.
      * @Default {false}
      */
    var loadOnDemand: js.UndefOr[Boolean] = js.undefined
    
    /** Allows the user to set the particular country or region language for the DropDownList.
      * @Default {en-US}
      */
    var locale: js.UndefOr[String] = js.undefined
    
    /** Defines the maximum height of the suggestion box. This property restricts the maximum height of the popup when resize is enabled.
      * @Default {null}
      */
    var maxPopupHeight: js.UndefOr[String | Double] = js.undefined
    
    /** Defines the maximum width of the suggestion box. This property restricts the maximum width of the popup when resize is enabled.
      * @Default {null}
      */
    var maxPopupWidth: js.UndefOr[String | Double] = js.undefined
    
    /** Defines the minimum height of the suggestion box. This property restricts the minimum height of the popup when resize is enabled.
      * @Default {null}
      */
    var minPopupHeight: js.UndefOr[String | Double] = js.undefined
    
    /** Defines the minimum height of the suggestion box. This property restricts the minimum height of the popup when resize is enabled.
      * @Default {0}
      */
    var minPopupWidth: js.UndefOr[String | Double] = js.undefined
    
    /** With the help of this property, you can make a single or multi selection with the DropDownList and display the text in two modes, delimiter and visual mode. In delimiter mode, you
      * can separate the items by using the delimiter character such as comma (,) or semi-colon (;) or any other special character. In the visual mode, the items are showcased like boxes
      * with close icon in the textbox.
      * @Default {ej.MultiSelectMode.None}
      */
    var multiSelectMode: js.UndefOr[MultiSelectMode | String] = js.undefined
    
    /** Defines the height of the suggestion popup box in the DropDownList control.
      * @Default {152px}
      */
    var popupHeight: js.UndefOr[String | Double] = js.undefined
    
    /** Fires the action, once the popup is closed
      */
    var popupHide: js.UndefOr[js.Function1[/* e */ PopupHideEventArgs, Unit]] = js.undefined
    
    /** Fires the action, when the popup is resized.
      */
    var popupResize: js.UndefOr[js.Function1[/* e */ PopupResizeEventArgs, Unit]] = js.undefined
    
    /** Fires the action, when resizing a popup starts.
      */
    var popupResizeStart: js.UndefOr[js.Function1[/* e */ PopupResizeStartEventArgs, Unit]] = js.undefined
    
    /** Fires the action, when the popup resizing is stopped.
      */
    var popupResizeStop: js.UndefOr[js.Function1[/* e */ PopupResizeStopEventArgs, Unit]] = js.undefined
    
    /** Fires the action, once the popup is opened.
      */
    var popupShown: js.UndefOr[js.Function1[/* e */ PopupShownEventArgs, Unit]] = js.undefined
    
    /** Defines the width of the suggestion popup box in the DropDownList control.
      * @Default {auto}
      */
    var popupWidth: js.UndefOr[String | Double] = js.undefined
    
    /** Specifies the query to retrieve the data from the DataSource.
      * @Default {null}
      */
    var query: js.UndefOr[Any] = js.undefined
    
    /** Specifies that the DropDownList textbox values should be read-only.
      * @Default {false}
      */
    var readOnly: js.UndefOr[Boolean] = js.undefined
    
    /** Fires the action before filtering the list items that starts in the DropDownList when the enableFilterSearch is enabled.
      */
    var search: js.UndefOr[js.Function1[/* e */ SearchEventArgs, Unit]] = js.undefined
    
    /** Fires the action, when the list of item is selected.
      */
    var select: js.UndefOr[js.Function1[/* e */ SelectEventArgs, Unit]] = js.undefined
    
    /** Specifies an item to be selected in the DropDownList.
      * @Default {null}
      */
    var selectedIndex: js.UndefOr[Double] = js.undefined
    
    /** Specifies the selectedItems for the DropDownList.
      * @Default {[]}
      */
    var selectedIndices: js.UndefOr[js.Array[Any]] = js.undefined
    
    /** Selects multiple items in the DropDownList with the help of the checkbox control. To achieve this, enable the showCheckbox option to true.
      * @Default {false}
      */
    var showCheckbox: js.UndefOr[Boolean] = js.undefined
    
    /** DropDownList control is displayed with the popup seen.
      * @Default {false}
      */
    var showPopupOnLoad: js.UndefOr[Boolean] = js.undefined
    
    /** DropDownList textbox displayed with the rounded corner style.
      * @Default {false}
      */
    var showRoundedCorner: js.UndefOr[Boolean] = js.undefined
    
    /** When the enableSorting property value is set to true, this property helps to sort the items either in ascending or descending order
      * @Default {ej.SortOrder.Ascending}
      */
    var sortOrder: js.UndefOr[SortOrder_ | String] = js.undefined
    
    /** Specifies the targetID for the DropDownListâ€™s items.
      * @Default {null}
      */
    var targetID: js.UndefOr[String] = js.undefined
    
    /** By default, you can add any text or image to the DropDownList item. To customize the item layout or to create your own visualized elements, you can use this template support.
      * @Default {null}
      */
    var template: js.UndefOr[String] = js.undefined
    
    /** Defines the text value that is displayed in the DropDownList textbox.
      * @Default {null}
      */
    var text: js.UndefOr[String] = js.undefined
    
    /** Sets the jQuery validation error message in the DropDownList
      * @Default {null}
      */
    var validationMessage: js.UndefOr[Any] = js.undefined
    
    /** Sets the jQuery validation rules in the Dropdownlist.
      * @Default {null}
      */
    var validationRules: js.UndefOr[Any] = js.undefined
    
    /** Specifies the value (text content) for the DropDownList control.
      * @Default {null}
      */
    var value: js.UndefOr[String | Double] = js.undefined
    
    /** The Virtual Scrolling feature is used to display a large amount of records in the DropDownList, that is, when scrolling, an AJAX request is sent to fetch some amount of data from
      * the server dynamically. To achieve this scenario with DropDownList, set the allowVirtualScrolling to true. You can set the itemsCount property that represents the number of items
      * to be fetched from the server on every AJAX request.
      * @Default {normal}
      */
    var virtualScrollMode: js.UndefOr[VirtualScrollMode | String] = js.undefined
    
    /** Specifies a short hint that describes the expected value of the DropDownList control.
      * @Default {null}
      */
    var watermarkText: js.UndefOr[String] = js.undefined
    
    /** Defines the width of the DropDownList textbox.
      * @Default {null}
      */
    var width: js.UndefOr[String | Double] = js.undefined
  }
  object Model {
    
    inline def apply(): typings.ejWebAll.ej.DropDownList.Model = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.ejWebAll.ej.DropDownList.Model]
    }
    
    extension [Self <: typings.ejWebAll.ej.DropDownList.Model](x: Self) {
      
      inline def setActionBegin(value: /* e */ ActionBeginEventArgs => Unit): Self = StObject.set(x, "actionBegin", js.Any.fromFunction1(value))
      
      inline def setActionBeginUndefined: Self = StObject.set(x, "actionBegin", js.undefined)
      
      inline def setActionComplete(value: /* e */ ActionCompleteEventArgs => Unit): Self = StObject.set(x, "actionComplete", js.Any.fromFunction1(value))
      
      inline def setActionCompleteUndefined: Self = StObject.set(x, "actionComplete", js.undefined)
      
      inline def setActionFailure(value: /* e */ ActionFailureEventArgs => Unit): Self = StObject.set(x, "actionFailure", js.Any.fromFunction1(value))
      
      inline def setActionFailureUndefined: Self = StObject.set(x, "actionFailure", js.undefined)
      
      inline def setActionSuccess(value: /* e */ ActionSuccessEventArgs => Unit): Self = StObject.set(x, "actionSuccess", js.Any.fromFunction1(value))
      
      inline def setActionSuccessUndefined: Self = StObject.set(x, "actionSuccess", js.undefined)
      
      inline def setAllowVirtualScrolling(value: Boolean): Self = StObject.set(x, "allowVirtualScrolling", value.asInstanceOf[js.Any])
      
      inline def setAllowVirtualScrollingUndefined: Self = StObject.set(x, "allowVirtualScrolling", js.undefined)
      
      inline def setBeforePopupHide(value: /* e */ BeforePopupHideEventArgs => Unit): Self = StObject.set(x, "beforePopupHide", js.Any.fromFunction1(value))
      
      inline def setBeforePopupHideUndefined: Self = StObject.set(x, "beforePopupHide", js.undefined)
      
      inline def setBeforePopupShown(value: /* e */ BeforePopupShownEventArgs => Unit): Self = StObject.set(x, "beforePopupShown", js.Any.fromFunction1(value))
      
      inline def setBeforePopupShownUndefined: Self = StObject.set(x, "beforePopupShown", js.undefined)
      
      inline def setCascade(value: /* e */ CascadeEventArgs => Unit): Self = StObject.set(x, "cascade", js.Any.fromFunction1(value))
      
      inline def setCascadeTo(value: String): Self = StObject.set(x, "cascadeTo", value.asInstanceOf[js.Any])
      
      inline def setCascadeToUndefined: Self = StObject.set(x, "cascadeTo", js.undefined)
      
      inline def setCascadeUndefined: Self = StObject.set(x, "cascade", js.undefined)
      
      inline def setCaseSensitiveSearch(value: Boolean): Self = StObject.set(x, "caseSensitiveSearch", value.asInstanceOf[js.Any])
      
      inline def setCaseSensitiveSearchUndefined: Self = StObject.set(x, "caseSensitiveSearch", js.undefined)
      
      inline def setChange(value: /* e */ ChangeEventArgs => Unit): Self = StObject.set(x, "change", js.Any.fromFunction1(value))
      
      inline def setChangeUndefined: Self = StObject.set(x, "change", js.undefined)
      
      inline def setCheckChange(value: /* e */ CheckChangeEventArgs => Unit): Self = StObject.set(x, "checkChange", js.Any.fromFunction1(value))
      
      inline def setCheckChangeUndefined: Self = StObject.set(x, "checkChange", js.undefined)
      
      inline def setCreate(value: /* e */ CreateEventArgs => Unit): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
      
      inline def setCreateUndefined: Self = StObject.set(x, "create", js.undefined)
      
      inline def setCssClass(value: String): Self = StObject.set(x, "cssClass", value.asInstanceOf[js.Any])
      
      inline def setCssClassUndefined: Self = StObject.set(x, "cssClass", js.undefined)
      
      inline def setDataBound(value: /* e */ DataBoundEventArgs => Unit): Self = StObject.set(x, "dataBound", js.Any.fromFunction1(value))
      
      inline def setDataBoundUndefined: Self = StObject.set(x, "dataBound", js.undefined)
      
      inline def setDataSource(value: Any): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
      
      inline def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
      
      inline def setDelimiterChar(value: String): Self = StObject.set(x, "delimiterChar", value.asInstanceOf[js.Any])
      
      inline def setDelimiterCharUndefined: Self = StObject.set(x, "delimiterChar", js.undefined)
      
      inline def setDestroy(value: /* e */ DestroyEventArgs => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction1(value))
      
      inline def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
      
      inline def setEnableAnimation(value: Boolean): Self = StObject.set(x, "enableAnimation", value.asInstanceOf[js.Any])
      
      inline def setEnableAnimationUndefined: Self = StObject.set(x, "enableAnimation", js.undefined)
      
      inline def setEnableFilterSearch(value: Boolean): Self = StObject.set(x, "enableFilterSearch", value.asInstanceOf[js.Any])
      
      inline def setEnableFilterSearchUndefined: Self = StObject.set(x, "enableFilterSearch", js.undefined)
      
      inline def setEnableIncrementalSearch(value: Boolean): Self = StObject.set(x, "enableIncrementalSearch", value.asInstanceOf[js.Any])
      
      inline def setEnableIncrementalSearchUndefined: Self = StObject.set(x, "enableIncrementalSearch", js.undefined)
      
      inline def setEnablePersistence(value: Boolean): Self = StObject.set(x, "enablePersistence", value.asInstanceOf[js.Any])
      
      inline def setEnablePersistenceUndefined: Self = StObject.set(x, "enablePersistence", js.undefined)
      
      inline def setEnablePopupResize(value: Boolean): Self = StObject.set(x, "enablePopupResize", value.asInstanceOf[js.Any])
      
      inline def setEnablePopupResizeUndefined: Self = StObject.set(x, "enablePopupResize", js.undefined)
      
      inline def setEnableRTL(value: Boolean): Self = StObject.set(x, "enableRTL", value.asInstanceOf[js.Any])
      
      inline def setEnableRTLUndefined: Self = StObject.set(x, "enableRTL", js.undefined)
      
      inline def setEnableServerFiltering(value: Boolean): Self = StObject.set(x, "enableServerFiltering", value.asInstanceOf[js.Any])
      
      inline def setEnableServerFilteringUndefined: Self = StObject.set(x, "enableServerFiltering", js.undefined)
      
      inline def setEnableSorting(value: Boolean): Self = StObject.set(x, "enableSorting", value.asInstanceOf[js.Any])
      
      inline def setEnableSortingUndefined: Self = StObject.set(x, "enableSorting", js.undefined)
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setFields(value: Fields): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
      
      inline def setFilterType(value: FilterType_ | String): Self = StObject.set(x, "filterType", value.asInstanceOf[js.Any])
      
      inline def setFilterTypeUndefined: Self = StObject.set(x, "filterType", js.undefined)
      
      inline def setFocusIn(value: /* e */ FocusInEventArgs => Unit): Self = StObject.set(x, "focusIn", js.Any.fromFunction1(value))
      
      inline def setFocusInUndefined: Self = StObject.set(x, "focusIn", js.undefined)
      
      inline def setFocusOut(value: /* e */ FocusOutEventArgs => Unit): Self = StObject.set(x, "focusOut", js.Any.fromFunction1(value))
      
      inline def setFocusOutUndefined: Self = StObject.set(x, "focusOut", js.undefined)
      
      inline def setHeaderTemplate(value: String): Self = StObject.set(x, "headerTemplate", value.asInstanceOf[js.Any])
      
      inline def setHeaderTemplateUndefined: Self = StObject.set(x, "headerTemplate", js.undefined)
      
      inline def setHeight(value: String | Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setHtmlAttributes(value: Any): Self = StObject.set(x, "htmlAttributes", value.asInstanceOf[js.Any])
      
      inline def setHtmlAttributesUndefined: Self = StObject.set(x, "htmlAttributes", js.undefined)
      
      inline def setItemsCount(value: Double): Self = StObject.set(x, "itemsCount", value.asInstanceOf[js.Any])
      
      inline def setItemsCountUndefined: Self = StObject.set(x, "itemsCount", js.undefined)
      
      inline def setLoadOnDemand(value: Boolean): Self = StObject.set(x, "loadOnDemand", value.asInstanceOf[js.Any])
      
      inline def setLoadOnDemandUndefined: Self = StObject.set(x, "loadOnDemand", js.undefined)
      
      inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      inline def setMaxPopupHeight(value: String | Double): Self = StObject.set(x, "maxPopupHeight", value.asInstanceOf[js.Any])
      
      inline def setMaxPopupHeightUndefined: Self = StObject.set(x, "maxPopupHeight", js.undefined)
      
      inline def setMaxPopupWidth(value: String | Double): Self = StObject.set(x, "maxPopupWidth", value.asInstanceOf[js.Any])
      
      inline def setMaxPopupWidthUndefined: Self = StObject.set(x, "maxPopupWidth", js.undefined)
      
      inline def setMinPopupHeight(value: String | Double): Self = StObject.set(x, "minPopupHeight", value.asInstanceOf[js.Any])
      
      inline def setMinPopupHeightUndefined: Self = StObject.set(x, "minPopupHeight", js.undefined)
      
      inline def setMinPopupWidth(value: String | Double): Self = StObject.set(x, "minPopupWidth", value.asInstanceOf[js.Any])
      
      inline def setMinPopupWidthUndefined: Self = StObject.set(x, "minPopupWidth", js.undefined)
      
      inline def setMultiSelectMode(value: MultiSelectMode | String): Self = StObject.set(x, "multiSelectMode", value.asInstanceOf[js.Any])
      
      inline def setMultiSelectModeUndefined: Self = StObject.set(x, "multiSelectMode", js.undefined)
      
      inline def setPopupHeight(value: String | Double): Self = StObject.set(x, "popupHeight", value.asInstanceOf[js.Any])
      
      inline def setPopupHeightUndefined: Self = StObject.set(x, "popupHeight", js.undefined)
      
      inline def setPopupHide(value: /* e */ PopupHideEventArgs => Unit): Self = StObject.set(x, "popupHide", js.Any.fromFunction1(value))
      
      inline def setPopupHideUndefined: Self = StObject.set(x, "popupHide", js.undefined)
      
      inline def setPopupResize(value: /* e */ PopupResizeEventArgs => Unit): Self = StObject.set(x, "popupResize", js.Any.fromFunction1(value))
      
      inline def setPopupResizeStart(value: /* e */ PopupResizeStartEventArgs => Unit): Self = StObject.set(x, "popupResizeStart", js.Any.fromFunction1(value))
      
      inline def setPopupResizeStartUndefined: Self = StObject.set(x, "popupResizeStart", js.undefined)
      
      inline def setPopupResizeStop(value: /* e */ PopupResizeStopEventArgs => Unit): Self = StObject.set(x, "popupResizeStop", js.Any.fromFunction1(value))
      
      inline def setPopupResizeStopUndefined: Self = StObject.set(x, "popupResizeStop", js.undefined)
      
      inline def setPopupResizeUndefined: Self = StObject.set(x, "popupResize", js.undefined)
      
      inline def setPopupShown(value: /* e */ PopupShownEventArgs => Unit): Self = StObject.set(x, "popupShown", js.Any.fromFunction1(value))
      
      inline def setPopupShownUndefined: Self = StObject.set(x, "popupShown", js.undefined)
      
      inline def setPopupWidth(value: String | Double): Self = StObject.set(x, "popupWidth", value.asInstanceOf[js.Any])
      
      inline def setPopupWidthUndefined: Self = StObject.set(x, "popupWidth", js.undefined)
      
      inline def setQuery(value: Any): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
      
      inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
      
      inline def setSearch(value: /* e */ SearchEventArgs => Unit): Self = StObject.set(x, "search", js.Any.fromFunction1(value))
      
      inline def setSearchUndefined: Self = StObject.set(x, "search", js.undefined)
      
      inline def setSelect(value: /* e */ SelectEventArgs => Unit): Self = StObject.set(x, "select", js.Any.fromFunction1(value))
      
      inline def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
      
      inline def setSelectedIndex(value: Double): Self = StObject.set(x, "selectedIndex", value.asInstanceOf[js.Any])
      
      inline def setSelectedIndexUndefined: Self = StObject.set(x, "selectedIndex", js.undefined)
      
      inline def setSelectedIndices(value: js.Array[Any]): Self = StObject.set(x, "selectedIndices", value.asInstanceOf[js.Any])
      
      inline def setSelectedIndicesUndefined: Self = StObject.set(x, "selectedIndices", js.undefined)
      
      inline def setSelectedIndicesVarargs(value: Any*): Self = StObject.set(x, "selectedIndices", js.Array(value*))
      
      inline def setShowCheckbox(value: Boolean): Self = StObject.set(x, "showCheckbox", value.asInstanceOf[js.Any])
      
      inline def setShowCheckboxUndefined: Self = StObject.set(x, "showCheckbox", js.undefined)
      
      inline def setShowPopupOnLoad(value: Boolean): Self = StObject.set(x, "showPopupOnLoad", value.asInstanceOf[js.Any])
      
      inline def setShowPopupOnLoadUndefined: Self = StObject.set(x, "showPopupOnLoad", js.undefined)
      
      inline def setShowRoundedCorner(value: Boolean): Self = StObject.set(x, "showRoundedCorner", value.asInstanceOf[js.Any])
      
      inline def setShowRoundedCornerUndefined: Self = StObject.set(x, "showRoundedCorner", js.undefined)
      
      inline def setSortOrder(value: SortOrder_ | String): Self = StObject.set(x, "sortOrder", value.asInstanceOf[js.Any])
      
      inline def setSortOrderUndefined: Self = StObject.set(x, "sortOrder", js.undefined)
      
      inline def setTargetID(value: String): Self = StObject.set(x, "targetID", value.asInstanceOf[js.Any])
      
      inline def setTargetIDUndefined: Self = StObject.set(x, "targetID", js.undefined)
      
      inline def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
      
      inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setValidationMessage(value: Any): Self = StObject.set(x, "validationMessage", value.asInstanceOf[js.Any])
      
      inline def setValidationMessageUndefined: Self = StObject.set(x, "validationMessage", js.undefined)
      
      inline def setValidationRules(value: Any): Self = StObject.set(x, "validationRules", value.asInstanceOf[js.Any])
      
      inline def setValidationRulesUndefined: Self = StObject.set(x, "validationRules", js.undefined)
      
      inline def setValue(value: String | Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setVirtualScrollMode(value: VirtualScrollMode | String): Self = StObject.set(x, "virtualScrollMode", value.asInstanceOf[js.Any])
      
      inline def setVirtualScrollModeUndefined: Self = StObject.set(x, "virtualScrollMode", js.undefined)
      
      inline def setWatermarkText(value: String): Self = StObject.set(x, "watermarkText", value.asInstanceOf[js.Any])
      
      inline def setWatermarkTextUndefined: Self = StObject.set(x, "watermarkText", js.undefined)
      
      inline def setWidth(value: String | Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait PopupHideEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the DropDownList model
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** returns the selected text
      */
    var text: js.UndefOr[String] = js.undefined
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
    
    /** returns the selected value
      */
    var value: js.UndefOr[String] = js.undefined
  }
  object PopupHideEventArgs {
    
    inline def apply(): PopupHideEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PopupHideEventArgs]
    }
    
    extension [Self <: PopupHideEventArgs](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait PopupResizeEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the data from the resizable plugin.
      */
    var event: js.UndefOr[Any] = js.undefined
    
    /** returns the DropDownList model
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object PopupResizeEventArgs {
    
    inline def apply(): PopupResizeEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PopupResizeEventArgs]
    }
    
    extension [Self <: PopupResizeEventArgs](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setEvent(value: Any): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      inline def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait PopupResizeStartEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the data from the resizable plugin.
      */
    var event: js.UndefOr[Any] = js.undefined
    
    /** returns the DropDownList model
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object PopupResizeStartEventArgs {
    
    inline def apply(): PopupResizeStartEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PopupResizeStartEventArgs]
    }
    
    extension [Self <: PopupResizeStartEventArgs](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setEvent(value: Any): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      inline def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait PopupResizeStopEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the data from the resizable plugin.
      */
    var event: js.UndefOr[Any] = js.undefined
    
    /** returns the DropDownList model
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object PopupResizeStopEventArgs {
    
    inline def apply(): PopupResizeStopEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PopupResizeStopEventArgs]
    }
    
    extension [Self <: PopupResizeStopEventArgs](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setEvent(value: Any): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      inline def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait PopupShownEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the DropDownList model
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** returns the selected text
      */
    var text: js.UndefOr[String] = js.undefined
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
    
    /** returns the selected value
      */
    var value: js.UndefOr[String] = js.undefined
  }
  object PopupShownEventArgs {
    
    inline def apply(): PopupShownEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PopupShownEventArgs]
    }
    
    extension [Self <: PopupShownEventArgs](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait SearchEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the data bound to the DropDownList.
      */
    var items: js.UndefOr[Any] = js.undefined
    
    /** returns the DropDownList model
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** Returns the search string typed in search box.
      */
    var searchString: js.UndefOr[String] = js.undefined
    
    /** Returns the selected item text.
      */
    var selectedText: js.UndefOr[String] = js.undefined
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object SearchEventArgs {
    
    inline def apply(): SearchEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SearchEventArgs]
    }
    
    extension [Self <: SearchEventArgs](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setItems(value: Any): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setSearchString(value: String): Self = StObject.set(x, "searchString", value.asInstanceOf[js.Any])
      
      inline def setSearchStringUndefined: Self = StObject.set(x, "searchString", js.undefined)
      
      inline def setSelectedText(value: String): Self = StObject.set(x, "selectedText", value.asInstanceOf[js.Any])
      
      inline def setSelectedTextUndefined: Self = StObject.set(x, "selectedText", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait SelectEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the selected item with checkbox checked or not.
      */
    var isChecked: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the selected item ID.
      */
    var itemId: js.UndefOr[String] = js.undefined
    
    /** returns the DropDownList model
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** Returns the selected item text.
      */
    var selectedText: js.UndefOr[String] = js.undefined
    
    /** Returns the selected text.
      */
    var text: js.UndefOr[String] = js.undefined
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
    
    /** Returns the selected value.
      */
    var value: js.UndefOr[String] = js.undefined
  }
  object SelectEventArgs {
    
    inline def apply(): SelectEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SelectEventArgs]
    }
    
    extension [Self <: SelectEventArgs](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setIsChecked(value: Boolean): Self = StObject.set(x, "isChecked", value.asInstanceOf[js.Any])
      
      inline def setIsCheckedUndefined: Self = StObject.set(x, "isChecked", js.undefined)
      
      inline def setItemId(value: String): Self = StObject.set(x, "itemId", value.asInstanceOf[js.Any])
      
      inline def setItemIdUndefined: Self = StObject.set(x, "itemId", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setSelectedText(value: String): Self = StObject.set(x, "selectedText", value.asInstanceOf[js.Any])
      
      inline def setSelectedTextUndefined: Self = StObject.set(x, "selectedText", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
