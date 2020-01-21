package typings.googleAppsScript.GoogleAppsScript.JDBC

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A JDBC Struct. For documentation of this class, see java.sql.Struct
  * .
  */
trait JdbcStruct extends js.Object {
  def getAttributes(): js.Array[_]
  def getSQLTypeName(): String
}

object JdbcStruct {
  @scala.inline
  def apply(getAttributes: () => js.Array[_], getSQLTypeName: () => String): JdbcStruct = {
    val __obj = js.Dynamic.literal(getAttributes = js.Any.fromFunction0(getAttributes), getSQLTypeName = js.Any.fromFunction0(getSQLTypeName))
  
    __obj.asInstanceOf[JdbcStruct]
  }
}

