package typings.dojo.dojox.sketch

import typings.dojo.dijit.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/sketch/_Plugin.html
  *
  * This represents a "plugin" to the dojox.sketch.Figure, which is basically
  * a single button on the Toolbar and some associated code
  *
  * @param args       Optional
  */
@JSGlobal("dojox.sketch._Plugin")
@js.native
class Plugin () extends js.Object {
  def this(args: js.Object) = this()
  /**
    *
    */
  var button: js.Object = js.native
  /**
    *
    */
  var figure: js.Object = js.native
  /**
    *
    */
  var iconClassPrefix: String = js.native
  /**
    *
    */
  var itemGroup: String = js.native
  /**
    *
    */
  var queryCommand: js.Object = js.native
  /**
    *
    */
  var shape: String = js.native
  /**
    *
    */
  var useDefaultCommand: Boolean = js.native
  /**
    *
    * @param e               Optional
    */
  def activate(e: js.Any): Unit = js.native
  /**
    *
    * @param name
    * @param value               Optional
    */
  def attr(name: js.Any, value: js.Any): js.Any = js.native
  /**
    *
    */
  def buttonClass(): Unit = js.native
  /**
    *
    * @param o
    * @param f
    * @param tf
    */
  def connect(o: js.Any, f: js.Any, tf: js.Any): Unit = js.native
  /**
    *
    * @param f
    */
  def destroy(f: js.Any): Unit = js.native
  /**
    *
    */
  def onActivate(): Unit = js.native
  /**
    *
    * @param e
    */
  def onMouseDown(e: js.Any): Unit = js.native
  /**
    *
    * @param e
    */
  def onMouseMove(e: js.Any): Unit = js.native
  /**
    *
    * @param e
    */
  def onMouseUp(e: js.Any): Unit = js.native
  /**
    *
    * @param figure
    */
  def setFigure(figure: Widget): Unit = js.native
  /**
    *
    * @param toolbar
    */
  def setToolbar(toolbar: Widget): Unit = js.native
}

