package typings.dojo.dojox.drawing.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/drawing/ui/Button.html
  *
  * Creates a clickable button in "UI" mode of the drawing.
  * Creates a 4-state button: normal, hover, active, selected.
  * Optionally may include button text or an icon.
  *
  * @param options
  */
@JSGlobal("dojox.drawing.ui.Button")
@js.native
class Button protected () extends js.Object {
  def this(options: js.Any) = this()
  /**
    *
    */
  var callback: js.Object = js.native
  /**
    *
    */
  var enabled: Boolean = js.native
  /**
    *
    */
  var hitched: js.Object = js.native
  /**
    *
    */
  var scope: js.Object = js.native
  /**
    *
    */
  var selected: Boolean = js.native
  /**
    *
    */
  var toolType: String = js.native
  /**
    *
    */
  var `type`: String = js.native
  /**
    *
    * @param options
    */
  def attr(options: js.Any): Unit = js.native
  /**
    *
    */
  def deselect(): Unit = js.native
  /**
    *
    */
  def disable(): Unit = js.native
  /**
    *
    */
  def enable(): Unit = js.native
  /**
    *
    * @param d
    * @param s
    */
  def makeOptions(d: js.Object, s: Double): js.Object = js.native
  /**
    * Stub to connect. Event is 'this'
    * Alternatively can pass in a scope and a callback
    * on creation.
    *
    * @param button
    */
  def onClick(button: js.Object): Unit = js.native
  /**
    *
    */
  def onDown(): Unit = js.native
  /**
    *
    */
  def onOut(): Unit = js.native
  /**
    *
    */
  def onOver(): Unit = js.native
  /**
    *
    */
  def onUp(): Unit = js.native
  /**
    *
    */
  def select(): Unit = js.native
}

