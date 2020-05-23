package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the client-side equivalent of the ControlCoordinates class.
  */
trait ASPxClientControlCoordinates extends js.Object {
  /**
    * Gets the point's pane.
    */
  var pane: ASPxClientXYDiagramPane
  /**
    * Gets the point's visibility state.
    */
  var visibility: String
  /**
    * Gets the point's X-coordinate, in pixels.
    */
  var x: Double
  /**
    * Gets the point's Y-coordinate, in pixels.
    */
  var y: Double
}

object ASPxClientControlCoordinates {
  @scala.inline
  def apply(pane: ASPxClientXYDiagramPane, visibility: String, x: Double, y: Double): ASPxClientControlCoordinates = {
    val __obj = js.Dynamic.literal(pane = pane.asInstanceOf[js.Any], visibility = visibility.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientControlCoordinates]
  }
}

