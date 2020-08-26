package typings.gapiClientSpanner.gapi.client.spanner

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDatabaseDdlResponse extends js.Object {
  /**
    * A list of formatted DDL statements defining the schema of the database
    * specified in the request.
    */
  var statements: js.UndefOr[js.Array[String]] = js.native
}

object GetDatabaseDdlResponse {
  @scala.inline
  def apply(): GetDatabaseDdlResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDatabaseDdlResponse]
  }
  @scala.inline
  implicit class GetDatabaseDdlResponseOps[Self <: GetDatabaseDdlResponse] (val x: Self) extends AnyVal {
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
    def setStatementsVarargs(value: String*): Self = this.set("statements", js.Array(value :_*))
    @scala.inline
    def setStatements(value: js.Array[String]): Self = this.set("statements", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatements: Self = this.set("statements", js.undefined)
  }
  
}

