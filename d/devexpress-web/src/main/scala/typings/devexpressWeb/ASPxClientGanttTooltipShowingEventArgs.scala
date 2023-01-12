package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the TooltipShowing event.
  */
trait ASPxClientGanttTooltipShowingEventArgs
  extends StObject
     with ASPxClientCancelEventArgs {
  
  /**
    * Returns a container for an instance of the tooltip.
    */
  var container: Any
  
  /**
    * Returns the processed task.
    */
  var task: Any
}
object ASPxClientGanttTooltipShowingEventArgs {
  
  inline def apply(cancel: Boolean, container: Any, task: Any): ASPxClientGanttTooltipShowingEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], task = task.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientGanttTooltipShowingEventArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ASPxClientGanttTooltipShowingEventArgs] (val x: Self) extends AnyVal {
    
    inline def setContainer(value: Any): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setTask(value: Any): Self = StObject.set(x, "task", value.asInstanceOf[js.Any])
  }
}
