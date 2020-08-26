package typings.googleAppsScript.GoogleAppsScript.JDBC

import typings.googleAppsScript.GoogleAppsScript.Byte
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A JDBC RowId. For documentation of this class, see java.sql.RowId
  * .
  */
@js.native
trait JdbcRowId extends js.Object {
  def getBytes(): js.Array[Byte] = js.native
}

object JdbcRowId {
  @scala.inline
  def apply(getBytes: () => js.Array[Byte]): JdbcRowId = {
    val __obj = js.Dynamic.literal(getBytes = js.Any.fromFunction0(getBytes))
    __obj.asInstanceOf[JdbcRowId]
  }
  @scala.inline
  implicit class JdbcRowIdOps[Self <: JdbcRowId] (val x: Self) extends AnyVal {
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
    def setGetBytes(value: () => js.Array[Byte]): Self = this.set("getBytes", js.Any.fromFunction0(value))
  }
  
}

