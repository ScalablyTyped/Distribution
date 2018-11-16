package typings
package atFirebaseDatabaseLib.distSrcApiTransactionResultMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/database/dist/src/api/TransactionResult", "TransactionResult")
@js.native
class TransactionResult protected () extends js.Object {
  /**
       * A type for the resolve value of Firebase.transaction.
       * @constructor
       * @dict
       * @param {boolean} committed
       * @param {DataSnapshot} snapshot
       */
  def this(committed: scala.Boolean, snapshot: atFirebaseDatabaseLib.distSrcApiDataSnapshotMod.DataSnapshot) = this()
  var committed: scala.Boolean = js.native
  var snapshot: atFirebaseDatabaseLib.distSrcApiDataSnapshotMod.DataSnapshot = js.native
  def toJSON(): js.Object = js.native
}

