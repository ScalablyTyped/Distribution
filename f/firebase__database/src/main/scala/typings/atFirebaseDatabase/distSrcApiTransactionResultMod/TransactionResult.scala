package typings.atFirebaseDatabase.distSrcApiTransactionResultMod

import typings.atFirebaseDatabase.distSrcApiDataSnapshotMod.DataSnapshot
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
  def this(committed: Boolean, snapshot: DataSnapshot) = this()
  var committed: Boolean = js.native
  var snapshot: DataSnapshot = js.native
  def toJSON(): js.Object = js.native
}

