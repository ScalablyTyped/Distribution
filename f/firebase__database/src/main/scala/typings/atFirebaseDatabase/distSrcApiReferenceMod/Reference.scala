package typings.atFirebaseDatabase.distSrcApiReferenceMod

import typings.atFirebaseDatabase.distSrcApiDataSnapshotMod.DataSnapshot
import typings.atFirebaseDatabase.distSrcApiDatabaseMod.Database
import typings.atFirebaseDatabase.distSrcApiOnDisconnectMod.OnDisconnect
import typings.atFirebaseDatabase.distSrcApiQueryMod.Query
import typings.atFirebaseDatabase.distSrcApiTransactionResultMod.TransactionResult
import typings.atFirebaseDatabase.distSrcCoreRepoMod.Repo
import typings.atFirebaseDatabase.distSrcCoreUtilPathMod.Path
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/database/dist/src/api/Reference", "Reference")
@js.native
class Reference protected () extends Query {
  /**
    * Call options:
    *   new Reference(Repo, Path) or
    *   new Reference(url: string, string|RepoManager)
    *
    * Externally - this is the firebase.database.Reference type.
    *
    * @param {!Repo} repo
    * @param {(!Path)} path
    * @extends {Query}
    */
  def this(repo: Repo, path: Path) = this()
  val database: Database = js.native
  val key: String | Null = js.native
  val parent: Reference | Null = js.native
  val root: Reference = js.native
  def `catch`(): js.Promise[_] = js.native
  def `catch`(a: Error): js.Promise[_] = js.native
  /**
    * @param {!(string|Path)} pathString
    * @return {!Reference}
    */
  def child(pathString: String): Reference = js.native
  def child(pathString: Path): Reference = js.native
  /** @return {!Database} */
  def databaseProp(): Database = js.native
  /** @return {?string} */
  def getKey(): String | Null = js.native
  /** @return {?Reference} */
  def getParent(): Reference | Null = js.native
  /** @return {!Reference} */
  def getRoot(): Reference = js.native
  /**
    * @return {!OnDisconnect}
    */
  def onDisconnect(): OnDisconnect = js.native
  /**
    * @param {*=} value
    * @param {function(?Error)=} onComplete
    * @return {!Reference}
    */
  def push(): Reference = js.native
  def push(value: js.Any): Reference = js.native
  def push(value: js.Any, onComplete: js.Function1[/* a */ Error | Null, Unit]): Reference = js.native
  /**
    * @param {function(?Error)=} onComplete
    * @return {!Promise}
    */
  def remove(): js.Promise[_] = js.native
  def remove(onComplete: js.Function1[/* a */ Error | Null, Unit]): js.Promise[_] = js.native
  /**
    * @param {*} newVal
    * @param {function(?Error)=} onComplete
    * @return {!Promise}
    */
  def set(newVal: js.Any): js.Promise[_] = js.native
  def set(newVal: js.Any, onComplete: js.Function1[/* a */ Error | Null, Unit]): js.Promise[_] = js.native
  def setPriority(): js.Promise[_] = js.native
  /**
    * @param {string|number|null} priority
    * @param {function(?Error)=} onComplete
    * @return {!Promise}
    */
  def setPriority(priority: String): js.Promise[_] = js.native
  def setPriority(priority: String, onComplete: js.Function1[/* a */ Error | Null, Unit]): js.Promise[_] = js.native
  def setPriority(priority: Double): js.Promise[_] = js.native
  def setPriority(priority: Double, onComplete: js.Function1[/* a */ Error | Null, Unit]): js.Promise[_] = js.native
  def setPriority(priority: Null, onComplete: js.Function1[/* a */ Error | Null, Unit]): js.Promise[_] = js.native
  def setWithPriority(newVal: js.Any): js.Promise[_] = js.native
  /**
    * @param {*} newVal
    * @param {string|number|null} newPriority
    * @param {function(?Error)=} onComplete
    * @return {!Promise}
    */
  def setWithPriority(newVal: js.Any, newPriority: String): js.Promise[_] = js.native
  def setWithPriority(newVal: js.Any, newPriority: String, onComplete: js.Function1[/* a */ Error | Null, Unit]): js.Promise[_] = js.native
  def setWithPriority(newVal: js.Any, newPriority: Double): js.Promise[_] = js.native
  def setWithPriority(newVal: js.Any, newPriority: Double, onComplete: js.Function1[/* a */ Error | Null, Unit]): js.Promise[_] = js.native
  def setWithPriority(newVal: js.Any, newPriority: Null, onComplete: js.Function1[/* a */ Error | Null, Unit]): js.Promise[_] = js.native
  def `then`(): js.Promise[_] = js.native
  def `then`(a: js.Any): js.Promise[_] = js.native
  /**
    * @param {function(*):*} transactionUpdate
    * @param {(function(?Error, boolean, ?DataSnapshot))=} onComplete
    * @param {boolean=} applyLocally
    * @return {!Promise}
    */
  def transaction(transactionUpdate: js.Function1[/* a */ js.Any, _]): js.Promise[TransactionResult] = js.native
  def transaction(
    transactionUpdate: js.Function1[/* a */ js.Any, _],
    onComplete: js.Function3[/* a */ Error | Null, /* b */ Boolean, /* c */ DataSnapshot | Null, Unit]
  ): js.Promise[TransactionResult] = js.native
  def transaction(
    transactionUpdate: js.Function1[/* a */ js.Any, _],
    onComplete: js.Function3[/* a */ Error | Null, /* b */ Boolean, /* c */ DataSnapshot | Null, Unit],
    applyLocally: Boolean
  ): js.Promise[TransactionResult] = js.native
  /**
    * @param {!Object} objectToMerge
    * @param {function(?Error)=} onComplete
    * @return {!Promise}
    */
  def update(objectToMerge: js.Object): js.Promise[_] = js.native
  def update(objectToMerge: js.Object, onComplete: js.Function1[/* a */ Error | Null, Unit]): js.Promise[_] = js.native
}

