package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientScheduler.CellClick event.
  */
@JSGlobal("ASPxClientSchedulerCellClickEventArgs")
@js.native
class ASPxClientSchedulerCellClickEventArgs () extends ASPxClientEventArgs {
  /**
    * Gets the HTML element that the event was triggered on.
    */
  var htmlElement: js.Any = js.native
  /**
    * Gets the time interval of the time cells related to the event.
    */
  var interval: ASPxClientTimeInterval = js.native
  /**
    * Gets the resource identifier associated with the cell related to the event.
    */
  var resource: String = js.native
}

