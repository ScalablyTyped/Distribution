package typings.dexie.mod

import typings.dexie.dexieStrings.add
import typings.dexie.dexieStrings.delete
import typings.dexie.dexieStrings.deleteRange
import typings.dexie.dexieStrings.put
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.dexie.mod.DBCoreAddRequest
  - typings.dexie.mod.DBCorePutRequest
  - typings.dexie.mod.DBCoreDeleteRequest
  - typings.dexie.mod.DBCoreDeleteRangeRequest
*/
trait DBCoreMutateRequest extends js.Object

object DBCoreMutateRequest {
  @scala.inline
  def DBCoreAddRequest(trans: DBCoreTransaction, `type`: add, values: js.Array[_]): DBCoreMutateRequest = {
    val __obj = js.Dynamic.literal(trans = trans.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DBCoreMutateRequest]
  }
  @scala.inline
  def DBCorePutRequest(trans: DBCoreTransaction, `type`: put, values: js.Array[_]): DBCoreMutateRequest = {
    val __obj = js.Dynamic.literal(trans = trans.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DBCoreMutateRequest]
  }
  @scala.inline
  def DBCoreDeleteRequest(keys: js.Array[_], trans: DBCoreTransaction, `type`: delete): DBCoreMutateRequest = {
    val __obj = js.Dynamic.literal(keys = keys.asInstanceOf[js.Any], trans = trans.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DBCoreMutateRequest]
  }
  @scala.inline
  def DBCoreDeleteRangeRequest(range: DBCoreKeyRange, trans: DBCoreTransaction, `type`: deleteRange): DBCoreMutateRequest = {
    val __obj = js.Dynamic.literal(range = range.asInstanceOf[js.Any], trans = trans.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DBCoreMutateRequest]
  }
}

