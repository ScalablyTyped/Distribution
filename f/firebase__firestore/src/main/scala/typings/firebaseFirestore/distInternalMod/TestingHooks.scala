package typings.firebaseFirestore.distInternalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/firestore/dist/internal", "_TestingHooks")
@js.native
/* private */ open class TestingHooks () extends StObject {
  
  /**
    * Invokes all currently-registered `onExistenceFilterMismatch` callbacks.
    * @param info Information about the existence filter mismatch.
    */
  def notifyOnExistenceFilterMismatch(info: ExistenceFilterMismatchInfo): Unit = js.native
  
  /**
    * Registers a callback to be notified when an existence filter mismatch
    * occurs in the Watch listen stream.
    *
    * The relative order in which callbacks are notified is unspecified; do not
    * rely on any particular ordering. If a given callback is registered multiple
    * times then it will be notified multiple times, once per registration.
    *
    * @param callback the callback to invoke upon existence filter mismatch.
    *
    * @return a function that, when called, unregisters the given callback; only
    * the first invocation of the returned function does anything; all subsequent
    * invocations do nothing.
    */
  def onExistenceFilterMismatch(callback: ExistenceFilterMismatchCallback): js.Function0[Unit] = js.native
  
  /* private */ val onExistenceFilterMismatchCallbacks: Any = js.native
}
/* static members */
object TestingHooks {
  
  @JSImport("@firebase/firestore/dist/internal", "_TestingHooks")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Returns the singleton instance of this class, creating it if is has never
    * been created before.
    */
  inline def getOrCreateInstance(): TestingHooks = ^.asInstanceOf[js.Dynamic].applyDynamic("getOrCreateInstance")().asInstanceOf[TestingHooks]
}
