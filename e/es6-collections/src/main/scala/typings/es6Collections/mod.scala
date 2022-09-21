package typings.es6Collections

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("es6-collections", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("es6-collections", "Map")
  @js.native
  open class Map[K, V] ()
    extends StObject
       with typings.es6Collections.Map[K, V] {
    def this(iterable: ForEachable[js.Tuple2[K, V]]) = this()
  }
  @JSImport("es6-collections", "Map")
  @js.native
  def Map: MapConstructor = js.native
  inline def Map_=(x: MapConstructor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Map")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("es6-collections", "Set")
  @js.native
  open class Set[T] ()
    extends StObject
       with typings.es6Collections.Set[T] {
    def this(iterable: ForEachable[T]) = this()
  }
  @JSImport("es6-collections", "Set")
  @js.native
  def Set: SetConstructor = js.native
  inline def Set_=(x: SetConstructor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Set")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("es6-collections", "WeakMap")
  @js.native
  open class WeakMap[K /* <: js.Object */, V] ()
    extends StObject
       with typings.es6Collections.WeakMap[K, V] {
    def this(iterable: ForEachable[js.Tuple2[K, V]]) = this()
  }
  @JSImport("es6-collections", "WeakMap")
  @js.native
  def WeakMap: WeakMapConstructor = js.native
  inline def WeakMap_=(x: WeakMapConstructor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WeakMap")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("es6-collections", "WeakSet")
  @js.native
  open class WeakSet[T] ()
    extends StObject
       with typings.es6Collections.WeakSet[T] {
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
  @JSImport("es6-collections", "WeakSet")
  @js.native
  def WeakSet: WeakSetConstructor = js.native
  inline def WeakSet_=(x: WeakSetConstructor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WeakSet")(x.asInstanceOf[js.Any])
}
