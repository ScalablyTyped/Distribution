package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the CellClick event.
  */
trait ASPxClientSchedulerCellClickEventArgs extends ASPxClientEventArgs {
  /**
    * Gets the HTML element that the event was triggered on.
    * Value: An object containing event data.
    */
  var htmlElement: js.Object
  /**
    * Gets the time interval of the time cells related to the event.
    * Value: An ASPxClientTimeInterval object specifying the time interval.
    */
  var interval: ASPxClientTimeInterval
  /**
    * Gets the resource identifier associated with the cell related to the event.
    * Value: A string value representing the resource.
    */
  var resource: java.lang.String
}

object ASPxClientSchedulerCellClickEventArgs {
  @scala.inline
  def apply(htmlElement: js.Object, interval: ASPxClientTimeInterval, resource: java.lang.String): ASPxClientSchedulerCellClickEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("htmlElement")(htmlElement)
    __obj.updateDynamic("interval")(interval)
    __obj.updateDynamic("resource")(resource)
    __obj.asInstanceOf[ASPxClientSchedulerCellClickEventArgs]
  }
}

