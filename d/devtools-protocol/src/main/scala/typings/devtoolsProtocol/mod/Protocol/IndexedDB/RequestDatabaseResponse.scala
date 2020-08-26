package typings.devtoolsProtocol.mod.Protocol.IndexedDB

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestDatabaseResponse extends js.Object {
  /**
    * Database with an array of object stores.
    */
  var databaseWithObjectStores: DatabaseWithObjectStores = js.native
}

object RequestDatabaseResponse {
  @scala.inline
  def apply(databaseWithObjectStores: DatabaseWithObjectStores): RequestDatabaseResponse = {
    val __obj = js.Dynamic.literal(databaseWithObjectStores = databaseWithObjectStores.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestDatabaseResponse]
  }
  @scala.inline
  implicit class RequestDatabaseResponseOps[Self <: RequestDatabaseResponse] (val x: Self) extends AnyVal {
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
    def setDatabaseWithObjectStores(value: DatabaseWithObjectStores): Self = this.set("databaseWithObjectStores", value.asInstanceOf[js.Any])
  }
  
}

