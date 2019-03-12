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
    free: () => scala.Unit,
    getString: () => java.lang.String,
    setString: java.lang.String => scala.Unit
  ): JdbcSQLXML = {
    val __obj = js.Dynamic.literal(free = js.Any.fromFunction0(free), getString = js.Any.fromFunction0(getString), setString = js.Any.fromFunction1(setString))
  
    __obj.asInstanceOf[JdbcSQLXML]
  }
}

