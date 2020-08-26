package typings.devtoolsProtocol.mod.Protocol.Database

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDatabaseTableNamesRequest extends js.Object {
  var databaseId: DatabaseId = js.native
}

object GetDatabaseTableNamesRequest {
  @scala.inline
  def apply(databaseId: DatabaseId): GetDatabaseTableNamesRequest = {
    val __obj = js.Dynamic.literal(databaseId = databaseId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDatabaseTableNamesRequest]
  }
  @scala.inline
  implicit class GetDatabaseTableNamesRequestOps[Self <: GetDatabaseTableNamesRequest] (val x: Self) extends AnyVal {
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
  }
  
}

