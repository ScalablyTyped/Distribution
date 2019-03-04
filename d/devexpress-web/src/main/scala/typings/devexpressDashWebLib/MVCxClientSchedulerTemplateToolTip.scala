package typings
package devexpressDashWebLib

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
    CalculatePosition: js.Function1[js.Object, ASPxClientPoint],
    CanShowToolTip: js.Function0[scala.Boolean],
    Close: js.Function0[scala.Unit],
    ConvertIntervalToString: js.Function1[ASPxClientTimeInterval, java.lang.String],
    FinalizeUpdate: js.Function1[ASPxClientSchedulerToolTipData, scala.Unit],
    ShowAppointmentMenu: js.Function1[js.Object, scala.Unit],
    ShowViewMenu: js.Function1[js.Object, scala.Unit],
    Update: js.Function1[ASPxClientSchedulerToolTipData, scala.Unit],
    `type`: MVCxSchedulerToolTipType
  ): MVCxClientSchedulerTemplateToolTip = {
    val __obj = js.Dynamic.literal(CalculatePosition = CalculatePosition, CanShowToolTip = CanShowToolTip, Close = Close, ConvertIntervalToString = ConvertIntervalToString, FinalizeUpdate = FinalizeUpdate, ShowAppointmentMenu = ShowAppointmentMenu, ShowViewMenu = ShowViewMenu, Update = Update)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[MVCxClientSchedulerTemplateToolTip]
  }
}

