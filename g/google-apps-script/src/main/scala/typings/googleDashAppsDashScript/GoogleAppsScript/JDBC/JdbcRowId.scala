package typings.googleDashAppsDashScript.GoogleAppsScript.JDBC

import typings.googleDashAppsDashScript.GoogleAppsScript.Byte
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A JDBC RowId. For documentation of this class, see java.sql.RowId
  * .
  */
trait JdbcRowId extends js.Object {
  def getBytes(): js.Array[Byte]
}

object JdbcRowId {
  @scala.inline
  def apply(getBytes: () => js.Array[Byte]): JdbcRowId = {
    val __obj = js.Dynamic.literal(getBytes = js.Any.fromFunction0(getBytes))
  
    __obj.asInstanceOf[JdbcRowId]
  }
}

