package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientScheduler.CellClick event.
  */
trait ASPxClientSchedulerCellClickEventArgs extends ASPxClientEventArgs {
  /**
    * Gets the HTML element that the event was triggered on.
    */
  var htmlElement: js.Any
  /**
    * Gets the time interval of the time cells related to the event.
    */
  var interval: ASPxClientTimeInterval
  /**
    * Gets the resource identifier associated with the cell related to the event.
    */
  var resource: String
}

object ASPxClientSchedulerCellClickEventArgs {
  @scala.inline
  def apply(htmlElement: js.Any, interval: ASPxClientTimeInterval, resource: String): ASPxClientSchedulerCellClickEventArgs = {
    val __obj = js.Dynamic.literal(htmlElement = htmlElement.asInstanceOf[js.Any], interval = interval.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientSchedulerCellClickEventArgs]
  }
}

