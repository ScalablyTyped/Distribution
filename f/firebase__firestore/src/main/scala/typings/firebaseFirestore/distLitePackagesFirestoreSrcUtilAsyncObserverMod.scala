package typings.firebaseFirestore

import typings.firebaseFirestore.distLitePackagesFirestoreSrcCoreEventManagerMod.Observer
import typings.firebaseFirestore.distLitePackagesFirestoreSrcUtilErrorMod.FirestoreError
import typings.firebaseFirestore.distLitePackagesFirestoreSrcUtilMiscMod.EventHandler
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLitePackagesFirestoreSrcUtilAsyncObserverMod {
  
  @JSImport("@firebase/firestore/dist/lite/packages/firestore/src/util/async_observer", "AsyncObserver")
  @js.native
  open class AsyncObserver[T] protected ()
    extends StObject
       with Observer[T] {
    def this(observer: Partial[Observer[T]]) = this()
    
    /* CompleteClass */
    override def error(value: FirestoreError): Unit = js.native
    /* CompleteClass */
    @JSName("error")
    var error_Original: EventHandler[FirestoreError] = js.native
    
    def mute(): Unit = js.native
    
    /**
      * When set to true, will not raise future events. Necessary to deal with
      * async detachment of listener.
      */
    /* private */ var muted: Any = js.native
    
    /* CompleteClass */
    override def next(value: T): Unit = js.native
    /* CompleteClass */
    @JSName("next")
    var next_Original: EventHandler[T] = js.native
    
    /* private */ var observer: Any = js.native
    
    /* private */ var scheduleEvent: Any = js.native
  }
}
