package typings.googleapis.buildSrcApisToolresultsV1beta3Mod.toolresults_v1beta3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A stacktrace.
  */
@js.native
trait Schema$StackTrace extends js.Object {
  /**
    * The stack trace message.  Required
    */
  var exception: js.UndefOr[String] = js.native
}

object Schema$StackTrace {
  @scala.inline
  def apply(exception: String = null): Schema$StackTrace = {
    val __obj = js.Dynamic.literal()
    if (exception != null) __obj.updateDynamic("exception")(exception.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$StackTrace]
  }
}

