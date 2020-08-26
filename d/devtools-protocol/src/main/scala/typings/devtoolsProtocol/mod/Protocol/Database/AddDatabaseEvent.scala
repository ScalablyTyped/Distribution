package typings.devtoolsProtocol.mod.Protocol.Database

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddDatabaseEvent extends js.Object {
  var database: typings.devtoolsProtocol.mod.Protocol.Database.Database = js.native
}

object AddDatabaseEvent {
  @scala.inline
  def apply(database: typings.devtoolsProtocol.mod.Protocol.Database.Database): AddDatabaseEvent = {
    val __obj = js.Dynamic.literal(database = database.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddDatabaseEvent]
  }
  @scala.inline
  implicit class AddDatabaseEventOps[Self <: AddDatabaseEvent] (val x: Self) extends AnyVal {
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
    def setDatabase(value: typings.devtoolsProtocol.mod.Protocol.Database.Database): Self = this.set("database", value.asInstanceOf[js.Any])
  }
  
}

