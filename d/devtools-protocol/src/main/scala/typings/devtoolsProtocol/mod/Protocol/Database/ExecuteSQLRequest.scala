package typings.devtoolsProtocol.mod.Protocol.Database

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExecuteSQLRequest extends js.Object {
  var databaseId: DatabaseId = js.native
  var query: String = js.native
}

object ExecuteSQLRequest {
  @scala.inline
  def apply(databaseId: DatabaseId, query: String): ExecuteSQLRequest = {
    val __obj = js.Dynamic.literal(databaseId = databaseId.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecuteSQLRequest]
  }
  @scala.inline
  implicit class ExecuteSQLRequestOps[Self <: ExecuteSQLRequest] (val x: Self) extends AnyVal {
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
    def setDatabaseId(value: DatabaseId): Self = this.set("databaseId", value.asInstanceOf[js.Any])
    @scala.inline
    def setQuery(value: String): Self = this.set("query", value.asInstanceOf[js.Any])
  }
  
}

