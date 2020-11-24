package typings.dexieBatch.mod

import typings.dexie.mod.Dexie.Collection
import typings.dexie.mod.Dexie.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DexieBatch extends js.Object {
  
  def each[T](collection: Collection[T, _], callback: Callback[T]): Promise[Double] = js.native
  
  def eachBatch[T](collection: Collection[T, _], callback: Callback[js.Array[T]]): Promise[Double] = js.native
  
  def eachBatchParallel[T](collection: Collection[T, _], callback: Callback[js.Array[T]]): Promise[Double] = js.native
  
  def eachBatchSerial[T](collection: Collection[T, _], callback: Callback[js.Array[T]]): Promise[Double] = js.native
  def eachBatchSerial[T](collection: Collection[T, _], callback: Callback[js.Array[T]], batchIdx: Double): Promise[Double] = js.native
  
  def isParallel(): Boolean = js.native
  
  val opts: Options = js.native
}
