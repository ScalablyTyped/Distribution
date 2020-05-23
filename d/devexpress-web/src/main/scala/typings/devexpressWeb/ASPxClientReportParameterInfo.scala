package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides information about a report parameter on the client side.
  */
trait ASPxClientReportParameterInfo extends js.Object {
  /**
    * Specifies the parameter path, relative to its parent container (e.g., "subreport1.subreportParameter1" for a subreport's parameter, or "parameter1" for a report's parameter).
    */
  var Path: String
  /**
    * Provides access to a parameter value on the client.
    */
  var Value: js.Any
}

object ASPxClientReportParameterInfo {
  @scala.inline
  def apply(Path: String, Value: js.Any): ASPxClientReportParameterInfo = {
    val __obj = js.Dynamic.literal(Path = Path.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientReportParameterInfo]
  }
}

