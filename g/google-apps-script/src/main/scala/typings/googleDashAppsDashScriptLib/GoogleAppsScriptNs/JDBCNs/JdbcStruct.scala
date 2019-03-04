package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.JDBCNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JdbcStruct extends js.Object {
  def getAttributes(): js.Array[js.Object]
  def getSQLTypeName(): java.lang.String
}

object JdbcStruct {
  @scala.inline
  def apply(getAttributes: js.Function0[js.Array[js.Object]], getSQLTypeName: js.Function0[java.lang.String]): JdbcStruct = {
    val __obj = js.Dynamic.literal(getAttributes = getAttributes, getSQLTypeName = getSQLTypeName)
  
    __obj.asInstanceOf[JdbcStruct]
  }
}

