package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the MVCxClientScheduler.ToolTipDisplaying event.
  */
trait MVCxClientSchedulerToolTipDisplayingEventArgs
  extends StObject
     with ASPxClientEventArgs {
  
  /**
    * Gets information about the tooltip related to the event.
    */
  var data: ASPxClientSchedulerToolTipData
  
  /**
    * Gets the tooltip related to the event.
    */
  var toolTip: MVCxClientSchedulerTemplateToolTip
}
object MVCxClientSchedulerToolTipDisplayingEventArgs {
  
  @scala.inline
  def apply(data: ASPxClientSchedulerToolTipData, toolTip: MVCxClientSchedulerTemplateToolTip): MVCxClientSchedulerToolTipDisplayingEventArgs = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], toolTip = toolTip.asInstanceOf[js.Any])
    __obj.asInstanceOf[MVCxClientSchedulerToolTipDisplayingEventArgs]
  }
  
  @scala.inline
  implicit class MVCxClientSchedulerToolTipDisplayingEventArgsMutableBuilder[Self <: MVCxClientSchedulerToolTipDisplayingEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: ASPxClientSchedulerToolTipData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToolTip(value: MVCxClientSchedulerTemplateToolTip): Self = StObject.set(x, "toolTip", value.asInstanceOf[js.Any])
  }
}
