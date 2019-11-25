package typings.dojo.dojox.mobile

import typings.dojo.Anon_Unwatch
import typings.dojo.dijit._WidgetBase
import typings.dojo.dojoStrings.orientation
import typings.dojo.dojoStrings.screenSizeAware
import typings.dojo.dojoStrings.screenSizeAwareClass
import typings.dojo.dojoStrings.style
import typings.dojo.dojoStrings.variablePane
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/mobile/FixedSplitter.html
  *
  * A layout container that splits the window horizontally or
  * vertically.
  * FixedSplitter is a very simple container widget that layouts its
  * child DOM nodes side by side either horizontally or
  * vertically. An example usage of this widget would be to realize
  * the split view on iPad. There is no visual splitter between the
  * children, and there is no function to resize the child panes
  * with drag-and-drop. If you need a visual splitter, you can
  * specify a border of a child DOM node with CSS.
  *
  * FixedSplitter has no knowledge of its child widgets.
  * dojox/mobile/Container, dojox/mobile/Pane, or dojox/mobile/ContentPane
  * can be used as a child widget of FixedSplitter.
  *
  * Use dojox/mobile/Container if your content consists of ONLY
  * Dojo widgets.
  * Use dojox/mobile/Pane if your content is an inline HTML
  * fragment (may or may not include Dojo widgets).
  * Use dojox/mobile/ContentPane if your content is an external
  * HTML fragment (may or may not include Dojo widgets).
  *
  * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.
  * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.dojo.dijit._Contained because Inheritance from two classes. Inlined getIndexInParent, getNextSibling, getPreviousSibling
- typings.dojo.dijit._Container because Inheritance from two classes. Inlined addChild, addChild, buildRendering, getIndexOfChild, hasChildren, removeChild, removeChild */ @JSGlobal("dojox.mobile.FixedSplitter")
@js.native
class FixedSplitter () extends _WidgetBase {
  def this(params: js.Object) = this()
  def this(params: js.Object, srcNodeRef: HTMLElement) = this()
  /**
    * The direction of split. If "H" is specified, panes are split
    * horizontally. If "V" is specified, panes are split vertically.
    *
    */
  var orientation: String = js.native
  /**
    * If true, dynamically load a screen-size-aware module.
    *
    */
  var screenSizeAware: Boolean = js.native
  /**
    * A screen-size-aware module to load.
    *
    */
  var screenSizeAwareClass: String = js.native
  /**
    * HTML style attributes as cssText string or name/value hash
    *
    */
  @JSName("style")
  var style_FixedSplitter: String = js.native
  /**
    * The index of a pane that fills the remainig space.
    * If -1, the last child pane fills the remaining space.
    *
    */
  var variablePane: Double = js.native
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
  @JSName("get")
  def get_orientation(property: orientation): String = js.native
  @JSName("get")
  def get_screenSizeAware(property: screenSizeAware): Boolean = js.native
  @JSName("get")
  def get_screenSizeAwareClass(property: screenSizeAwareClass): String = js.native
  @JSName("get")
  def get_variablePane(property: variablePane): Double = js.native
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
  def removeChild(widget: _WidgetBase): Unit = js.native
  /**
    *
    */
  def resize(): Unit = js.native
  @JSName("set")
  def set_orientation(property: orientation, value: String): Unit = js.native
  @JSName("set")
  def set_screenSizeAware(property: screenSizeAware, value: Boolean): Unit = js.native
  @JSName("set")
  def set_screenSizeAwareClass(property: screenSizeAwareClass, value: String): Unit = js.native
  @JSName("set")
  def set_style(property: style, value: String): Unit = js.native
  @JSName("set")
  def set_variablePane(property: variablePane, value: Double): Unit = js.native
  @JSName("watch")
  def watch_orientation(
    property: orientation,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_screenSizeAware(
    property: screenSizeAware,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_screenSizeAwareClass(
    property: screenSizeAwareClass,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_variablePane(
    property: variablePane,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): Anon_Unwatch = js.native
}

