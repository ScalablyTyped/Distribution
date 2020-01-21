package typings.dojo.dijit.main

import typings.dojo.AnonUnwatch
import typings.dojo.dijit.CalendarLite
import typings.dojo.dojoStrings.active
import typings.dojo.dojoStrings.cssStateNodes
import typings.dojo.dojoStrings.dndType
import typings.dojo.dojoStrings.hovering
import typings.dojo.dojoStrings.observer
import typings.dojo.dojoStrings.slideFrom
import typings.dojo.dojoStrings.style
import typings.std.Date
import typings.std.Event_
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dijit/main._Calendar.html
  *
  * A simple GUI for choosing a date in the context of a monthly calendar.
  * See CalendarLite for general description.   Calendar extends CalendarLite, adding:
  * 
  * month drop down list
  * keyboard navigation
  * CSS classes for hover/mousepress on date, month, and year nodes
  * support of deprecated methods (will be removed in 2.0)
  * 
  * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.     
  * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified, replace srcNodeRef with my generated DOM tree     
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.dojo.dijit.Destroyable because Already inherited
- typings.dojo.dojo.Stateful because Already inherited
- typings.dojo.dijit.FocusMixin because Inheritance from two classes. Inlined 
- typings.dojo.dijit.OnDijitClickMixin because Inheritance from two classes. Inlined 
- typings.dojo.dijit.WidgetBase because Already inherited
- typings.dojo.dijit.CssStateMixin because Inheritance from two classes. Inlined active, cssStateNodes, hovering
- typings.dojo.dijit.Widget because Inheritance from two classes. Inlined a11yclick, set_attributeMap, get_attributeMap, watch_attributeMap, set_baseClass, get_baseClass, watch_baseClass, set_class, get_class, watch_class, set_containerNode, get_containerNode, watch_containerNode, set_dir, get_dir, watch_dir, dndType, set_dndType, get_dndType, watch_dndType, set_domNode, get_domNode, watch_domNode, set_focused, get_focused, watch_focused, set_id, get_id, watch_id, set_lang, get_lang, watch_lang, observer, set_observer, get_observer, watch_observer, set_ownerDocument, get_ownerDocument, watch_ownerDocument, slideFrom, set_slideFrom, get_slideFrom, watch_slideFrom, set_srcNodeRef, get_srcNodeRef, watch_srcNodeRef, set_style, get_style, watch_style, set_title, get_title, watch_title, set_tooltip, get_tooltip, watch_tooltip, attr, attr, attr, attr, buildRendering, connect, connect, connect, connect, connect, connect, connect, connect, defer, defer, destroy, destroy, destroyDescendants, destroyDescendants, destroyRecursive, destroyRecursive, destroyRendering, destroyRendering, disconnect, emit, emit, emit, get, getChildren, getDescendants, getParent, isFocusable, isLeftToRight, on, on, own, placeAt, placeAt, placeAt, placeAt, placeAt, placeAt, placeAt, placeAt, placeAt, postCreate, postMixInProperties, set, setAttribute, startup, subscribe, toString, uninitialize, unsubscribe, watch, onBlur, onClick, onClose, onDblClick, onFocus, onHide, onKeyDown, onKeyPress, onKeyUp, onMouseDown, onMouseEnter, onMouseLeave, onMouseMove, onMouseOut, onMouseOver, onMouseUp, onShow */ @JSGlobal("dijit.main._Calendar")
@js.native
class Calendar () extends CalendarLite {
  def this(params: js.Object) = this()
  def this(params: js.Object, srcNodeRef: HTMLElement) = this()
  /**
    * Custom press, release, and click synthetic events
    * which trigger on a left mouse click, touch, or space/enter keyup.
    * 
    */
  var a11yclick: js.Object = js.native
  /**
    * True if mouse was pressed while over this widget, and hasn't been released yet
    * 
    */
  var active: Boolean = js.native
  /**
    * 
    */
  var cssStateNodes: js.Object = js.native
  /**
    * Defines a type of widget.
    * 
    */
  var dndType: String = js.native
  /**
    * True if cursor is over this widget
    * 
    */
  var hovering: Boolean = js.native
  /**
    * 
    */
  var observer: String = js.native
  /**
    * A parameter needed by RadioGroupSlide only. An optional parameter to force
    * the ContentPane to slide in from a set direction. Defaults
    * to "random", or specify one of "top", "left", "right", "bottom"
    * to slideFrom top, left, right, or bottom.
    * 
    */
  var slideFrom: String = js.native
  /**
    * This method is deprecated, use get() or set() directly.
    * 
    * @param name The property to get or set. If an object is passed here and nota string, its keys are used as names of attributes to be setand the value of the object as values to set in the widget.             
    * @param value               OptionalOptional. If provided, attr() operates as a setter. If omitted,the current value of the named property is returned.             
    */
  /**
    * This method is deprecated, use get() or set() directly.
    * 
    * @param name The property to get or set. If an object is passed here and nota string, its keys are used as names of attributes to be setand the value of the object as values to set in the widget.             
    * @param value               OptionalOptional. If provided, attr() operates as a setter. If omitted,the current value of the named property is returned.             
    */
  def attr(name: String): js.Any = js.native
  def attr(name: String, value: js.Object): js.Any = js.native
  /**
    * This method is deprecated, use get() or set() directly.
    * 
    * @param name The property to get or set. If an object is passed here and nota string, its keys are used as names of attributes to be setand the value of the object as values to set in the widget.             
    * @param value               OptionalOptional. If provided, attr() operates as a setter. If omitted,the current value of the named property is returned.             
    */
  /**
    * This method is deprecated, use get() or set() directly.
    * 
    * @param name The property to get or set. If an object is passed here and nota string, its keys are used as names of attributes to be setand the value of the object as values to set in the widget.             
    * @param value               OptionalOptional. If provided, attr() operates as a setter. If omitted,the current value of the named property is returned.             
    */
  def attr(name: js.Object): js.Any = js.native
  def attr(name: js.Object, value: js.Object): js.Any = js.native
  /**
    * Returns all the widgets contained by this, i.e., all widgets underneath this.containerNode.
    * This method should generally be avoided as it returns widgets declared in templates, which are
    * supposed to be internal/hidden, but it's left here for back-compat reasons.
    * 
    */
  /**
    * Returns all the widgets contained by this, i.e., all widgets underneath this.containerNode.
    * This method should generally be avoided as it returns widgets declared in templates, which are
    * supposed to be internal/hidden, but it's left here for back-compat reasons.
    * 
    */
  def getDescendants(): js.Array[_] = js.native
  @JSName("get")
  def get_active(property: active): Boolean = js.native
  @JSName("get")
  def get_cssStateNodes(property: cssStateNodes): js.Object = js.native
  @JSName("get")
  def get_dndType(property: dndType): String = js.native
  @JSName("get")
  def get_hovering(property: hovering): Boolean = js.native
  @JSName("get")
  def get_observer(property: observer): String = js.native
  @JSName("get")
  def get_slideFrom(property: slideFrom): String = js.native
  @JSName("get")
  def get_style_String(property: style): String = js.native
  /**
    * Provides keyboard navigation of calendar.
    * Called from _onKeyDown() to handle keydown on a stand alone Calendar,
    * and also from dijit/form/_DateTimeTextBox to pass a keydown event
    * from the dijit/form/DateTextBox to be handled in this widget
    * 
    * @param evt             
    */
  def handleKey(evt: Event_): js.Any = js.native
  /**
    * 
    * @param value             
    */
  def onChange(value: js.Any): Unit = js.native
  /**
    * Connect to this function to receive notifications of mouse click events.
    * 
    * @param event mouse Event             
    */
  /**
    * Connect to this function to receive notifications of mouse click events.
    * 
    * @param event mouse Event             
    */
  def onClick(event: js.Any): Unit = js.native
  /**
    * Called when this widget is being displayed as a popup (ex: a Calendar popped
    * up from a DateTextBox), and it is hidden.
    * This is called from the dijit.popup code, and should not be called directly.
    * 
    * Also used as a parameter for children of dijit/layout/StackContainer or subclasses.
    * Callback if a user tries to close the child.   Child will be closed if this function returns true.
    * 
    */
  /**
    * Called when this widget is being displayed as a popup (ex: a Calendar popped
    * up from a DateTextBox), and it is hidden.
    * This is called from the dijit.popup code, and should not be called directly.
    * 
    * Also used as a parameter for children of dijit/layout/StackContainer or subclasses.
    * Callback if a user tries to close the child.   Child will be closed if this function returns true.
    * 
    */
  def onClose(): Boolean = js.native
  /**
    * Connect to this function to receive notifications of mouse double click events.
    * 
    * @param event mouse Event             
    */
  /**
    * Connect to this function to receive notifications of mouse double click events.
    * 
    * @param event mouse Event             
    */
  def onDblClick(event: js.Any): Unit = js.native
  /**
    * Called when another widget becomes the selected pane in a
    * dijit/layout/TabContainer, dijit/layout/StackContainer,
    * dijit/layout/AccordionContainer, etc.
    * 
    * Also called to indicate hide of a dijit.Dialog, dijit.TooltipDialog, or dijit.TitlePane.
    * 
    */
  /**
    * Called when another widget becomes the selected pane in a
    * dijit/layout/TabContainer, dijit/layout/StackContainer,
    * dijit/layout/AccordionContainer, etc.
    * 
    * Also called to indicate hide of a dijit.Dialog, dijit.TooltipDialog, or dijit.TitlePane.
    * 
    */
  def onHide(): Unit = js.native
  /**
    * Connect to this function to receive notifications of keys being pressed down.
    * 
    * @param event key Event             
    */
  /**
    * Connect to this function to receive notifications of keys being pressed down.
    * 
    * @param event key Event             
    */
  def onKeyDown(event: js.Any): Unit = js.native
  /**
    * Connect to this function to receive notifications of printable keys being typed.
    * 
    * @param event key Event             
    */
  /**
    * Connect to this function to receive notifications of printable keys being typed.
    * 
    * @param event key Event             
    */
  def onKeyPress(event: js.Any): Unit = js.native
  /**
    * Connect to this function to receive notifications of keys being released.
    * 
    * @param event key Event             
    */
  /**
    * Connect to this function to receive notifications of keys being released.
    * 
    * @param event key Event             
    */
  def onKeyUp(event: js.Any): Unit = js.native
  /**
    * Connect to this function to receive notifications of when the mouse button is pressed down.
    * 
    * @param event mouse Event             
    */
  /**
    * Connect to this function to receive notifications of when the mouse button is pressed down.
    * 
    * @param event mouse Event             
    */
  def onMouseDown(event: js.Any): Unit = js.native
  /**
    * Connect to this function to receive notifications of when the mouse moves onto this widget.
    * 
    * @param event mouse Event             
    */
  /**
    * Connect to this function to receive notifications of when the mouse moves onto this widget.
    * 
    * @param event mouse Event             
    */
  def onMouseEnter(event: js.Any): Unit = js.native
  /**
    * Connect to this function to receive notifications of when the mouse moves off of this widget.
    * 
    * @param event mouse Event             
    */
  /**
    * Connect to this function to receive notifications of when the mouse moves off of this widget.
    * 
    * @param event mouse Event             
    */
  def onMouseLeave(event: js.Any): Unit = js.native
  /**
    * Connect to this function to receive notifications of when the mouse moves over nodes contained within this widget.
    * 
    * @param event mouse Event             
    */
  /**
    * Connect to this function to receive notifications of when the mouse moves over nodes contained within this widget.
    * 
    * @param event mouse Event             
    */
  def onMouseMove(event: js.Any): Unit = js.native
  /**
    * Connect to this function to receive notifications of when the mouse moves off of nodes contained within this widget.
    * 
    * @param event mouse Event             
    */
  /**
    * Connect to this function to receive notifications of when the mouse moves off of nodes contained within this widget.
    * 
    * @param event mouse Event             
    */
  def onMouseOut(event: js.Any): Unit = js.native
  /**
    * Connect to this function to receive notifications of when the mouse moves onto nodes contained within this widget.
    * 
    * @param event mouse Event             
    */
  /**
    * Connect to this function to receive notifications of when the mouse moves onto nodes contained within this widget.
    * 
    * @param event mouse Event             
    */
  def onMouseOver(event: js.Any): Unit = js.native
  /**
    * Connect to this function to receive notifications of when the mouse button is released.
    * 
    * @param event mouse Event             
    */
  /**
    * Connect to this function to receive notifications of when the mouse button is released.
    * 
    * @param event mouse Event             
    */
  def onMouseUp(event: js.Any): Unit = js.native
  /**
    * Called when this widget becomes the selected pane in a
    * dijit/layout/TabContainer, dijit/layout/StackContainer,
    * dijit/layout/AccordionContainer, etc.
    * 
    * Also called to indicate display of a dijit.Dialog, dijit.TooltipDialog, or dijit.TitlePane.
    * 
    */
  /**
    * Called when this widget becomes the selected pane in a
    * dijit/layout/TabContainer, dijit/layout/StackContainer,
    * dijit/layout/AccordionContainer, etc.
    * 
    * Also called to indicate display of a dijit.Dialog, dijit.TooltipDialog, or dijit.TitlePane.
    * 
    */
  def onShow(): Unit = js.native
  /**
    * Deprecated.   Notification that a date cell was selected.  It may be the same as the previous value.
    * Formerly used by dijit/form/_DateTimeTextBox (and thus dijit/form/DateTextBox)
    * to get notification when the user has clicked a date.  Now onExecute() (above) is used.
    * 
    * @param date             
    */
  def onValueSelected(date: Date): Unit = js.native
  /**
    * Deprecated.  Use set() instead.
    * 
    * @param attr             
    * @param value             
    */
  /**
    * Deprecated.  Use set() instead.
    * 
    * @param attr             
    * @param value             
    */
  def setAttribute(attr: String, value: js.Any): Unit = js.native
  /**
    * Deprecated.   Use set('value', ...) instead.
    * 
    * @param value             
    */
  def setValue(value: Date): Unit = js.native
  @JSName("set")
  def set_active(property: active, value: Boolean): Unit = js.native
  @JSName("set")
  def set_cssStateNodes(property: cssStateNodes, value: js.Object): Unit = js.native
  @JSName("set")
  def set_dndType(property: dndType, value: String): Unit = js.native
  @JSName("set")
  def set_hovering(property: hovering, value: Boolean): Unit = js.native
  @JSName("set")
  def set_observer(property: observer, value: String): Unit = js.native
  @JSName("set")
  def set_slideFrom(property: slideFrom, value: String): Unit = js.native
  @JSName("watch")
  def watch_active(
    property: active,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_cssStateNodes(
    property: cssStateNodes,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Object], 
      /* newValue */ js.UndefOr[js.Object], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_dndType(
    property: dndType,
    callback: js.Function3[js.UndefOr[String], js.UndefOr[String], js.UndefOr[String], Unit]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_hovering(
    property: hovering,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_observer(
    property: observer,
    callback: js.Function3[js.UndefOr[String], js.UndefOr[String], js.UndefOr[String], Unit]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_slideFrom(
    property: slideFrom,
    callback: js.Function3[js.UndefOr[String], js.UndefOr[String], js.UndefOr[String], Unit]
  ): AnonUnwatch = js.native
}

