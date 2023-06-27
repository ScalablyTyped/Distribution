package typings.ejWebAll.ej

import typings.ejWebAll.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GroupButton
  extends StObject
     with Widget_ {
  
  var defaults: Model = js.native
  
  /** Remove the selection state of the specified the button element from the GroupButton
    * @param {JQuery} Specific button element
    * @returns {void}
    */
  def deselectItem(element: JQuery): Unit = js.native
  
  /** Disables the GroupButton control
    * @returns {void}
    */
  def disable(): Unit = js.native
  
  /** Disable the specified button element from the ejGroupButton control.
    * @param {JQuery} Specific button element
    * @returns {void}
    */
  def disableItem(element: JQuery): Unit = js.native
  
  /** Enables the disabled ejGroupButton control.
    * @returns {void}
    */
  def enable(): Unit = js.native
  
  /** Enable the specified disabled button element from the ejGroupButton control.
    * @param {JQuery} Specific button element
    * @returns {void}
    */
  def enableItem(element: JQuery): Unit = js.native
  
  /** Returns the index value for specified button element in the GroupButton control.
    * @param {JQuery} Specific button element
    * @returns {number}
    */
  def getIndex(element: JQuery): Double = js.native
  
  /** This method returns the list of active state button elements from the GroupButton control.
    * @returns {any}
    */
  def getSelectedItem(): Any = js.native
  
  /** Hides the GroupButton control
    * @returns {void}
    */
  def hide(): Unit = js.native
  
  /** Hide the specified button element from the ejGroupButton control.
    * @param {JQuery} Specific button element
    * @returns {void}
    */
  def hideItem(element: JQuery): Unit = js.native
  
  /** Returns the disabled state of the specified element button element in GroupButton as Boolean.
    * @returns {boolean}
    */
  def isDisabled(): Boolean = js.native
  
  /** Returns the state of the specified button element as Boolean.
    * @returns {boolean}
    */
  def isSelected(): Boolean = js.native
  
  @JSName("model")
  var model_GroupButton: Model = js.native
  
  /** Public method used to select the specified button element from the ejGroupButton control.
    * @param {JQuery} Specific button element
    * @returns {void}
    */
  def selectItem(element: JQuery): Unit = js.native
  
  /** Shows the GroupButton control, if its hide.
    * @returns {void}
    */
  def show(): Unit = js.native
  
  /** Show the specified hidden button element from the ejGroupButton control.
    * @param {JQuery} Specific button element
    * @returns {void}
    */
  def showItem(element: JQuery): Unit = js.native
}
object GroupButton {
  
  trait BeforeSelectEventArgs extends StObject {
    
    /** Boolean value based on whether the button element is disabled or not.
      */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the selection button element.
      */
    var element: js.UndefOr[Any] = js.undefined
    
    /** Event object
      */
    var event: js.UndefOr[Any] = js.undefined
    
    /** Return the button element ID.
      */
    var id: js.UndefOr[String] = js.undefined
    
    /** Button item index.
      */
    var index: js.UndefOr[Double] = js.undefined
    
    /** returns the button model
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** Boolean value based on whether the button element is selected or not.
      */
    var selected: js.UndefOr[Boolean] = js.undefined
    
    /** return the button state
      */
    var status: js.UndefOr[Boolean] = js.undefined
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object BeforeSelectEventArgs {
    
    inline def apply(): BeforeSelectEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BeforeSelectEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BeforeSelectEventArgs] (val x: Self) extends AnyVal {
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setElement(value: Any): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
      
      inline def setEvent(value: Any): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      inline def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
      
      inline def setStatus(value: Boolean): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait CreateEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the GroupButton model
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** returns the name of the event
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
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the GroupButton model
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** returns the name of the event
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
  
  trait KeyPressEventArgs extends StObject {
    
    /** Boolean value based on whether the button element is disabled or not.
      */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the selection button element.
      */
    var element: js.UndefOr[Any] = js.undefined
    
    /** Event object
      */
    var event: js.UndefOr[Any] = js.undefined
    
    /** Return the button element ID.
      */
    var id: js.UndefOr[String] = js.undefined
    
    /** Button item index.
      */
    var index: js.UndefOr[Double] = js.undefined
    
    /** returns the button model
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** Boolean value based on whether the button element is selected or not.
      */
    var selected: js.UndefOr[Boolean] = js.undefined
    
    /** return the button state
      */
    var status: js.UndefOr[Boolean] = js.undefined
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object KeyPressEventArgs {
    
    inline def apply(): KeyPressEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[KeyPressEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: KeyPressEventArgs] (val x: Self) extends AnyVal {
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setElement(value: Any): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
      
      inline def setEvent(value: Any): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      inline def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
      
      inline def setStatus(value: Boolean): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait Model extends StObject {
    
    /** Triggered before any button element in the GroupButton get selected.
      */
    var beforeSelect: js.UndefOr[js.Function1[/* e */ BeforeSelectEventArgs, Unit]] = js.undefined
    
    /** Fires after GroupButton control is created.If the user want to perform any operation after the button control creation then the user can make use of this create event.
      */
    var create: js.UndefOr[js.Function1[/* e */ CreateEventArgs, Unit]] = js.undefined
    
    /** Sets the specified class to GroupButton wrapper element, which allows for custom skinning option in ejGroupButton control.
      */
    var cssClass: js.UndefOr[String] = js.undefined
    
    /** To set the local JSON data, define a JSON array and initialize the GroupButton with dataSource property. Specify the column names in the fields property.
      * @default {null}
      */
    var dataSource: js.UndefOr[Any] = js.undefined
    
    /** Fires when the GroupButton is destroyed successfully.If the user want to perform any operation after the destroy button control then the user can make use of this destroy event.
      */
    var destroy: js.UndefOr[js.Function1[/* e */ DestroyEventArgs, Unit]] = js.undefined
    
    /** Displays the ejGroupButton in Right to Left direction.
      * @default {false}
      */
    var enableRTL: js.UndefOr[Boolean] = js.undefined
    
    /** Used to enable or disable the ejGroupButton control.
      * @default {true}
      */
    var enabled: js.UndefOr[Boolean] = js.undefined
    
    /** Gets or sets a value that indicates to display the values of the data.
      * @default {null}
      */
    var fields: js.UndefOr[Any] = js.undefined
    
    /** Sets the GroupButton behavior to works as Checkbox mode/ radio button mode based on the specified option.
      * @default {ej.GroupButtonMode.RadioButton}
      */
    var groupButtonMode: js.UndefOr[GroupButtonMode | String] = js.undefined
    
    /** Used to sets the height of the ejGroupButton control.
      * @default {28}
      */
    var height: js.UndefOr[String | Double] = js.undefined
    
    /** Defines the characteristics of the ejGroupButton control and extend the capability of an HTML element by adding specified attributes to element tag and by performing the related
      * actions
      * @default {{}}
      */
    var htmlAttributes: js.UndefOr[Any] = js.undefined
    
    /** Triggered once the key is pressed, when the control is in focused state.
      */
    var keyPress: js.UndefOr[js.Function1[/* e */ KeyPressEventArgs, Unit]] = js.undefined
    
    /** Specify the orientation of the GroupButton. See below to get available orientations
      * @default {ej.Orientation.Horizontal}
      */
    var orientation: js.UndefOr[Orientation | String] = js.undefined
    
    /** Query the dataSource from the table for Groupbutton
      * @default {null}
      */
    var query: js.UndefOr[Any] = js.undefined
    
    /** Triggered when the button element get selected.
      */
    var select: js.UndefOr[js.Function1[/* e */ SelectEventArgs, Unit]] = js.undefined
    
    /** Sets the list of button elements to be selected. To enable this option groupButtonMode should be in â€œcheckboxâ€ mode.
      * @default {[]}
      */
    var selectedItemIndex: js.UndefOr[js.Array[Double | String]] = js.undefined
    
    /** Sets the rounder corner to the GroupButton, if sets as true.
      * @default {false}
      */
    var showRoundedCorner: js.UndefOr[Boolean] = js.undefined
    
    /** Specifies the size of the button. See available size
      * @default {ej.ButtonSize.Normal}
      */
    var size: js.UndefOr[ButtonSize | String] = js.undefined
    
    /** Defines the width of the ejGroupButton control.
      */
    var width: js.UndefOr[String | Double] = js.undefined
  }
  object Model {
    
    inline def apply(): typings.ejWebAll.ej.GroupButton.Model = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.ejWebAll.ej.GroupButton.Model]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: typings.ejWebAll.ej.GroupButton.Model] (val x: Self) extends AnyVal {
      
      inline def setBeforeSelect(value: /* e */ BeforeSelectEventArgs => Unit): Self = StObject.set(x, "beforeSelect", js.Any.fromFunction1(value))
      
      inline def setBeforeSelectUndefined: Self = StObject.set(x, "beforeSelect", js.undefined)
      
      inline def setCreate(value: /* e */ CreateEventArgs => Unit): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
      
      inline def setCreateUndefined: Self = StObject.set(x, "create", js.undefined)
      
      inline def setCssClass(value: String): Self = StObject.set(x, "cssClass", value.asInstanceOf[js.Any])
      
      inline def setCssClassUndefined: Self = StObject.set(x, "cssClass", js.undefined)
      
      inline def setDataSource(value: Any): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
      
      inline def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
      
      inline def setDestroy(value: /* e */ DestroyEventArgs => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction1(value))
      
      inline def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
      
      inline def setEnableRTL(value: Boolean): Self = StObject.set(x, "enableRTL", value.asInstanceOf[js.Any])
      
      inline def setEnableRTLUndefined: Self = StObject.set(x, "enableRTL", js.undefined)
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setFields(value: Any): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
      
      inline def setGroupButtonMode(value: GroupButtonMode | String): Self = StObject.set(x, "groupButtonMode", value.asInstanceOf[js.Any])
      
      inline def setGroupButtonModeUndefined: Self = StObject.set(x, "groupButtonMode", js.undefined)
      
      inline def setHeight(value: String | Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setHtmlAttributes(value: Any): Self = StObject.set(x, "htmlAttributes", value.asInstanceOf[js.Any])
      
      inline def setHtmlAttributesUndefined: Self = StObject.set(x, "htmlAttributes", js.undefined)
      
      inline def setKeyPress(value: /* e */ KeyPressEventArgs => Unit): Self = StObject.set(x, "keyPress", js.Any.fromFunction1(value))
      
      inline def setKeyPressUndefined: Self = StObject.set(x, "keyPress", js.undefined)
      
      inline def setOrientation(value: Orientation | String): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
      
      inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
      
      inline def setQuery(value: Any): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
      
      inline def setSelect(value: /* e */ SelectEventArgs => Unit): Self = StObject.set(x, "select", js.Any.fromFunction1(value))
      
      inline def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
      
      inline def setSelectedItemIndex(value: js.Array[Double | String]): Self = StObject.set(x, "selectedItemIndex", value.asInstanceOf[js.Any])
      
      inline def setSelectedItemIndexUndefined: Self = StObject.set(x, "selectedItemIndex", js.undefined)
      
      inline def setSelectedItemIndexVarargs(value: (Double | String)*): Self = StObject.set(x, "selectedItemIndex", js.Array(value*))
      
      inline def setShowRoundedCorner(value: Boolean): Self = StObject.set(x, "showRoundedCorner", value.asInstanceOf[js.Any])
      
      inline def setShowRoundedCornerUndefined: Self = StObject.set(x, "showRoundedCorner", js.undefined)
      
      inline def setSize(value: ButtonSize | String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setWidth(value: String | Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait SelectEventArgs extends StObject {
    
    /** Boolean value based on whether the selected button element is disabled or not.
      */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the selection button element.
      */
    var element: js.UndefOr[Any] = js.undefined
    
    /** Event object
      */
    var event: js.UndefOr[Any] = js.undefined
    
    /** Return the selected button element ID.
      */
    var id: js.UndefOr[String] = js.undefined
    
    /** Selected button item index.
      */
    var index: js.UndefOr[Double] = js.undefined
    
    /** returns the button model
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** Boolean value based on whether the button element is selected or not.
      */
    var selected: js.UndefOr[Boolean] = js.undefined
    
    /** return the button state
      */
    var status: js.UndefOr[Boolean] = js.undefined
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object SelectEventArgs {
    
    inline def apply(): SelectEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SelectEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SelectEventArgs] (val x: Self) extends AnyVal {
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setElement(value: Any): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
      
      inline def setEvent(value: Any): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      inline def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
      
      inline def setStatus(value: Boolean): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
