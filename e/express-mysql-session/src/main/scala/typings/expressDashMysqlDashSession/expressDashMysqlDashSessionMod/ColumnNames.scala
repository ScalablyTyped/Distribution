package typings.expressDashMysqlDashSession.expressDashMysqlDashSessionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnNames extends js.Object {
  var data: String
  var expires: String
  var session_id: String
}

object ColumnNames {
  @scala.inline
  def apply(data: String, expires: String, session_id: String): ColumnNames = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], expires = expires.asInstanceOf[js.Any], session_id = session_id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ColumnNames]
  }
}

