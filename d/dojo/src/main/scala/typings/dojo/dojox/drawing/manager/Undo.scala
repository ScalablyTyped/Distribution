package typings.dojo.dojox.drawing.manager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/drawing/manager/Undo.html
  *
  * Handles the Undo in drawing.
  * NOTE: Only partially implemented!!! There is very
  * little actual undo functionality!
  *
  * @param options
  */
@JSGlobal("dojox.drawing.manager.Undo")
@js.native
class Undo protected () extends js.Object {
  def this(options: js.Any) = this()
  /**
    *
    * @param stack
    */
  def add(stack: js.Any): Unit = js.native
  /**
    *
    * @param scope
    * @param method
    * @param args
    */
  @JSName("apply")
  def apply(scope: js.Any, method: js.Any, args: js.Any): Unit = js.native
  /**
    *
    * @param evt
    */
  def onKeyDown(evt: js.Any): Unit = js.native
  /**
    *
    */
  def redo(): Unit = js.native
  /**
    *
    */
  def undo(): Unit = js.native
}

