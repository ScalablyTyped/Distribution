package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.JDBCNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JdbcRowId extends js.Object {
  def getBytes(): js.Array[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Byte]
}

object JdbcRowId {
  @scala.inline
  def apply(getBytes: js.Function0[js.Array[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Byte]]): JdbcRowId = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getBytes")(getBytes)
    __obj.asInstanceOf[JdbcRowId]
  }
}

