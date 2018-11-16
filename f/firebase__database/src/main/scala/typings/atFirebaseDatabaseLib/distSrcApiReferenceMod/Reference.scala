package typings
package atFirebaseDatabaseLib.distSrcApiReferenceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/database/dist/src/api/Reference", "Reference")
@js.native
class Reference protected ()
  extends atFirebaseDatabaseLib.distSrcApiQueryMod.Query {
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
  def this(repo: atFirebaseDatabaseLib.distSrcCoreRepoMod.Repo, path: atFirebaseDatabaseLib.distSrcCoreUtilPathMod.Path) = this()
  val database: atFirebaseDatabaseLib.distSrcApiDatabaseMod.Database = js.native
  val key: java.lang.String | scala.Null = js.native
  val parent: Reference | scala.Null = js.native
  val root: Reference = js.native
  def `catch`(): stdLib.Promise[_] = js.native
  def `catch`(a: stdLib.Error): stdLib.Promise[_] = js.native
  /**
       * @param {!(string|Path)} pathString
       * @return {!Reference}
       */
  def child(pathString: atFirebaseDatabaseLib.distSrcCoreUtilPathMod.Path): Reference = js.native
  /**
       * @param {!(string|Path)} pathString
       * @return {!Reference}
       */
  def child(pathString: java.lang.String): Reference = js.native
  /** @return {!Database} */
  def databaseProp(): atFirebaseDatabaseLib.distSrcApiDatabaseMod.Database = js.native
  /** @return {?string} */
  def getKey(): java.lang.String | scala.Null = js.native
  /** @return {?Reference} */
  def getParent(): Reference | scala.Null = js.native
  /** @return {!Reference} */
  def getRoot(): Reference = js.native
  /**
       * @return {!OnDisconnect}
       */
  def onDisconnect(): atFirebaseDatabaseLib.distSrcApiOnDisconnectMod.OnDisconnect = js.native
  /**
       * @param {*=} value
       * @param {function(?Error)=} onComplete
       * @return {!Reference}
       */
  def push(): Reference = js.native
  /**
       * @param {*=} value
       * @param {function(?Error)=} onComplete
       * @return {!Reference}
       */
  def push(value: js.Any): Reference = js.native
  /**
       * @param {*=} value
       * @param {function(?Error)=} onComplete
       * @return {!Reference}
       */
  def push(value: js.Any, onComplete: js.Function1[/* a */ stdLib.Error | scala.Null, scala.Unit]): Reference = js.native
  /**
       * @param {function(?Error)=} onComplete
       * @return {!Promise}
       */
  def remove(): stdLib.Promise[_] = js.native
  /**
       * @param {function(?Error)=} onComplete
       * @return {!Promise}
       */
  def remove(onComplete: js.Function1[/* a */ stdLib.Error | scala.Null, scala.Unit]): stdLib.Promise[_] = js.native
  /**
       * @param {*} newVal
       * @param {function(?Error)=} onComplete
       * @return {!Promise}
       */
  def set(newVal: js.Any): stdLib.Promise[_] = js.native
  /**
       * @param {*} newVal
       * @param {function(?Error)=} onComplete
       * @return {!Promise}
       */
  def set(newVal: js.Any, onComplete: js.Function1[/* a */ stdLib.Error | scala.Null, scala.Unit]): stdLib.Promise[_] = js.native
  /**
       * @param {string|number|null} priority
       * @param {function(?Error)=} onComplete
       * @return {!Promise}
       */
  def setPriority(): stdLib.Promise[_] = js.native
  /**
       * @param {string|number|null} priority
       * @param {function(?Error)=} onComplete
       * @return {!Promise}
       */
  def setPriority(priority: java.lang.String): stdLib.Promise[_] = js.native
  /**
       * @param {string|number|null} priority
       * @param {function(?Error)=} onComplete
       * @return {!Promise}
       */
  def setPriority(
    priority: java.lang.String,
    onComplete: js.Function1[/* a */ stdLib.Error | scala.Null, scala.Unit]
  ): stdLib.Promise[_] = js.native
  /**
       * @param {string|number|null} priority
       * @param {function(?Error)=} onComplete
       * @return {!Promise}
       */
  def setPriority(priority: scala.Double): stdLib.Promise[_] = js.native
  /**
       * @param {string|number|null} priority
       * @param {function(?Error)=} onComplete
       * @return {!Promise}
       */
  def setPriority(priority: scala.Double, onComplete: js.Function1[/* a */ stdLib.Error | scala.Null, scala.Unit]): stdLib.Promise[_] = js.native
  /**
       * @param {string|number|null} priority
       * @param {function(?Error)=} onComplete
       * @return {!Promise}
       */
  def setPriority(priority: scala.Null, onComplete: js.Function1[/* a */ stdLib.Error | scala.Null, scala.Unit]): stdLib.Promise[_] = js.native
  /**
       * @param {*} newVal
       * @param {string|number|null} newPriority
       * @param {function(?Error)=} onComplete
       * @return {!Promise}
       */
  def setWithPriority(newVal: js.Any): stdLib.Promise[_] = js.native
  /**
       * @param {*} newVal
       * @param {string|number|null} newPriority
       * @param {function(?Error)=} onComplete
       * @return {!Promise}
       */
  def setWithPriority(newVal: js.Any, newPriority: java.lang.String): stdLib.Promise[_] = js.native
  /**
       * @param {*} newVal
       * @param {string|number|null} newPriority
       * @param {function(?Error)=} onComplete
       * @return {!Promise}
       */
  def setWithPriority(
    newVal: js.Any,
    newPriority: java.lang.String,
    onComplete: js.Function1[/* a */ stdLib.Error | scala.Null, scala.Unit]
  ): stdLib.Promise[_] = js.native
  /**
       * @param {*} newVal
       * @param {string|number|null} newPriority
       * @param {function(?Error)=} onComplete
       * @return {!Promise}
       */
  def setWithPriority(newVal: js.Any, newPriority: scala.Double): stdLib.Promise[_] = js.native
  /**
       * @param {*} newVal
       * @param {string|number|null} newPriority
       * @param {function(?Error)=} onComplete
       * @return {!Promise}
       */
  def setWithPriority(
    newVal: js.Any,
    newPriority: scala.Double,
    onComplete: js.Function1[/* a */ stdLib.Error | scala.Null, scala.Unit]
  ): stdLib.Promise[_] = js.native
  /**
       * @param {*} newVal
       * @param {string|number|null} newPriority
       * @param {function(?Error)=} onComplete
       * @return {!Promise}
       */
  def setWithPriority(
    newVal: js.Any,
    newPriority: scala.Null,
    onComplete: js.Function1[/* a */ stdLib.Error | scala.Null, scala.Unit]
  ): stdLib.Promise[_] = js.native
  def `then`(): stdLib.Promise[_] = js.native
  def `then`(a: js.Any): stdLib.Promise[_] = js.native
  /**
       * @param {function(*):*} transactionUpdate
       * @param {(function(?Error, boolean, ?DataSnapshot))=} onComplete
       * @param {boolean=} applyLocally
       * @return {!Promise}
       */
  def transaction(transactionUpdate: js.Function1[/* a */ js.Any, _]): stdLib.Promise[atFirebaseDatabaseLib.distSrcApiTransactionResultMod.TransactionResult] = js.native
  /**
       * @param {function(*):*} transactionUpdate
       * @param {(function(?Error, boolean, ?DataSnapshot))=} onComplete
       * @param {boolean=} applyLocally
       * @return {!Promise}
       */
  def transaction(
    transactionUpdate: js.Function1[/* a */ js.Any, _],
    onComplete: js.Function3[
      /* a */ stdLib.Error | scala.Null, 
      /* b */ scala.Boolean, 
      /* c */ atFirebaseDatabaseLib.distSrcApiDataSnapshotMod.DataSnapshot | scala.Null, 
      scala.Unit
    ]
  ): stdLib.Promise[atFirebaseDatabaseLib.distSrcApiTransactionResultMod.TransactionResult] = js.native
  /**
       * @param {function(*):*} transactionUpdate
       * @param {(function(?Error, boolean, ?DataSnapshot))=} onComplete
       * @param {boolean=} applyLocally
       * @return {!Promise}
       */
  def transaction(
    transactionUpdate: js.Function1[/* a */ js.Any, _],
    onComplete: js.Function3[
      /* a */ stdLib.Error | scala.Null, 
      /* b */ scala.Boolean, 
      /* c */ atFirebaseDatabaseLib.distSrcApiDataSnapshotMod.DataSnapshot | scala.Null, 
      scala.Unit
    ],
    applyLocally: scala.Boolean
  ): stdLib.Promise[atFirebaseDatabaseLib.distSrcApiTransactionResultMod.TransactionResult] = js.native
  /**
       * @param {!Object} objectToMerge
       * @param {function(?Error)=} onComplete
       * @return {!Promise}
       */
  def update(objectToMerge: js.Object): stdLib.Promise[_] = js.native
  /**
       * @param {!Object} objectToMerge
       * @param {function(?Error)=} onComplete
       * @return {!Promise}
       */
  def update(objectToMerge: js.Object, onComplete: js.Function1[/* a */ stdLib.Error | scala.Null, scala.Unit]): stdLib.Promise[_] = js.native
}

