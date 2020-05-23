package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientReportDesigner.ComponentAdded event.
  */
@JSGlobal("ASPxClientReportDesignerComponentAddedEventArgs")
@js.native
class ASPxClientReportDesignerComponentAddedEventArgs protected ()
  extends typings.devexpressWeb.ASPxClientReportDesignerComponentAddedEventArgs {
  /**
    * Initializes a new instance of the ASPxClientReportDesignerComponentAddedEventArgs class with the specified settings.
    * @param model An object that specifies the model of a component that has been added to a report. This value is assigned to the ASPxClientReportDesignerComponentAddedEventArgs.Model property.
    * @param parent An object that specifies the parent of a component that has been added to a report. This value is assigned to the ASPxClientReportDesignerComponentAddedEventArgs.Parent property.
    */
  def this(model: js.Any, parent: js.Any) = this()
  /**
    * Gets the model of a component that has been added to a report.
    */
  /* CompleteClass */
  override var Model: js.Any = js.native
  /**
    * Gets the parent of a component that has been added to a report.
    */
  /* CompleteClass */
  override var Parent: js.Any = js.native
}

