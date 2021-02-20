package typings.es6Shim

import typings.std.ArrayLike
import typings.std.PropertyDescriptor
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("es6-shim", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("es6-shim", "Array")
  @js.native
  def Array: ArrayConstructor = js.native
  @scala.inline
  def Array_=(x: ArrayConstructor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Array")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("es6-shim", "Map")
  @js.native
  class Map[K, V] ()
    extends typings.es6Shim.Map[K, V] {
    def this(iterable: IterableShim[js.Tuple2[K, V]]) = this()
  }
  @JSImport("es6-shim", "Map")
  @js.native
  def Map: MapConstructor = js.native
  @scala.inline
  def Map_=(x: MapConstructor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Map")(x.asInstanceOf[js.Any])
  
  @JSImport("es6-shim", "Math")
  @js.native
  def Math: typings.es6Shim.Math = js.native
  @scala.inline
  def Math_=(x: Math): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Math")(x.asInstanceOf[js.Any])
  
  @JSImport("es6-shim", "Number")
  @js.native
  def Number: NumberConstructor = js.native
  @scala.inline
  def Number_=(x: NumberConstructor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Number")(x.asInstanceOf[js.Any])
  
  @JSImport("es6-shim", "Object")
  @js.native
  def Object: ObjectConstructor = js.native
  @scala.inline
  def Object_=(x: ObjectConstructor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Object")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("es6-shim", "Promise")
  @js.native
  class Promise[T] protected ()
    extends typings.es6Shim.Promise[T] {
    /**
      * Creates a new Promise.
      * @param executor A callback used to initialize the promise. This callback is passed two arguments:
      * a resolve callback used to resolve the promise with a value or the result of another promise,
      * and a reject callback used to reject the promise with a provided reason or error.
      */
    def this(executor: js.Function2[
            /* resolve */ js.Function1[/* value */ js.UndefOr[T | PromiseLike[T]], Unit], 
            /* reject */ js.Function1[/* reason */ js.UndefOr[js.Any], Unit], 
            Unit
          ]) = this()
  }
  @JSImport("es6-shim", "Promise")
  @js.native
  def Promise: PromiseConstructor = js.native
  @scala.inline
  def Promise_=(x: PromiseConstructor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Promise")(x.asInstanceOf[js.Any])
  
  object Reflect {
    
    @JSImport("es6-shim", "Reflect.apply")
    @js.native
    def apply(target: js.Function, thisArgument: js.Any, argumentsList: ArrayLike[_]): js.Any = js.native
    
    @JSImport("es6-shim", "Reflect.construct")
    @js.native
    def construct(target: js.Function, argumentsList: ArrayLike[_]): js.Any = js.native
    
    @JSImport("es6-shim", "Reflect.defineProperty")
    @js.native
    def defineProperty(target: js.Any, propertyKey: PropertyKey, attributes: PropertyDescriptor): Boolean = js.native
    
    @JSImport("es6-shim", "Reflect.deleteProperty")
    @js.native
    def deleteProperty(target: js.Any, propertyKey: PropertyKey): Boolean = js.native
    
    @JSImport("es6-shim", "Reflect.enumerate")
    @js.native
    def enumerate(target: js.Any): Iterator[_] = js.native
    
    @JSImport("es6-shim", "Reflect.get")
    @js.native
    def get(target: js.Any, propertyKey: PropertyKey): js.Any = js.native
    @JSImport("es6-shim", "Reflect.get")
    @js.native
    def get(target: js.Any, propertyKey: PropertyKey, receiver: js.Any): js.Any = js.native
    
    @JSImport("es6-shim", "Reflect.getOwnPropertyDescriptor")
    @js.native
    def getOwnPropertyDescriptor(target: js.Any, propertyKey: PropertyKey): PropertyDescriptor = js.native
    
    @JSImport("es6-shim", "Reflect.getPrototypeOf")
    @js.native
    def getPrototypeOf(target: js.Any): js.Any = js.native
    
    @JSImport("es6-shim", "Reflect.has")
    @js.native
    def has(target: js.Any, propertyKey: PropertyKey): Boolean = js.native
    
    @JSImport("es6-shim", "Reflect.isExtensible")
    @js.native
    def isExtensible(target: js.Any): Boolean = js.native
    
    @JSImport("es6-shim", "Reflect.ownKeys")
    @js.native
    def ownKeys(target: js.Any): Array[PropertyKey] = js.native
    
    @JSImport("es6-shim", "Reflect.preventExtensions")
    @js.native
    def preventExtensions(target: js.Any): Boolean = js.native
    
    @JSImport("es6-shim", "Reflect.set")
    @js.native
    def set(target: js.Any, propertyKey: PropertyKey, value: js.Any): Boolean = js.native
    @JSImport("es6-shim", "Reflect.set")
    @js.native
    def set(target: js.Any, propertyKey: PropertyKey, value: js.Any, receiver: js.Any): Boolean = js.native
    
    @JSImport("es6-shim", "Reflect.setPrototypeOf")
    @js.native
    def setPrototypeOf(target: js.Any, proto: js.Any): Boolean = js.native
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("es6-shim", "Set")
  @js.native
  class Set[T] ()
    extends typings.es6Shim.Set[T] {
    def this(iterable: IterableShim[T]) = this()
  }
  @JSImport("es6-shim", "Set")
  @js.native
  def Set: SetConstructor = js.native
  @scala.inline
  def Set_=(x: SetConstructor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Set")(x.asInstanceOf[js.Any])
  
  @JSImport("es6-shim", "String")
  @js.native
  def String: StringConstructor = js.native
  @scala.inline
  def String_=(x: StringConstructor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("String")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("es6-shim", "WeakMap")
  @js.native
  class WeakMap[K /* <: js.Object */, V] ()
    extends typings.es6Shim.WeakMap[K, V] {
    def this(iterable: IterableShim[js.Tuple2[K, V]]) = this()
  }
  @JSImport("es6-shim", "WeakMap")
  @js.native
  def WeakMap: WeakMapConstructor = js.native
  @scala.inline
  def WeakMap_=(x: WeakMapConstructor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WeakMap")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("es6-shim", "WeakSet")
  @js.native
  class WeakSet[T] ()
    extends typings.es6Shim.WeakSet[T] {
    def this(iterable: IterableShim[T]) = this()
  }
  @JSImport("es6-shim", "WeakSet")
  @js.native
  def WeakSet: WeakSetConstructor = js.native
  @scala.inline
  def WeakSet_=(x: WeakSetConstructor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WeakSet")(x.asInstanceOf[js.Any])
}
