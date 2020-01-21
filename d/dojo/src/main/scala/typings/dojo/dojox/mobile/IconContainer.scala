package typings.dojo.dojox.mobile

import typings.dojo.AnonUnwatch
import typings.dojo.dijit.WidgetBase
import typings.dojo.dojoStrings.back
import typings.dojo.dojoStrings.defaultIcon
import typings.dojo.dojoStrings.editable
import typings.dojo.dojoStrings.editableMixinClass
import typings.dojo.dojoStrings.iconBase
import typings.dojo.dojoStrings.iconItemPaneClass
import typings.dojo.dojoStrings.iconItemPaneContainerClass
import typings.dojo.dojoStrings.iconItemPaneContainerProps
import typings.dojo.dojoStrings.iconItemPaneProps
import typings.dojo.dojoStrings.iconPos
import typings.dojo.dojoStrings.label
import typings.dojo.dojoStrings.pressedIconOpacity
import typings.dojo.dojoStrings.single
import typings.dojo.dojoStrings.style
import typings.dojo.dojoStrings.tag
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/mobile/IconContainer.html
  *
  * A container widget which can hold multiple icons.
  * IconContainer is a container widget which can hold multiple
  * icons. Each icon must be a subclass of dojox/mobile/IconItem
  * and can be associated with a panel which opens when touching
  * the icon.
  *
  * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.
  * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.dojo.dijit.Contained because Inheritance from two classes. Inlined getIndexInParent, getNextSibling, getPreviousSibling
- typings.dojo.dijit.Container because Inheritance from two classes. Inlined addChild, addChild, buildRendering, getIndexOfChild, hasChildren, removeChild, removeChild */ @JSGlobal("dojox.mobile.IconContainer")
@js.native
class IconContainer () extends WidgetBase {
  def this(params: js.Object) = this()
  def this(params: js.Object, srcNodeRef: HTMLElement) = this()
  /**
    * A label for the navigational control.
    *
    */
  var back: String = js.native
  /**
    * The default fallback icon, which is displayed only when the
    * specified icon has failed to load.
    *
    */
  var defaultIcon: String = js.native
  /**
    * If true, the icons can be removed or reordered. You can enter
    * into edit mode by pressing on a child IconItem until it starts shaking.
    * The default value is false. Note that changing the value of the property after
    * the widget creation has no effect.
    *
    */
  var editable: Boolean = js.native
  /**
    *
    */
  var editableMixinClass: String = js.native
  /**
    * The default icon path for child items.
    *
    */
  var iconBase: String = js.native
  /**
    *
    */
  var iconItemPaneClass: String = js.native
  /**
    *
    */
  var iconItemPaneContainerClass: String = js.native
  /**
    *
    */
  var iconItemPaneContainerProps: js.Object = js.native
  /**
    *
    */
  var iconItemPaneProps: js.Object = js.native
  /**
    * The default icon position for child items.
    *
    */
  var iconPos: String = js.native
  /**
    * A title text of the heading.
    *
    */
  var label: String = js.native
  /**
    * The opacity of the pressed icon image. The default value is 0.4.
    *
    */
  var pressedIconOpacity: Double = js.native
  /**
    * If true, only one icon content can be opened at a time.
    *
    */
  var single: Boolean = js.native
  /**
    * HTML style attributes as cssText string or name/value hash
    *
    */
  @JSName("style")
  var style_IconContainer: String = js.native
  /**
    * A name of html tag to create as domNode.
    *
    */
  var tag: String = js.native
  /**
    * A type of animated transition effect. You can choose from the
    * standard transition types: "slide", "fade", "flip", or from the
    * extended transition types: "cover", "coverv", "dissolve",
    * "reveal", "revealv", "scaleIn", "scaleOut", "slidev",
    * "swirl", "zoomIn", "zoomOut", "cube", and "swap". If "none" is
    * specified, the transition occurs immediately without animation. If
    * "below" is specified, the application contents are displayed
    * below the icons. The default value is "below". Note that changing
    * the value of the property after the widget creation has no effect.
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
    * Closes all the icon items.
    *
    */
  def closeAll(): Unit = js.native
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
  def get_back(property: back): String = js.native
  @JSName("get")
  def get_defaultIcon(property: defaultIcon): String = js.native
  @JSName("get")
  def get_editable(property: editable): Boolean = js.native
  @JSName("get")
  def get_editableMixinClass(property: editableMixinClass): String = js.native
  @JSName("get")
  def get_iconBase(property: iconBase): String = js.native
  @JSName("get")
  def get_iconItemPaneClass(property: iconItemPaneClass): String = js.native
  @JSName("get")
  def get_iconItemPaneContainerClass(property: iconItemPaneContainerClass): String = js.native
  @JSName("get")
  def get_iconItemPaneContainerProps(property: iconItemPaneContainerProps): js.Object = js.native
  @JSName("get")
  def get_iconItemPaneProps(property: iconItemPaneProps): js.Object = js.native
  @JSName("get")
  def get_iconPos(property: iconPos): String = js.native
  @JSName("get")
  def get_label(property: label): String = js.native
  @JSName("get")
  def get_pressedIconOpacity(property: pressedIconOpacity): Double = js.native
  @JSName("get")
  def get_single(property: single): Boolean = js.native
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
  @JSName("set")
  def set_back(property: back, value: String): Unit = js.native
  @JSName("set")
  def set_defaultIcon(property: defaultIcon, value: String): Unit = js.native
  @JSName("set")
  def set_editable(property: editable, value: Boolean): Unit = js.native
  @JSName("set")
  def set_editableMixinClass(property: editableMixinClass, value: String): Unit = js.native
  @JSName("set")
  def set_iconBase(property: iconBase, value: String): Unit = js.native
  @JSName("set")
  def set_iconItemPaneClass(property: iconItemPaneClass, value: String): Unit = js.native
  @JSName("set")
  def set_iconItemPaneContainerClass(property: iconItemPaneContainerClass, value: String): Unit = js.native
  @JSName("set")
  def set_iconItemPaneContainerProps(property: iconItemPaneContainerProps, value: js.Object): Unit = js.native
  @JSName("set")
  def set_iconItemPaneProps(property: iconItemPaneProps, value: js.Object): Unit = js.native
  @JSName("set")
  def set_iconPos(property: iconPos, value: String): Unit = js.native
  @JSName("set")
  def set_label(property: label, value: String): Unit = js.native
  @JSName("set")
  def set_pressedIconOpacity(property: pressedIconOpacity, value: Double): Unit = js.native
  @JSName("set")
  def set_single(property: single, value: Boolean): Unit = js.native
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
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_defaultIcon(
    property: defaultIcon,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): AnonUnwatch = js.native
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
  def watch_iconItemPaneClass(
    property: iconItemPaneClass,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_iconItemPaneContainerClass(
    property: iconItemPaneContainerClass,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_iconItemPaneContainerProps(
    property: iconItemPaneContainerProps,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Object], 
      /* newValue */ js.UndefOr[js.Object], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_iconItemPaneProps(
    property: iconItemPaneProps,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Object], 
      /* newValue */ js.UndefOr[js.Object], 
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
  def watch_label(
    property: label,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_pressedIconOpacity(
    property: pressedIconOpacity,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_single(
    property: single,
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

