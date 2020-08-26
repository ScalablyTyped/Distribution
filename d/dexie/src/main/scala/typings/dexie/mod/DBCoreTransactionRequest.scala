package typings.dexie.mod

import typings.dexie.dexieStrings.readonly
import typings.dexie.dexieStrings.readwrite
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DBCoreTransactionRequest extends js.Object {
  var mode: readonly | readwrite = js.native
  var tables: js.Array[String] = js.native
}

object DBCoreTransactionRequest {
  @scala.inline
  def apply(mode: readonly | readwrite, tables: js.Array[String]): DBCoreTransactionRequest = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any], tables = tables.asInstanceOf[js.Any])
    __obj.asInstanceOf[DBCoreTransactionRequest]
  }
  @scala.inline
  implicit class DBCoreTransactionRequestOps[Self <: DBCoreTransactionRequest] (val x: Self) extends AnyVal {
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
    def setMode(value: readonly | readwrite): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def setTablesVarargs(value: String*): Self = this.set("tables", js.Array(value :_*))
    @scala.inline
    def setTables(value: js.Array[String]): Self = this.set("tables", value.asInstanceOf[js.Any])
  }
  
}

