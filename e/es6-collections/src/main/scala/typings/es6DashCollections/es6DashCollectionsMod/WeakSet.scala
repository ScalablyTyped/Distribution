package typings.es6DashCollections.es6DashCollectionsMod

import typings.es6DashCollections.ForEachable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("es6-collections", "WeakSet")
@js.native
class WeakSet[T] ()
  extends typings.es6DashCollections.WeakSet[T] {
  def this(iterable: ForEachable[T]) = this()
  /* CompleteClass */
  override def add(value: T): typings.es6DashCollections.WeakSet[T] = js.native
  /* CompleteClass */
  override def clear(): Unit = js.native
  /* CompleteClass */
  override def delete(value: T): Boolean = js.native
  /* CompleteClass */
  override def has(value: T): Boolean = js.native
}

