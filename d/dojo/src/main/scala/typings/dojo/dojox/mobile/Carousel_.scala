package typings.dojo.dojox.mobile

import typings.dojo.AnonUnwatch
import typings.dojo.dijit.WidgetBase
import typings.dojo.dojoStrings.ChildSwapViewProperties
import typings.dojo.dojoStrings.height
import typings.dojo.dojoStrings.itemWidth
import typings.dojo.dojoStrings.navButton
import typings.dojo.dojoStrings.numVisible
import typings.dojo.dojoStrings.pageIndicator
import typings.dojo.dojoStrings.selectable
import typings.dojo.dojoStrings.style
import typings.std.Event_
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/mobile/Carousel.html
  *
  * A carousel widget that manages a list of images.
  * The carousel widget manages a list of images that can be
  * displayed horizontally, and allows the user to scroll through
  * the list and select a single item.
  *
  * This widget itself has no data store support, but there are two
  * subclasses, dojox/mobile/DataCarousel and dojox/mobile/StoreCarousel,
  * available for generating the contents from a data store.
  * To feed data into a Carousel through a dojo/data, use DataCarousel.
  * To feed data into a Carousel through a dojo/store, use StoreCarousel.
  *
  * The Carousel widget loads and instantiates its item contents in
  * a lazy manner. For example, if the number of visible items
  * (see the property numVisible) is 2, the widget creates 4 items, 2 for the
  * initial pane and 2 for the next page, at startup time. If you
  * swipe the page to open the second page, the widget creates 2 more
  * items for the third page. If the item to create is a dojo widget,
  * its module is dynamically loaded automatically before instantiation.
  *
  * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.
  * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.dojo.dijit.Contained because Inheritance from two classes. Inlined getIndexInParent, getNextSibling, getPreviousSibling
- typings.dojo.dijit.Container because Inheritance from two classes. Inlined addChild, addChild, buildRendering, getIndexOfChild, hasChildren, removeChild, removeChild */ @JSGlobal("dojox.mobile.Carousel")
@js.native
class Carousel_ () extends WidgetBase {
  def this(params: js.Object) = this()
  def this(params: js.Object, srcNodeRef: HTMLElement) = this()
  /**
    * This property can be specified for the SwapView children of a dojox/mobile/Carousel.
    *
    */
  var ChildSwapViewProperties: js.Object = js.native
  /**
    * Explicitly specified height of the widget (ex. "300px"). If
    * "inherit" is specified, the height is inherited from its offset
    * parent.
    * Note that changing the value of the property after the widget
    * creation has no effect.
    *
    */
  var height: String = js.native
  /**
    * The number of visible items (=numVisible) is determined by
    * (carousel_width / itemWidth).
    * If itemWidth is specified, numVisible is automatically calculated.
    * If resize() is called, numVisible is recalculated and the layout
    * is changed accordingly.
    *
    */
  var itemWidth: Double = js.native
  /**
    * If true, navigation buttons are displyed on the title bar.
    * Note that changing the value of the property after the widget
    * creation has no effect.
    *
    */
  var navButton: Boolean = js.native
  /**
    * The number of visible items.
    *
    */
  var numVisible: Double = js.native
  /**
    * If true, a page indicator, a series of small dots that indicate
    * the current page, is displayed on the title bar.
    * Note that changing the value of the property after the widget
    * creation has no effect.
    *
    */
  var pageIndicator: Boolean = js.native
  /**
    * If true, an item can be selected by clicking it.
    *
    */
  var selectable: Boolean = js.native
  /**
    * HTML style attributes as cssText string or name/value hash
    *
    */
  @JSName("style")
  var style_Carousel_ : String = js.native
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
    *
    */
  def fillPages(): Unit = js.native
  /**
    * Returns the index of a given item widget.
    *
    * @param w
    */
  def getIndexByItemWidget(w: WidgetBase): Double = js.native
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
    * Returns the index of an item widget at a given index.
    *
    * @param index
    */
  def getItemWidgetByIndex(index: Double): js.Any = js.native
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
    * Returns the parent view of the given DOM node.
    *
    * @param node
    */
  def getParentView(node: HTMLElement): js.Any = js.native
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
  def get_ChildSwapViewProperties(property: ChildSwapViewProperties): js.Object = js.native
  @JSName("get")
  def get_height(property: height): String = js.native
  @JSName("get")
  def get_itemWidth(property: itemWidth): Double = js.native
  @JSName("get")
  def get_navButton(property: navButton): Boolean = js.native
  @JSName("get")
  def get_numVisible(property: numVisible): Double = js.native
  @JSName("get")
  def get_pageIndicator(property: pageIndicator): Boolean = js.native
  @JSName("get")
  def get_selectable(property: selectable): Boolean = js.native
  /**
    * Listens to "/dojox/mobile/viewChanged" events.
    *
    * @param view
    */
  def handleViewChanged(view: js.Any): Unit = js.native
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
    * Instantiates the given view.
    *
    * @param view
    */
  def instantiateView(view: js.Any): Unit = js.native
  /**
    * User-defined function to handle clicks.
    *
    * @param e
    */
  def onClick(e: Event_): Unit = js.native
  /**
    * A handler that is called after the fetch completes.
    *
    * @param items
    */
  def onComplete(items: js.Array[_]): Unit = js.native
  /**
    * Deletes an existing item.
    *
    * @param item
    * @param removedFrom
    */
  def onDelete(item: js.Object, removedFrom: Double): Unit = js.native
  /**
    * An error handler.
    *
    * @param errText
    */
  def onError(errText: String): Unit = js.native
  /**
    *
    * @param newItem
    * @param parentInfo
    */
  def onNew(newItem: js.Any, parentInfo: js.Any): Unit = js.native
  /**
    * Called when the "next" button is clicked.
    *
    * @param e
    */
  def onNextBtnClick(e: Event_): Unit = js.native
  /**
    * Called when the "previous" button is clicked.
    *
    * @param e
    */
  def onPrevBtnClick(e: Event_): Unit = js.native
  /**
    *
    * @param item
    * @param attribute
    * @param oldValue
    * @param newValue
    */
  def onSet(item: js.Any, attribute: js.Any, oldValue: js.Any, newValue: js.Any): Unit = js.native
  /**
    * Called when the store is closed.
    *
    * @param request
    */
  def onStoreClose(request: js.Any): Unit = js.native
  /**
    * Adds a new item or updates an existing item.
    *
    * @param item
    * @param insertedInto
    */
  def onUpdate(item: js.Object, insertedInto: Double): Unit = js.native
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
    *
    */
  def resize(): Unit = js.native
  /**
    * Resizes the child items of the carousel.
    *
    */
  def resizeItems(): Unit = js.native
  /**
    * Selects the given widget.
    *
    * @param itemWidget
    */
  def select(itemWidget: Double): Unit = js.native
  /**
    * Selects the given widget.
    *
    * @param itemWidget
    */
  def select(itemWidget: WidgetBase): Unit = js.native
  @JSName("set")
  def set_ChildSwapViewProperties(property: ChildSwapViewProperties, value: js.Object): Unit = js.native
  @JSName("set")
  def set_height(property: height, value: String): Unit = js.native
  @JSName("set")
  def set_itemWidth(property: itemWidth, value: Double): Unit = js.native
  @JSName("set")
  def set_navButton(property: navButton, value: Boolean): Unit = js.native
  @JSName("set")
  def set_numVisible(property: numVisible, value: Double): Unit = js.native
  @JSName("set")
  def set_pageIndicator(property: pageIndicator, value: Boolean): Unit = js.native
  @JSName("set")
  def set_selectable(property: selectable, value: Boolean): Unit = js.native
  @JSName("set")
  def set_style(property: style, value: String): Unit = js.native
  @JSName("watch")
  def watch_ChildSwapViewProperties(
    property: ChildSwapViewProperties,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Object], 
      /* newValue */ js.UndefOr[js.Object], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_height(
    property: height,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_itemWidth(
    property: itemWidth,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_navButton(
    property: navButton,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_numVisible(
    property: numVisible,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_pageIndicator(
    property: pageIndicator,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_selectable(
    property: selectable,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): AnonUnwatch = js.native
}

