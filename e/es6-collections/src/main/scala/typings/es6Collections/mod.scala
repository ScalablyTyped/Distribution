package typings.es6Collections

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("es6-collections", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class Map[K, V] ()
    extends typings.es6Collections.Map[K, V] {
    def this(iterable: ForEachable[js.Tuple2[K, V]]) = this()
  }
  
  @js.native
  class Set[T] ()
    extends typings.es6Collections.Set[T] {
    def this(iterable: ForEachable[T]) = this()
  }
  
  @js.native
  class WeakMap[K /* <: js.Object */, V] ()
    extends typings.es6Collections.WeakMap[K, V] {
    def this(iterable: ForEachable[js.Tuple2[K, V]]) = this()
  }
  
  @js.native
  class WeakSet[T] ()
    extends typings.es6Collections.WeakSet[T] {
    def this(iterable: ForEachable[T]) = this()
    /* CompleteClass */
    override def add(value: T): typings.es6Collections.WeakSet[T] = js.native
    /* CompleteClass */
    override def clear(): Unit = js.native
    /* CompleteClass */
    override def delete(value: T): Boolean = js.native
    /* CompleteClass */
    override def has(value: T): Boolean = js.native
  }
  
  @js.native
  object Map extends TopLevel[MapConstructor]
  
  @js.native
  object Set extends TopLevel[SetConstructor]
  
  @js.native
  object WeakMap extends TopLevel[WeakMapConstructor]
  
  @js.native
  object WeakSet extends TopLevel[WeakSetConstructor]
  
}

