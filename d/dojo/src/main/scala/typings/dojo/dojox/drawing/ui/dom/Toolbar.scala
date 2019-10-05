package typings.dojo.dojox.drawing.ui.dom

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/drawing/ui/dom/Toolbar.html
  *
  *
  * @param props
  * @param node
  */
@JSGlobal("dojox.drawing.ui.dom.Toolbar")
@js.native
class Toolbar protected () extends js.Object {
  def this(props: js.Any, node: js.Any) = this()
  /**
    * The CSS style to apply to the toolbar node
    *
    */
  var baseClass: String = js.native
  /**
    * The CSS style to apply to each button node
    *
    */
  var buttonClass: String = js.native
  /**
    * The CSS style to apply to each button icon node
    *
    */
  var iconClass: String = js.native
  /**
    * Internal. Creates an icon node for each button.
    *
    * @param node The button node.
    * @param constr               OptionalOptional. If not supplied, an icon is not created.Information for each icon is derived fromthe ToolsSetup object defined at the endof each tool. See: stencil._Base
    */
  def createIcon(node: HTMLElement, constr: js.Function): Unit = js.native
  /**
    * Creates a button on the Toolbar that is
    * a Tool, not a Plugin. Tools draw Stencils,
    * Plugins do actions.
    *
    * @param node The button node.
    */
  def createTool(node: HTMLElement): Unit = js.native
  /**
    * Event fired from clicking a Tool, not a PLugin.
    * Plugin clicks are handled within the plugin's class.
    *
    * @param type Fully qualified name of class. ex: dojox.drawing.tools.Ellipse
    */
  def onClick(`type`: String): Unit = js.native
  /**
    * handles buttons clicks and selects or deselects
    *
    * @param type
    */
  def onSetTool(`type`: String): Unit = js.native
  /**
    * Initializing method that reads the dom node and its
    * children for tools and plugins.
    *
    */
  def parse(): Unit = js.native
}

