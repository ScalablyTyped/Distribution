package typings.gapiClientDoubleclickbidmanager.gapi.client.doubleclickbidmanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReportFailure extends js.Object {
  /** Error code that shows why the report was not created. */
  var errorCode: js.UndefOr[String] = js.undefined
}

object ReportFailure {
  @scala.inline
  def apply(errorCode: String = null): ReportFailure = {
    val __obj = js.Dynamic.literal()
    if (errorCode != null) __obj.updateDynamic("errorCode")(errorCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReportFailure]
  }
}

