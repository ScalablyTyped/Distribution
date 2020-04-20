package typings.dexie

import typings.std.IDBFactory
import typings.std.IDBKeyRange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIDBKeyRange extends js.Object {
  var IDBKeyRange: typings.std.IDBKeyRange
  var indexedDB: IDBFactory
}

object AnonIDBKeyRange {
  @scala.inline
  def apply(IDBKeyRange: IDBKeyRange, indexedDB: IDBFactory): AnonIDBKeyRange = {
    val __obj = js.Dynamic.literal(IDBKeyRange = IDBKeyRange.asInstanceOf[js.Any], indexedDB = indexedDB.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIDBKeyRange]
  }
}

