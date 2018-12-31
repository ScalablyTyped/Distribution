package typings
package atFirebaseDatabaseLib.distSrcApiOnDisconnectMod

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
  def this(`repo_`: atFirebaseDatabaseLib.distSrcCoreRepoMod.Repo, `path_`: atFirebaseDatabaseLib.distSrcCoreUtilPathMod.Path) = this()
  var `path_`: js.Any = js.native
  var `repo_`: js.Any = js.native
  /**
    * @param {function(?Error)=} onComplete
    * @return {!firebase.Promise}
    */
  def cancel(): js.Promise[scala.Unit] = js.native
  def cancel(onComplete: js.Function1[/* a */ stdLib.Error | scala.Null, scala.Unit]): js.Promise[scala.Unit] = js.native
  /**
    * @param {function(?Error)=} onComplete
    * @return {!firebase.Promise}
    */
  def remove(): js.Promise[scala.Unit] = js.native
  def remove(onComplete: js.Function1[/* a */ stdLib.Error | scala.Null, scala.Unit]): js.Promise[scala.Unit] = js.native
  /**
    * @param {*} value
    * @param {function(?Error)=} onComplete
    * @return {!firebase.Promise}
    */
  def set(value: js.Any): js.Promise[scala.Unit] = js.native
  def set(value: js.Any, onComplete: js.Function1[/* a */ stdLib.Error | scala.Null, scala.Unit]): js.Promise[scala.Unit] = js.native
  def setWithPriority(value: js.Any): js.Promise[scala.Unit] = js.native
  def setWithPriority(value: js.Any, priority: java.lang.String): js.Promise[scala.Unit] = js.native
  def setWithPriority(
    value: js.Any,
    priority: java.lang.String,
    onComplete: js.Function1[/* a */ stdLib.Error | scala.Null, scala.Unit]
  ): js.Promise[scala.Unit] = js.native
  /**
    * @param {*} value
    * @param {number|string|null} priority
    * @param {function(?Error)=} onComplete
    * @return {!firebase.Promise}
    */
  def setWithPriority(value: js.Any, priority: scala.Double): js.Promise[scala.Unit] = js.native
  def setWithPriority(
    value: js.Any,
    priority: scala.Double,
    onComplete: js.Function1[/* a */ stdLib.Error | scala.Null, scala.Unit]
  ): js.Promise[scala.Unit] = js.native
  def setWithPriority(
    value: js.Any,
    priority: scala.Null,
    onComplete: js.Function1[/* a */ stdLib.Error | scala.Null, scala.Unit]
  ): js.Promise[scala.Unit] = js.native
  /**
    * @param {!Object} objectToMerge
    * @param {function(?Error)=} onComplete
    * @return {!firebase.Promise}
    */
  def update(objectToMerge: js.Object): js.Promise[scala.Unit] = js.native
  def update(objectToMerge: js.Object, onComplete: js.Function1[/* a */ stdLib.Error | scala.Null, scala.Unit]): js.Promise[scala.Unit] = js.native
}

