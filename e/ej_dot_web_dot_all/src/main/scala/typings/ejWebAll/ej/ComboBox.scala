package typings.ejWebAll.ej

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ComboBox
  extends StObject
     with Widget_ {
  
  /** Adds a new item to the popup list. By default, new item appends to the list as the last item, but you can insert based on the index parameter.
    * @returns {void}
    */
  def addItem(): Unit = js.native
  
  var defaults: Model = js.native
  
  /** Sets the focus to the component for interaction.
    * @returns {void}
    */
  def focusIn(): Unit = js.native
  
  /** Moves the focus from the component if the component is already focused.
    * @returns {void}
    */
  def focusOut(): Unit = js.native
  
  /** Gets the data object that matches the given value.
    * @returns {any}
    */
  def getDataByValue(): js.Any = js.native
  
  /** Gets all the list items bound on this component.
    * @returns {Element[]}
    */
  def getItems(): js.Array[Element] = js.native
  
  /** Hides the popup if it is in open state.
    * @returns {void}
    */
  def hidePopup(): Unit = js.native
  
  @JSName("model")
  var model_ComboBox: Model = js.native
  
  /** Opens the popup that displays the list of items.
    * @returns {void}
    */
  def showPopup(): Unit = js.native
}
object ComboBox {
  
  @js.native
  sealed trait SortOrder extends StObject
  @JSGlobal("ej.ComboBox.SortOrder")
  @js.native
  object SortOrder extends StObject {
    
    ///The data source is sorting with ascending order.
    @js.native
    sealed trait Ascending
      extends StObject
         with SortOrder
    
    ///The data source is sorting with descending order.
    @js.native
    sealed trait Descending
      extends StObject
         with SortOrder
    
    ///The data source is not sorting.
    @js.native
    sealed trait None
      extends StObject
         with SortOrder
  }
  
  trait ActionBeginEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the ComboBox model
      */
    var model: js.UndefOr[js.Any] = js.undefined
    
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
      
      inline def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait ActionCompleteEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the query for data retrieval from the Database
      */
    var e: js.UndefOr[js.Any] = js.undefined
    
    /** returns the Autocomplete model
      */
    var model: js.UndefOr[js.Any] = js.undefined
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object ActionCompleteEventArgs {
    
    inline def apply(): ActionCompleteEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ActionCompleteEventArgs]
    }
    
    extension [Self <: ActionCompleteEventArgs](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setE(value: js.Any): Self = StObject.set(x, "e", value.asInstanceOf[js.Any])
      
      inline def setEUndefined: Self = StObject.set(x, "e", js.undefined)
      
      inline def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait ActionFailureEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the error message
      */
    var e: js.UndefOr[js.Any] = js.undefined
    
    /** returns the Autocomplete model
      */
    var model: js.UndefOr[js.Any] = js.undefined
    
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
      
      inline def setE(value: js.Any): Self = StObject.set(x, "e", value.asInstanceOf[js.Any])
      
      inline def setEUndefined: Self = StObject.set(x, "e", js.undefined)
      
      inline def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait ChangeEventArgs extends StObject {
    
    /** Li element of the selected item.
      */
    var Item: js.UndefOr[js.Any] = js.undefined
    
    /** Set this option to true to cancel the event.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Event argument.
      */
    var e: js.UndefOr[js.Any] = js.undefined
    
    /** value of the interaction
      */
    var isInteracted: js.UndefOr[Boolean] = js.undefined
    
    /** Instance of the combobox model object.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** Name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
    
    /** Value of the combobox textbox.
      */
    var value: js.UndefOr[String | Double] = js.undefined
  }
  object ChangeEventArgs {
    
    inline def apply(): ChangeEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChangeEventArgs]
    }
    
    extension [Self <: ChangeEventArgs](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setE(value: js.Any): Self = StObject.set(x, "e", value.asInstanceOf[js.Any])
      
      inline def setEUndefined: Self = StObject.set(x, "e", js.undefined)
      
      inline def setIsInteracted(value: Boolean): Self = StObject.set(x, "isInteracted", value.asInstanceOf[js.Any])
      
      inline def setIsInteractedUndefined: Self = StObject.set(x, "isInteracted", js.undefined)
      
      inline def setItem(value: js.Any): Self = StObject.set(x, "Item", value.asInstanceOf[js.Any])
      
      inline def setItemUndefined: Self = StObject.set(x, "Item", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setValue(value: String | Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait CloseEventArgs extends StObject {
    
    /** Element of the combobox popup list
      */
    var popup: js.UndefOr[js.Any] = js.undefined
  }
  object CloseEventArgs {
    
    inline def apply(): CloseEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CloseEventArgs]
    }
    
    extension [Self <: CloseEventArgs](x: Self) {
      
      inline def setPopup(value: js.Any): Self = StObject.set(x, "popup", value.asInstanceOf[js.Any])
      
      inline def setPopupUndefined: Self = StObject.set(x, "popup", js.undefined)
    }
  }
  
  trait CreateEventArgs extends StObject {
    
    /** Set this option to true to cancel the event.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Instance of the combobox model object.
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
    
    extension [Self <: CreateEventArgs](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait CustomValueSpecifierEventArgs extends StObject {
    
    /** Instance of the combobox model object.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** text of the combobox.
      */
    var text: js.UndefOr[String] = js.undefined
    
    /** Name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object CustomValueSpecifierEventArgs {
    
    inline def apply(): CustomValueSpecifierEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CustomValueSpecifierEventArgs]
    }
    
    extension [Self <: CustomValueSpecifierEventArgs](x: Self) {
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait Fields extends StObject {
    
    /** Used to group the popup list items.
      * @Default {null}
      */
    var groupBy: js.UndefOr[String] = js.undefined
    
    /** Defines class for the item.
      * @Default {null}
      */
    var iconCss: js.UndefOr[String] = js.undefined
    
    /** Defines the specific field name in the data source to load the popup list with data.
      * @Default {null}
      */
    var text: js.UndefOr[String] = js.undefined
    
    /** Defines the specific field name which contains unique values for the list items.
      * @Default {null}
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
      
      inline def setIconCss(value: String): Self = StObject.set(x, "iconCss", value.asInstanceOf[js.Any])
      
      inline def setIconCssUndefined: Self = StObject.set(x, "iconCss", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait FilteringEventArgs extends StObject {
    
    /** Instance of the combobox model object.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** text of the combobox.
      */
    var text: js.UndefOr[String] = js.undefined
    
    /** Name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
    
    /** Function used to update the filtering value.
      */
    var updateData: js.UndefOr[js.Any] = js.undefined
  }
  object FilteringEventArgs {
    
    inline def apply(): FilteringEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FilteringEventArgs]
    }
    
    extension [Self <: FilteringEventArgs](x: Self) {
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setUpdateData(value: js.Any): Self = StObject.set(x, "updateData", value.asInstanceOf[js.Any])
      
      inline def setUpdateDataUndefined: Self = StObject.set(x, "updateData", js.undefined)
    }
  }
  
  trait FocusEventArgs extends StObject {
    
    /** Set this option to true to cancel the event.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Instance of the combobox model object.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** Name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object FocusEventArgs {
    
    inline def apply(): FocusEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FocusEventArgs]
    }
    
    extension [Self <: FocusEventArgs](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait Model extends StObject {
    
    /** Triggers before fetching data from the remote server.
      */
    var actionBegin: js.UndefOr[js.Function1[/* e */ ActionBeginEventArgs, Unit]] = js.undefined
    
    /** Triggers after data is fetched successfully from the remote server.
      */
    var actionComplete: js.UndefOr[js.Function1[/* e */ ActionCompleteEventArgs, Unit]] = js.undefined
    
    /** Triggers when the data fetch request from the remote server fails.
      */
    var actionFailure: js.UndefOr[js.Function1[/* e */ ActionFailureEventArgs, Unit]] = js.undefined
    
    /** Accepts the template and assigns it to the popup list content of the component when the data fetch request from the remote server fails.
      * @Default {The Request Failed}
      */
    var actionFailureTemplate: js.UndefOr[String] = js.undefined
    
    /** Specifies whether the component allows user defined value which does not exist in data source.
      * @Default {true}
      */
    var allowCustom: js.UndefOr[Boolean] = js.undefined
    
    /** When allowFiltering is set to true, show the filter bar (search box) of the component. The filter action retrieves matched items through the filtering event based on the
      * characters typed in the search TextBox. If no match is found, the value of the noRecordsTemplate property will be displayed.
      * @Default {false}
      */
    var allowFiltering: js.UndefOr[Boolean] = js.undefined
    
    /** Specifies whether suggest a first matched item in input when searching. No action happens when no matches found.
      * @Default {false}
      */
    var autofill: js.UndefOr[Boolean] = js.undefined
    
    /** Triggers when an item in a popup is selected or when the model value is changed.
      */
    var change: js.UndefOr[js.Function1[/* e */ ChangeEventArgs, Unit]] = js.undefined
    
    /** Triggers when the popup is closed.
      */
    var close: js.UndefOr[js.Function1[/* e */ CloseEventArgs, Unit]] = js.undefined
    
    /** Triggers when ComboBox widget is created.
      */
    var create: js.UndefOr[js.Function1[/* e */ CreateEventArgs, Unit]] = js.undefined
    
    /** Sets CSS classes to the root element of the component that helps customize the UI styles.
      * @Default {null}
      */
    var cssClass: js.UndefOr[String] = js.undefined
    
    /** Triggers on set a custom value to this component.
      */
    var customValueSpecifier: js.UndefOr[js.Function1[/* e */ CustomValueSpecifierEventArgs, Unit]] = js.undefined
    
    /** Accepts the list items either through local or remote service and binds it to the component. It can be an array of JSON objects or an instance of DataManager.
      * @Default {[]}
      */
    var dataSource: js.UndefOr[js.Any | js.Array[js.Any]] = js.undefined
    
    /** When set to true, enables RTL mode of the component that displays the content in the right-to-left direction.
      * @Default {false}
      */
    var enableRtl: js.UndefOr[Boolean] = js.undefined
    
    /** Specifies a value that indicates whether the component is enabled or not.
      * @Default {true}
      */
    var enabled: js.UndefOr[Boolean] = js.undefined
    
    /** The fields property maps the columns of the data table and binds the data to the component.
      */
    var fields: js.UndefOr[Fields] = js.undefined
    
    /** Triggers on typing a character in the component.
      */
    var filtering: js.UndefOr[js.Function1[/* e */ FilteringEventArgs, Unit]] = js.undefined
    
    /** Triggers when the component is focused.
      */
    var focus: js.UndefOr[js.Function1[/* e */ FocusEventArgs, Unit]] = js.undefined
    
    /** Accepts the template design and assigns it to the footer container of the popup list.
      * @Default {null}
      */
    var footerTemplate: js.UndefOr[String] = js.undefined
    
    /** Accepts the template design and assigns it to the group headers present in the popup list.
      * @Default {null}
      */
    var groupTemplate: js.UndefOr[String] = js.undefined
    
    /** Accepts the template design and assigns it to the header container of the popup list.
      * @Default {null}
      */
    var headerTemplate: js.UndefOr[String] = js.undefined
    
    /** Allows additional HTML attributes such as title, name, etc., and accepts n number of attributes in a key-value pair format.
      * @Default {{}}
      */
    var htmlAttributes: js.UndefOr[js.Any] = js.undefined
    
    /** Gets or sets the index of the selected item in the component.
      * @Default {null}
      */
    var index: js.UndefOr[Double] = js.undefined
    
    /** Accepts the template design and assigns it to each list item present in the popup.
      * @Default {null}
      */
    var itemTemplate: js.UndefOr[String] = js.undefined
    
    /** Overrides the global culture and localization value for this component. Default global culture is 'en-US'.
      * @Default {en-US}
      */
    var locale: js.UndefOr[String] = js.undefined
    
    /** Accepts the template design and assigns it to popup list of component when no data is available on the component.
      * @Default {No Records Found}
      */
    var noRecordsTemplate: js.UndefOr[String] = js.undefined
    
    /** Triggers after the suggestion list is opened.
      */
    var open: js.UndefOr[js.Function1[/* e */ OpenEventArgs, Unit]] = js.undefined
    
    /** Accepts the value to be displayed as a watermark text on the component input.
      * @Default {null}
      */
    var placeholder: js.UndefOr[String] = js.undefined
    
    /** Specifies the height of the popup list.
      * @Default {300px}
      */
    var popupHeight: js.UndefOr[String | Double] = js.undefined
    
    /** Specifies the width of the popup list. By default, the popup width sets based on the width of the component.
      * @Default {100%}
      */
    var popupWidth: js.UndefOr[String | Double] = js.undefined
    
    /** The query to retrieve the data from the data source.
      * @Default {null}
      */
    var query: js.UndefOr[Query] = js.undefined
    
    /** When set to true, the user interactions on the component are disabled.
      * @Default {false}
      */
    var readonly: js.UndefOr[Boolean] = js.undefined
    
    /** Triggers when an item in the popup is selected.
      */
    var select: js.UndefOr[js.Function1[/* e */ SelectEventArgs, Unit]] = js.undefined
    
    /** Specifies whether to show or hide the clear button. When the clear button is clicked, value, text, and index properties are reset to null.
      * @Default {true}
      */
    var showClearButton: js.UndefOr[Boolean] = js.undefined
    
    /** Specifies the sortOrder to sort the data source. The available type of sort orders are
      * @Default {ej.SortOrder.None}
      */
    var sortOrder: js.UndefOr[SortOrder_ | String] = js.undefined
    
    /** Gets or sets the display text of the selected item in the component.
      * @Default {null}
      */
    var text: js.UndefOr[String] = js.undefined
    
    /** Gets or sets the value of the selected item in the component.
      * @Default {null}
      */
    var value: js.UndefOr[Double | String] = js.undefined
    
    /** Specifies the width of the component. By default, the component width sets based on the width of its parent container. You can also set the width in pixel values.
      * @Default {100%}
      */
    var width: js.UndefOr[Double | String] = js.undefined
  }
  object Model {
    
    inline def apply(): typings.ejWebAll.ej.ComboBox.Model = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.ejWebAll.ej.ComboBox.Model]
    }
    
    extension [Self <: typings.ejWebAll.ej.ComboBox.Model](x: Self) {
      
      inline def setActionBegin(value: /* e */ ActionBeginEventArgs => Unit): Self = StObject.set(x, "actionBegin", js.Any.fromFunction1(value))
      
      inline def setActionBeginUndefined: Self = StObject.set(x, "actionBegin", js.undefined)
      
      inline def setActionComplete(value: /* e */ ActionCompleteEventArgs => Unit): Self = StObject.set(x, "actionComplete", js.Any.fromFunction1(value))
      
      inline def setActionCompleteUndefined: Self = StObject.set(x, "actionComplete", js.undefined)
      
      inline def setActionFailure(value: /* e */ ActionFailureEventArgs => Unit): Self = StObject.set(x, "actionFailure", js.Any.fromFunction1(value))
      
      inline def setActionFailureTemplate(value: String): Self = StObject.set(x, "actionFailureTemplate", value.asInstanceOf[js.Any])
      
      inline def setActionFailureTemplateUndefined: Self = StObject.set(x, "actionFailureTemplate", js.undefined)
      
      inline def setActionFailureUndefined: Self = StObject.set(x, "actionFailure", js.undefined)
      
      inline def setAllowCustom(value: Boolean): Self = StObject.set(x, "allowCustom", value.asInstanceOf[js.Any])
      
      inline def setAllowCustomUndefined: Self = StObject.set(x, "allowCustom", js.undefined)
      
      inline def setAllowFiltering(value: Boolean): Self = StObject.set(x, "allowFiltering", value.asInstanceOf[js.Any])
      
      inline def setAllowFilteringUndefined: Self = StObject.set(x, "allowFiltering", js.undefined)
      
      inline def setAutofill(value: Boolean): Self = StObject.set(x, "autofill", value.asInstanceOf[js.Any])
      
      inline def setAutofillUndefined: Self = StObject.set(x, "autofill", js.undefined)
      
      inline def setChange(value: /* e */ ChangeEventArgs => Unit): Self = StObject.set(x, "change", js.Any.fromFunction1(value))
      
      inline def setChangeUndefined: Self = StObject.set(x, "change", js.undefined)
      
      inline def setClose(value: /* e */ CloseEventArgs => Unit): Self = StObject.set(x, "close", js.Any.fromFunction1(value))
      
      inline def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
      
      inline def setCreate(value: /* e */ CreateEventArgs => Unit): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
      
      inline def setCreateUndefined: Self = StObject.set(x, "create", js.undefined)
      
      inline def setCssClass(value: String): Self = StObject.set(x, "cssClass", value.asInstanceOf[js.Any])
      
      inline def setCssClassUndefined: Self = StObject.set(x, "cssClass", js.undefined)
      
      inline def setCustomValueSpecifier(value: /* e */ CustomValueSpecifierEventArgs => Unit): Self = StObject.set(x, "customValueSpecifier", js.Any.fromFunction1(value))
      
      inline def setCustomValueSpecifierUndefined: Self = StObject.set(x, "customValueSpecifier", js.undefined)
      
      inline def setDataSource(value: js.Any | js.Array[js.Any]): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
      
      inline def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
      
      inline def setDataSourceVarargs(value: js.Any*): Self = StObject.set(x, "dataSource", js.Array(value :_*))
      
      inline def setEnableRtl(value: Boolean): Self = StObject.set(x, "enableRtl", value.asInstanceOf[js.Any])
      
      inline def setEnableRtlUndefined: Self = StObject.set(x, "enableRtl", js.undefined)
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setFields(value: Fields): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
      
      inline def setFiltering(value: /* e */ FilteringEventArgs => Unit): Self = StObject.set(x, "filtering", js.Any.fromFunction1(value))
      
      inline def setFilteringUndefined: Self = StObject.set(x, "filtering", js.undefined)
      
      inline def setFocus(value: /* e */ FocusEventArgs => Unit): Self = StObject.set(x, "focus", js.Any.fromFunction1(value))
      
      inline def setFocusUndefined: Self = StObject.set(x, "focus", js.undefined)
      
      inline def setFooterTemplate(value: String): Self = StObject.set(x, "footerTemplate", value.asInstanceOf[js.Any])
      
      inline def setFooterTemplateUndefined: Self = StObject.set(x, "footerTemplate", js.undefined)
      
      inline def setGroupTemplate(value: String): Self = StObject.set(x, "groupTemplate", value.asInstanceOf[js.Any])
      
      inline def setGroupTemplateUndefined: Self = StObject.set(x, "groupTemplate", js.undefined)
      
      inline def setHeaderTemplate(value: String): Self = StObject.set(x, "headerTemplate", value.asInstanceOf[js.Any])
      
      inline def setHeaderTemplateUndefined: Self = StObject.set(x, "headerTemplate", js.undefined)
      
      inline def setHtmlAttributes(value: js.Any): Self = StObject.set(x, "htmlAttributes", value.asInstanceOf[js.Any])
      
      inline def setHtmlAttributesUndefined: Self = StObject.set(x, "htmlAttributes", js.undefined)
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      inline def setItemTemplate(value: String): Self = StObject.set(x, "itemTemplate", value.asInstanceOf[js.Any])
      
      inline def setItemTemplateUndefined: Self = StObject.set(x, "itemTemplate", js.undefined)
      
      inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      inline def setNoRecordsTemplate(value: String): Self = StObject.set(x, "noRecordsTemplate", value.asInstanceOf[js.Any])
      
      inline def setNoRecordsTemplateUndefined: Self = StObject.set(x, "noRecordsTemplate", js.undefined)
      
      inline def setOpen(value: /* e */ OpenEventArgs => Unit): Self = StObject.set(x, "open", js.Any.fromFunction1(value))
      
      inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
      
      inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      inline def setPopupHeight(value: String | Double): Self = StObject.set(x, "popupHeight", value.asInstanceOf[js.Any])
      
      inline def setPopupHeightUndefined: Self = StObject.set(x, "popupHeight", js.undefined)
      
      inline def setPopupWidth(value: String | Double): Self = StObject.set(x, "popupWidth", value.asInstanceOf[js.Any])
      
      inline def setPopupWidthUndefined: Self = StObject.set(x, "popupWidth", js.undefined)
      
      inline def setQuery(value: Query): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
      
      inline def setReadonly(value: Boolean): Self = StObject.set(x, "readonly", value.asInstanceOf[js.Any])
      
      inline def setReadonlyUndefined: Self = StObject.set(x, "readonly", js.undefined)
      
      inline def setSelect(value: /* e */ SelectEventArgs => Unit): Self = StObject.set(x, "select", js.Any.fromFunction1(value))
      
      inline def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
      
      inline def setShowClearButton(value: Boolean): Self = StObject.set(x, "showClearButton", value.asInstanceOf[js.Any])
      
      inline def setShowClearButtonUndefined: Self = StObject.set(x, "showClearButton", js.undefined)
      
      inline def setSortOrder(value: SortOrder_ | String): Self = StObject.set(x, "sortOrder", value.asInstanceOf[js.Any])
      
      inline def setSortOrderUndefined: Self = StObject.set(x, "sortOrder", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setValue(value: Double | String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait OpenEventArgs extends StObject {
    
    /** Element of the combobox popup list
      */
    var popup: js.UndefOr[js.Any] = js.undefined
  }
  object OpenEventArgs {
    
    inline def apply(): OpenEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OpenEventArgs]
    }
    
    extension [Self <: OpenEventArgs](x: Self) {
      
      inline def setPopup(value: js.Any): Self = StObject.set(x, "popup", value.asInstanceOf[js.Any])
      
      inline def setPopupUndefined: Self = StObject.set(x, "popup", js.undefined)
    }
  }
  
  trait SelectEventArgs extends StObject {
    
    /** Li element of the selected item.
      */
    var Item: js.UndefOr[js.Any] = js.undefined
    
    /** Set this option to true to cancel the event.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Event argument.
      */
    var e: js.UndefOr[js.Any] = js.undefined
    
    /** value of the interaction
      */
    var isInteracted: js.UndefOr[Boolean] = js.undefined
    
    /** Data object of the selected item.
      */
    var itemData: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** Instance of the combobox model object.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** Text of the selected item.
      */
    var text: js.UndefOr[String] = js.undefined
    
    /** Name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
    
    /** Value of the combobox textbox.
      */
    var value: js.UndefOr[String | Double] = js.undefined
  }
  object SelectEventArgs {
    
    inline def apply(): SelectEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SelectEventArgs]
    }
    
    extension [Self <: SelectEventArgs](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setE(value: js.Any): Self = StObject.set(x, "e", value.asInstanceOf[js.Any])
      
      inline def setEUndefined: Self = StObject.set(x, "e", js.undefined)
      
      inline def setIsInteracted(value: Boolean): Self = StObject.set(x, "isInteracted", value.asInstanceOf[js.Any])
      
      inline def setIsInteractedUndefined: Self = StObject.set(x, "isInteracted", js.undefined)
      
      inline def setItem(value: js.Any): Self = StObject.set(x, "Item", value.asInstanceOf[js.Any])
      
      inline def setItemData(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "itemData", value.asInstanceOf[js.Any])
      
      inline def setItemDataUndefined: Self = StObject.set(x, "itemData", js.undefined)
      
      inline def setItemUndefined: Self = StObject.set(x, "Item", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setValue(value: String | Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
