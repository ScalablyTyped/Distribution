package typings
package gapiDotClientDotClouderrorreportingLib.gapiNs.clientNs.clouderrorreportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReportedErrorEvent extends js.Object {
  /** [Optional] A description of the context in which the error occurred. */
  var context: js.UndefOr[ErrorContext] = js.undefined
  /**
    * [Optional] Time when the event occurred.
    * If not provided, the time when the event was received by the
    * Error Reporting system will be used.
    */
  var eventTime: js.UndefOr[java.lang.String] = js.undefined
  /**
    * [Required] The error message.
    * If no `context.reportLocation` is provided, the message must contain a
    * header (typically consisting of the exception type name and an error
    * message) and an exception stack trace in one of the supported programming
    * languages and formats.
    * Supported languages are Java, Python, JavaScript, Ruby, C#, PHP, and Go.
    * Supported stack trace formats are:
    *
    * &#42; &#42;&#42;Java&#42;&#42;: Must be the return value of
    * [`Throwable.printStackTrace()`](https://docs.oracle.com/javase/7/docs/api/java/lang/Throwable.html#printStackTrace%28%29).
    * &#42; &#42;&#42;Python&#42;&#42;: Must be the return value of [`traceback.format_exc()`](https://docs.python.org/2/library/traceback.html#traceback.format_exc).
    * &#42; &#42;&#42;JavaScript&#42;&#42;: Must be the value of [`error.stack`](https://github.com/v8/v8/wiki/Stack-Trace-API)
    * as returned by V8.
    * &#42; &#42;&#42;Ruby&#42;&#42;: Must contain frames returned by [`Exception.backtrace`](https://ruby-doc.org/core-2.2.0/Exception.html#method-i-backtrace).
    * &#42; &#42;&#42;C#&#42;&#42;: Must be the return value of [`Exception.ToString()`](https://msdn.microsoft.com/en-us/library/system.exception.tostring.aspx).
    * &#42; &#42;&#42;PHP&#42;&#42;: Must start with `PHP (Notice|Parse error|Fatal error|Warning)`
    * and contain the result of [`(string)$exception`](http://php.net/manual/en/exception.tostring.php).
    * &#42; &#42;&#42;Go&#42;&#42;: Must be the return value of [`runtime.Stack()`](https://golang.org/pkg/runtime/debug/#Stack).
    */
  var message: js.UndefOr[java.lang.String] = js.undefined
  /** [Required] The service context in which this error has occurred. */
  var serviceContext: js.UndefOr[ServiceContext] = js.undefined
}

