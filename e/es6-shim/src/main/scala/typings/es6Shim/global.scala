package typings.es6Shim

import typings.std.ArrayLike
import typings.std.PropertyDescriptor
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("Map")
  @js.native
  class Map[K, V] ()
    extends StObject
       with typings.es6Shim.Map[K, V] {
    def this(iterable: IterableShim[js.Tuple2[K, V]]) = this()
  }
  @JSGlobal("Map")
  @js.native
  def Map: MapConstructor = js.native
  inline def Map_=(x: MapConstructor): Unit = js.Dynamic.global.updateDynamic("Map")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("Promise")
  @js.native
  class Promise[T] protected ()
    extends StObject
       with typings.es6Shim.Promise[T] {
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
  inline def Promise_=(x: PromiseConstructor): Unit = js.Dynamic.global.updateDynamic("Promise")(x.asInstanceOf[js.Any])
  
  object Reflect {
    
    @JSGlobal("Reflect")
    @js.native
    val ^ : js.Any = js.native
    
    inline def apply(target: js.Function, thisArgument: js.Any, argumentsList: ArrayLike[js.Any]): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("apply")(target.asInstanceOf[js.Any], thisArgument.asInstanceOf[js.Any], argumentsList.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
    inline def construct(target: js.Function, argumentsList: ArrayLike[js.Any]): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("construct")(target.asInstanceOf[js.Any], argumentsList.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
    inline def defineProperty(target: js.Any, propertyKey: PropertyKey, attributes: PropertyDescriptor): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("defineProperty")(target.asInstanceOf[js.Any], propertyKey.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def deleteProperty(target: js.Any, propertyKey: PropertyKey): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("deleteProperty")(target.asInstanceOf[js.Any], propertyKey.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def enumerate(target: js.Any): IterableIteratorShim[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("enumerate")(target.asInstanceOf[js.Any]).asInstanceOf[IterableIteratorShim[js.Any]]
    
    inline def get(target: js.Any, propertyKey: PropertyKey): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(target.asInstanceOf[js.Any], propertyKey.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def get(target: js.Any, propertyKey: PropertyKey, receiver: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(target.asInstanceOf[js.Any], propertyKey.asInstanceOf[js.Any], receiver.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
    inline def getOwnPropertyDescriptor(target: js.Any, propertyKey: PropertyKey): PropertyDescriptor = (^.asInstanceOf[js.Dynamic].applyDynamic("getOwnPropertyDescriptor")(target.asInstanceOf[js.Any], propertyKey.asInstanceOf[js.Any])).asInstanceOf[PropertyDescriptor]
    
    inline def getPrototypeOf(target: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getPrototypeOf")(target.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    inline def has(target: js.Any, propertyKey: PropertyKey): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("has")(target.asInstanceOf[js.Any], propertyKey.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def isExtensible(target: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isExtensible")(target.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def ownKeys(target: js.Any): Array[PropertyKey] = ^.asInstanceOf[js.Dynamic].applyDynamic("ownKeys")(target.asInstanceOf[js.Any]).asInstanceOf[Array[PropertyKey]]
    
    inline def preventExtensions(target: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("preventExtensions")(target.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def set(target: js.Any, propertyKey: PropertyKey, value: js.Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(target.asInstanceOf[js.Any], propertyKey.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def set(target: js.Any, propertyKey: PropertyKey, value: js.Any, receiver: js.Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(target.asInstanceOf[js.Any], propertyKey.asInstanceOf[js.Any], value.asInstanceOf[js.Any], receiver.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def setPrototypeOf(target: js.Any, proto: js.Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("setPrototypeOf")(target.asInstanceOf[js.Any], proto.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("Set")
  @js.native
  class Set[T] ()
    extends StObject
       with typings.es6Shim.Set[T] {
    def this(iterable: IterableShim[T]) = this()
  }
  @JSGlobal("Set")
  @js.native
  def Set: SetConstructor = js.native
  inline def Set_=(x: SetConstructor): Unit = js.Dynamic.global.updateDynamic("Set")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("WeakMap")
  @js.native
  class WeakMap[K /* <: js.Object */, V] ()
    extends StObject
       with typings.es6Shim.WeakMap[K, V] {
    def this(iterable: IterableShim[js.Tuple2[K, V]]) = this()
    
    /* CompleteClass */
    override def delete(key: K): Boolean = js.native
    
    /* CompleteClass */
    override def get(key: K): js.UndefOr[V] = js.native
    
    /* CompleteClass */
    override def has(key: K): Boolean = js.native
    
    /* CompleteClass */
    override def set(key: K, value: V): typings.es6Shim.WeakMap[K, V] = js.native
  }
  @JSGlobal("WeakMap")
  @js.native
  def WeakMap: WeakMapConstructor = js.native
  inline def WeakMap_=(x: WeakMapConstructor): Unit = js.Dynamic.global.updateDynamic("WeakMap")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("WeakSet")
  @js.native
  class WeakSet[T] ()
    extends StObject
       with typings.es6Shim.WeakSet[T] {
    def this(iterable: IterableShim[T]) = this()
    
    /* CompleteClass */
    override def add(value: T): typings.es6Shim.WeakSet[T] = js.native
    
    /* CompleteClass */
    override def delete(value: T): Boolean = js.native
    
    /* CompleteClass */
    override def has(value: T): Boolean = js.native
  }
  @JSGlobal("WeakSet")
  @js.native
  def WeakSet: WeakSetConstructor = js.native
  inline def WeakSet_=(x: WeakSetConstructor): Unit = js.Dynamic.global.updateDynamic("WeakSet")(x.asInstanceOf[js.Any])
}
