package typings.dojo.dojo.dnd.Moveable

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojo/dnd/Moveable.__MoveableArgs.html
  *
  *
  */
@JSGlobal("dojo.dnd.Moveable.__MoveableArgs")
@js.native
class MoveableArgs () extends js.Object {
  /**
    * delay move by this number of pixels
    *
    */
  var delay: Double = js.native
  /**
    * A node (or node's id), which is used as a mouse handle.
    * If omitted, the node itself is used as a handle.
    *
    */
  var handle: HTMLElement = js.native
  /**
    * a constructor of custom Mover
    *
    */
  var mover: js.Object = js.native
  /**
    * skip move of form elements
    *
    */
  var skip: Boolean = js.native
}

