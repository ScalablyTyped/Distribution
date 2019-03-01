package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides information about a report parameter on the client side.
  */
trait ASPxClientReportParameterInfo extends js.Object {
  /**
    * Specifies the parameter path, relative to its parent container (e.g., "subreport1.subreportParameter1" for a subreport's parameter, or "parameter1" for a report's parameter).
    * Value: A String value, specifying the parameter path (e.g., "subreport1.subreportParameter1").
    */
  var Path: java.lang.String
  /**
    * Provides access to a parameter value on the client.
    * Value: A Object value.
    */
  var Value: js.Object
}

object ASPxClientReportParameterInfo {
  @scala.inline
  def apply(Path: java.lang.String, Value: js.Object): ASPxClientReportParameterInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Path")(Path)
    __obj.updateDynamic("Value")(Value)
    __obj.asInstanceOf[ASPxClientReportParameterInfo]
  }
}

