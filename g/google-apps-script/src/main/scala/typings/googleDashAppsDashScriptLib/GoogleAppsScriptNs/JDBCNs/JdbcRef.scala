package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.JDBCNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JdbcRef extends js.Object {
  def getBaseTypeName(): java.lang.String
  def getObject(): js.Any
  def setObject(`object`: js.Any): scala.Unit
}

object JdbcRef {
  @scala.inline
  def apply(getBaseTypeName: () => java.lang.String, getObject: () => js.Any, setObject: js.Any => scala.Unit): JdbcRef = {
    val __obj = js.Dynamic.literal(getBaseTypeName = js.Any.fromFunction0(getBaseTypeName), getObject = js.Any.fromFunction0(getObject), setObject = js.Any.fromFunction1(setObject))
  
    __obj.asInstanceOf[JdbcRef]
  }
}

