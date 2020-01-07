package typings.googleapis.buildSrcApisClouderrorreportingV1beta1Mod.clouderrorreporting_v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An error event which is returned by the Error Reporting system.
  */
@js.native
trait Schema$ErrorEvent extends js.Object {
  /**
    * Data about the context in which the error occurred.
    */
  var context: js.UndefOr[Schema$ErrorContext] = js.native
  /**
    * Time when the event occurred as provided in the error report. If the
    * report did not contain a timestamp, the time the error was received by
    * the Error Reporting system is used.
    */
  var eventTime: js.UndefOr[String] = js.native
  /**
    * The stack trace that was reported or logged by the service.
    */
  var message: js.UndefOr[String] = js.native
  /**
    * The `ServiceContext` for which this error was reported.
    */
  var serviceContext: js.UndefOr[Schema$ServiceContext] = js.native
}

object Schema$ErrorEvent {
  @scala.inline
  def apply(
    context: Schema$ErrorContext = null,
    eventTime: String = null,
    message: String = null,
    serviceContext: Schema$ServiceContext = null
  ): Schema$ErrorEvent = {
    val __obj = js.Dynamic.literal()
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (eventTime != null) __obj.updateDynamic("eventTime")(eventTime.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (serviceContext != null) __obj.updateDynamic("serviceContext")(serviceContext.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ErrorEvent]
  }
}

