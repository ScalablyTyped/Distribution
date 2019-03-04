package typings
package expressDashMysqlDashSessionLib.expressDashMysqlDashSessionMod.MySQLStoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnNames extends js.Object {
  var data: java.lang.String
  var expires: java.lang.String
  var session_id: java.lang.String
}

object ColumnNames {
  @scala.inline
  def apply(data: java.lang.String, expires: java.lang.String, session_id: java.lang.String): ColumnNames = {
    val __obj = js.Dynamic.literal(data = data, expires = expires, session_id = session_id)
  
    __obj.asInstanceOf[ColumnNames]
  }
}

