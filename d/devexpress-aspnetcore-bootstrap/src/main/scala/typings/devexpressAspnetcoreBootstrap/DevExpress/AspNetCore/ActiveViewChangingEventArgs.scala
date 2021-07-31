package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActiveViewChangingEventArgs
  extends StObject
     with EventArgs {
  
  var cancel: Boolean
  
  val newView: BootstrapSchedulerViewType
  
  val oldView: BootstrapSchedulerViewType
}
object ActiveViewChangingEventArgs {
  
  @scala.inline
  def apply(
    cancel: Boolean,
    newView: BootstrapSchedulerViewType,
    oldView: BootstrapSchedulerViewType,
    sender: Control
  ): ActiveViewChangingEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], newView = newView.asInstanceOf[js.Any], oldView = oldView.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActiveViewChangingEventArgs]
  }
  
  @scala.inline
  implicit class ActiveViewChangingEventArgsMutableBuilder[Self <: ActiveViewChangingEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewView(value: BootstrapSchedulerViewType): Self = StObject.set(x, "newView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldView(value: BootstrapSchedulerViewType): Self = StObject.set(x, "oldView", value.asInstanceOf[js.Any])
  }
}
