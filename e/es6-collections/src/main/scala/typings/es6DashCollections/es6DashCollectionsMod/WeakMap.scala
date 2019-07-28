package typings.es6DashCollections.es6DashCollectionsMod

import typings.es6DashCollections.ForEachable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("es6-collections", "WeakMap")
@js.native
class WeakMap[K /* <: js.Object */, V] ()
  extends typings.es6DashCollections.WeakMap[K, V] {
  def this(iterable: ForEachable[js.Tuple2[K, V]]) = this()
}

