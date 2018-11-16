package typings
package goLib.goMod.goNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
    * The PanningTool supports manual panning, where the user can shift the
    * Diagram.position by dragging the mouse.
    */
@js.native
trait PanningTool extends Tool {
  /**Gets or sets whether panning actions will allow events to bubble instead of panning in the diagram.*/
  var bubbles: scala.Boolean = js.native
  /**This read-only property returns the Point that was the original value of Diagram.position when the panning operation started.*/
  var originalPosition: Point = js.native
}

