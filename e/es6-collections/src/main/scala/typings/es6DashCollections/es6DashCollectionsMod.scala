package typings.es6DashCollections

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("es6-collections", JSImport.Namespace)
@js.native
object es6DashCollectionsMod extends js.Object {
  @js.native
  class Map[K, V] ()
    extends typings.es6DashCollections.Map[K, V] {
    def this(iterable: ForEachable[js.Tuple2[K, V]]) = this()
  }
  
  @js.native
  class Set[T] ()
    extends typings.es6DashCollections.Set[T] {
    def this(iterable: ForEachable[T]) = this()
  }
  
  @js.native
  class WeakMap[K /* <: js.Object */, V] ()
    extends typings.es6DashCollections.WeakMap[K, V] {
    def this(iterable: ForEachable[js.Tuple2[K, V]]) = this()
  }
  
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
  
  var Map: MapConstructor = js.native
  var Set: SetConstructor = js.native
  var WeakMap: WeakMapConstructor = js.native
  var WeakSet: WeakSetConstructor = js.native
}

