package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Holds action types for the client-side ASPxClientScheduler.Refresh method.
  */
@js.native
trait ASPxClientSchedulerRefreshAction extends StObject {
  
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
object ASPxClientSchedulerRefreshAction {
  
  @scala.inline
  def apply(ActiveViewTypeChanged: Double, None: Double, VisibleIntervalChanged: Double): ASPxClientSchedulerRefreshAction = {
    val __obj = js.Dynamic.literal(ActiveViewTypeChanged = ActiveViewTypeChanged.asInstanceOf[js.Any], None = None.asInstanceOf[js.Any], VisibleIntervalChanged = VisibleIntervalChanged.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientSchedulerRefreshAction]
  }
  
  @scala.inline
  implicit class ASPxClientSchedulerRefreshActionMutableBuilder[Self <: ASPxClientSchedulerRefreshAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActiveViewTypeChanged(value: Double): Self = StObject.set(x, "ActiveViewTypeChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNone(value: Double): Self = StObject.set(x, "None", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleIntervalChanged(value: Double): Self = StObject.set(x, "VisibleIntervalChanged", value.asInstanceOf[js.Any])
  }
}
