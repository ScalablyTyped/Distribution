package typings.firebaseFirestore.localLruGarbageCollectorMod

import typings.firebaseFirestore.firebaseFirestoreNumbers.`-1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/src/local/lru_garbage_collector", "LruParams")
@js.native
class LruParams protected () extends js.Object {
  def this(
    cacheSizeCollectionThreshold: Double,
    percentileToCollect: Double,
    maximumSequenceNumbersToCollect: Double
  ) = this()
  val cacheSizeCollectionThreshold: Double = js.native
  val maximumSequenceNumbersToCollect: Double = js.native
  val percentileToCollect: Double = js.native
}

/* static members */
@JSImport("@firebase/firestore/dist/src/local/lru_garbage_collector", "LruParams")
@js.native
object LruParams extends js.Object {
  val COLLECTION_DISABLED: `-1` = js.native
  val DEFAULT: LruParams = js.native
  val DEFAULT_CACHE_SIZE_BYTES: Double = js.native
  val DEFAULT_COLLECTION_PERCENTILE: js.Any = js.native
  val DEFAULT_MAX_SEQUENCE_NUMBERS_TO_COLLECT: js.Any = js.native
  val DISABLED: LruParams = js.native
  val MINIMUM_CACHE_SIZE_BYTES: Double = js.native
  def withCacheSize(cacheSize: Double): LruParams = js.native
}

