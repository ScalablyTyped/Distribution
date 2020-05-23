package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientReportDesigner.CustomizeToolbox event.
  */
trait ASPxClientReportDesignerCustomizeToolboxEventArgs extends ASPxClientEventArgs {
  /**
    * Provides information about all controls available in the Toolbox.
    */
  var ControlsFactory: ASPxDesignerControlsFactory
}

object ASPxClientReportDesignerCustomizeToolboxEventArgs {
  @scala.inline
  def apply(ControlsFactory: ASPxDesignerControlsFactory): ASPxClientReportDesignerCustomizeToolboxEventArgs = {
    val __obj = js.Dynamic.literal(ControlsFactory = ControlsFactory.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientReportDesignerCustomizeToolboxEventArgs]
  }
}

