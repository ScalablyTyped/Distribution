package typings.googleAppsScript.GoogleAppsScript.JDBC

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A JDBC SQLXML. For documentation of this class, see java.sql.SQLXML
  * .
  */
@js.native
trait JdbcSQLXML extends js.Object {
  def free(): Unit = js.native
  def getString(): String = js.native
  def setString(value: String): Unit = js.native
}

object JdbcSQLXML {
  @scala.inline
  def apply(free: () => Unit, getString: () => String, setString: String => Unit): JdbcSQLXML = {
    val __obj = js.Dynamic.literal(free = js.Any.fromFunction0(free), getString = js.Any.fromFunction0(getString), setString = js.Any.fromFunction1(setString))
    __obj.asInstanceOf[JdbcSQLXML]
  }
  @scala.inline
  implicit class JdbcSQLXMLOps[Self <: JdbcSQLXML] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFree(value: () => Unit): Self = this.set("free", js.Any.fromFunction0(value))
    @scala.inline
    def setGetString(value: () => String): Self = this.set("getString", js.Any.fromFunction0(value))
    @scala.inline
    def setSetString(value: String => Unit): Self = this.set("setString", js.Any.fromFunction1(value))
  }
  
}

