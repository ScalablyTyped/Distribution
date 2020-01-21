package typings.dojo.dojox.mobile

import typings.dojo.AnonUnwatch
import typings.dojo.dijit.WidgetBase
import typings.dojo.dojoStrings.colors
import typings.dojo.dojoStrings.slotClasses
import typings.dojo.dojoStrings.slotOrder
import typings.dojo.dojoStrings.slotProps
import typings.dojo.dojoStrings.style
import typings.dojo.dojoStrings.values
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/mobile/_PickerBase.html
  *
  * A base class for picker classes (e.g. SpinWheel, ValuePicker).
  *
  * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.
  * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.dojo.dijit.Contained because Inheritance from two classes. Inlined getIndexInParent, getNextSibling, getPreviousSibling
- typings.dojo.dijit.Container because Inheritance from two classes. Inlined addChild, addChild, buildRendering, getIndexOfChild, hasChildren, removeChild, removeChild */ @JSGlobal("dojox.mobile._PickerBase")
@js.native
class PickerBase () extends WidgetBase {
  def this(params: js.Object) = this()
  def this(params: js.Object, srcNodeRef: HTMLElement) = this()
  /**
    * An array of slot colors.
    * Warning: Do not use this property directly, make sure to call set() or get() methods.
    *
    */
  var colors: js.Array[_] = js.native
  /**
    * An array of slot classes. This property is intended to be used
    * when you create a subclass of this widget that has specific slots.
    *
    */
  var slotClasses: js.Array[_] = js.native
  /**
    * An array of index of slotClasses and slotProps.
    * If there are three slots and slotOrder=[2,1,0], the slots are
    * displayed in reversed order. This property is intended to be used
    * when you create a subclass of this widget that has specific slots.
    *
    */
  var slotOrder: js.Array[_] = js.native
  /**
    * An array of property objects for each slot class specified in
    * slotClasses. This property is intended to be used when you
    * create a subclass of this widget that has specific slots.
    *
    */
  var slotProps: js.Array[_] = js.native
  /**
    * HTML style attributes as cssText string or name/value hash
    *
    */
  @JSName("style")
  var style_PickerBase: String = js.native
  /**
    * An array of slot values.
    * Warning: Do not use this property directly, make sure to call set() or get() methods.
    *
    */
  var values: js.Array[_] = js.native
  /**
    * Makes the given widget a child of this widget.
    * Inserts specified child widget's dom node as a child of this widget's
    * container node, and possibly does other processing (such as layout).
    * 
    * @param widget             
    * @param insertIndex               Optional            
    */
  def addChild(widget: WidgetBase): Unit = js.native
  /**
    * Makes the given widget a child of this widget.
    * Inserts specified child widget's dom node as a child of this widget's
    * container node, and possibly does other processing (such as layout).
    *
    * @param widget
    * @param insertIndex               Optional
    */
  def addChild(widget: WidgetBase, insertIndex: Double): Unit = js.native
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
    * Gets the index of the child in this container or -1 if not found
    *
    * @param child
    */
  /**
    * Gets the index of the child in this container or -1 if not found
    * 
    * @param child             
    */
  def getIndexOfChild(child: WidgetBase): js.Any = js.native
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
  /**
    * Returns an array of child slot widgets.
    *
    */
  def getSlots(): js.Any = js.native
  @JSName("get")
  def get_colors(property: colors): js.Array[_] = js.native
  @JSName("get")
  def get_slotClasses(property: slotClasses): js.Array[_] = js.native
  @JSName("get")
  def get_slotOrder(property: slotOrder): js.Array[_] = js.native
  @JSName("get")
  def get_slotProps(property: slotProps): js.Array[_] = js.native
  @JSName("get")
  def get_values(property: values): js.Array[_] = js.native
  /**
    * Returns true if widget has child widgets, i.e. if this.containerNode contains widgets.
    *
    */
  /**
    * Returns true if widget has child widgets, i.e. if this.containerNode contains widgets.
    * 
    */
  def hasChildren(): Boolean = js.native
  /**
    * Track specified handles and remove/destroy them when this instance is destroyed, unless they were
    * already removed/destroyed manually.
    *
    */
  def own(): js.Any = js.native
  /**
    * Removes the passed widget instance from this widget but does
    * not destroy it.  You can also pass in an integer indicating
    * the index within the container to remove (ie, removeChild(5) removes the sixth widget).
    *
    * @param widget
    */
  /**
    * Removes the passed widget instance from this widget but does
    * not destroy it.  You can also pass in an integer indicating
    * the index within the container to remove (ie, removeChild(5) removes the sixth widget).
    * 
    * @param widget             
    */
  def removeChild(widget: Double): Unit = js.native
  /**
    * Removes the passed widget instance from this widget but does
    * not destroy it.  You can also pass in an integer indicating
    * the index within the container to remove (ie, removeChild(5) removes the sixth widget).
    *
    * @param widget
    */
  /**
    * Removes the passed widget instance from this widget but does
    * not destroy it.  You can also pass in an integer indicating
    * the index within the container to remove (ie, removeChild(5) removes the sixth widget).
    * 
    * @param widget             
    */
  def removeChild(widget: WidgetBase): Unit = js.native
  /**
    * Resets the picker to show the initial values.
    *
    */
  def reset(): Unit = js.native
  @JSName("set")
  def set_colors(property: colors, value: js.Array[_]): Unit = js.native
  @JSName("set")
  def set_slotClasses(property: slotClasses, value: js.Array[_]): Unit = js.native
  @JSName("set")
  def set_slotOrder(property: slotOrder, value: js.Array[_]): Unit = js.native
  @JSName("set")
  def set_slotProps(property: slotProps, value: js.Array[_]): Unit = js.native
  @JSName("set")
  def set_style(property: style, value: String): Unit = js.native
  @JSName("set")
  def set_values(property: values, value: js.Array[_]): Unit = js.native
  @JSName("watch")
  def watch_colors(
    property: colors,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Array[_]], 
      /* newValue */ js.UndefOr[js.Array[_]], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_slotClasses(
    property: slotClasses,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Array[_]], 
      /* newValue */ js.UndefOr[js.Array[_]], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_slotOrder(
    property: slotOrder,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Array[_]], 
      /* newValue */ js.UndefOr[js.Array[_]], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_slotProps(
    property: slotProps,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Array[_]], 
      /* newValue */ js.UndefOr[js.Array[_]], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_values(
    property: values,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Array[_]], 
      /* newValue */ js.UndefOr[js.Array[_]], 
      Unit
    ]
  ): AnonUnwatch = js.native
}

