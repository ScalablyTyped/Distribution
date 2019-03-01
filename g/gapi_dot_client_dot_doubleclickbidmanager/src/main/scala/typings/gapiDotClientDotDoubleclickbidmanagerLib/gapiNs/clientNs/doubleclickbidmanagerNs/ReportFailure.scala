package typings
package gapiDotClientDotDoubleclickbidmanagerLib.gapiNs.clientNs.doubleclickbidmanagerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReportFailure extends js.Object {
  /** Error code that shows why the report was not created. */
  var errorCode: js.UndefOr[java.lang.String] = js.undefined
}

object ReportFailure {
  @scala.inline
  def apply(errorCode: java.lang.String = null): ReportFailure = {
    val __obj = js.Dynamic.literal()
    if (errorCode != null) __obj.updateDynamic("errorCode")(errorCode)
    __obj.asInstanceOf[ReportFailure]
  }
}

