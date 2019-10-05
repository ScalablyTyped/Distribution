package typings.dojo.dijit.layout

import typings.dojo.Anon_Unwatch
import typings.dojo.Fn_NewValue
import typings.dojo.Fn_NewValueOldValueProperty
import typings.dojo.dijit._Widget
import typings.dojo.dijit._WidgetBase
import typings.dojo.dojoStrings.isLayoutContainer
import typings.dojo.dojoStrings.style
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dijit/layout/_LayoutWidget.html
  *
  * Base class for a _Container widget which is responsible for laying out its children.
  * Widgets which mixin this code must define layout() to manage placement and sizing of the children.
  * 
  * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.     
  * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree     
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.dojo.dijit._Contained because Inheritance from two classes. Inlined getIndexInParent, getNextSibling, getPreviousSibling
- typings.dojo.dijit._Container because Inheritance from two classes. Inlined addChild, addChild, buildRendering, getIndexOfChild, hasChildren, removeChild, removeChild */ @JSGlobal("dijit.layout._LayoutWidget")
@js.native
class _LayoutWidget () extends _Widget {
  def this(params: js.Object) = this()
  def this(params: js.Object, srcNodeRef: HTMLElement) = this()
  /**
    * Indicates that this widget is going to call resize() on its
    * children widgets, setting their size, when they become visible.
    * 
    */
  var isLayoutContainer: Boolean = js.native
  /**
    * HTML style attributes as cssText string or name/value hash
    * 
    */
  @JSName("style")
  var style__LayoutWidget: String = js.native
  /**
    * 
    * @param child             
    * @param insertIndex               Optional            
    */
  def addChild(child: _WidgetBase, insertIndex: Double): Unit = js.native
  /**
    * Makes the given widget a child of this widget.
    * Inserts specified child widget's dom node as a child of this widget's
    * container node, and possibly does other processing (such as layout).
    * 
    * @param widget             
    * @param insertIndex               Optional            
    */
  def addChild(widget: _WidgetBase): Unit = js.native
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
  def getIndexOfChild(child: _WidgetBase): js.Any = js.native
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
  def get_isLayoutContainer(property: isLayoutContainer): Boolean = js.native
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
    * Widgets override this method to size and position their contents/children.
    * When this is called this._contentBox is guaranteed to be set (see resize()).
    * 
    * This is called after startup(), and also when the widget's size has been
    * changed.
    * 
    */
  def layout(): Unit = js.native
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
  def removeChild(widget: _WidgetBase): Unit = js.native
  /**
    * Call this to resize a widget, or after its size has changed.
    * Change size mode:
    * When changeSize is specified, changes the marginBox of this widget
    * and forces it to re-layout its contents accordingly.
    * changeSize may specify height, width, or both.
    * 
    * If resultSize is specified it indicates the size the widget will
    * become after changeSize has been applied.
    * 
    * Notification mode:
    * When changeSize is null, indicates that the caller has already changed
    * the size of the widget, or perhaps it changed because the browser
    * window was resized.  Tells widget to re-layout its contents accordingly.
    * 
    * If resultSize is also specified it indicates the size the widget has
    * become.
    * 
    * In either mode, this method also:
    * 
    * Sets this._borderBox and this._contentBox to the new size of
    *  the widget.  Queries the current domNode size if necessary.
    * Calls layout() to resize contents (and maybe adjust child widgets).
    * 
    * @param changeSize               OptionalSets the widget to this margin-box size and position.May include any/all of the following properties:{w: int, h: int, l: int, t: int}             
    * @param resultSize               OptionalThe margin-box size of this widget after applying changeSize (ifchangeSize is specified).  If caller knows this size andpasses it in, we don't need to query the browser to get the size.{w: int, h: int}             
    */
  def resize(changeSize: js.Object, resultSize: js.Object): Unit = js.native
  @JSName("set")
  def set_isLayoutContainer(property: isLayoutContainer, value: Boolean): Unit = js.native
  @JSName("set")
  def set_style(property: style, value: String): Unit = js.native
  @JSName("watch")
  def watch_isLayoutContainer(property: isLayoutContainer, callback: Fn_NewValue): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_style(property: style, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
}

