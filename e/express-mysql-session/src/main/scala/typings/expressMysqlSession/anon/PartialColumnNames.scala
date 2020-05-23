package typings.expressMysqlSession.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<express-mysql-session.express-mysql-session.ColumnNames> */
trait PartialColumnNames extends js.Object {
  var data: js.UndefOr[String] = js.undefined
  var expires: js.UndefOr[String] = js.undefined
  var session_id: js.UndefOr[String] = js.undefined
}

object PartialColumnNames {
  @scala.inline
  def apply(data: String = null, expires: String = null, session_id: String = null): PartialColumnNames = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (expires != null) __obj.updateDynamic("expires")(expires.asInstanceOf[js.Any])
    if (session_id != null) __obj.updateDynamic("session_id")(session_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialColumnNames]
  }
}

