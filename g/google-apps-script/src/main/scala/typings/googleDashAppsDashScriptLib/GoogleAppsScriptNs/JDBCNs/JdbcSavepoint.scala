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
    getSavepointId: js.Function0[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer],
    getSavepointName: js.Function0[java.lang.String]
  ): JdbcSavepoint = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getSavepointId")(getSavepointId)
    __obj.updateDynamic("getSavepointName")(getSavepointName)
    __obj.asInstanceOf[JdbcSavepoint]
  }
}

