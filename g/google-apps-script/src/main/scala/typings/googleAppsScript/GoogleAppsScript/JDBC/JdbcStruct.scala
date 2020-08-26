package typings.googleAppsScript.GoogleAppsScript.JDBC

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A JDBC Struct. For documentation of this class, see java.sql.Struct
  * .
  */
@js.native
trait JdbcStruct extends js.Object {
  def getAttributes(): js.Array[_] = js.native
  def getSQLTypeName(): String = js.native
}

object JdbcStruct {
  @scala.inline
  def apply(getAttributes: () => js.Array[_], getSQLTypeName: () => String): JdbcStruct = {
    val __obj = js.Dynamic.literal(getAttributes = js.Any.fromFunction0(getAttributes), getSQLTypeName = js.Any.fromFunction0(getSQLTypeName))
    __obj.asInstanceOf[JdbcStruct]
  }
  @scala.inline
  implicit class JdbcStructOps[Self <: JdbcStruct] (val x: Self) extends AnyVal {
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
    def setGetAttributes(value: () => js.Array[_]): Self = this.set("getAttributes", js.Any.fromFunction0(value))
    @scala.inline
    def setGetSQLTypeName(value: () => String): Self = this.set("getSQLTypeName", js.Any.fromFunction0(value))
  }
  
}

