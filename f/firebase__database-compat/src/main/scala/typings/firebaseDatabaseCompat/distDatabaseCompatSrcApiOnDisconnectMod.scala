package typings.firebaseDatabaseCompat

import typings.firebaseDatabase.mod.OnDisconnect_
import typings.firebaseUtil.mod.Compat
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDatabaseCompatSrcApiOnDisconnectMod {
  
  @JSImport("@firebase/database-compat/dist/database-compat/src/api/onDisconnect", "OnDisconnect")
  @js.native
  open class OnDisconnect protected ()
    extends StObject
       with Compat[OnDisconnect_] {
    def this(_delegate: OnDisconnect_) = this()
    
    /* CompleteClass */
    var _delegate: OnDisconnect_ = js.native
    
    def cancel(): js.Promise[Unit] = js.native
    def cancel(onComplete: js.Function1[/* a */ js.Error | Null, Unit]): js.Promise[Unit] = js.native
    
    def remove(): js.Promise[Unit] = js.native
    def remove(onComplete: js.Function1[/* a */ js.Error | Null, Unit]): js.Promise[Unit] = js.native
    
    def set(value: Any): js.Promise[Unit] = js.native
    def set(value: Any, onComplete: js.Function1[/* a */ js.Error | Null, Unit]): js.Promise[Unit] = js.native
    
    def setWithPriority(value: Any): js.Promise[Unit] = js.native
    def setWithPriority(value: Any, priority: String): js.Promise[Unit] = js.native
    def setWithPriority(value: Any, priority: String, onComplete: js.Function1[/* a */ js.Error | Null, Unit]): js.Promise[Unit] = js.native
    def setWithPriority(value: Any, priority: Double): js.Promise[Unit] = js.native
    def setWithPriority(value: Any, priority: Double, onComplete: js.Function1[/* a */ js.Error | Null, Unit]): js.Promise[Unit] = js.native
    def setWithPriority(value: Any, priority: Null, onComplete: js.Function1[/* a */ js.Error | Null, Unit]): js.Promise[Unit] = js.native
    
    def update(objectToMerge: Record[String, Any]): js.Promise[Unit] = js.native
    def update(objectToMerge: Record[String, Any], onComplete: js.Function1[/* a */ js.Error | Null, Unit]): js.Promise[Unit] = js.native
  }
}
