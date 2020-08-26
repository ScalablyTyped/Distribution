package typings.diagnosticChannelPublishers.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Connection extends js.Object {
  var _connection: js.UndefOr[Config] = js.native
  var sql: js.UndefOr[String] = js.native
}

object Connection {
  @scala.inline
  def apply(): Connection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Connection]
  }
  @scala.inline
  implicit class ConnectionOps[Self <: Connection] (val x: Self) extends AnyVal {
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
    def set_connection(value: Config): Self = this.set("_connection", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_connection: Self = this.set("_connection", js.undefined)
    @scala.inline
    def setSql(value: String): Self = this.set("sql", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSql: Self = this.set("sql", js.undefined)
  }
  
}

