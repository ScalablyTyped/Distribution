package typings
package gapiDotClientDotClouderrorreportingLib.gapiNs.clientNs.clouderrorreportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrorEvent extends js.Object {
  /** Data about the context in which the error occurred. */
  var context: js.UndefOr[ErrorContext] = js.undefined
  /**
    * Time when the event occurred as provided in the error report.
    * If the report did not contain a timestamp, the time the error was received
    * by the Error Reporting system is used.
    */
  var eventTime: js.UndefOr[java.lang.String] = js.undefined
  /** The stack trace that was reported or logged by the service. */
  var message: js.UndefOr[java.lang.String] = js.undefined
  /** The `ServiceContext` for which this error was reported. */
  var serviceContext: js.UndefOr[ServiceContext] = js.undefined
}

object ErrorEvent {
  @scala.inline
  def apply(
    context: ErrorContext = null,
    eventTime: java.lang.String = null,
    message: java.lang.String = null,
    serviceContext: ServiceContext = null
  ): ErrorEvent = {
    val __obj = js.Dynamic.literal()
    if (context != null) __obj.updateDynamic("context")(context)
    if (eventTime != null) __obj.updateDynamic("eventTime")(eventTime)
    if (message != null) __obj.updateDynamic("message")(message)
    if (serviceContext != null) __obj.updateDynamic("serviceContext")(serviceContext)
    __obj.asInstanceOf[ErrorEvent]
  }
}

