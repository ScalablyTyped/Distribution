package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the client-side ASPxClientScheduler.ActiveViewChanging event.
  */
trait ActiveViewChangingEventArgs
  extends StObject
     with ASPxClientEventArgs {
  
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
  
  @scala.inline
  implicit class ActiveViewChangingEventArgsMutableBuilder[Self <: ActiveViewChangingEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewView(value: ASPxSchedulerViewType): Self = StObject.set(x, "newView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldView(value: ASPxSchedulerViewType): Self = StObject.set(x, "oldView", value.asInstanceOf[js.Any])
  }
}
