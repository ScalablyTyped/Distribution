package typings.dexie.mod

import typings.dexie.dexieStrings.delete
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DBCoreDeleteRequest extends DBCoreMutateRequest {
  var keys: js.Array[_] = js.native
  var trans: DBCoreTransaction = js.native
  var `type`: delete = js.native
}

object DBCoreDeleteRequest {
  @scala.inline
  def apply(keys: js.Array[_], trans: DBCoreTransaction, `type`: delete): DBCoreDeleteRequest = {
    val __obj = js.Dynamic.literal(keys = keys.asInstanceOf[js.Any], trans = trans.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DBCoreDeleteRequest]
  }
  @scala.inline
  implicit class DBCoreDeleteRequestOps[Self <: DBCoreDeleteRequest] (val x: Self) extends AnyVal {
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
    def setKeysVarargs(value: js.Any*): Self = this.set("keys", js.Array(value :_*))
    @scala.inline
    def setKeys(value: js.Array[_]): Self = this.set("keys", value.asInstanceOf[js.Any])
    @scala.inline
    def setTrans(value: DBCoreTransaction): Self = this.set("trans", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: delete): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

