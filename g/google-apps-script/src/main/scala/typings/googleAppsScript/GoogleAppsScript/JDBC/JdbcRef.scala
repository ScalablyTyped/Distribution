package typings.googleAppsScript.GoogleAppsScript.JDBC

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A JDBC Ref. For documentation of this class, see java.sql.Ref.
  */
trait JdbcRef extends js.Object {
  def getBaseTypeName(): String
  def getObject(): js.Any
  def setObject(`object`: js.Any): Unit
}

object JdbcRef {
  @scala.inline
  def apply(getBaseTypeName: () => String, getObject: () => js.Any, setObject: js.Any => Unit): JdbcRef = {
    val __obj = js.Dynamic.literal(getBaseTypeName = js.Any.fromFunction0(getBaseTypeName), getObject = js.Any.fromFunction0(getObject), setObject = js.Any.fromFunction1(setObject))
  
    __obj.asInstanceOf[JdbcRef]
  }
}

