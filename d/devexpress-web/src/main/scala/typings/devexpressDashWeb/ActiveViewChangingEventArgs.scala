package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the client-side ASPxClientScheduler.ActiveViewChanging event.
  */
@JSGlobal("ActiveViewChangingEventArgs")
@js.native
class ActiveViewChangingEventArgs protected () extends ASPxClientEventArgs {
  /**
    * Provides data for the client-side ActiveViewChanging event.
    * @param oldView Represents the new View used by the Scheduler to show its data.
    * @param newView Represents the previous View used by the Scheduler to show its data.
    */
  def this(oldView: ASPxSchedulerViewType, newView: ASPxSchedulerViewType) = this()
  /**
    * Gets or sets whether the change of active view should be canceled.
    */
  var cancel: Boolean = js.native
  /**
    * Gets the new value of the ASPxScheduler.ActiveView property.
    */
  var newView: ASPxSchedulerViewType = js.native
  /**
    * Gets the value of the ASPxScheduler.ActiveView property before modification.
    */
  var oldView: ASPxSchedulerViewType = js.native
}

