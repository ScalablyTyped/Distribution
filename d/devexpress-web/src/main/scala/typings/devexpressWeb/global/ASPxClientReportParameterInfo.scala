package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides information about a report parameter on the client side.
  */
@JSGlobal("ASPxClientReportParameterInfo")
@js.native
class ASPxClientReportParameterInfo ()
  extends StObject
     with typings.devexpressWeb.ASPxClientReportParameterInfo {
  
  /**
    * Specifies the parameter path, relative to its parent container (e.g., "subreport1.subreportParameter1" for a subreport's parameter, or "parameter1" for a report's parameter).
    */
  /* CompleteClass */
  var Path: String = js.native
  
  /**
    * Provides access to a parameter value on the client.
    */
  /* CompleteClass */
  var Value: js.Any = js.native
}
