package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.JDBCNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JdbcRef extends js.Object {
  def getBaseTypeName(): java.lang.String
  def getObject(): js.Object
  def setObject(`object`: js.Object): scala.Unit
}

object JdbcRef {
  @scala.inline
  def apply(
    getBaseTypeName: js.Function0[java.lang.String],
    getObject: js.Function0[js.Object],
    setObject: js.Function1[js.Object, scala.Unit]
  ): JdbcRef = {
    val __obj = js.Dynamic.literal(getBaseTypeName = getBaseTypeName, getObject = getObject, setObject = setObject)
  
    __obj.asInstanceOf[JdbcRef]
  }
}

