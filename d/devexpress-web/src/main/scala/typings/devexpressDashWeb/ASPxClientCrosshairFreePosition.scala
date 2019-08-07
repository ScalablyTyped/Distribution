package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The client-side equivalent of the CrosshairFreePosition class.
  */
@JSGlobal("ASPxClientCrosshairFreePosition")
@js.native
class ASPxClientCrosshairFreePosition () extends ASPxClientCrosshairPosition {
  /**
    * Gets a string containing information on a crosshair label's dock position when the crosshair cursor is in the free position mode.
    */
  var dockPosition: String = js.native
  /**
    * Gets a Pane's ID when the crosshair cursor is in the free position mode.
    */
  var paneID: Double = js.native
}

