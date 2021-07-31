package typings.firebaseUtil

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deferredMod {
  
  @JSImport("@firebase/util/dist/src/deferred", "Deferred")
  @js.native
  class Deferred[R] () extends StObject {
    
    var promise: js.Promise[R] = js.native
    
    def reject(): Unit = js.native
    def reject(value: js.Any): Unit = js.native
    
    def resolve(): Unit = js.native
    def resolve(value: js.Any): Unit = js.native
    
    /**
      * Our API internals are not promiseified and cannot because our callback APIs have subtle expectations around
      * invoking promises inline, which Promises are forbidden to do. This method accepts an optional node-style callback
      * and returns a node-style callback which will resolve or reject the Deferred's promise.
      */
    def wrapCallback(): js.Function2[/* error */ js.Any, /* value */ js.UndefOr[js.Any], Unit] = js.native
    def wrapCallback(callback: js.Function2[/* error */ js.UndefOr[js.Any], /* value */ js.UndefOr[js.Any], Unit]): js.Function2[/* error */ js.Any, /* value */ js.UndefOr[js.Any], Unit] = js.native
  }
}
