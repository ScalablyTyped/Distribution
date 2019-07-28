package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A template that is rendered to display a tooltip.
  */
trait MVCxClientSchedulerTemplateToolTip extends ASPxClientToolTipBase {
  /**
    * Gets the tooltip type.
    * Value: A MVCxSchedulerToolTipType object that specifies the tooltip type.
    */
  var `type`: MVCxSchedulerToolTipType
}

object MVCxClientSchedulerTemplateToolTip {
  @scala.inline
  def apply(
    CalculatePosition: js.Object => ASPxClientPoint,
    CanShowToolTip: () => Boolean,
    Close: () => Unit,
    ConvertIntervalToString: ASPxClientTimeInterval => String,
    FinalizeUpdate: ASPxClientSchedulerToolTipData => Unit,
    ShowAppointmentMenu: js.Object => Unit,
    ShowViewMenu: js.Object => Unit,
    Update: ASPxClientSchedulerToolTipData => Unit,
    `type`: MVCxSchedulerToolTipType
  ): MVCxClientSchedulerTemplateToolTip = {
    val __obj = js.Dynamic.literal(CalculatePosition = js.Any.fromFunction1(CalculatePosition), CanShowToolTip = js.Any.fromFunction0(CanShowToolTip), Close = js.Any.fromFunction0(Close), ConvertIntervalToString = js.Any.fromFunction1(ConvertIntervalToString), FinalizeUpdate = js.Any.fromFunction1(FinalizeUpdate), ShowAppointmentMenu = js.Any.fromFunction1(ShowAppointmentMenu), ShowViewMenu = js.Any.fromFunction1(ShowViewMenu), Update = js.Any.fromFunction1(Update))
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[MVCxClientSchedulerTemplateToolTip]
  }
}

