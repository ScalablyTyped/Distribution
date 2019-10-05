package typings.dojo.dojo.dnd

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojo/dnd/TimedMoveable.html
  *
  * A specialized version of Moveable to support an FPS throttling.
  * This class puts an upper restriction on FPS, which may reduce
  * the CPU load. The additional parameter "timeout" regulates
  * the delay before actually moving the moveable object.
  *
  * @param node a node (or node's id) to be moved
  * @param params object with additional parameters.
  */
@JSGlobal("dojo.dnd.TimedMoveable")
@js.native
class TimedMoveable protected () extends Moveable {
  def this(node: HTMLElement, params: js.Object) = this()
  /**
    *
    */
  var timeout: Double = js.native
  /**
    *
    * @param mover
    * @param leftTop
    */
  def onMove(mover: Mover, leftTop: js.Object): Unit = js.native
}

