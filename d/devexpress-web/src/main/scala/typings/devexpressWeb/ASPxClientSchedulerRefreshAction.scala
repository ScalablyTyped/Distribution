package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Holds action types for the client-side ASPxClientScheduler.Refresh method.
  */
@JSGlobal("ASPxClientSchedulerRefreshAction")
@js.native
class ASPxClientSchedulerRefreshAction () extends js.Object {
  /**
    * Gets the value of the action parameter which initiates reloading of the main ASPxScheduler control and its satellite View controls.
    */
  var ActiveViewTypeChanged: Double = js.native
  /**
    * Gets the value of the action parameter which initiates a simple reload of the control.
    */
  var None: Double = js.native
  /**
    * Gets the value of the action parameter which initiates reloading of the main ASPxScheduler control and its data-dependent satellites.
    */
  var VisibleIntervalChanged: Double = js.native
}

