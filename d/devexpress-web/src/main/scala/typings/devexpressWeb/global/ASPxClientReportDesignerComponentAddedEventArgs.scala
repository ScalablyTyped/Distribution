package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientReportDesigner.ComponentAdded event.
  */
@JSGlobal("ASPxClientReportDesignerComponentAddedEventArgs")
@js.native
class ASPxClientReportDesignerComponentAddedEventArgs protected ()
  extends StObject
     with typings.devexpressWeb.ASPxClientReportDesignerComponentAddedEventArgs {
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
  var Model: js.Any = js.native
  
  /**
    * Gets the parent of a component that has been added to a report.
    */
  /* CompleteClass */
  var Parent: js.Any = js.native
}
