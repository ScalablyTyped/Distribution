package typings.es6Collections

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("es6-collections", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("es6-collections", "Map")
  @js.native
  class Map[K, V] ()
    extends typings.es6Collections.Map[K, V] {
    def this(iterable: ForEachable[js.Tuple2[K, V]]) = this()
  }
  @JSImport("es6-collections", "Map")
  @js.native
  def Map: MapConstructor = js.native
  @scala.inline
  def Map_=(x: MapConstructor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Map")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("es6-collections", "Set")
  @js.native
  class Set[T] ()
    extends typings.es6Collections.Set[T] {
    def this(iterable: ForEachable[T]) = this()
  }
  @JSImport("es6-collections", "Set")
  @js.native
  def Set: SetConstructor = js.native
  @scala.inline
  def Set_=(x: SetConstructor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Set")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("es6-collections", "WeakMap")
  @js.native
  class WeakMap[K /* <: js.Object */, V] ()
    extends typings.es6Collections.WeakMap[K, V] {
    def this(iterable: ForEachable[js.Tuple2[K, V]]) = this()
  }
  @JSImport("es6-collections", "WeakMap")
  @js.native
  def WeakMap: WeakMapConstructor = js.native
  @scala.inline
  def WeakMap_=(x: WeakMapConstructor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WeakMap")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("es6-collections", "WeakSet")
  @js.native
  class WeakSet[T] ()
    extends typings.es6Collections.WeakSet[T] {
    def this(iterable: ForEachable[T]) = this()
  }
  @JSImport("es6-collections", "WeakSet")
  @js.native
  def WeakSet: WeakSetConstructor = js.native
  @scala.inline
  def WeakSet_=(x: WeakSetConstructor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WeakSet")(x.asInstanceOf[js.Any])
}
