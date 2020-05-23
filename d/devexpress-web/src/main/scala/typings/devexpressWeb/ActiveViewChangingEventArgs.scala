package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the client-side ASPxClientScheduler.ActiveViewChanging event.
  */
trait ActiveViewChangingEventArgs extends ASPxClientEventArgs {
  /**
    * Gets or sets whether the change of active view should be canceled.
    */
  var cancel: Boolean
  /**
    * Gets the new value of the ASPxScheduler.ActiveView property.
    */
  var newView: ASPxSchedulerViewType
  /**
    * Gets the value of the ASPxScheduler.ActiveView property before modification.
    */
  var oldView: ASPxSchedulerViewType
}

object ActiveViewChangingEventArgs {
  @scala.inline
  def apply(cancel: Boolean, newView: ASPxSchedulerViewType, oldView: ASPxSchedulerViewType): ActiveViewChangingEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], newView = newView.asInstanceOf[js.Any], oldView = oldView.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActiveViewChangingEventArgs]
  }
}

