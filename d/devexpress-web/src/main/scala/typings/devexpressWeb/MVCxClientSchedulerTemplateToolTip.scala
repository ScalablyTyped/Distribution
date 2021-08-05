package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A template that is rendered to display a tooltip.
  */
trait MVCxClientSchedulerTemplateToolTip
  extends StObject
     with ASPxClientToolTipBase {
  
  /**
    * Gets the tooltip type.
    */
  var `type`: MVCxSchedulerToolTipType
}
object MVCxClientSchedulerTemplateToolTip {
  
  inline def apply(
    CalculatePosition: js.Any => ASPxClientPoint,
    CanShowToolTip: () => Boolean,
    Close: () => Unit,
    ConvertIntervalToString: ASPxClientTimeInterval => String,
    FinalizeUpdate: ASPxClientSchedulerToolTipData => Unit,
    ShowAppointmentMenu: js.Any => Unit,
    ShowViewMenu: js.Any => Unit,
    Update: ASPxClientSchedulerToolTipData => Unit,
    `type`: MVCxSchedulerToolTipType
  ): MVCxClientSchedulerTemplateToolTip = {
    val __obj = js.Dynamic.literal(CalculatePosition = js.Any.fromFunction1(CalculatePosition), CanShowToolTip = js.Any.fromFunction0(CanShowToolTip), Close = js.Any.fromFunction0(Close), ConvertIntervalToString = js.Any.fromFunction1(ConvertIntervalToString), FinalizeUpdate = js.Any.fromFunction1(FinalizeUpdate), ShowAppointmentMenu = js.Any.fromFunction1(ShowAppointmentMenu), ShowViewMenu = js.Any.fromFunction1(ShowViewMenu), Update = js.Any.fromFunction1(Update))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MVCxClientSchedulerTemplateToolTip]
  }
  
  extension [Self <: MVCxClientSchedulerTemplateToolTip](x: Self) {
    
    inline def setType(value: MVCxSchedulerToolTipType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
