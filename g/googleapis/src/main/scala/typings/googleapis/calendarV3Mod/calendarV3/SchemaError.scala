package typings.googleapis.calendarV3Mod.calendarV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaError extends js.Object {
  /**
    * Domain, or broad category, of the error.
    */
  var domain: js.UndefOr[String] = js.native
  /**
    * Specific reason for the error. Some of the possible values are:   -
    * &quot;groupTooBig&quot; - The group of users requested is too large for a
    * single query.  - &quot;tooManyCalendarsRequested&quot; - The number of
    * calendars requested is too large for a single query.  -
    * &quot;notFound&quot; - The requested resource was not found.  -
    * &quot;internalError&quot; - The API service has encountered an internal
    * error.  Additional error types may be added in the future, so clients
    * should gracefully handle additional error statuses not included in this
    * list.
    */
  var reason: js.UndefOr[String] = js.native
}

object SchemaError {
  @scala.inline
  def apply(domain: String = null, reason: String = null): SchemaError = {
    val __obj = js.Dynamic.literal()
    if (domain != null) __obj.updateDynamic("domain")(domain.asInstanceOf[js.Any])
    if (reason != null) __obj.updateDynamic("reason")(reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaError]
  }
}

