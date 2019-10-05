package typings.dexieDashBatch.dexieDashBatchMod

import typings.dexie.dexieMod.Dexie.Collection
import typings.dexie.dexieMod.Dexie.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DexieBatch extends js.Object {
  val opts: Options = js.native
  def each[T](collection: Collection[T, _], callback: Callback[T]): Promise[Double] = js.native
  def eachBatch[T](collection: Collection[T, _], callback: Callback[js.Array[T]]): Promise[Double] = js.native
  def eachBatchParallel[T](collection: Collection[T, _], callback: Callback[js.Array[T]]): Promise[Double] = js.native
  def eachBatchSerial[T](collection: Collection[T, _], callback: Callback[js.Array[T]]): Promise[Double] = js.native
  def eachBatchSerial[T](collection: Collection[T, _], callback: Callback[js.Array[T]], batchIdx: Double): Promise[Double] = js.native
  def isParallel(): Boolean = js.native
}

