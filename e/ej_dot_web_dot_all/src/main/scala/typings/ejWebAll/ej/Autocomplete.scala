package typings.ejWebAll.ej

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Autocomplete
  extends StObject
     with Widget_ {
  
  /** Clears the text in the Autocomplete textbox.
    * @returns {void}
    */
  def clearText(): Unit = js.native
  
  var defaults: Model = js.native
  
  /** Disables the autocomplete widget.
    * @returns {void}
    */
  def disable(): Unit = js.native
  
  /** Enables the autocomplete widget.
    * @returns {void}
    */
  def enable(): Unit = js.native
  
  /** Returns the current active text value in the Autocomplete suggestion list.
    * @returns {string}
    */
  def getActiveText(): String = js.native
  
  /** Returns objects (data object) of all the selected items in the autocomplete textbox.
    * @returns {any}
    */
  def getSelectedItems(): Any = js.native
  
  /** Returns the current selected value from the Autocomplete textbox.
    * @returns {string}
    */
  def getValue(): String = js.native
  
  /** Hides the Autocomplete suggestion list.
    * @returns {void}
    */
  def hide(): Unit = js.native
  
  @JSName("model")
  var model_Autocomplete: Model = js.native
  
  /** Open up the autocomplete suggestion popup with all list items.
    * @returns {void}
    */
  def open(): Unit = js.native
  
  /** Search the entered text and show it in the suggestion list if available.
    * @returns {void}
    */
  def search(): Unit = js.native
  
  /** Sets the value of the Autocomplete textbox based on the given key value.
    * @param {string} The key value of the specific suggestion item.
    * @returns {void}
    */
  def selectValueByKey(Key: String): Unit = js.native
  
  /** Sets the value of the Autocomplete textbox based on the given input text value.
    * @param {string} The text (label) value of the specific suggestion item.
    * @returns {void}
    */
  def selectValueByText(Text: String): Unit = js.native
}
object Autocomplete {
  
  @js.native
  sealed trait Animation extends StObject
  @JSGlobal("ej.Autocomplete.Animation")
  @js.native
  object Animation extends StObject {
    
    ///Supports to animation type with fade type only.
    @js.native
    sealed trait Fade
      extends StObject
         with typings.ejWebAll.ej.Autocomplete.Animation
    
    ///Supports to animation type with none type only.
    @js.native
    sealed trait None
      extends StObject
         with typings.ejWebAll.ej.Autocomplete.Animation
    
    ///Supports to animation type with slide type only.
    @js.native
    sealed trait Slide
      extends StObject
         with typings.ejWebAll.ej.Autocomplete.Animation
  }
  
  @js.native
  sealed trait MultiSelectMode extends StObject
  @JSGlobal("ej.Autocomplete.MultiSelectMode")
  @js.native
  object MultiSelectMode extends StObject {
    
    ///Multiple values are separated using a given special character.
    @js.native
    sealed trait Delimiter
      extends StObject
         with typings.ejWebAll.ej.Autocomplete.MultiSelectMode
    
    ///Each values are displayed in separate box with close button.
    @js.native
    sealed trait VisualMode
      extends StObject
         with typings.ejWebAll.ej.Autocomplete.MultiSelectMode
  }
  
  @js.native
  sealed trait SortOrder extends StObject
  @JSGlobal("ej.Autocomplete.SortOrder")
  @js.native
  object SortOrder extends StObject {
    
    ///Items to be displayed in the suggestion list in ascending order.
    @js.native
    sealed trait Ascending
      extends StObject
         with SortOrder
    
    ///Items to be displayed in the suggestion list in descending order.
    @js.native
    sealed trait Descending
      extends StObject
         with SortOrder
  }
  
  trait ActionBeginEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the Autocomplete model
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ActionBeginEventArgs] (val x: Self) extends AnyVal {
      
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
    
    /** returns the Autocomplete model
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ActionCompleteEventArgs] (val x: Self) extends AnyVal {
      
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
    
    /** returns the Autocomplete model
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ActionFailureEventArgs] (val x: Self) extends AnyVal {
      
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
    
    /** returns the Autocomplete model
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ActionSuccessEventArgs] (val x: Self) extends AnyVal {
      
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
  
  trait ChangeEventArgs extends StObject {
    
    /** Set this option to true to cancel the event.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Instance of the autocomplete model object.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** Name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
    
    /** Value of the autocomplete textbox.
      */
    var value: js.UndefOr[String] = js.undefined
  }
  object ChangeEventArgs {
    
    inline def apply(): ChangeEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChangeEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ChangeEventArgs] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait CloseEventArgs extends StObject {
    
    /** Set this option to true to cancel the event.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Instance of the autocomplete model object.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** Name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object CloseEventArgs {
    
    inline def apply(): CloseEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CloseEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CloseEventArgs] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait CreateEventArgs extends StObject {
    
    /** Set this option to true to cancel the event.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Instance of the autocomplete model object.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** Name of the event.
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
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait DestroyEventArgs extends StObject {
    
    /** Set this option to true to cancel the event.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Instance of the autocomplete model object.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** Name of the event.
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
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait Fields extends StObject {
    
    /** Used to group the suggestion list items.
      */
    var groupBy: js.UndefOr[String] = js.undefined
    
    /** Defines the HTML attributes such as id, class, styles for the item.
      */
    var htmlAttributes: js.UndefOr[Any] = js.undefined
    
    /** Defines the specific field name which contains unique key values for the list items.
      */
    var key: js.UndefOr[String] = js.undefined
    
    /** Defines the specific field name in the data source to load the suggestion list with data.
      */
    var text: js.UndefOr[String] = js.undefined
  }
  object Fields {
    
    inline def apply(): Fields = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Fields]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Fields] (val x: Self) extends AnyVal {
      
      inline def setGroupBy(value: String): Self = StObject.set(x, "groupBy", value.asInstanceOf[js.Any])
      
      inline def setGroupByUndefined: Self = StObject.set(x, "groupBy", js.undefined)
      
      inline def setHtmlAttributes(value: Any): Self = StObject.set(x, "htmlAttributes", value.asInstanceOf[js.Any])
      
      inline def setHtmlAttributesUndefined: Self = StObject.set(x, "htmlAttributes", js.undefined)
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
  
  trait FocusInEventArgs extends StObject {
    
    /** Set this option to true to cancel the event.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Instance of the autocomplete model object.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** Name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
    
    /** Value of the autocomplete textbox.
      */
    var value: js.UndefOr[String] = js.undefined
  }
  object FocusInEventArgs {
    
    inline def apply(): FocusInEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FocusInEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FocusInEventArgs] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait FocusOutEventArgs extends StObject {
    
    /** Set this option to true to cancel the event.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Instance of the autocomplete model object.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** Name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
    
    /** Value of the autocomplete textbox.
      */
    var value: js.UndefOr[String] = js.undefined
  }
  object FocusOutEventArgs {
    
    inline def apply(): FocusOutEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FocusOutEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FocusOutEventArgs] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait Model extends StObject {
    
    /** Triggers when the AJAX requests Begins.
      */
    var actionBegin: js.UndefOr[js.Function1[/* e */ ActionBeginEventArgs, Unit]] = js.undefined
    
    /** Triggers when the AJAX requests complete. The request may get failed or succeed.
      */
    var actionComplete: js.UndefOr[js.Function1[/* e */ ActionCompleteEventArgs, Unit]] = js.undefined
    
    /** Triggers when the data requested from AJAX get failed.
      */
    var actionFailure: js.UndefOr[js.Function1[/* e */ ActionFailureEventArgs, Unit]] = js.undefined
    
    /** Triggers when the data requested from AJAX will get successfully loaded in the Autocomplete widget.
      */
    var actionSuccess: js.UndefOr[js.Function1[/* e */ ActionSuccessEventArgs, Unit]] = js.undefined
    
    /** Customize &quot;Add New&quot; text (label) to be added in the autocomplete popup list for the entered text when there are no suggestions for it.
      * @Default {Add New}
      */
    var addNewText: js.UndefOr[String] = js.undefined
    
    /** Allows new values to be added to the autocomplete input other than the values in the suggestion list. Normally, when there are no suggestions it will display â€œNo suggestionsâ€
      * label in the popup.
      * @Default {false}
      */
    var allowAddNew: js.UndefOr[Boolean] = js.undefined
    
    /** Enables or disables the sorting of suggestion list item. The default sort order is ascending order. You customize sort order.
      * @Default {true}
      */
    var allowSorting: js.UndefOr[Boolean] = js.undefined
    
    /** Enables or disables selecting the animation style for the popup list. Animation types can be selected through either of the following options,
      * @Default {slide}
      */
    var animateType: js.UndefOr[typings.ejWebAll.ej.Animation | String] = js.undefined
    
    /** To focus the items in the suggestion list when the popup is shown. By default first item will be focused.
      * @Default {false}
      */
    var autoFocus: js.UndefOr[Boolean] = js.undefined
    
    /** Enables or disables the case sensitive search.
      * @Default {false}
      */
    var caseSensitiveSearch: js.UndefOr[Boolean] = js.undefined
    
    /** Triggers when the text box value is changed.
      */
    var change: js.UndefOr[js.Function1[/* e */ ChangeEventArgs, Unit]] = js.undefined
    
    /** Triggers after the suggestion popup is closed.
      */
    var close: js.UndefOr[js.Function1[/* e */ CloseEventArgs, Unit]] = js.undefined
    
    /** Triggers when Autocomplete widget is created.
      */
    var create: js.UndefOr[js.Function1[/* e */ CreateEventArgs, Unit]] = js.undefined
    
    /** The root class for the Autocomplete textbox widget which helps in customizing its theme.
      * @Default {â€â€}
      */
    var cssClass: js.UndefOr[String] = js.undefined
    
    /** The data source contains the list of data for the suggestions list. It can be a string array or JSON array or service URL that returns JSON.
      * @Default {null}
      */
    var dataSource: js.UndefOr[Any | js.Array[Any]] = js.undefined
    
    /** The time delay (in milliseconds) after which the suggestion popup will be shown.
      * @Default {200}
      */
    var delaySuggestionTimeout: js.UndefOr[Double] = js.undefined
    
    /** The special character which acts as a separator for the given words for multi-mode search i.e. the text after the delimiter are considered as a separate word or query for search
      * operation.
      * @Default {â€™,â€™}
      */
    var delimiterChar: js.UndefOr[String] = js.undefined
    
    /** Triggers after the Autocomplete widget is destroyed.
      */
    var destroy: js.UndefOr[js.Function1[/* e */ DestroyEventArgs, Unit]] = js.undefined
    
    /** The text to be displayed in the popup when there are no suggestions available for the entered text.
      * @Default {â€œNo suggestionsâ€}
      */
    var emptyResultText: js.UndefOr[String] = js.undefined
    
    /** Fills the autocomplete textbox with the first matched item from the suggestion list automatically based on the entered text when enabled.
      * @Default {false}
      */
    var enableAutoFill: js.UndefOr[Boolean] = js.undefined
    
    /** Enables or disables displaying the duplicate names present in the search result.
      * @Default {false}
      */
    var enableDistinct: js.UndefOr[Boolean] = js.undefined
    
    /** Allows the current model values to be saved in local storage or browser cookies for state maintenance when it is set to true. While refreshing the page, it retains the model value
      * from browser cookies or local storage.
      * @Default {false}
      */
    var enablePersistence: js.UndefOr[Boolean] = js.undefined
    
    /** Displays the Autocomplete widgetâ€™s content from right to left when enabled.
      * @Default {false}
      */
    var enableRTL: js.UndefOr[Boolean] = js.undefined
    
    /** Enables or disables the Autocomplete textbox widget.
      * @Default {true}
      */
    var enabled: js.UndefOr[Boolean] = js.undefined
    
    /** Mapping fields for the suggestion items of the Autocomplete textbox widget.
      * @Default {null}
      */
    var fields: js.UndefOr[Fields] = js.undefined
    
    /** Specifies the search filter type. There are several types of search filter available such as â€˜startswithâ€™, â€˜containsâ€™, â€˜endswithâ€™, â€˜lessthanâ€™,
      * â€˜lessthanorequalâ€™, â€˜greaterthanâ€™, â€˜greaterthanorequalâ€™, â€˜equalâ€™, â€˜notequalâ€™.
      * @Default {ej.filterType.StartsWith}
      */
    var filterType: js.UndefOr[String] = js.undefined
    
    /** Triggers after the autocomplete textbox is focused.
      */
    var focusIn: js.UndefOr[js.Function1[/* e */ FocusInEventArgs, Unit]] = js.undefined
    
    /** Triggers after the Autocomplete textbox gets out of the focus.
      */
    var focusOut: js.UndefOr[js.Function1[/* e */ FocusOutEventArgs, Unit]] = js.undefined
    
    /** The height of the Autocomplete textbox.
      * @Default {null}
      */
    var height: js.UndefOr[String | Double] = js.undefined
    
    /** The search text can be highlighted in the AutoComplete suggestion list when enabled.
      * @Default {false}
      */
    var highlightSearch: js.UndefOr[Boolean] = js.undefined
    
    /** To enable or disable the diacritic characters of the Autocomplete suggestion list when filtering.
      * @Default {false}
      */
    var ignoreAccent: js.UndefOr[Boolean] = js.undefined
    
    /** Number of items to be displayed in the suggestion list.
      * @Default {0}
      */
    var itemsCount: js.UndefOr[Double] = js.undefined
    
    /** Set the localization culture for Autocomplete Widget.
      */
    var locale: js.UndefOr[String] = js.undefined
    
    /** Minimum number of character to be entered in the Autocomplete textbox to show the suggestion list.
      * @Default {1}
      */
    var minCharacter: js.UndefOr[Double] = js.undefined
    
    /** An Autocomplete column collection can be defined and customized through the multiColumnSettings property.Column's header, field, and stringFormat can be define via
      * multiColumnSettings properties.
      */
    var multiColumnSettings: js.UndefOr[MultiColumnSettings] = js.undefined
    
    /** Enables or disables selecting multiple values from the suggestion list. Multiple values can be selected through either of the following options,
      * @Default {ej.MultiSelectMode.None}
      */
    var multiSelectMode: js.UndefOr[typings.ejWebAll.ej.MultiSelectMode | String] = js.undefined
    
    /** Triggers after the suggestion list is opened.
      */
    var open: js.UndefOr[js.Function1[/* e */ OpenEventArgs, Unit]] = js.undefined
    
    /** The height of the suggestion list.
      * @Default {â€œ152pxâ€}
      */
    var popupHeight: js.UndefOr[String] = js.undefined
    
    /** The width of the suggestion list.
      * @Default {â€œautoâ€}
      */
    var popupWidth: js.UndefOr[String] = js.undefined
    
    /** The query to retrieve the data from the data source.
      * @Default {null}
      */
    var query: js.UndefOr[Query] = js.undefined
    
    /** Indicates that the autocomplete textbox values can only be readable.
      * @Default {false}
      */
    var readOnly: js.UndefOr[Boolean] = js.undefined
    
    /** Triggers when an item has been selected from the suggestion list.
      */
    var select: js.UndefOr[js.Function1[/* e */ SelectEventArgs, Unit]] = js.undefined
    
    /** Sets the value for the Autocomplete textbox based on the given input key value.
      */
    var selectValueByKey: js.UndefOr[Double] = js.undefined
    
    /** Enables or disables showing the message when there are no suggestions for the entered text.
      * @Default {true}
      */
    var showEmptyResultText: js.UndefOr[Boolean] = js.undefined
    
    /** Enables or disables the loading icon to intimate the searching operation. The loading icon is visible when there is a time delay to perform the search.
      * @Default {true}
      */
    var showLoadingIcon: js.UndefOr[Boolean] = js.undefined
    
    /** Enables the showPopup button in autocomplete textbox. When the showPopup button is clicked, it displays all the available data from the data source.
      * @Default {false}
      */
    var showPopupButton: js.UndefOr[Boolean] = js.undefined
    
    /** Enables or disables reset icon to clear the textbox values.
      * @Default {false}
      */
    var showResetIcon: js.UndefOr[Boolean] = js.undefined
    
    /** Enables or disables rounded corner.
      * @Default {false}
      */
    var showRoundedCorner: js.UndefOr[Boolean] = js.undefined
    
    /** Sort order specifies whether the suggestion list values has to be displayed in ascending or descending order.
      * @Default {ej.SortOrder.Ascending}
      */
    var sortOrder: js.UndefOr[SortOrder_ | String] = js.undefined
    
    /** The template to display the suggestion list items with customized appearance.
      * @Default {null}
      */
    var template: js.UndefOr[String] = js.undefined
    
    /** The jQuery validation error message to be displayed on form validation.
      * @Default {null}
      */
    var validationMessage: js.UndefOr[Any] = js.undefined
    
    /** The jQuery validation rules for form validation.
      * @Default {null}
      */
    var validationRules: js.UndefOr[Any] = js.undefined
    
    /** The value to be displayed in the autocomplete textbox.
      * @Default {null}
      */
    var value: js.UndefOr[String] = js.undefined
    
    /** Enables or disables the visibility of the autocomplete textbox.
      * @Default {true}
      */
    var visible: js.UndefOr[Boolean] = js.undefined
    
    /** The text to be displayed when the value of the autocomplete textbox is empty.
      * @Default {null}
      */
    var watermarkText: js.UndefOr[String] = js.undefined
    
    /** The width of the Autocomplete textbox.
      * @Default {null}
      */
    var width: js.UndefOr[String | Double] = js.undefined
  }
  object Model {
    
    inline def apply(): typings.ejWebAll.ej.Autocomplete.Model = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.ejWebAll.ej.Autocomplete.Model]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: typings.ejWebAll.ej.Autocomplete.Model] (val x: Self) extends AnyVal {
      
      inline def setActionBegin(value: /* e */ ActionBeginEventArgs => Unit): Self = StObject.set(x, "actionBegin", js.Any.fromFunction1(value))
      
      inline def setActionBeginUndefined: Self = StObject.set(x, "actionBegin", js.undefined)
      
      inline def setActionComplete(value: /* e */ ActionCompleteEventArgs => Unit): Self = StObject.set(x, "actionComplete", js.Any.fromFunction1(value))
      
      inline def setActionCompleteUndefined: Self = StObject.set(x, "actionComplete", js.undefined)
      
      inline def setActionFailure(value: /* e */ ActionFailureEventArgs => Unit): Self = StObject.set(x, "actionFailure", js.Any.fromFunction1(value))
      
      inline def setActionFailureUndefined: Self = StObject.set(x, "actionFailure", js.undefined)
      
      inline def setActionSuccess(value: /* e */ ActionSuccessEventArgs => Unit): Self = StObject.set(x, "actionSuccess", js.Any.fromFunction1(value))
      
      inline def setActionSuccessUndefined: Self = StObject.set(x, "actionSuccess", js.undefined)
      
      inline def setAddNewText(value: String): Self = StObject.set(x, "addNewText", value.asInstanceOf[js.Any])
      
      inline def setAddNewTextUndefined: Self = StObject.set(x, "addNewText", js.undefined)
      
      inline def setAllowAddNew(value: Boolean): Self = StObject.set(x, "allowAddNew", value.asInstanceOf[js.Any])
      
      inline def setAllowAddNewUndefined: Self = StObject.set(x, "allowAddNew", js.undefined)
      
      inline def setAllowSorting(value: Boolean): Self = StObject.set(x, "allowSorting", value.asInstanceOf[js.Any])
      
      inline def setAllowSortingUndefined: Self = StObject.set(x, "allowSorting", js.undefined)
      
      inline def setAnimateType(value: typings.ejWebAll.ej.Animation | String): Self = StObject.set(x, "animateType", value.asInstanceOf[js.Any])
      
      inline def setAnimateTypeUndefined: Self = StObject.set(x, "animateType", js.undefined)
      
      inline def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      inline def setCaseSensitiveSearch(value: Boolean): Self = StObject.set(x, "caseSensitiveSearch", value.asInstanceOf[js.Any])
      
      inline def setCaseSensitiveSearchUndefined: Self = StObject.set(x, "caseSensitiveSearch", js.undefined)
      
      inline def setChange(value: /* e */ ChangeEventArgs => Unit): Self = StObject.set(x, "change", js.Any.fromFunction1(value))
      
      inline def setChangeUndefined: Self = StObject.set(x, "change", js.undefined)
      
      inline def setClose(value: /* e */ CloseEventArgs => Unit): Self = StObject.set(x, "close", js.Any.fromFunction1(value))
      
      inline def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
      
      inline def setCreate(value: /* e */ CreateEventArgs => Unit): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
      
      inline def setCreateUndefined: Self = StObject.set(x, "create", js.undefined)
      
      inline def setCssClass(value: String): Self = StObject.set(x, "cssClass", value.asInstanceOf[js.Any])
      
      inline def setCssClassUndefined: Self = StObject.set(x, "cssClass", js.undefined)
      
      inline def setDataSource(value: Any | js.Array[Any]): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
      
      inline def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
      
      inline def setDataSourceVarargs(value: Any*): Self = StObject.set(x, "dataSource", js.Array(value*))
      
      inline def setDelaySuggestionTimeout(value: Double): Self = StObject.set(x, "delaySuggestionTimeout", value.asInstanceOf[js.Any])
      
      inline def setDelaySuggestionTimeoutUndefined: Self = StObject.set(x, "delaySuggestionTimeout", js.undefined)
      
      inline def setDelimiterChar(value: String): Self = StObject.set(x, "delimiterChar", value.asInstanceOf[js.Any])
      
      inline def setDelimiterCharUndefined: Self = StObject.set(x, "delimiterChar", js.undefined)
      
      inline def setDestroy(value: /* e */ DestroyEventArgs => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction1(value))
      
      inline def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
      
      inline def setEmptyResultText(value: String): Self = StObject.set(x, "emptyResultText", value.asInstanceOf[js.Any])
      
      inline def setEmptyResultTextUndefined: Self = StObject.set(x, "emptyResultText", js.undefined)
      
      inline def setEnableAutoFill(value: Boolean): Self = StObject.set(x, "enableAutoFill", value.asInstanceOf[js.Any])
      
      inline def setEnableAutoFillUndefined: Self = StObject.set(x, "enableAutoFill", js.undefined)
      
      inline def setEnableDistinct(value: Boolean): Self = StObject.set(x, "enableDistinct", value.asInstanceOf[js.Any])
      
      inline def setEnableDistinctUndefined: Self = StObject.set(x, "enableDistinct", js.undefined)
      
      inline def setEnablePersistence(value: Boolean): Self = StObject.set(x, "enablePersistence", value.asInstanceOf[js.Any])
      
      inline def setEnablePersistenceUndefined: Self = StObject.set(x, "enablePersistence", js.undefined)
      
      inline def setEnableRTL(value: Boolean): Self = StObject.set(x, "enableRTL", value.asInstanceOf[js.Any])
      
      inline def setEnableRTLUndefined: Self = StObject.set(x, "enableRTL", js.undefined)
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setFields(value: Fields): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
      
      inline def setFilterType(value: String): Self = StObject.set(x, "filterType", value.asInstanceOf[js.Any])
      
      inline def setFilterTypeUndefined: Self = StObject.set(x, "filterType", js.undefined)
      
      inline def setFocusIn(value: /* e */ FocusInEventArgs => Unit): Self = StObject.set(x, "focusIn", js.Any.fromFunction1(value))
      
      inline def setFocusInUndefined: Self = StObject.set(x, "focusIn", js.undefined)
      
      inline def setFocusOut(value: /* e */ FocusOutEventArgs => Unit): Self = StObject.set(x, "focusOut", js.Any.fromFunction1(value))
      
      inline def setFocusOutUndefined: Self = StObject.set(x, "focusOut", js.undefined)
      
      inline def setHeight(value: String | Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setHighlightSearch(value: Boolean): Self = StObject.set(x, "highlightSearch", value.asInstanceOf[js.Any])
      
      inline def setHighlightSearchUndefined: Self = StObject.set(x, "highlightSearch", js.undefined)
      
      inline def setIgnoreAccent(value: Boolean): Self = StObject.set(x, "ignoreAccent", value.asInstanceOf[js.Any])
      
      inline def setIgnoreAccentUndefined: Self = StObject.set(x, "ignoreAccent", js.undefined)
      
      inline def setItemsCount(value: Double): Self = StObject.set(x, "itemsCount", value.asInstanceOf[js.Any])
      
      inline def setItemsCountUndefined: Self = StObject.set(x, "itemsCount", js.undefined)
      
      inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      inline def setMinCharacter(value: Double): Self = StObject.set(x, "minCharacter", value.asInstanceOf[js.Any])
      
      inline def setMinCharacterUndefined: Self = StObject.set(x, "minCharacter", js.undefined)
      
      inline def setMultiColumnSettings(value: MultiColumnSettings): Self = StObject.set(x, "multiColumnSettings", value.asInstanceOf[js.Any])
      
      inline def setMultiColumnSettingsUndefined: Self = StObject.set(x, "multiColumnSettings", js.undefined)
      
      inline def setMultiSelectMode(value: typings.ejWebAll.ej.MultiSelectMode | String): Self = StObject.set(x, "multiSelectMode", value.asInstanceOf[js.Any])
      
      inline def setMultiSelectModeUndefined: Self = StObject.set(x, "multiSelectMode", js.undefined)
      
      inline def setOpen(value: /* e */ OpenEventArgs => Unit): Self = StObject.set(x, "open", js.Any.fromFunction1(value))
      
      inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
      
      inline def setPopupHeight(value: String): Self = StObject.set(x, "popupHeight", value.asInstanceOf[js.Any])
      
      inline def setPopupHeightUndefined: Self = StObject.set(x, "popupHeight", js.undefined)
      
      inline def setPopupWidth(value: String): Self = StObject.set(x, "popupWidth", value.asInstanceOf[js.Any])
      
      inline def setPopupWidthUndefined: Self = StObject.set(x, "popupWidth", js.undefined)
      
      inline def setQuery(value: Query): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
      
      inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
      
      inline def setSelect(value: /* e */ SelectEventArgs => Unit): Self = StObject.set(x, "select", js.Any.fromFunction1(value))
      
      inline def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
      
      inline def setSelectValueByKey(value: Double): Self = StObject.set(x, "selectValueByKey", value.asInstanceOf[js.Any])
      
      inline def setSelectValueByKeyUndefined: Self = StObject.set(x, "selectValueByKey", js.undefined)
      
      inline def setShowEmptyResultText(value: Boolean): Self = StObject.set(x, "showEmptyResultText", value.asInstanceOf[js.Any])
      
      inline def setShowEmptyResultTextUndefined: Self = StObject.set(x, "showEmptyResultText", js.undefined)
      
      inline def setShowLoadingIcon(value: Boolean): Self = StObject.set(x, "showLoadingIcon", value.asInstanceOf[js.Any])
      
      inline def setShowLoadingIconUndefined: Self = StObject.set(x, "showLoadingIcon", js.undefined)
      
      inline def setShowPopupButton(value: Boolean): Self = StObject.set(x, "showPopupButton", value.asInstanceOf[js.Any])
      
      inline def setShowPopupButtonUndefined: Self = StObject.set(x, "showPopupButton", js.undefined)
      
      inline def setShowResetIcon(value: Boolean): Self = StObject.set(x, "showResetIcon", value.asInstanceOf[js.Any])
      
      inline def setShowResetIconUndefined: Self = StObject.set(x, "showResetIcon", js.undefined)
      
      inline def setShowRoundedCorner(value: Boolean): Self = StObject.set(x, "showRoundedCorner", value.asInstanceOf[js.Any])
      
      inline def setShowRoundedCornerUndefined: Self = StObject.set(x, "showRoundedCorner", js.undefined)
      
      inline def setSortOrder(value: SortOrder_ | String): Self = StObject.set(x, "sortOrder", value.asInstanceOf[js.Any])
      
      inline def setSortOrderUndefined: Self = StObject.set(x, "sortOrder", js.undefined)
      
      inline def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
      
      inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
      
      inline def setValidationMessage(value: Any): Self = StObject.set(x, "validationMessage", value.asInstanceOf[js.Any])
      
      inline def setValidationMessageUndefined: Self = StObject.set(x, "validationMessage", js.undefined)
      
      inline def setValidationRules(value: Any): Self = StObject.set(x, "validationRules", value.asInstanceOf[js.Any])
      
      inline def setValidationRulesUndefined: Self = StObject.set(x, "validationRules", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
      
      inline def setWatermarkText(value: String): Self = StObject.set(x, "watermarkText", value.asInstanceOf[js.Any])
      
      inline def setWatermarkTextUndefined: Self = StObject.set(x, "watermarkText", js.undefined)
      
      inline def setWidth(value: String | Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait MultiColumnSettings extends StObject {
    
    /** Field and Header Text collections can be defined and customized through columns field.
      */
    var columns: js.UndefOr[js.Array[MultiColumnSettingsColumn]] = js.undefined
    
    /** Allow list of data to be displayed in several columns.
      * @Default {false}
      */
    var enable: js.UndefOr[Boolean] = js.undefined
    
    /** This property allows user to search text for any number of fields in the suggestion list without modifying the selected text format.
      */
    var searchColumnIndices: js.UndefOr[js.Array[Any]] = js.undefined
    
    /** Allow header text to be displayed in corresponding columns.
      * @Default {true}
      */
    var showHeader: js.UndefOr[Boolean] = js.undefined
    
    /** Displayed selected value and autocomplete search based on mentioned column value specified in that format.
      */
    var stringFormat: js.UndefOr[String] = js.undefined
  }
  object MultiColumnSettings {
    
    inline def apply(): MultiColumnSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MultiColumnSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MultiColumnSettings] (val x: Self) extends AnyVal {
      
      inline def setColumns(value: js.Array[MultiColumnSettingsColumn]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
      
      inline def setColumnsVarargs(value: MultiColumnSettingsColumn*): Self = StObject.set(x, "columns", js.Array(value*))
      
      inline def setEnable(value: Boolean): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
      
      inline def setEnableUndefined: Self = StObject.set(x, "enable", js.undefined)
      
      inline def setSearchColumnIndices(value: js.Array[Any]): Self = StObject.set(x, "searchColumnIndices", value.asInstanceOf[js.Any])
      
      inline def setSearchColumnIndicesUndefined: Self = StObject.set(x, "searchColumnIndices", js.undefined)
      
      inline def setSearchColumnIndicesVarargs(value: Any*): Self = StObject.set(x, "searchColumnIndices", js.Array(value*))
      
      inline def setShowHeader(value: Boolean): Self = StObject.set(x, "showHeader", value.asInstanceOf[js.Any])
      
      inline def setShowHeaderUndefined: Self = StObject.set(x, "showHeader", js.undefined)
      
      inline def setStringFormat(value: String): Self = StObject.set(x, "stringFormat", value.asInstanceOf[js.Any])
      
      inline def setStringFormatUndefined: Self = StObject.set(x, "stringFormat", js.undefined)
    }
  }
  
  trait MultiColumnSettingsColumn extends StObject {
    
    /** Gets or sets a value that indicates to render the multicolumn with custom theme.
      */
    var cssClass: js.UndefOr[String] = js.undefined
    
    /** Get or set a value that indicates to display the columns in the autocomplete mapping with column name of the dataSource.
      */
    var field: js.UndefOr[String] = js.undefined
    
    /** Specifies the search filter type. There are several types of search filter available such as â€˜startswithâ€™, â€˜containsâ€™, â€˜endswithâ€™, â€˜lessthanâ€™,
      * â€˜lessthanorequalâ€™, â€˜greaterthanâ€™, â€˜greaterthanorequalâ€™, â€˜equalâ€™, â€˜notequalâ€™.
      * @Default {ej.filterType.StartsWith}
      */
    var filterType: js.UndefOr[typings.ejWebAll.ej.filterType | String] = js.undefined
    
    /** Get or set a value that indicates to display the title of that particular column.
      */
    var headerText: js.UndefOr[String] = js.undefined
    
    /** This defines the text alignment of a particular column header cell value. See headerTextAlign
      * @Default {ej.TextAlign.Left}
      */
    var headerTextAlign: js.UndefOr[TextAlign | String] = js.undefined
    
    /** Gets or sets a value that indicates to align the text within the column. See textAlign
      * @Default {ej.TextAlign.Left}
      */
    var textAlign: js.UndefOr[TextAlign | String] = js.undefined
    
    /** Specifies the search data type. There are four types of data types available such as string, â€˜numberâ€™, â€˜booleanâ€™ and â€˜dateâ€™.
      * @Default {ej.Type.String}
      */
    var `type`: js.UndefOr[Type | String] = js.undefined
  }
  object MultiColumnSettingsColumn {
    
    inline def apply(): MultiColumnSettingsColumn = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MultiColumnSettingsColumn]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MultiColumnSettingsColumn] (val x: Self) extends AnyVal {
      
      inline def setCssClass(value: String): Self = StObject.set(x, "cssClass", value.asInstanceOf[js.Any])
      
      inline def setCssClassUndefined: Self = StObject.set(x, "cssClass", js.undefined)
      
      inline def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
      
      inline def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
      
      inline def setFilterType(value: filterType | String): Self = StObject.set(x, "filterType", value.asInstanceOf[js.Any])
      
      inline def setFilterTypeUndefined: Self = StObject.set(x, "filterType", js.undefined)
      
      inline def setHeaderText(value: String): Self = StObject.set(x, "headerText", value.asInstanceOf[js.Any])
      
      inline def setHeaderTextAlign(value: TextAlign | String): Self = StObject.set(x, "headerTextAlign", value.asInstanceOf[js.Any])
      
      inline def setHeaderTextAlignUndefined: Self = StObject.set(x, "headerTextAlign", js.undefined)
      
      inline def setHeaderTextUndefined: Self = StObject.set(x, "headerText", js.undefined)
      
      inline def setTextAlign(value: TextAlign | String): Self = StObject.set(x, "textAlign", value.asInstanceOf[js.Any])
      
      inline def setTextAlignUndefined: Self = StObject.set(x, "textAlign", js.undefined)
      
      inline def setType(value: Type | String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait OpenEventArgs extends StObject {
    
    /** Set this option to true to cancel the event.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Instance of the autocomplete model object.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** Name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object OpenEventArgs {
    
    inline def apply(): OpenEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OpenEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OpenEventArgs] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait SelectEventArgs extends StObject {
    
    /** Data object of the selected item.
      */
    var Item: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** Set this option to true to cancel the event.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Key of the selected item.
      */
    var key: js.UndefOr[String] = js.undefined
    
    /** Instance of the autocomplete model object.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** Text of the selected item.
      */
    var text: js.UndefOr[String] = js.undefined
    
    /** Name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
    
    /** Value of the autocomplete textbox.
      */
    var value: js.UndefOr[String] = js.undefined
  }
  object SelectEventArgs {
    
    inline def apply(): SelectEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SelectEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SelectEventArgs] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setItem(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "Item", value.asInstanceOf[js.Any])
      
      inline def setItemUndefined: Self = StObject.set(x, "Item", js.undefined)
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
