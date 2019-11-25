package typings.gapiDotClientDotToolresults.gapi.client.toolresults

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestIssue extends js.Object {
  /** A brief human-readable message describing the issue. Required. */
  var errorMessage: js.UndefOr[String] = js.undefined
  /** Severity of issue. Required. */
  var severity: js.UndefOr[String] = js.undefined
  /** Deprecated in favor of stack trace fields inside specific warnings. */
  var stackTrace: js.UndefOr[StackTrace] = js.undefined
  /** Type of issue. Required. */
  var `type`: js.UndefOr[String] = js.undefined
  /** Warning message with additional details of the issue. Should always be a message from com.google.devtools.toolresults.v1.warnings Required. */
  var warning: js.UndefOr[Any] = js.undefined
}

object TestIssue {
  @scala.inline
  def apply(
    errorMessage: String = null,
    severity: String = null,
    stackTrace: StackTrace = null,
    `type`: String = null,
    warning: Any = null
  ): TestIssue = {
    val __obj = js.Dynamic.literal()
    if (errorMessage != null) __obj.updateDynamic("errorMessage")(errorMessage.asInstanceOf[js.Any])
    if (severity != null) __obj.updateDynamic("severity")(severity.asInstanceOf[js.Any])
    if (stackTrace != null) __obj.updateDynamic("stackTrace")(stackTrace.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (warning != null) __obj.updateDynamic("warning")(warning.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestIssue]
  }
}

