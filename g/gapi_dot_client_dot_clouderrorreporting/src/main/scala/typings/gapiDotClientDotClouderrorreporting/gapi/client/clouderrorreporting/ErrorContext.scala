package typings.gapiDotClientDotClouderrorreporting.gapi.client.clouderrorreporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrorContext extends js.Object {
  /**
    * The HTTP request which was processed when the error was
    * triggered.
    */
  var httpRequest: js.UndefOr[HttpRequestContext] = js.undefined
  /**
    * The location in the source code where the decision was made to
    * report the error, usually the place where it was logged.
    * For a logged exception this would be the source line where the
    * exception is logged, usually close to the place where it was
    * caught.
    */
  var reportLocation: js.UndefOr[SourceLocation] = js.undefined
  /**
    * Source code that was used to build the executable which has
    * caused the given error message.
    */
  var sourceReferences: js.UndefOr[js.Array[SourceReference]] = js.undefined
  /**
    * The user who caused or was affected by the crash.
    * This can be a user ID, an email address, or an arbitrary token that
    * uniquely identifies the user.
    * When sending an error report, leave this field empty if the user was not
    * logged in. In this case the
    * Error Reporting system will use other data, such as remote IP address, to
    * distinguish affected users. See `affected_users_count` in
    * `ErrorGroupStats`.
    */
  var user: js.UndefOr[String] = js.undefined
}

object ErrorContext {
  @scala.inline
  def apply(
    httpRequest: HttpRequestContext = null,
    reportLocation: SourceLocation = null,
    sourceReferences: js.Array[SourceReference] = null,
    user: String = null
  ): ErrorContext = {
    val __obj = js.Dynamic.literal()
    if (httpRequest != null) __obj.updateDynamic("httpRequest")(httpRequest.asInstanceOf[js.Any])
    if (reportLocation != null) __obj.updateDynamic("reportLocation")(reportLocation.asInstanceOf[js.Any])
    if (sourceReferences != null) __obj.updateDynamic("sourceReferences")(sourceReferences.asInstanceOf[js.Any])
    if (user != null) __obj.updateDynamic("user")(user.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorContext]
  }
}

