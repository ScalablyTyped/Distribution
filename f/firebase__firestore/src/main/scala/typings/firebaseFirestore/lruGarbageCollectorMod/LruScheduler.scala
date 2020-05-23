package typings.firebaseFirestore.lruGarbageCollectorMod

import typings.firebaseFirestore.asyncQueueMod.AsyncQueue
import typings.firebaseFirestore.localStoreMod.LocalStore
import typings.firebaseFirestore.persistenceMod.GarbageCollectionScheduler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/packages/firestore/src/local/lru_garbage_collector", "LruScheduler")
@js.native
class LruScheduler protected () extends GarbageCollectionScheduler {
  def this(garbageCollector: LruGarbageCollector, asyncQueue: AsyncQueue) = this()
  val asyncQueue: js.Any = js.native
  val garbageCollector: js.Any = js.native
  var gcTask: js.Any = js.native
  var hasRun: js.Any = js.native
  var scheduleGC: js.Any = js.native
  /* CompleteClass */
  override val started: Boolean = js.native
  /* CompleteClass */
  override def start(localStore: LocalStore): Unit = js.native
  @JSName("started")
  def started_MLruScheduler: Boolean = js.native
  /* CompleteClass */
  override def stop(): Unit = js.native
}

