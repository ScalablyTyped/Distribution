package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.JDBCNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JdbcStruct extends js.Object {
  def getAttributes(): js.Array[_]
  def getSQLTypeName(): java.lang.String
}

object JdbcStruct {
  @scala.inline
  def apply(getAttributes: () => js.Array[_], getSQLTypeName: () => java.lang.String): JdbcStruct = {
    val __obj = js.Dynamic.literal(getAttributes = js.Any.fromFunction0(getAttributes), getSQLTypeName = js.Any.fromFunction0(getSQLTypeName))
  
    __obj.asInstanceOf[JdbcStruct]
  }
}

