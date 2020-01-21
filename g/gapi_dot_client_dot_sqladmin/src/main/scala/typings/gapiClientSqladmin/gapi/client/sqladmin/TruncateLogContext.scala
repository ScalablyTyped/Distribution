package typings.gapiClientSqladmin.gapi.client.sqladmin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TruncateLogContext extends js.Object {
  /** This is always sql#truncateLogContext. */
  var kind: js.UndefOr[String] = js.undefined
  /** The type of log to truncate. Valid values are MYSQL_GENERAL_TABLE and MYSQL_SLOW_TABLE. */
  var logType: js.UndefOr[String] = js.undefined
}

object TruncateLogContext {
  @scala.inline
  def apply(kind: String = null, logType: String = null): TruncateLogContext = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (logType != null) __obj.updateDynamic("logType")(logType.asInstanceOf[js.Any])
    __obj.asInstanceOf[TruncateLogContext]
  }
}

