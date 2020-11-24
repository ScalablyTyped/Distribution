package typings.dexie.mod

import typings.dexie.dexieStrings.deleteRange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DBCoreDeleteRangeRequest extends DBCoreMutateRequest {
  
  var range: DBCoreKeyRange = js.native
  
  var trans: DBCoreTransaction = js.native
  
  var `type`: deleteRange = js.native
}
object DBCoreDeleteRangeRequest {
  
  @scala.inline
  def apply(range: DBCoreKeyRange, trans: DBCoreTransaction, `type`: deleteRange): DBCoreDeleteRangeRequest = {
    val __obj = js.Dynamic.literal(range = range.asInstanceOf[js.Any], trans = trans.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DBCoreDeleteRangeRequest]
  }
  
  @scala.inline
  implicit class DBCoreDeleteRangeRequestOps[Self <: DBCoreDeleteRangeRequest] (val x: Self) extends AnyVal {
    
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
    def setRange(value: DBCoreKeyRange): Self = this.set("range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrans(value: DBCoreTransaction): Self = this.set("trans", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: deleteRange): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
