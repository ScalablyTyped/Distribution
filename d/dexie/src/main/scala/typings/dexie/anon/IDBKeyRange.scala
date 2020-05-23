package typings.dexie.anon

import typings.std.IDBFactory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDBKeyRange extends js.Object {
  var IDBKeyRange: typings.std.IDBKeyRange
  var indexedDB: IDBFactory
}

object IDBKeyRange {
  @scala.inline
  def apply(IDBKeyRange: typings.std.IDBKeyRange, indexedDB: IDBFactory): IDBKeyRange = {
    val __obj = js.Dynamic.literal(IDBKeyRange = IDBKeyRange.asInstanceOf[js.Any], indexedDB = indexedDB.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDBKeyRange]
  }
}

