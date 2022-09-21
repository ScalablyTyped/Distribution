package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the TooltipShowing event.
  */
@JSGlobal("ASPxClientGanttTooltipShowingEventArgs")
@js.native
open class ASPxClientGanttTooltipShowingEventArgs protected ()
  extends StObject
     with typings.devexpressWeb.ASPxClientGanttTooltipShowingEventArgs {
  /**
    * Initializes a new instance of the ASPxClientGanttTooltipShowingEventArgs class with specified settings.
    * @param container A container for the tooltip.
    * @param task The task.
    */
  def this(container: Any, task: Any) = this()
  
  /**
    * Specifies whether to cancel the related action (for example, row edit, export).
    */
  /* CompleteClass */
  var cancel: Boolean = js.native
  
  /**
    * Returns a container for an instance of the tooltip.
    */
  /* CompleteClass */
  var container: Any = js.native
  
  /**
    * Returns the processed task.
    */
  /* CompleteClass */
  var task: Any = js.native
}
