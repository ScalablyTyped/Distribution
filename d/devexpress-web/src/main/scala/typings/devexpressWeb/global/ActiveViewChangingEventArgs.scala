package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the client-side ASPxClientScheduler.ActiveViewChanging event.
  */
@JSGlobal("ActiveViewChangingEventArgs")
@js.native
class ActiveViewChangingEventArgs protected ()
  extends typings.devexpressWeb.ActiveViewChangingEventArgs {
  /**
    * Provides data for the client-side ActiveViewChanging event.
    * @param oldView Represents the new View used by the Scheduler to show its data.
    * @param newView Represents the previous View used by the Scheduler to show its data.
    */
  def this(
    oldView: typings.devexpressWeb.ASPxSchedulerViewType,
    newView: typings.devexpressWeb.ASPxSchedulerViewType
  ) = this()
}

