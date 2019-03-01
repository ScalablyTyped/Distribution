package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the CustomizeToolbox event.
  */
trait ASPxClientReportDesignerCustomizeToolboxEventArgs extends ASPxClientEventArgs {
  /**
    * Provides information about all controls available in the Toolbox.
    * Value: An ASPxDesignerControlsFactory object that provides information about toolbox controls.
    */
  var ControlsFactory: ASPxDesignerControlsFactory
}

object ASPxClientReportDesignerCustomizeToolboxEventArgs {
  @scala.inline
  def apply(ControlsFactory: ASPxDesignerControlsFactory): ASPxClientReportDesignerCustomizeToolboxEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ControlsFactory")(ControlsFactory)
    __obj.asInstanceOf[ASPxClientReportDesignerCustomizeToolboxEventArgs]
  }
}

