package typings
package es6DashCollectionsLib.es6DashCollectionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("es6-collections", "WeakSet")
@js.native
class WeakSet[T] ()
  extends es6DashCollectionsLib.WeakSet[T] {
  def this(iterable: es6DashCollectionsLib.ForEachable[T]) = this()
  /* CompleteClass */
  override def add(value: T): es6DashCollectionsLib.WeakSet[T] = js.native
  /* CompleteClass */
  override def clear(): scala.Unit = js.native
  /* CompleteClass */
  override def delete(value: T): scala.Boolean = js.native
  /* CompleteClass */
  override def has(value: T): scala.Boolean = js.native
}

