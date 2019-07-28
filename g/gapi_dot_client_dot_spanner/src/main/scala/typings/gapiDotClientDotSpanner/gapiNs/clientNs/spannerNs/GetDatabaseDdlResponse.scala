package typings.gapiDotClientDotSpanner.gapiNs.clientNs.spannerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetDatabaseDdlResponse extends js.Object {
  /**
    * A list of formatted DDL statements defining the schema of the database
    * specified in the request.
    */
  var statements: js.UndefOr[js.Array[String]] = js.undefined
}

object GetDatabaseDdlResponse {
  @scala.inline
  def apply(statements: js.Array[String] = null): GetDatabaseDdlResponse = {
    val __obj = js.Dynamic.literal()
    if (statements != null) __obj.updateDynamic("statements")(statements)
    __obj.asInstanceOf[GetDatabaseDdlResponse]
  }
}

