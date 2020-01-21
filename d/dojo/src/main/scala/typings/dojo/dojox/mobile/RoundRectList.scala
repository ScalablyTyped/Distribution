package typings.dojo.dojox.mobile

import typings.dojo.AnonUnwatch
import typings.dojo.dijit.WidgetBase
import typings.dojo.dojoStrings.editable
import typings.dojo.dojoStrings.editableMixinClass
import typings.dojo.dojoStrings.filterBoxClass
import typings.dojo.dojoStrings.iconBase
import typings.dojo.dojoStrings.iconPos
import typings.dojo.dojoStrings.select
import typings.dojo.dojoStrings.stateful
import typings.dojo.dojoStrings.style
import typings.dojo.dojoStrings.syncWithViews
import typings.dojo.dojoStrings.tag
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/mobile/RoundRectList.html
  *
  * A rounded rectangle list.
  * RoundRectList is a rounded rectangle list, which can be used to
  * display a group of items. Each item must be a dojox/mobile/ListItem.
  *
  * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.
  * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.dojo.dijit.Contained because Inheritance from two classes. Inlined getIndexInParent, getNextSibling, getPreviousSibling
- typings.dojo.dijit.Container because Inheritance from two classes. Inlined addChild, addChild, buildRendering, getIndexOfChild, hasChildren, removeChild, removeChild */ @JSGlobal("dojox.mobile.RoundRectList")
@js.native
class RoundRectList () extends WidgetBase {
  def this(params: js.Object) = this()
  def this(params: js.Object, srcNodeRef: HTMLElement) = this()
  /**
    * If true, the list can be reordered.
    * Note that changing the value of the property after the widget
    * creation has no effect.
    *
    */
  var editable: Boolean = js.native
  /**
    * The name of the mixin class.
    *
    */
  var editableMixinClass: String = js.native
  /**
    * The name of the CSS class added to the DOM node inside which is placed the
    * dojox/mobile/SearchBox created when mixing dojox/mobile/FilteredListMixin.
    * The default value is "mblFilteredRoundRectListSearchBox".
    *
    */
  var filterBoxClass: String = js.native
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
    * Selection mode of the list. The check mark is shown for the
    * selected list item(s). The value can be "single", "multiple", or "".
    * If "single", there can be only one selected item at a time.
    * If "multiple", there can be multiple selected items at a time.
    * If "", the check mark is not shown.
    *
    */
  var select: String = js.native
  /**
    * If true, the last selected item remains highlighted.
    *
    */
  var stateful: Boolean = js.native
  /**
    * HTML style attributes as cssText string or name/value hash
    *
    */
  @JSName("style")
  var style_RoundRectList: String = js.native
  /**
    * If true, this widget listens to view transition events to be
    * synchronized with view's visibility.
    * Note that changing the value of the property after the widget
    * creation has no effect.
    *
    */
  var syncWithViews: Boolean = js.native
  /**
    * A name of html tag to create as domNode.
    *
    */
  var tag: String = js.native
  /**
    * The default animated transition effect for child items.
    *
    */
  var transition: String = js.native
  /**
    *
    * @param widget
    * @param insertIndex               Optional
    */
  def addChild(widget: js.Any, insertIndex: Double): Unit = js.native
  /**
    * Makes the given widget a child of this widget.
    * Inserts specified child widget's dom node as a child of this widget's
    * container node, and possibly does other processing (such as layout).
    * 
    * @param widget             
    * @param insertIndex               Optional            
    */
  def addChild(widget: WidgetBase): Unit = js.native
  def addChild(widget: WidgetBase, insertIndex: Double): Unit = js.native
  /**
    * Deselects all the items.
    *
    */
  def deselectAll(): Unit = js.native
  /**
    * Deselects the given item.
    *
    * @param item
    */
  def deselectItem(item: ListItem): Unit = js.native
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
  @JSName("get")
  def get_editable(property: editable): Boolean = js.native
  @JSName("get")
  def get_editableMixinClass(property: editableMixinClass): String = js.native
  @JSName("get")
  def get_filterBoxClass(property: filterBoxClass): String = js.native
  @JSName("get")
  def get_iconBase(property: iconBase): String = js.native
  @JSName("get")
  def get_iconPos(property: iconPos): String = js.native
  @JSName("get")
  def get_select(property: select): String = js.native
  @JSName("get")
  def get_stateful(property: stateful): Boolean = js.native
  @JSName("get")
  def get_syncWithViews(property: syncWithViews): Boolean = js.native
  @JSName("get")
  def get_tag(property: tag): String = js.native
  @JSName("get")
  def get_transition(property: typings.dojo.dojoStrings.transition): String = js.native
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
    * Stub function to connect to from your application.
    * Called when the check state has been changed.
    *
    * @param listItem
    * @param newState
    */
  def onCheckStateChanged(listItem: WidgetBase, newState: String): Unit = js.native
  /**
    * Track specified handles and remove/destroy them when this instance is destroyed, unless they were
    * already removed/destroyed manually.
    *
    */
  def own(): js.Any = js.native
  /**
    * Function to adjust the creation of RoundRectLists on IE.
    * Removed undesired styles.
    *
    */
  def redrawBorders(): Unit = js.native
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
    * Calls resize() of each child widget.
    *
    */
  def resize(): Unit = js.native
  /**
    * Selects the given item.
    *
    * @param item
    */
  def selectItem(item: ListItem): Unit = js.native
  @JSName("set")
  def set_editable(property: editable, value: Boolean): Unit = js.native
  @JSName("set")
  def set_editableMixinClass(property: editableMixinClass, value: String): Unit = js.native
  @JSName("set")
  def set_filterBoxClass(property: filterBoxClass, value: String): Unit = js.native
  @JSName("set")
  def set_iconBase(property: iconBase, value: String): Unit = js.native
  @JSName("set")
  def set_iconPos(property: iconPos, value: String): Unit = js.native
  @JSName("set")
  def set_select(property: select, value: String): Unit = js.native
  @JSName("set")
  def set_stateful(property: stateful, value: Boolean): Unit = js.native
  @JSName("set")
  def set_style(property: style, value: String): Unit = js.native
  @JSName("set")
  def set_syncWithViews(property: syncWithViews, value: Boolean): Unit = js.native
  @JSName("set")
  def set_tag(property: tag, value: String): Unit = js.native
  @JSName("set")
  def set_transition(property: typings.dojo.dojoStrings.transition, value: String): Unit = js.native
  @JSName("watch")
  def watch_editable(
    property: editable,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_editableMixinClass(
    property: editableMixinClass,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_filterBoxClass(
    property: filterBoxClass,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_iconBase(
    property: iconBase,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_iconPos(
    property: iconPos,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_select(
    property: select,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_stateful(
    property: stateful,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_syncWithViews(
    property: syncWithViews,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_tag(
    property: tag,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_transition(
    property: typings.dojo.dojoStrings.transition,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): AnonUnwatch = js.native
}

