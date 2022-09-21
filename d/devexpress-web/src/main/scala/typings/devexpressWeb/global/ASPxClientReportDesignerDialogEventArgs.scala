package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the events related to opening and saving reports in the Web Report Designer.
  */
@JSGlobal("ASPxClientReportDesignerDialogEventArgs")
@js.native
open class ASPxClientReportDesignerDialogEventArgs protected ()
  extends StObject
     with typings.devexpressWeb.ASPxClientReportDesignerDialogEventArgs {
  /**
    * Initializes a new instance of the ASPxClientReportDesignerDialogEventArgs class with the specified settings.
    * @param url Specifies the URL of the report currently being processed. This value is assigned to the ASPxClientReportDesignerDialogEventArgs.Url property.
    * @param report Specifies the report currently being processed. This value is assigned to the ASPxClientReportDesignerDialogEventArgs.Report property.
    */
  def this(url: String, report: Any) = this()
  
  /**
    * Specifies the report currently being processed.
    */
  /* CompleteClass */
  var Report: Any = js.native
  
  /**
    * Specifies the URL of the report currently being processed.
    */
  /* CompleteClass */
  var Url: String = js.native
}
