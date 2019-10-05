package typings.dojo.dojox.mobile

import typings.dojo.Anon_Unwatch
import typings.dojo.Fn_NewValueOldValueProperty
import typings.dojo.dijit._WidgetBase
import typings.dojo.dojoStrings.leftLabel
import typings.dojo.dojoStrings.name
import typings.dojo.dojoStrings.rightLabel
import typings.dojo.dojoStrings.shape
import typings.dojo.dojoStrings.style
import typings.dojo.dojoStrings.tabIndex
import typings.dojo.dojoStrings.value
import typings.std.Event
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/mobile/Switch.html
  *
  * A toggle switch with a sliding knob.
  * Switch is a toggle switch with a sliding knob. You can either
  * tap or slide the knob to toggle the switch. The onStateChanged
  * handler is called when the switch is manipulated.
  *
  * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.
  * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.dojo.dijit._Contained because Inheritance from two classes. Inlined getIndexInParent, getNextSibling, getPreviousSibling */ @JSGlobal("dojox.mobile.Switch")
@js.native
class Switch () extends _WidgetBase {
  def this(params: js.Object) = this()
  def this(params: js.Object, srcNodeRef: HTMLElement) = this()
  /**
    * The left-side label of the switch.
    *
    */
  var leftLabel: String = js.native
  /**
    * A name for a hidden input field, which holds the current value.
    *
    */
  var name: String = js.native
  /**
    * The right-side label of the switch.
    *
    */
  var rightLabel: String = js.native
  /**
    * The shape of the switch.
    * "mblSwDefaultShape", "mblSwSquareShape", "mblSwRoundShape1",
    * "mblSwRoundShape2", "mblSwArcShape1" or "mblSwArcShape2".
    * The default value is "mblSwDefaultShape".
    *
    */
  var shape: String = js.native
  /**
    * HTML style attributes as cssText string or name/value hash
    *
    */
  @JSName("style")
  var style_Switch: String = js.native
  /**
    * Tabindex setting for this widget so users can hit the tab key to
    * focus on it.
    *
    */
  var tabIndex: String = js.native
  /**
    * The initial state of the switch: "on" or "off". The default
    * value is "on".
    *
    */
  var value: String = js.native
  /**
    * Returns the index of this widget within its container parent.
    * It returns -1 if the parent does not exist, or if the parent
    * is not a dijit/_Container
    *
    */
  /**
    * Returns the index of this widget within its container parent.
    * It returns -1 if the parent does not exist, or if the parent
    * is not a dijit/_Container
    * 
    */
  def getIndexInParent(): js.Any = js.native
  /**
    * Returns null if this is the last child of the parent,
    * otherwise returns the next element sibling to the "right".
    *
    */
  /**
    * Returns null if this is the last child of the parent,
    * otherwise returns the next element sibling to the "right".
    * 
    */
  def getNextSibling(): js.Any = js.native
  /**
    * Returns null if this is the first child of the parent,
    * otherwise returns the next element sibling to the "left".
    *
    */
  /**
    * Returns null if this is the first child of the parent,
    * otherwise returns the next element sibling to the "left".
    * 
    */
  def getPreviousSibling(): js.Any = js.native
  @JSName("get")
  def get_leftLabel(property: leftLabel): String = js.native
  @JSName("get")
  def get_name(property: name): String = js.native
  @JSName("get")
  def get_rightLabel(property: rightLabel): String = js.native
  @JSName("get")
  def get_shape(property: shape): String = js.native
  @JSName("get")
  def get_tabIndex(property: tabIndex): String = js.native
  @JSName("get")
  def get_value(property: value): String = js.native
  /**
    * User defined function to handle clicks
    *
    * @param e
    */
  def onClick(e: Event): Unit = js.native
  /**
    * Stub function to connect to from your application.
    * Called when the state has been changed.
    *
    * @param newState
    */
  def onStateChanged(newState: String): Unit = js.native
  /**
    * Internal function to handle touchEnd events.
    *
    * @param e
    */
  def onTouchEnd(e: Event): Unit = js.native
  /**
    * Internal function to handle touchMove events.
    *
    * @param e
    */
  def onTouchMove(e: Event): Unit = js.native
  /**
    * Internal function to handle touchStart events.
    *
    * @param e
    */
  def onTouchStart(e: Event): Unit = js.native
  /**
    * Track specified handles and remove/destroy them when this instance is destroyed, unless they were
    * already removed/destroyed manually.
    *
    */
  def own(): js.Any = js.native
  /**
    * Reset the widget's value to what it was at initialization time
    *
    */
  def reset(): Unit = js.native
  @JSName("set")
  def set_leftLabel(property: leftLabel, value: String): Unit = js.native
  @JSName("set")
  def set_name(property: name, value: String): Unit = js.native
  @JSName("set")
  def set_rightLabel(property: rightLabel, value: String): Unit = js.native
  @JSName("set")
  def set_shape(property: shape, value: String): Unit = js.native
  @JSName("set")
  def set_style(property: style, value: String): Unit = js.native
  @JSName("set")
  def set_tabIndex(property: tabIndex, value: String): Unit = js.native
  @JSName("set")
  def set_value(property: value, value: String): Unit = js.native
  @JSName("watch")
  def watch_leftLabel(property: leftLabel, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_name(property: name, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_rightLabel(property: rightLabel, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_shape(property: shape, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_style(property: style, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_tabIndex(property: tabIndex, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_value(property: value, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
}

