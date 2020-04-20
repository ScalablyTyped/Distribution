package typings.googleAppsScript.GoogleAppsScript.JDBC

import typings.googleAppsScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A JDBC Savepoint. For documentation of this class, see java.sql.Savepoint
  * .
  */
trait JdbcSavepoint extends js.Object {
  def getSavepointId(): Integer
  def getSavepointName(): String
}

object JdbcSavepoint {
  @scala.inline
  def apply(getSavepointId: () => Integer, getSavepointName: () => String): JdbcSavepoint = {
    val __obj = js.Dynamic.literal(getSavepointId = js.Any.fromFunction0(getSavepointId), getSavepointName = js.Any.fromFunction0(getSavepointName))
    __obj.asInstanceOf[JdbcSavepoint]
  }
}

