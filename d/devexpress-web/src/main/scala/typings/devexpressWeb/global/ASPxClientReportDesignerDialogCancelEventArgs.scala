package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the events related to opening and saving reports in the Web Report Designer.
  */
@JSGlobal("ASPxClientReportDesignerDialogCancelEventArgs")
@js.native
class ASPxClientReportDesignerDialogCancelEventArgs protected ()
  extends StObject
     with typings.devexpressWeb.ASPxClientReportDesignerDialogCancelEventArgs {
  /**
    * Initializes a new instance of the ASPxClientReportDesignerDialogCancelEventArgs class with the specified settings.
    * @param url Specifies the URL of the report currently being processed. This value is assigned to the ASPxClientReportDesignerDialogEventArgs.Url property.
    * @param report Specifies the report currently being processed. This value is assigned to the ASPxClientReportDesignerDialogEventArgs.Report property.
    */
  def this(url: String, report: js.Any) = this()
  
  /**
    * Specifies whether or not the operation performed with a report should be canceled.
    */
  /* CompleteClass */
  var Cancel: Boolean = js.native
  
  /**
    * Specifies the report currently being processed.
    */
  /* CompleteClass */
  var Report: js.Any = js.native
  
  /**
    * Specifies the URL of the report currently being processed.
    */
  /* CompleteClass */
  var Url: String = js.native
}
