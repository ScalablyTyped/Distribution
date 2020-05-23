package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientScheduler.CellClick event.
  */
@JSGlobal("ASPxClientSchedulerCellClickEventArgs")
@js.native
class ASPxClientSchedulerCellClickEventArgs ()
  extends typings.devexpressWeb.ASPxClientSchedulerCellClickEventArgs {
  /**
    * Gets the HTML element that the event was triggered on.
    */
  /* CompleteClass */
  override var htmlElement: js.Any = js.native
  /**
    * Gets the time interval of the time cells related to the event.
    */
  /* CompleteClass */
  override var interval: typings.devexpressWeb.ASPxClientTimeInterval = js.native
  /**
    * Gets the resource identifier associated with the cell related to the event.
    */
  /* CompleteClass */
  override var resource: String = js.native
}

