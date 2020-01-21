package typings.googleapis.clouderrorreportingV1beta1Mod.clouderrorreportingV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An error event which is reported to the Error Reporting system.
  */
@js.native
trait SchemaReportedErrorEvent extends js.Object {
  /**
    * [Optional] A description of the context in which the error occurred.
    */
  var context: js.UndefOr[SchemaErrorContext] = js.native
  /**
    * [Optional] Time when the event occurred. If not provided, the time when
    * the event was received by the Error Reporting system will be used.
    */
  var eventTime: js.UndefOr[String] = js.native
  /**
    * [Required] The error message. If no `context.reportLocation` is provided,
    * the message must contain a header (typically consisting of the exception
    * type name and an error message) and an exception stack trace in one of
    * the supported programming languages and formats. Supported languages are
    * Java, Python, JavaScript, Ruby, C#, PHP, and Go. Supported stack trace
    * formats are:  * **Java**: Must be the return value of
    * [`Throwable.printStackTrace()`](https://docs.oracle.com/javase/7/docs/api/java/lang/Throwable.html#printStackTrace%28%29).
    * * **Python**: Must be the return value of
    * [`traceback.format_exc()`](https://docs.python.org/2/library/traceback.html#traceback.format_exc).
    * * **JavaScript**: Must be the value of
    * [`error.stack`](https://github.com/v8/v8/wiki/Stack-Trace-API) as
    * returned by V8. * **Ruby**: Must contain frames returned by
    * [`Exception.backtrace`](https://ruby-doc.org/core-2.2.0/Exception.html#method-i-backtrace).
    * * **C#**: Must be the return value of
    * [`Exception.ToString()`](https://msdn.microsoft.com/en-us/library/system.exception.tostring.aspx).
    * * **PHP**: Must start with `PHP (Notice|Parse error|Fatal error|Warning)`
    * and contain the result of
    * [`(string)$exception`](http://php.net/manual/en/exception.tostring.php).
    * * **Go**: Must be the return value of
    * [`runtime.Stack()`](https://golang.org/pkg/runtime/debug/#Stack).
    */
  var message: js.UndefOr[String] = js.native
  /**
    * [Required] The service context in which this error has occurred.
    */
  var serviceContext: js.UndefOr[SchemaServiceContext] = js.native
}

object SchemaReportedErrorEvent {
  @scala.inline
  def apply(
    context: SchemaErrorContext = null,
    eventTime: String = null,
    message: String = null,
    serviceContext: SchemaServiceContext = null
  ): SchemaReportedErrorEvent = {
    val __obj = js.Dynamic.literal()
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (eventTime != null) __obj.updateDynamic("eventTime")(eventTime.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (serviceContext != null) __obj.updateDynamic("serviceContext")(serviceContext.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaReportedErrorEvent]
  }
}

