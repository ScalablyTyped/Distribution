package typings.firebaseFirestore

import typings.firebaseFirestore.localLocalStoreMod.LocalStore
import typings.firebaseFirestore.localLruGarbageCollectorMod.LruDelegate
import typings.firebaseFirestore.localLruGarbageCollectorMod.LruGarbageCollector
import typings.firebaseFirestore.localLruGarbageCollectorMod.LruParams
import typings.firebaseFirestore.localPersistenceMod.Scheduler
import typings.firebaseFirestore.utilAsyncQueueMod.AsyncQueue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object localLruGarbageCollectorImplMod {
  
  @JSImport("@firebase/firestore/dist/lite/firestore/src/local/lru_garbage_collector_impl", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@firebase/firestore/dist/lite/firestore/src/local/lru_garbage_collector_impl", "LRU_MINIMUM_CACHE_SIZE_BYTES")
  @js.native
  val LRU_MINIMUM_CACHE_SIZE_BYTES: Double = js.native
  
  @JSImport("@firebase/firestore/dist/lite/firestore/src/local/lru_garbage_collector_impl", "LruScheduler")
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
