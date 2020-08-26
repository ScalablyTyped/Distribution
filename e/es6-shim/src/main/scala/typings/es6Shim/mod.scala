package typings.es6Shim

import org.scalablytyped.runtime.TopLevel
import typings.std.ArrayLike
import typings.std.PropertyDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("es6-shim", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class Map[K, V] ()
    extends typings.es6Shim.Map[K, V] {
    def this(iterable: IterableShim[js.Tuple2[K, V]]) = this()
  }
  
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
  
  @js.native
  class Set[T] ()
    extends typings.es6Shim.Set[T] {
    def this(iterable: IterableShim[T]) = this()
  }
  
  @js.native
  class WeakMap[K /* <: js.Object */, V] ()
    extends typings.es6Shim.WeakMap[K, V] {
    def this(iterable: IterableShim[js.Tuple2[K, V]]) = this()
  }
  
  @js.native
  class WeakSet[T] ()
    extends typings.es6Shim.WeakSet[T] {
    def this(iterable: IterableShim[T]) = this()
  }
  
  var Array: ArrayConstructor = js.native
  var Math: typings.es6Shim.Math = js.native
  var Number: NumberConstructor = js.native
  var Object: ObjectConstructor = js.native
  var String: StringConstructor = js.native
  @js.native
  object Map extends TopLevel[MapConstructor]
  
  @js.native
  object Promise extends TopLevel[PromiseConstructor]
  
  @js.native
  object Reflect extends js.Object {
    @JSName("apply")
    def apply(target: js.Function, thisArgument: js.Any, argumentsList: ArrayLike[_]): js.Any = js.native
    def construct(target: js.Function, argumentsList: ArrayLike[_]): js.Any = js.native
    def defineProperty(target: js.Any, propertyKey: KeyOfProperty, attributes: PropertyDescriptor): Boolean = js.native
    def deleteProperty(target: js.Any, propertyKey: KeyOfProperty): Boolean = js.native
    def enumerate(target: js.Any): Iterator[_] = js.native
    def get(target: js.Any, propertyKey: KeyOfProperty): js.Any = js.native
    def get(target: js.Any, propertyKey: KeyOfProperty, receiver: js.Any): js.Any = js.native
    def getOwnPropertyDescriptor(target: js.Any, propertyKey: KeyOfProperty): PropertyDescriptor = js.native
    def getPrototypeOf(target: js.Any): js.Any = js.native
    def has(target: js.Any, propertyKey: KeyOfProperty): Boolean = js.native
    def isExtensible(target: js.Any): Boolean = js.native
    def ownKeys(target: js.Any): Array[KeyOfProperty] = js.native
    def preventExtensions(target: js.Any): Boolean = js.native
    def set(target: js.Any, propertyKey: KeyOfProperty, value: js.Any): Boolean = js.native
    def set(target: js.Any, propertyKey: KeyOfProperty, value: js.Any, receiver: js.Any): Boolean = js.native
    def setPrototypeOf(target: js.Any, proto: js.Any): Boolean = js.native
  }
  
  @js.native
  object Set extends TopLevel[SetConstructor]
  
  @js.native
  object WeakMap extends TopLevel[WeakMapConstructor]
  
  @js.native
  object WeakSet extends TopLevel[WeakSetConstructor]
  
}

