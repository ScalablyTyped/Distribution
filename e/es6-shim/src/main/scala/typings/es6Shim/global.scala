package typings.es6Shim

import typings.std.ArrayLike
import typings.std.PropertyDescriptor
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("Map")
  @js.native
  class Map[K, V] ()
    extends typings.es6Shim.Map[K, V] {
    def this(iterable: IterableShim[js.Tuple2[K, V]]) = this()
  }
  @JSGlobal("Map")
  @js.native
  def Map: MapConstructor = js.native
  @scala.inline
  def Map_=(x: MapConstructor): Unit = js.Dynamic.global.updateDynamic("Map")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("Promise")
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
  @JSGlobal("Promise")
  @js.native
  def Promise: PromiseConstructor = js.native
  @scala.inline
  def Promise_=(x: PromiseConstructor): Unit = js.Dynamic.global.updateDynamic("Promise")(x.asInstanceOf[js.Any])
  
  object Reflect {
    
    @JSGlobal("Reflect.apply")
    @js.native
    def apply(target: js.Function, thisArgument: js.Any, argumentsList: ArrayLike[_]): js.Any = js.native
    
    @JSGlobal("Reflect.construct")
    @js.native
    def construct(target: js.Function, argumentsList: ArrayLike[_]): js.Any = js.native
    
    @JSGlobal("Reflect.defineProperty")
    @js.native
    def defineProperty(target: js.Any, propertyKey: PropertyKey, attributes: PropertyDescriptor): Boolean = js.native
    
    @JSGlobal("Reflect.deleteProperty")
    @js.native
    def deleteProperty(target: js.Any, propertyKey: PropertyKey): Boolean = js.native
    
    @JSGlobal("Reflect.enumerate")
    @js.native
    def enumerate(target: js.Any): IterableIteratorShim[_] = js.native
    
    @JSGlobal("Reflect.get")
    @js.native
    def get(target: js.Any, propertyKey: PropertyKey): js.Any = js.native
    @JSGlobal("Reflect.get")
    @js.native
    def get(target: js.Any, propertyKey: PropertyKey, receiver: js.Any): js.Any = js.native
    
    @JSGlobal("Reflect.getOwnPropertyDescriptor")
    @js.native
    def getOwnPropertyDescriptor(target: js.Any, propertyKey: PropertyKey): PropertyDescriptor = js.native
    
    @JSGlobal("Reflect.getPrototypeOf")
    @js.native
    def getPrototypeOf(target: js.Any): js.Any = js.native
    
    @JSGlobal("Reflect.has")
    @js.native
    def has(target: js.Any, propertyKey: PropertyKey): Boolean = js.native
    
    @JSGlobal("Reflect.isExtensible")
    @js.native
    def isExtensible(target: js.Any): Boolean = js.native
    
    @JSGlobal("Reflect.ownKeys")
    @js.native
    def ownKeys(target: js.Any): Array[PropertyKey] = js.native
    
    @JSGlobal("Reflect.preventExtensions")
    @js.native
    def preventExtensions(target: js.Any): Boolean = js.native
    
    @JSGlobal("Reflect.set")
    @js.native
    def set(target: js.Any, propertyKey: PropertyKey, value: js.Any): Boolean = js.native
    @JSGlobal("Reflect.set")
    @js.native
    def set(target: js.Any, propertyKey: PropertyKey, value: js.Any, receiver: js.Any): Boolean = js.native
    
    @JSGlobal("Reflect.setPrototypeOf")
    @js.native
    def setPrototypeOf(target: js.Any, proto: js.Any): Boolean = js.native
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("Set")
  @js.native
  class Set[T] ()
    extends typings.es6Shim.Set[T] {
    def this(iterable: IterableShim[T]) = this()
  }
  @JSGlobal("Set")
  @js.native
  def Set: SetConstructor = js.native
  @scala.inline
  def Set_=(x: SetConstructor): Unit = js.Dynamic.global.updateDynamic("Set")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("WeakMap")
  @js.native
  class WeakMap[K /* <: js.Object */, V] ()
    extends typings.es6Shim.WeakMap[K, V] {
    def this(iterable: IterableShim[js.Tuple2[K, V]]) = this()
  }
  @JSGlobal("WeakMap")
  @js.native
  def WeakMap: WeakMapConstructor = js.native
  @scala.inline
  def WeakMap_=(x: WeakMapConstructor): Unit = js.Dynamic.global.updateDynamic("WeakMap")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("WeakSet")
  @js.native
  class WeakSet[T] ()
    extends typings.es6Shim.WeakSet[T] {
    def this(iterable: IterableShim[T]) = this()
  }
  @JSGlobal("WeakSet")
  @js.native
  def WeakSet: WeakSetConstructor = js.native
  @scala.inline
  def WeakSet_=(x: WeakSetConstructor): Unit = js.Dynamic.global.updateDynamic("WeakSet")(x.asInstanceOf[js.Any])
}
