package typings.googleapis.buildSrcApisToolresultsV1beta3Mod.toolresults_v1beta3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An issue detected occurring during a test execution.
  */
@js.native
trait Schema$TestIssue extends js.Object {
  /**
    * Category of issue. Required.
    */
  var category: js.UndefOr[String] = js.native
  /**
    * A brief human-readable message describing the issue. Required.
    */
  var errorMessage: js.UndefOr[String] = js.native
  /**
    * Severity of issue. Required.
    */
  var severity: js.UndefOr[String] = js.native
  /**
    * Deprecated in favor of stack trace fields inside specific warnings.
    */
  var stackTrace: js.UndefOr[Schema$StackTrace] = js.native
  /**
    * Type of issue. Required.
    */
  var `type`: js.UndefOr[String] = js.native
  /**
    * Warning message with additional details of the issue. Should always be a
    * message from com.google.devtools.toolresults.v1.warnings
    */
  var warning: js.UndefOr[Schema$Any] = js.native
}

object Schema$TestIssue {
  @scala.inline
  def apply(
    category: String = null,
    errorMessage: String = null,
    severity: String = null,
    stackTrace: Schema$StackTrace = null,
    `type`: String = null,
    warning: Schema$Any = null
  ): Schema$TestIssue = {
    val __obj = js.Dynamic.literal()
    if (category != null) __obj.updateDynamic("category")(category.asInstanceOf[js.Any])
    if (errorMessage != null) __obj.updateDynamic("errorMessage")(errorMessage.asInstanceOf[js.Any])
    if (severity != null) __obj.updateDynamic("severity")(severity.asInstanceOf[js.Any])
    if (stackTrace != null) __obj.updateDynamic("stackTrace")(stackTrace.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (warning != null) __obj.updateDynamic("warning")(warning.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$TestIssue]
  }
}

