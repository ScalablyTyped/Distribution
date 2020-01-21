package typings.firebaseFirestore.lruGarbageCollectorMod

import typings.firebaseFirestore.asyncQueueMod.AsyncQueue
import typings.firebaseFirestore.localStoreMod.LocalStore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/lib/src/local/lru_garbage_collector", "LruScheduler")
@js.native
class LruScheduler protected () extends js.Object {
  def this(garbageCollector: LruGarbageCollector, asyncQueue: AsyncQueue, localStore: LocalStore) = this()
  val asyncQueue: js.Any = js.native
  val garbageCollector: js.Any = js.native
  var gcTask: js.Any = js.native
  var hasRun: js.Any = js.native
  val localStore: js.Any = js.native
  var scheduleGC: js.Any = js.native
  def start(): Unit = js.native
  def started(): Boolean = js.native
  def stop(): Unit = js.native
}

