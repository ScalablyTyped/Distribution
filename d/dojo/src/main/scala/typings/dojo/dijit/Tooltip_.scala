package typings.dojo.dijit

import typings.dojo.AnonUnwatch
import typings.dojo.dojoStrings.connectId
import typings.dojo.dojoStrings.defaultPosition
import typings.dojo.dojoStrings.label
import typings.dojo.dojoStrings.position
import typings.dojo.dojoStrings.selector
import typings.dojo.dojoStrings.showDelay
import typings.dojo.dojoStrings.style
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dijit/Tooltip.html
  *
  * Pops up a tooltip (a help message) when you hover over a node.
  * Also provides static show() and hide() methods that can be used without instantiating a dijit/Tooltip.
  * 
  * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.     
  * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree     
  */
@JSGlobal("dijit.Tooltip")
@js.native
class Tooltip_ () extends Widget {
  def this(params: js.Object) = this()
  def this(params: js.Object, srcNodeRef: HTMLElement) = this()
  /**
    * Id of domNode(s) to attach the tooltip to.
    * When user hovers over specified dom node(s), the tooltip will appear.
    * 
    */
  var connectId: String = js.native
  /**
    * This variable controls the position of tooltips, if the position is not specified to
    * the Tooltip widget or *TextBox widget itself.  It's an array of strings with the values
    * possible for dijit/place.around().   The recommended values are:
    * 
    * before-centered: centers tooltip to the left of the anchor node/widget, or to the right
    * in the case of RTL scripts like Hebrew and Arabic
    * after-centered: centers tooltip to the right of the anchor node/widget, or to the left
    * in the case of RTL scripts like Hebrew and Arabic
    * above-centered: tooltip is centered above anchor node
    * below-centered: tooltip is centered above anchor node
    * The list is positions is tried, in order, until a position is found where the tooltip fits
    * within the viewport.
    * 
    * Be careful setting this parameter.  A value of "above-centered" may work fine until the user scrolls
    * the screen so that there's no room above the target node.   Nodes with drop downs, like
    * DropDownButton or FilteringSelect, are especially problematic, in that you need to be sure
    * that the drop down and tooltip don't overlap, even when the viewport is scrolled so that there
    * is only room below (or above) the target node, but not both.
    * 
    */
  var defaultPosition: js.Object = js.native
  /**
    * HTML to display in the tooltip.
    * Specified as innerHTML when creating the widget from markup.
    * 
    */
  var label: String = js.native
  /**
    * See description of dijit/Tooltip.defaultPosition for details on position parameter.
    * 
    */
  var position: js.Object = js.native
  /**
    * CSS expression to apply this Tooltip to descendants of connectIds, rather than to
    * the nodes specified by connectIds themselves.    Useful for applying a Tooltip to
    * a range of rows in a table, tree, etc.   Use in conjunction with getContent() parameter.
    * Ex: connectId: myTable, selector: "tr", getContent: function(node){ return ...; }
    * 
    * The application must require() an appropriate level of dojo/query to handle the selector.
    * 
    */
  var selector: js.Object = js.native
  /**
    * Number of milliseconds to wait after hovering over/focusing on the object, before
    * the tooltip is displayed.
    * 
    */
  var showDelay: Double = js.native
  /**
    * HTML style attributes as cssText string or name/value hash
    * 
    */
  @JSName("style")
  var style_Tooltip_ : String = js.native
  /**
    * Attach tooltip to specified node if it's not already connected
    * 
    * @param node             
    */
  def addTarget(node: String): Unit = js.native
  /**
    * Attach tooltip to specified node if it's not already connected
    * 
    * @param node             
    */
  def addTarget(node: HTMLElement): Unit = js.native
  /**
    * User overridable function that return the text to display in the tooltip.
    * 
    * @param node             
    */
  def getContent(node: HTMLElement): js.Any = js.native
  @JSName("get")
  def get_connectId(property: connectId): String = js.native
  @JSName("get")
  def get_defaultPosition(property: defaultPosition): js.Object = js.native
  @JSName("get")
  def get_label(property: label): String = js.native
  @JSName("get")
  def get_position(property: position): js.Object = js.native
  @JSName("get")
  def get_selector(property: selector): js.Object = js.native
  @JSName("get")
  def get_showDelay(property: showDelay): Double = js.native
  def onShow(target: js.Any): Unit = js.native
  def onShow(target: js.Any, position: js.Any): Unit = js.native
  /**
    * Detach tooltip from specified node
    * 
    * @param node             
    */
  def removeTarget(node: String): Unit = js.native
  /**
    * Detach tooltip from specified node
    * 
    * @param node             
    */
  def removeTarget(node: HTMLElement): Unit = js.native
  @JSName("set")
  def set_connectId(property: connectId, value: String): Unit = js.native
  @JSName("set")
  def set_defaultPosition(property: defaultPosition, value: js.Object): Unit = js.native
  @JSName("set")
  def set_label(property: label, value: String): Unit = js.native
  @JSName("set")
  def set_position(property: position, value: js.Object): Unit = js.native
  @JSName("set")
  def set_selector(property: selector, value: js.Object): Unit = js.native
  @JSName("set")
  def set_showDelay(property: showDelay, value: Double): Unit = js.native
  @JSName("set")
  def set_style(property: style, value: String): Unit = js.native
  @JSName("watch")
  def watch_connectId(
    property: connectId,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_defaultPosition(
    property: defaultPosition,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Object], 
      /* newValue */ js.UndefOr[js.Object], 
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
  def watch_position(
    property: position,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Object], 
      /* newValue */ js.UndefOr[js.Object], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_selector(
    property: selector,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Object], 
      /* newValue */ js.UndefOr[js.Object], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_showDelay(
    property: showDelay,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): AnonUnwatch = js.native
}

