package typings.dojo.dijit

import typings.dojo.AnonUnwatch
import typings.dojo.dojoStrings.dndType
import typings.dojo.dojoStrings.observer
import typings.dojo.dojoStrings.slideFrom
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dijit/_Widget.html
  *
  * Old base class for widgets.   New widgets should extend dijit/_WidgetBase instead
  * Old Base class for Dijit widgets.
  * 
  * Extends _WidgetBase, adding support for:
  * 
  * declaratively/programatically specifying widget initialization parameters like
  *   onMouseMove="foo" that call foo when this.domNode gets a mousemove event
  * ondijitclick:
  *   Support new data-dojo-attach-event="ondijitclick: ..." that is triggered by a mouse click or a SPACE/ENTER keypress
  * focus related functions:
  *   In particular, the onFocus()/onBlur() callbacks.   Driven internally by
  *   dijit/_base/focus.js.
  * deprecated methods
  * onShow(), onHide(), onClose()
  * Also, by loading code in dijit/_base, turns on:
  * 
  * browser sniffing (putting browser class like dj_ie on <html> node)
  * high contrast mode sniffing (add dijit_a11y class to <body> if machine is in high contrast mode)
  * 
  * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.     
  * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree     
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.dojo.dijit.FocusMixin because Inheritance from two classes. Inlined 
- typings.dojo.dijit.OnDijitClickMixin because Inheritance from two classes. Inlined a11yclick, connect */ @JSGlobal("dijit._Widget")
@js.native
class Widget () extends WidgetBase {
  def this(params: js.Object) = this()
  def this(params: js.Object, srcNodeRef: HTMLElement) = this()
  /**
    * Custom press, release, and click synthetic events
    * which trigger on a left mouse click, touch, or space/enter keyup.
    * 
    */
  var a11yclick: js.Object = js.native
  /**
    * Defines a type of widget.
    * 
    */
  var dndType: String = js.native
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
  def attr(name: String): js.Any = js.native
  def attr(name: String, value: js.Object): js.Any = js.native
  /**
    * This method is deprecated, use get() or set() directly.
    * 
    * @param name The property to get or set. If an object is passed here and nota string, its keys are used as names of attributes to be setand the value of the object as values to set in the widget.             
    * @param value               OptionalOptional. If provided, attr() operates as a setter. If omitted,the current value of the named property is returned.             
    */
  def attr(name: js.Object): js.Any = js.native
  def attr(name: js.Object, value: js.Object): js.Any = js.native
  /**
    * 
    * @param obj             
    * @param event             
    * @param method             
    */
  def connect(obj: js.Any, event: js.Any, method: js.Any): js.Any = js.native
  /**
    * Returns all the widgets contained by this, i.e., all widgets underneath this.containerNode.
    * This method should generally be avoided as it returns widgets declared in templates, which are
    * supposed to be internal/hidden, but it's left here for back-compat reasons.
    * 
    */
  def getDescendants(): js.Array[_] = js.native
  @JSName("get")
  def get_dndType(property: dndType): String = js.native
  @JSName("get")
  def get_observer(property: observer): String = js.native
  @JSName("get")
  def get_slideFrom(property: slideFrom): String = js.native
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
  def onClose(): Boolean = js.native
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
  def onHide(): Unit = js.native
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
  def onKeyPress(event: js.Any): Unit = js.native
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
  def onMouseDown(event: js.Any): Unit = js.native
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
  def onMouseLeave(event: js.Any): Unit = js.native
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
  def onMouseOut(event: js.Any): Unit = js.native
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
  def onMouseUp(event: js.Any): Unit = js.native
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
    * Track specified handles and remove/destroy them when this instance is destroyed, unless they were
    * already removed/destroyed manually.
    * 
    */
  def own(): js.Any = js.native
  /**
    * Deprecated.  Use set() instead.
    * 
    * @param attr             
    * @param value             
    */
  def setAttribute(attr: String, value: js.Any): Unit = js.native
  @JSName("set")
  def set_dndType(property: dndType, value: String): Unit = js.native
  @JSName("set")
  def set_observer(property: observer, value: String): Unit = js.native
  @JSName("set")
  def set_slideFrom(property: slideFrom, value: String): Unit = js.native
  @JSName("watch")
  def watch_dndType(
    property: dndType,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_observer(
    property: observer,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_slideFrom(
    property: slideFrom,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): AnonUnwatch = js.native
}

