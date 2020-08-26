package typings.devtoolsProtocol.mod.Protocol.IndexedDB

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestDatabaseNamesResponse extends js.Object {
  /**
    * Database names for origin.
    */
  var databaseNames: js.Array[String] = js.native
}

object RequestDatabaseNamesResponse {
  @scala.inline
  def apply(databaseNames: js.Array[String]): RequestDatabaseNamesResponse = {
    val __obj = js.Dynamic.literal(databaseNames = databaseNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestDatabaseNamesResponse]
  }
  @scala.inline
  implicit class RequestDatabaseNamesResponseOps[Self <: RequestDatabaseNamesResponse] (val x: Self) extends AnyVal {
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
    def setDatabaseNamesVarargs(value: String*): Self = this.set("databaseNames", js.Array(value :_*))
    @scala.inline
    def setDatabaseNames(value: js.Array[String]): Self = this.set("databaseNames", value.asInstanceOf[js.Any])
  }
  
}

