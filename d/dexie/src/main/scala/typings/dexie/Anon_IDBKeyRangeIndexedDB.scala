package typings.dexie

import typings.std.IDBFactory
import typings.std.IDBKeyRange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IDBKeyRangeIndexedDB extends js.Object {
  var IDBKeyRange: typings.std.IDBKeyRange
  var indexedDB: IDBFactory
}

object Anon_IDBKeyRangeIndexedDB {
  @scala.inline
  def apply(IDBKeyRange: IDBKeyRange, indexedDB: IDBFactory): Anon_IDBKeyRangeIndexedDB = {
    val __obj = js.Dynamic.literal(IDBKeyRange = IDBKeyRange, indexedDB = indexedDB)
  
    __obj.asInstanceOf[Anon_IDBKeyRangeIndexedDB]
  }
}

