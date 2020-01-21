package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides information about a report parameter on the client side.
  */
@JSGlobal("ASPxClientReportParameterInfo")
@js.native
class ASPxClientReportParameterInfo () extends js.Object {
  /**
    * Specifies the parameter path, relative to its parent container (e.g., "subreport1.subreportParameter1" for a subreport's parameter, or "parameter1" for a report's parameter).
    */
  var Path: String = js.native
  /**
    * Provides access to a parameter value on the client.
    */
  var Value: js.Any = js.native
}

