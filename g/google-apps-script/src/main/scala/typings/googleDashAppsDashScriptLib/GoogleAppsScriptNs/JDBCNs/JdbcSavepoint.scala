package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.JDBCNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JdbcSavepoint extends js.Object {
  def getSavepointId(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  def getSavepointName(): java.lang.String
}

object JdbcSavepoint {
  @scala.inline
  def apply(
    getSavepointId: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    getSavepointName: () => java.lang.String
  ): JdbcSavepoint = {
    val __obj = js.Dynamic.literal(getSavepointId = js.Any.fromFunction0(getSavepointId), getSavepointName = js.Any.fromFunction0(getSavepointName))
  
    __obj.asInstanceOf[JdbcSavepoint]
  }
}

