package typings.dojo.dojox.mobile

import typings.dojo.Anon_Unwatch
import typings.dojo.Fn_NewValue
import typings.dojo.Fn_NewValueOldValueProperty
import typings.dojo.dijit._WidgetBase
import typings.dojo.dojoStrings.barType
import typings.dojo.dojoStrings.center
import typings.dojo.dojoStrings.closable
import typings.dojo.dojoStrings.fill
import typings.dojo.dojoStrings.iconBase
import typings.dojo.dojoStrings.iconPos
import typings.dojo.dojoStrings.style
import typings.dojo.dojoStrings.syncWithViews
import typings.dojo.dojoStrings.tag
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/mobile/TabBar.html
  *
  * A bar widget that has buttons to control visibility of views.
  * TabBar is a container widget that has typically multiple
  * TabBarButtons which controls visibility of views. It can be used
  * as a tab container.
  *
  * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.
  * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.dojo.dijit._Contained because Inheritance from two classes. Inlined getIndexInParent, getNextSibling, getPreviousSibling
- typings.dojo.dijit._Container because Inheritance from two classes. Inlined addChild, addChild, buildRendering, getIndexOfChild, hasChildren, removeChild, removeChild */ @JSGlobal("dojox.mobile.TabBar")
@js.native
class TabBar () extends _WidgetBase {
  def this(params: js.Object) = this()
  def this(params: js.Object, srcNodeRef: HTMLElement) = this()
  /**
    * "tabBar", "segmentedControl", "standardTab", "slimTab", "flatTab",
    * or "tallTab"
    *
    */
  var barType: String = js.native
  /**
    * If true, place the tabs in the center of the bar.
    * This property is NOT effective for "tabBar".
    *
    */
  var center: Boolean = js.native
  /**
    * If true, user can close (destroy) a child tab by clicking the X on the tab.
    * This property is NOT effective for "tabBar" and "tallBar".
    *
    */
  var closable: Boolean = js.native
  /**
    * Define if the TabBar should resize its children so that they evenly fill all the available space in the bar.
    *
    * Allowed values:
    *
    * "auto" is the default behavior from version 1.8: bar buttons are resized to evenly fill the entire bar only on small devices (width < 500px) and when barType is "tabBar"
    * "always": bar buttons are always resized to evenly fill the entire bar
    * "never": bar buttons are never resized to evenly fill the entire bar
    *
    */
  var fill: String = js.native
  /**
    * The default icon path for child items.
    *
    */
  var iconBase: String = js.native
  /**
    * The default icon position for child items.
    *
    */
  var iconPos: String = js.native
  /**
    * HTML style attributes as cssText string or name/value hash
    *
    */
  @JSName("style")
  var style_TabBar: String = js.native
  /**
    * If true, this widget listens to view transition events to be
    * synchronized with view's visibility.
    *
    */
  var syncWithViews: Boolean = js.native
  /**
    * A name of html tag to create as domNode.
    *
    */
  var tag: String = js.native
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
    * Makes the given widget a child of this widget.
    * Inserts specified child widget's dom node as a child of this widget's
    * container node, and possibly does other processing (such as layout).
    *
    * @param widget
    * @param insertIndex               Optional
    */
  def addChild(widget: _WidgetBase, insertIndex: Double): Unit = js.native
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
  /**
    * Returns the first selected child.
    *
    */
  def getSelectedTab(): js.Any = js.native
  @JSName("get")
  def get_barType(property: barType): String = js.native
  @JSName("get")
  def get_center(property: center): Boolean = js.native
  @JSName("get")
  def get_closable(property: closable): Boolean = js.native
  @JSName("get")
  def get_fill(property: fill): String = js.native
  @JSName("get")
  def get_iconBase(property: iconBase): String = js.native
  @JSName("get")
  def get_iconPos(property: iconPos): String = js.native
  @JSName("get")
  def get_syncWithViews(property: syncWithViews): Boolean = js.native
  @JSName("get")
  def get_tag(property: tag): String = js.native
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
    * Called whenever the close button [X] of a child tab is clicked.
    *
    * @param tab
    */
  def onCloseButtonClick(tab: TabBarButton): Boolean = js.native
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
  def removeChild(widget: _WidgetBase): Unit = js.native
  /**
    * Resets the widget to its initial state.
    *
    */
  def reset(): Unit = js.native
  /**
    *
    * @param size
    */
  def resize(size: js.Any): Unit = js.native
  @JSName("set")
  def set_barType(property: barType, value: String): Unit = js.native
  @JSName("set")
  def set_center(property: center, value: Boolean): Unit = js.native
  @JSName("set")
  def set_closable(property: closable, value: Boolean): Unit = js.native
  @JSName("set")
  def set_fill(property: fill, value: String): Unit = js.native
  @JSName("set")
  def set_iconBase(property: iconBase, value: String): Unit = js.native
  @JSName("set")
  def set_iconPos(property: iconPos, value: String): Unit = js.native
  @JSName("set")
  def set_style(property: style, value: String): Unit = js.native
  @JSName("set")
  def set_syncWithViews(property: syncWithViews, value: Boolean): Unit = js.native
  @JSName("set")
  def set_tag(property: tag, value: String): Unit = js.native
  @JSName("watch")
  def watch_barType(property: barType, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_center(property: center, callback: Fn_NewValue): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_closable(property: closable, callback: Fn_NewValue): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_fill(property: fill, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_iconBase(property: iconBase, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_iconPos(property: iconPos, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_style(property: style, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_syncWithViews(property: syncWithViews, callback: Fn_NewValue): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_tag(property: tag, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
}

