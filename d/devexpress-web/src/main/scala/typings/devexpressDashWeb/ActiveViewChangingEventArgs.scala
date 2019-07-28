package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the client-side ActiveViewChanging event.
  */
trait ActiveViewChangingEventArgs extends ASPxClientEventArgs {
  /**
    * Gets or sets whether the change of active view should be canceled.
    * Value: true to cancel the operation; otherwise, false.
    */
  var cancel: Boolean
  /**
    * Gets the new value of the ActiveView property.
    * Value: A string, which is the SchedulerViewType enumeration value.
    */
  var newView: ASPxSchedulerViewType
  /**
    * Gets the value of the ActiveView property before modification.
    * Value: A SchedulerViewType enumeration.
    */
  var oldView: ASPxSchedulerViewType
}

object ActiveViewChangingEventArgs {
  @scala.inline
  def apply(cancel: Boolean, newView: ASPxSchedulerViewType, oldView: ASPxSchedulerViewType): ActiveViewChangingEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel, newView = newView, oldView = oldView)
  
    __obj.asInstanceOf[ActiveViewChangingEventArgs]
  }
}

