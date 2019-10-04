package typings.expoDashSqlite.buildSQLiteDotTypesMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResultSetError extends js.Object {
  var error: Error
}

object ResultSetError {
  @scala.inline
  def apply(error: Error): ResultSetError = {
    val __obj = js.Dynamic.literal(error = error)
  
    __obj.asInstanceOf[ResultSetError]
  }
}

