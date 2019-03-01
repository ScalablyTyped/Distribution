package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.JDBCNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JdbcSQLXML extends js.Object {
  def free(): scala.Unit
  def getString(): java.lang.String
  def setString(value: java.lang.String): scala.Unit
}

object JdbcSQLXML {
  @scala.inline
  def apply(
    free: js.Function0[scala.Unit],
    getString: js.Function0[java.lang.String],
    setString: js.Function1[java.lang.String, scala.Unit]
  ): JdbcSQLXML = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("free")(free)
    __obj.updateDynamic("getString")(getString)
    __obj.updateDynamic("setString")(setString)
    __obj.asInstanceOf[JdbcSQLXML]
  }
}

