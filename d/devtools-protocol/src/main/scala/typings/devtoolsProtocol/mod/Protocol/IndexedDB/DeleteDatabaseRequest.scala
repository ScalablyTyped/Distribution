package typings.devtoolsProtocol.mod.Protocol.IndexedDB

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteDatabaseRequest extends js.Object {
  /**
    * Database name.
    */
  var databaseName: String = js.native
  /**
    * Security origin.
    */
  var securityOrigin: String = js.native
}

object DeleteDatabaseRequest {
  @scala.inline
  def apply(databaseName: String, securityOrigin: String): DeleteDatabaseRequest = {
    val __obj = js.Dynamic.literal(databaseName = databaseName.asInstanceOf[js.Any], securityOrigin = securityOrigin.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDatabaseRequest]
  }
  @scala.inline
  implicit class DeleteDatabaseRequestOps[Self <: DeleteDatabaseRequest] (val x: Self) extends AnyVal {
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
    def setDatabaseName(value: String): Self = this.set("databaseName", value.asInstanceOf[js.Any])
    @scala.inline
    def setSecurityOrigin(value: String): Self = this.set("securityOrigin", value.asInstanceOf[js.Any])
  }
  
}

