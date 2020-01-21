package typings.dojo.dijit

import typings.dojo.AnonUnwatch
import typings.dojo.dojoStrings.contextMenuForWindow
import typings.dojo.dojoStrings.currentTarget
import typings.dojo.dojoStrings.leftClickToOpen
import typings.dojo.dojoStrings.refocus
import typings.dojo.dojoStrings.selector
import typings.dojo.dojoStrings.targetNodeIds
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dijit/Menu.html
  *
  * A context menu you can assign to multiple elements
  * 
  * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.     
  * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsreplace srcNodeRef with my generated DOM tree     
  */
@JSGlobal("dijit.Menu")
@js.native
class Menu () extends DropDownMenu {
  def this(params: js.Object) = this()
  def this(params: js.Object, srcNodeRef: HTMLElement) = this()
  /**
    * If true, right clicking anywhere on the window will cause this context menu to open.
    * If false, must specify targetNodeIds.
    * 
    */
  var contextMenuForWindow: Boolean = js.native
  /**
    * For context menus, set to the current node that the Menu is being displayed for.
    * Useful so that the menu actions can be tailored according to the node
    * 
    */
  var currentTarget: HTMLElement = js.native
  /**
    * If true, menu will open on left click instead of right click, similar to a file menu.
    * 
    */
  var leftClickToOpen: Boolean = js.native
  /**
    * When this menu closes, re-focus the element which had focus before it was opened.
    * 
    */
  var refocus: Boolean = js.native
  /**
    * CSS expression to apply this Menu to descendants of targetNodeIds, rather than to
    * the nodes specified by targetNodeIds themselves.  Useful for applying a Menu to
    * a range of rows in a table, tree, etc.
    * 
    * The application must require() an appropriate level of dojo/query to handle the selector.
    * 
    */
  var selector: js.Object = js.native
  /**
    * Array of dom node ids of nodes to attach to.
    * Fill this with nodeIds upon widget creation and it becomes context menu for those nodes.
    * 
    */
  var targetNodeIds: js.Object = js.native
  /**
    * Attach menu to given node
    * 
    * @param node             
    */
  def bindDomNode(node: String): Unit = js.native
  /**
    * Attach menu to given node
    * 
    * @param node             
    */
  def bindDomNode(node: HTMLElement): Unit = js.native
  /**
    * Returns an array of placeholders with the given label.  There
    * can be multiples.
    * 
    * @param label               OptionalLabel to search for - if not specified, then all placeholdersare returned             
    */
  def getPlaceholders(label: String): js.Any = js.native
  @JSName("get")
  def get_contextMenuForWindow(property: contextMenuForWindow): Boolean = js.native
  @JSName("get")
  def get_currentTarget(property: currentTarget): HTMLElement = js.native
  @JSName("get")
  def get_leftClickToOpen(property: leftClickToOpen): Boolean = js.native
  @JSName("get")
  def get_refocus(property: refocus): Boolean = js.native
  @JSName("get")
  def get_selector(property: selector): js.Object = js.native
  @JSName("get")
  def get_targetNodeIds(property: targetNodeIds): js.Object = js.native
  @JSName("set")
  def set_contextMenuForWindow(property: contextMenuForWindow, value: Boolean): Unit = js.native
  @JSName("set")
  def set_currentTarget(property: currentTarget, value: HTMLElement): Unit = js.native
  @JSName("set")
  def set_leftClickToOpen(property: leftClickToOpen, value: Boolean): Unit = js.native
  @JSName("set")
  def set_refocus(property: refocus, value: Boolean): Unit = js.native
  @JSName("set")
  def set_selector(property: selector, value: js.Object): Unit = js.native
  @JSName("set")
  def set_targetNodeIds(property: targetNodeIds, value: js.Object): Unit = js.native
  /**
    * Detach menu from given node
    * 
    * @param nodeName             
    */
  def unBindDomNode(nodeName: String): Unit = js.native
  /**
    * Detach menu from given node
    * 
    * @param nodeName             
    */
  def unBindDomNode(nodeName: HTMLElement): Unit = js.native
  @JSName("watch")
  def watch_contextMenuForWindow(
    property: contextMenuForWindow,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_currentTarget(
    property: currentTarget,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[HTMLElement], 
      /* newValue */ js.UndefOr[HTMLElement], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_leftClickToOpen(
    property: leftClickToOpen,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_refocus(
    property: refocus,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
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
  def watch_targetNodeIds(
    property: targetNodeIds,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Object], 
      /* newValue */ js.UndefOr[js.Object], 
      Unit
    ]
  ): AnonUnwatch = js.native
}

