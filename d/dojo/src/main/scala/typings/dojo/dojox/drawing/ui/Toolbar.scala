package typings.dojo.dojox.drawing.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/drawing/ui/Toolbar.html
  *
  * A Toolbar used for holding buttons; typically representing the Stencils
  * used for a DojoX Drawing.
  * Creates a GFX-based toolbar that holds GFX-based buttons. Can be either created
  * within the actual drawing or within a separate DOM element. When within the
  * drawing, the toolbar will cover a portion of the drawing; hence the option.
  *
  * A Toolbar can be created programmatically or in markup. Currently markup is as
  * a separate DOM element and programmatic is within the drawing.
  *
  * @param props
  * @param node
  */
@JSGlobal("dojox.drawing.ui.Toolbar")
@js.native
class Toolbar protected () extends js.Object {
  def this(props: js.Any, node: js.Any) = this()
  /**
    * The space between each button.
    *
    */
  var margin: Double = js.native
  /**
    * The amount of spce between the top and left of the toolbar and the buttons.
    *
    */
  var padding: Double = js.native
  /**
    * The size of the button's rounded corner
    *
    */
  var radius: Double = js.native
  /**
    * The width and height of the button
    *
    */
  var size: Double = js.native
  /**
    * A comma delineated list of the plugins to include in the Toolbar.
    * If "all" is used, all registered plugins are included.
    *
    */
  var strPlugs: String = js.native
  /**
    * The button that should be selected at startup.
    *
    */
  var strSelected: String = js.native
  /**
    * A comma delineated list of the Stencil-tools to include in the Toolbar.
    * If "all" is used, all registered tools are included.
    *
    */
  var strTools: String = js.native
  /**
    * The distance between the tool buttons and plug buttons
    *
    */
  var toolPlugGap: Double = js.native
  /**
    * Internal. Adds the back, behind the toolbar.
    *
    */
  def addBack(): Unit = js.native
  /**
    *
    */
  def addPlugin(): Unit = js.native
  /**
    *
    */
  def addTool(): Unit = js.native
  /**
    * Internal. create buttons.
    *
    */
  def makeButtons(): Unit = js.native
  /**
    * Plugin click event. May be connected to.
    *
    * @param button
    */
  def onPlugClick(button: js.Object): Unit = js.native
  /**
    * Stencil render event.
    *
    * @param stencil
    */
  def onRenderStencil(stencil: js.Object): Unit = js.native
  /**
    * Tool click event. May be connected to.
    *
    * @param button
    */
  def onToolClick(button: js.Object): Unit = js.native
}

