package typings.es6DashCollections.es6DashCollectionsMod

import typings.es6DashCollections.ForEachable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("es6-collections", "Set")
@js.native
class Set[T] ()
  extends typings.es6DashCollections.Set[T] {
  def this(iterable: ForEachable[T]) = this()
}

