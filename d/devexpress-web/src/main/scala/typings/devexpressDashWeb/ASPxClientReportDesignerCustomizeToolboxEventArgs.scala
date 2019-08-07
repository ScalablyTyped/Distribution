package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientReportDesigner.CustomizeToolbox event.
  */
@JSGlobal("ASPxClientReportDesignerCustomizeToolboxEventArgs")
@js.native
class ASPxClientReportDesignerCustomizeToolboxEventArgs protected () extends ASPxClientEventArgs {
  /**
    * Initializes a new instance of the ASPxClientReportDesignerCustomizeToolboxEventArgs class with the specified settings.
    * @param controlsFactory An object that provides information about all controls available in the Toolbox. This object is assigned to the ASPxClientReportDesignerCustomizeToolboxEventArgs.ControlsFactory property.
    */
  def this(controlsFactory: ASPxDesignerControlsFactory) = this()
  /**
    * Provides information about all controls available in the Toolbox.
    */
  var ControlsFactory: ASPxDesignerControlsFactory = js.native
}

