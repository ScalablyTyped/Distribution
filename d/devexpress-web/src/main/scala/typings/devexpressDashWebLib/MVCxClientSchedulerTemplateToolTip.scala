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
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("CalculatePosition")(CalculatePosition)
    __obj.updateDynamic("CanShowToolTip")(CanShowToolTip)
    __obj.updateDynamic("Close")(Close)
    __obj.updateDynamic("ConvertIntervalToString")(ConvertIntervalToString)
    __obj.updateDynamic("FinalizeUpdate")(FinalizeUpdate)
    __obj.updateDynamic("ShowAppointmentMenu")(ShowAppointmentMenu)
    __obj.updateDynamic("ShowViewMenu")(ShowViewMenu)
    __obj.updateDynamic("Update")(Update)
    __obj.asInstanceOf[MVCxClientSchedulerTemplateToolTip]
  }
}

