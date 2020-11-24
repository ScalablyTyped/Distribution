package typings.firebaseDatabase

import typings.firebaseDatabase.miscMod.Indexable
import typings.firebaseDatabase.pathMod.Path
import typings.firebaseDatabase.repoMod.Repo
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/database/dist/src/api/onDisconnect", JSImport.Namespace)
@js.native
object onDisconnectMod extends js.Object {
  
  @js.native
  class OnDisconnect protected () extends js.Object {
    /**
      * @param {!Repo} repo_
      * @param {!Path} path_
      */
    def this(repo_ : Repo, path_ : Path) = this()
    
    /**
      * @param {function(?Error)=} onComplete
      * @return {!firebase.Promise}
      */
    def cancel(): js.Promise[Unit] = js.native
    def cancel(onComplete: js.Function1[/* a */ Error | Null, Unit]): js.Promise[Unit] = js.native
    
    var path_ : js.Any = js.native
    
    /**
      * @param {function(?Error)=} onComplete
      * @return {!firebase.Promise}
      */
    def remove(): js.Promise[Unit] = js.native
    def remove(onComplete: js.Function1[/* a */ Error | Null, Unit]): js.Promise[Unit] = js.native
    
    var repo_ : js.Any = js.native
    
    /**
      * @param {*} value
      * @param {function(?Error)=} onComplete
      * @return {!firebase.Promise}
      */
    def set(value: js.Any): js.Promise[Unit] = js.native
    def set(value: js.Any, onComplete: js.Function1[/* a */ Error | Null, Unit]): js.Promise[Unit] = js.native
    
    /**
      * @param {*} value
      * @param {number|string|null} priority
      * @param {function(?Error)=} onComplete
      * @return {!firebase.Promise}
      */
    def setWithPriority(value: js.Any): js.Promise[Unit] = js.native
    def setWithPriority(value: js.Any, priority: String): js.Promise[Unit] = js.native
    def setWithPriority(value: js.Any, priority: String, onComplete: js.Function1[/* a */ Error | Null, Unit]): js.Promise[Unit] = js.native
    def setWithPriority(value: js.Any, priority: Double): js.Promise[Unit] = js.native
    def setWithPriority(value: js.Any, priority: Double, onComplete: js.Function1[/* a */ Error | Null, Unit]): js.Promise[Unit] = js.native
    def setWithPriority(value: js.Any, priority: Null, onComplete: js.Function1[/* a */ Error | Null, Unit]): js.Promise[Unit] = js.native
    
    /**
      * @param {!Object} objectToMerge
      * @param {function(?Error)=} onComplete
      * @return {!firebase.Promise}
      */
    def update(objectToMerge: Indexable): js.Promise[Unit] = js.native
    def update(objectToMerge: Indexable, onComplete: js.Function1[/* a */ Error | Null, Unit]): js.Promise[Unit] = js.native
  }
}
