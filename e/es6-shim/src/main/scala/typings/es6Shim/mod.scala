package typings.es6Shim

import typings.std.ArrayLike
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("es6-shim", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("es6-shim", "Array")
  @js.native
  def Array: ArrayConstructor = js.native
  inline def Array_=(x: ArrayConstructor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Array")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("es6-shim", "Map")
  @js.native
  open class Map[K, V] ()
    extends StObject
       with typings.es6Shim.Map[K, V] {
    def this(iterable: IterableShim[js.Tuple2[K, V]]) = this()
  }
  @JSImport("es6-shim", "Map")
  @js.native
  def Map: MapConstructor = js.native
  inline def Map_=(x: MapConstructor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Map")(x.asInstanceOf[js.Any])
  
  @JSImport("es6-shim", "Math")
  @js.native
  def Math: typings.es6Shim.Math = js.native
  inline def Math_=(x: Math): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Math")(x.asInstanceOf[js.Any])
  
  @JSImport("es6-shim", "Number")
  @js.native
  def Number: NumberConstructor = js.native
  inline def Number_=(x: NumberConstructor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Number")(x.asInstanceOf[js.Any])
  
  @JSImport("es6-shim", "Object")
  @js.native
  def Object: ObjectConstructor = js.native
  inline def Object_=(x: ObjectConstructor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Object")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("es6-shim", "Promise")
  @js.native
  open class Promise[T] protected ()
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
            /* reject */ js.Function1[/* reason */ js.UndefOr[Any], Unit], 
            Unit
          ]) = this()
  }
  @JSImport("es6-shim", "Promise")
  @js.native
  def Promise: PromiseConstructor = js.native
  inline def Promise_=(x: PromiseConstructor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Promise")(x.asInstanceOf[js.Any])
  
  object Reflect {
    
    @JSImport("es6-shim", "Reflect")
    @js.native
    val ^ : js.Any = js.native
    
    inline def apply(target: js.Function, thisArgument: Any, argumentsList: ArrayLike[Any]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("apply")(target.asInstanceOf[js.Any], thisArgument.asInstanceOf[js.Any], argumentsList.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def construct(target: js.Function, argumentsList: ArrayLike[Any]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("construct")(target.asInstanceOf[js.Any], argumentsList.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def defineProperty(target: Any, propertyKey: PropertyKey, attributes: js.PropertyDescriptor): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("defineProperty")(target.asInstanceOf[js.Any], propertyKey.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def deleteProperty(target: Any, propertyKey: PropertyKey): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("deleteProperty")(target.asInstanceOf[js.Any], propertyKey.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def enumerate(target: Any): Iterator[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("enumerate")(target.asInstanceOf[js.Any]).asInstanceOf[Iterator[Any]]
    
    inline def get(target: Any, propertyKey: PropertyKey): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(target.asInstanceOf[js.Any], propertyKey.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def get(target: Any, propertyKey: PropertyKey, receiver: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(target.asInstanceOf[js.Any], propertyKey.asInstanceOf[js.Any], receiver.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def getOwnPropertyDescriptor(target: Any, propertyKey: PropertyKey): js.PropertyDescriptor = (^.asInstanceOf[js.Dynamic].applyDynamic("getOwnPropertyDescriptor")(target.asInstanceOf[js.Any], propertyKey.asInstanceOf[js.Any])).asInstanceOf[js.PropertyDescriptor]
    
    inline def getPrototypeOf(target: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getPrototypeOf")(target.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def has(target: Any, propertyKey: PropertyKey): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("has")(target.asInstanceOf[js.Any], propertyKey.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def isExtensible(target: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isExtensible")(target.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def ownKeys(target: Any): Array[PropertyKey] = ^.asInstanceOf[js.Dynamic].applyDynamic("ownKeys")(target.asInstanceOf[js.Any]).asInstanceOf[Array[PropertyKey]]
    
    inline def preventExtensions(target: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("preventExtensions")(target.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def set(target: Any, propertyKey: PropertyKey, value: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(target.asInstanceOf[js.Any], propertyKey.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def set(target: Any, propertyKey: PropertyKey, value: Any, receiver: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(target.asInstanceOf[js.Any], propertyKey.asInstanceOf[js.Any], value.asInstanceOf[js.Any], receiver.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def setPrototypeOf(target: Any, proto: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("setPrototypeOf")(target.asInstanceOf[js.Any], proto.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("es6-shim", "Set")
  @js.native
  open class Set[T] ()
    extends StObject
       with typings.es6Shim.Set[T] {
    def this(iterable: IterableShim[T]) = this()
  }
  @JSImport("es6-shim", "Set")
  @js.native
  def Set: SetConstructor = js.native
  inline def Set_=(x: SetConstructor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Set")(x.asInstanceOf[js.Any])
  
  @JSImport("es6-shim", "String")
  @js.native
  def String: StringConstructor = js.native
  inline def String_=(x: StringConstructor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("String")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("es6-shim", "WeakMap")
  @js.native
  open class WeakMap[K /* <: js.Object */, V] ()
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
  @JSImport("es6-shim", "WeakMap")
  @js.native
  def WeakMap: WeakMapConstructor = js.native
  inline def WeakMap_=(x: WeakMapConstructor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WeakMap")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("es6-shim", "WeakSet")
  @js.native
  open class WeakSet[T] ()
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
  @JSImport("es6-shim", "WeakSet")
  @js.native
  def WeakSet: WeakSetConstructor = js.native
  inline def WeakSet_=(x: WeakSetConstructor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WeakSet")(x.asInstanceOf[js.Any])
}
