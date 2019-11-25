package typings.dojo.dojox.mobile

import typings.dojo.Anon_Unwatch
import typings.dojo.dijit._WidgetBase
import typings.dojo.dojoStrings.back
import typings.dojo.dojoStrings.busy
import typings.dojo.dojoStrings.href
import typings.dojo.dojoStrings.iconBase
import typings.dojo.dojoStrings.label
import typings.dojo.dojoStrings.moveTo
import typings.dojo.dojoStrings.progStyle
import typings.dojo.dojoStrings.style
import typings.dojo.dojoStrings.tag
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/mobile/Heading.html
  *
  * A widget that represents a navigation bar.
  * Heading is a widget that represents a navigation bar, which
  * usually appears at the top of an application. It usually
  * displays the title of the current view and can contain a
  * navigational control. If you use it with
  * dojox/mobile/ScrollableView, it can also be used as a fixed
  * header bar or a fixed footer bar. In such cases, specify the
  * fixed="top" attribute to be a fixed header bar or the
  * fixed="bottom" attribute to be a fixed footer bar. Heading can
  * have one or more ToolBarButton widgets as its children.
  *
  * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.
  * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.dojo.dijit._Contained because Inheritance from two classes. Inlined getIndexInParent, getNextSibling, getPreviousSibling
- typings.dojo.dijit._Container because Inheritance from two classes. Inlined addChild, addChild, buildRendering, getIndexOfChild, hasChildren, removeChild, removeChild */ @JSGlobal("dojox.mobile.Heading")
@js.native
class Heading () extends _WidgetBase {
  def this(params: js.Object) = this()
  def this(params: js.Object, srcNodeRef: HTMLElement) = this()
  /**
    * A label for the navigational control to return to the previous View.
    *
    */
  var back: String = js.native
  /**
    * If true, a progress indicator spins on this widget.
    *
    */
  var busy: Boolean = js.native
  /**
    * A URL to open when the navigational control is pressed.
    *
    */
  var href: String = js.native
  /**
    * The default icon path for child items.
    *
    */
  var iconBase: String = js.native
  /**
    * A title text of the heading. If the label is not specified, the
    * innerHTML of the node is used as a label.
    *
    */
  var label: String = js.native
  /**
    * The id of the transition destination of the navigation control.
    * If the value has a hash sign ('#') before the id (e.g. #view1)
    * and the dojox/mobile/bookmarkable module is loaded by the user application,
    * the view transition updates the hash in the browser URL so that the
    * user can bookmark the destination view. In this case, the user
    * can also use the browser's back/forward button to navigate
    * through the views in the browser history.
    *
    * If null, transitions to a blank view.
    * If '#', returns immediately without transition.
    *
    */
  var moveTo: String = js.native
  /**
    * A css class name to add to the progress indicator.
    *
    */
  var progStyle: String = js.native
  /**
    * HTML style attributes as cssText string or name/value hash
    *
    */
  @JSName("style")
  var style_Heading: String = js.native
  /**
    * A name of HTML tag to create as domNode.
    *
    */
  var tag: String = js.native
  /**
    * A type of animated transition effect. You can choose from the
    * standard transition types, "slide", "fade", "flip", or from the
    * extended transition types, "cover", "coverv", "dissolve",
    * "reveal", "revealv", "scaleIn", "scaleOut", "slidev",
    * "swirl", "zoomIn", "zoomOut", "cube", and "swap". If "none" is
    * specified, transition occurs immediately without animation.
    *
    */
  var transition: String = js.native
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
  def get_back(property: back): String = js.native
  @JSName("get")
  def get_busy(property: busy): Boolean = js.native
  @JSName("get")
  def get_href(property: href): String = js.native
  @JSName("get")
  def get_iconBase(property: iconBase): String = js.native
  @JSName("get")
  def get_label(property: label): String = js.native
  @JSName("get")
  def get_moveTo(property: moveTo): String = js.native
  @JSName("get")
  def get_progStyle(property: progStyle): String = js.native
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
  def set_back(property: back, value: String): Unit = js.native
  @JSName("set")
  def set_busy(property: busy, value: Boolean): Unit = js.native
  @JSName("set")
  def set_href(property: href, value: String): Unit = js.native
  @JSName("set")
  def set_iconBase(property: iconBase, value: String): Unit = js.native
  @JSName("set")
  def set_label(property: label, value: String): Unit = js.native
  @JSName("set")
  def set_moveTo(property: moveTo, value: String): Unit = js.native
  @JSName("set")
  def set_progStyle(property: progStyle, value: String): Unit = js.native
  @JSName("set")
  def set_style(property: style, value: String): Unit = js.native
  @JSName("set")
  def set_tag(property: tag, value: String): Unit = js.native
  @JSName("set")
  def set_transition(property: typings.dojo.dojoStrings.transition, value: String): Unit = js.native
  @JSName("watch")
  def watch_back(
    property: back,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_busy(
    property: busy,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_href(
    property: href,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_iconBase(
    property: iconBase,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_label(
    property: label,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_moveTo(
    property: moveTo,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_progStyle(
    property: progStyle,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_tag(
    property: tag,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_transition(
    property: typings.dojo.dojoStrings.transition,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): Anon_Unwatch = js.native
}

