package typings.dojo.dojox.drawing.manager

import typings.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/drawing/manager/StencilUI.html
  *
  * Used for handling Stencils as UI components.
  * Replaces manager.Stencil. Handles basic UI mouse
  * events like onmouseover. Does not handle selections
  * or support delete, etc.
  *
  * @param options
  */
@JSGlobal("dojox.drawing.manager.StencilUI")
@js.native
class StencilUI protected () extends js.Object {
  def this(options: js.Any) = this()
  /**
    * Event fired on mousedown on a stencil
    *
    * @param obj
    */
  def onOut(obj: Event_): Unit = js.native
  /**
    * Event fired on mousedown on a stencil
    *
    * @param obj
    */
  def onOver(obj: Event_): Unit = js.native
  /**
    * Event fired on mousedown on a stencil
    *
    * @param obj
    */
  def onUiDown(obj: Event_): Unit = js.native
  /**
    * Event fired on mousedown on a stencil
    *
    * @param obj
    */
  def onUiUp(obj: Event_): Unit = js.native
  /**
    *
    * @param stencil
    */
  def register(stencil: js.Object): js.Object = js.native
}

