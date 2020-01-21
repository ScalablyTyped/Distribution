package typings.googleAppsScript.GoogleAppsScript.JDBC

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A JDBC SQLXML. For documentation of this class, see java.sql.SQLXML
  * .
  */
trait JdbcSQLXML extends js.Object {
  def free(): Unit
  def getString(): String
  def setString(value: String): Unit
}

object JdbcSQLXML {
  @scala.inline
  def apply(free: () => Unit, getString: () => String, setString: String => Unit): JdbcSQLXML = {
    val __obj = js.Dynamic.literal(free = js.Any.fromFunction0(free), getString = js.Any.fromFunction0(getString), setString = js.Any.fromFunction1(setString))
  
    __obj.asInstanceOf[JdbcSQLXML]
  }
}

