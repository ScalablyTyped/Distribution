package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Holds action types for the client-side ASPxClientScheduler.Refresh method.
  */
trait ASPxClientSchedulerRefreshAction extends StObject {
  
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
  
  inline def apply(ActiveViewTypeChanged: Double, None: Double, VisibleIntervalChanged: Double): ASPxClientSchedulerRefreshAction = {
    val __obj = js.Dynamic.literal(ActiveViewTypeChanged = ActiveViewTypeChanged.asInstanceOf[js.Any], None = None.asInstanceOf[js.Any], VisibleIntervalChanged = VisibleIntervalChanged.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientSchedulerRefreshAction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ASPxClientSchedulerRefreshAction] (val x: Self) extends AnyVal {
    
    inline def setActiveViewTypeChanged(value: Double): Self = StObject.set(x, "ActiveViewTypeChanged", value.asInstanceOf[js.Any])
    
    inline def setNone(value: Double): Self = StObject.set(x, "None", value.asInstanceOf[js.Any])
    
    inline def setVisibleIntervalChanged(value: Double): Self = StObject.set(x, "VisibleIntervalChanged", value.asInstanceOf[js.Any])
  }
}
