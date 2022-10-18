package typings.firebaseFirestore

import typings.firebaseFirestore.distFirestoreSrcLocalLocalStoreMod.LocalStore
import typings.firebaseFirestore.distFirestoreSrcLocalLruGarbageCollectorMod.LruDelegate
import typings.firebaseFirestore.distFirestoreSrcLocalLruGarbageCollectorMod.LruGarbageCollector
import typings.firebaseFirestore.distFirestoreSrcLocalLruGarbageCollectorMod.LruParams
import typings.firebaseFirestore.distFirestoreSrcLocalPersistenceMod.Scheduler
import typings.firebaseFirestore.distFirestoreSrcUtilAsyncQueueMod.AsyncQueue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distFirestoreSrcLocalLruGarbageCollectorImplMod {
  
  @JSImport("@firebase/firestore/dist/firestore/src/local/lru_garbage_collector_impl", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@firebase/firestore/dist/firestore/src/local/lru_garbage_collector_impl", "LRU_MINIMUM_CACHE_SIZE_BYTES")
  @js.native
  val LRU_MINIMUM_CACHE_SIZE_BYTES: Double = js.native
  
  @JSImport("@firebase/firestore/dist/firestore/src/local/lru_garbage_collector_impl", "LruScheduler")
  @js.native
  open class LruScheduler protected ()
    extends StObject
       with Scheduler {
    def this(garbageCollector: LruGarbageCollector, asyncQueue: AsyncQueue, localStore: LocalStore) = this()
    
    /* private */ val asyncQueue: Any = js.native
    
    /* private */ val garbageCollector: Any = js.native
    
    /* private */ var gcTask: Any = js.native
    
    /* private */ val localStore: Any = js.native
    
    /* private */ var scheduleGC: Any = js.native
    
    /* CompleteClass */
    override def start(): Unit = js.native
    
    /* CompleteClass */
    override val started: Boolean = js.native
    @JSName("started")
    def started_MLruScheduler: Boolean = js.native
    
    /* CompleteClass */
    override def stop(): Unit = js.native
  }
  
  inline def newLruGarbageCollector(delegate: LruDelegate, params: LruParams): LruGarbageCollector = (^.asInstanceOf[js.Dynamic].applyDynamic("newLruGarbageCollector")(delegate.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[LruGarbageCollector]
}
