package typings
package es6DashCollectionsLib.es6DashCollectionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("es6-collections", "WeakMap")
@js.native
class WeakMap[K /* <: js.Object */, V] ()
  extends es6DashCollectionsLib.WeakMap[K, V] {
  def this(iterable: es6DashCollectionsLib.ForEachable[js.Tuple2[K, V]]) = this()
}

