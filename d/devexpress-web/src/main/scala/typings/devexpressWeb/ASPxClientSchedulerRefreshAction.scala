package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Holds action types for the client-side ASPxClientScheduler.Refresh method.
  */
trait ASPxClientSchedulerRefreshAction extends js.Object {
  /**
    * Gets the value of the action parameter which initiates reloading of the main ASPxScheduler control and its satellite View controls.
    */
  var ActiveViewTypeChanged: Double
  /**
    * Gets the value of the action parameter which initiates a simple reload of the control.
    */
  var None: Double
  /**
    * Gets the value of the action parameter which initiates reloading of the main ASPxScheduler control and its data-dependent satellites.
    */
  var VisibleIntervalChanged: Double
}

object ASPxClientSchedulerRefreshAction {
  @scala.inline
  def apply(ActiveViewTypeChanged: Double, None: Double, VisibleIntervalChanged: Double): ASPxClientSchedulerRefreshAction = {
    val __obj = js.Dynamic.literal(ActiveViewTypeChanged = ActiveViewTypeChanged.asInstanceOf[js.Any], None = None.asInstanceOf[js.Any], VisibleIntervalChanged = VisibleIntervalChanged.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientSchedulerRefreshAction]
  }
}

