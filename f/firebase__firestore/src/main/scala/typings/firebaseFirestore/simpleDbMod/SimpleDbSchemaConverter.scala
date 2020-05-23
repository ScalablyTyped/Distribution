package typings.firebaseFirestore.simpleDbMod

import typings.firebaseFirestore.persistencePromiseMod.PersistencePromise
import typings.std.IDBDatabase
import typings.std.IDBTransaction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SimpleDbSchemaConverter extends js.Object {
  def createOrUpgrade(db: IDBDatabase, txn: IDBTransaction, fromVersion: Double, toVersion: Double): PersistencePromise[Unit]
}

object SimpleDbSchemaConverter {
  @scala.inline
  def apply(createOrUpgrade: (IDBDatabase, IDBTransaction, Double, Double) => PersistencePromise[Unit]): SimpleDbSchemaConverter = {
    val __obj = js.Dynamic.literal(createOrUpgrade = js.Any.fromFunction4(createOrUpgrade))
    __obj.asInstanceOf[SimpleDbSchemaConverter]
  }
}

