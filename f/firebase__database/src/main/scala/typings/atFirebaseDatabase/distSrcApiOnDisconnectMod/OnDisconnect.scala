package typings.atFirebaseDatabase.distSrcApiOnDisconnectMod

import typings.atFirebaseDatabase.distSrcCoreRepoMod.Repo
import typings.atFirebaseDatabase.distSrcCoreUtilPathMod.Path
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/database/dist/src/api/onDisconnect", "OnDisconnect")
@js.native
class OnDisconnect protected () extends js.Object {
  /**
    * @param {!Repo} repo_
    * @param {!Path} path_
    */
  def this(repo_ : Repo, path_ : Path) = this()
  var path_ : js.Any = js.native
  var repo_ : js.Any = js.native
  /**
    * @param {function(?Error)=} onComplete
    * @return {!firebase.Promise}
    */
  def cancel(): js.Promise[Unit] = js.native
  def cancel(onComplete: js.Function1[/* a */ Error | Null, Unit]): js.Promise[Unit] = js.native
  /**
    * @param {function(?Error)=} onComplete
    * @return {!firebase.Promise}
    */
  def remove(): js.Promise[Unit] = js.native
  def remove(onComplete: js.Function1[/* a */ Error | Null, Unit]): js.Promise[Unit] = js.native
  /**
    * @param {*} value
    * @param {function(?Error)=} onComplete
    * @return {!firebase.Promise}
    */
  def set(value: js.Any): js.Promise[Unit] = js.native
  def set(value: js.Any, onComplete: js.Function1[/* a */ Error | Null, Unit]): js.Promise[Unit] = js.native
  def setWithPriority(value: js.Any): js.Promise[Unit] = js.native
  def setWithPriority(value: js.Any, priority: String): js.Promise[Unit] = js.native
  def setWithPriority(value: js.Any, priority: String, onComplete: js.Function1[/* a */ Error | Null, Unit]): js.Promise[Unit] = js.native
  /**
    * @param {*} value
    * @param {number|string|null} priority
    * @param {function(?Error)=} onComplete
    * @return {!firebase.Promise}
    */
  def setWithPriority(value: js.Any, priority: Double): js.Promise[Unit] = js.native
  def setWithPriority(value: js.Any, priority: Double, onComplete: js.Function1[/* a */ Error | Null, Unit]): js.Promise[Unit] = js.native
  def setWithPriority(value: js.Any, priority: Null, onComplete: js.Function1[/* a */ Error | Null, Unit]): js.Promise[Unit] = js.native
  /**
    * @param {!Object} objectToMerge
    * @param {function(?Error)=} onComplete
    * @return {!firebase.Promise}
    */
  def update(objectToMerge: js.Object): js.Promise[Unit] = js.native
  def update(objectToMerge: js.Object, onComplete: js.Function1[/* a */ Error | Null, Unit]): js.Promise[Unit] = js.native
}

