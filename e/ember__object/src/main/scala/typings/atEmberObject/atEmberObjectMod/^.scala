package typings.atEmberObject.atEmberObjectMod

import typings.atEmberObject.computedMod.ComputedProperty
import typings.atEmberObject.dashPrivateTypesMod.ComputedPropertyCallback
import typings.atEmberObject.dashPrivateTypesMod.UnwrapComputedPropertyGetter
import typings.atEmberObject.dashPrivateTypesMod.UnwrapComputedPropertyGetters
import typings.atEmberObject.dashPrivateTypesMod.UnwrapComputedPropertySetter
import typings.atEmberObject.dashPrivateTypesMod.UnwrapComputedPropertySetters
import typings.std.MethodDecorator
import typings.std.Pick
import typings.std.PropertyDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ember/object", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val action: MethodDecorator = js.native
  def aliasMethod(methodName: String): ComputedProperty[_, _] = js.native
  def computed(deps: String*): MethodDecorator = js.native
  def computed(k1: String, k2: String, k3: String, k4: String, k5: String, k6: String, k7: String, rest: js.Any*): ComputedProperty[_, _] = js.native
  def computed[T](cb: ComputedPropertyCallback[T]): ComputedProperty[T, T] = js.native
  def computed[T](k1: String, cb: ComputedPropertyCallback[T]): ComputedProperty[T, T] = js.native
  def computed[T](k1: String, k2: String, cb: ComputedPropertyCallback[T]): ComputedProperty[T, T] = js.native
  def computed[T](k1: String, k2: String, k3: String, cb: ComputedPropertyCallback[T]): ComputedProperty[T, T] = js.native
  def computed[T](k1: String, k2: String, k3: String, k4: String, cb: ComputedPropertyCallback[T]): ComputedProperty[T, T] = js.native
  def computed[T](k1: String, k2: String, k3: String, k4: String, k5: String, cb: ComputedPropertyCallback[T]): ComputedProperty[T, T] = js.native
  def computed[T](
    k1: String,
    k2: String,
    k3: String,
    k4: String,
    k5: String,
    k6: String,
    cb: ComputedPropertyCallback[T]
  ): ComputedProperty[T, T] = js.native
  def defineProperty(obj: js.Object, keyName: String): Unit = js.native
  def defineProperty(obj: js.Object, keyName: String, desc: ComputedProperty[_, _]): Unit = js.native
  def defineProperty(obj: js.Object, keyName: String, desc: ComputedProperty[_, _], data: js.Any): Unit = js.native
  def defineProperty(obj: js.Object, keyName: String, desc: ComputedProperty[_, _], data: js.Any, meta: js.Any): Unit = js.native
  def defineProperty(obj: js.Object, keyName: String, desc: PropertyDescriptor): Unit = js.native
  def defineProperty(obj: js.Object, keyName: String, desc: PropertyDescriptor, data: js.Any): Unit = js.native
  def defineProperty(obj: js.Object, keyName: String, desc: PropertyDescriptor, data: js.Any, meta: js.Any): Unit = js.native
  def get[T, K /* <: String */](obj: T, key: K): UnwrapComputedPropertyGetter[/* import warning: ImportType.apply Failed type conversion: T[K] */ js.Any] = js.native
  def getProperties[T, K /* <: String */](obj: T, list: K*): Pick[UnwrapComputedPropertyGetters[T], K] = js.native
  def getProperties[T, K /* <: String */](obj: T, list: js.Array[K]): Pick[UnwrapComputedPropertyGetters[T], K] = js.native
  def getWithDefault[T, K /* <: String */](
    obj: T,
    key: K,
    defaultValue: UnwrapComputedPropertyGetter[/* import warning: ImportType.apply Failed type conversion: T[K] */ js.Any]
  ): UnwrapComputedPropertyGetter[/* import warning: ImportType.apply Failed type conversion: T[K] */ js.Any] = js.native
  def notifyPropertyChange(obj: js.Object, keyName: String): Unit = js.native
  def observer[Fn /* <: js.Function2[/* target */ js.Any, /* key */ String, Unit] */](key1: String, func: Fn): Fn = js.native
  def observer[Fn /* <: js.Function2[/* target */ js.Any, /* key */ String, Unit] */](key1: String, key2: String, func: Fn): Fn = js.native
  def observer[Fn /* <: js.Function2[/* target */ js.Any, /* key */ String, Unit] */](key1: String, key2: String, key3: String, func: Fn): Fn = js.native
  def observer[Fn /* <: js.Function2[/* target */ js.Any, /* key */ String, Unit] */](key1: String, key2: String, key3: String, key4: String, func: Fn): Fn = js.native
  def observer[Fn /* <: js.Function2[/* target */ js.Any, /* key */ String, Unit] */](key1: String, key2: String, key3: String, key4: String, key5: String, func: Fn): Fn = js.native
  def set[T, K /* <: String */](obj: T, key: K, value: /* import warning: ImportType.apply Failed type conversion: T[K] */ js.Any): /* import warning: ImportType.apply Failed type conversion: T[K] */ js.Any = js.native
  def setProperties[T, K /* <: String */](obj: T, hash: Pick[T | UnwrapComputedPropertySetters[T], K]): Pick[UnwrapComputedPropertyGetters[T], K] = js.native
  @JSName("set")
  def set_TK_String_UnwrapComputedPropertyGetter[T, K /* <: String */](
    obj: T,
    key: K,
    value: UnwrapComputedPropertySetter[/* import warning: ImportType.apply Failed type conversion: T[K] */ js.Any]
  ): UnwrapComputedPropertyGetter[/* import warning: ImportType.apply Failed type conversion: T[K] */ js.Any] = js.native
  def trySet(root: js.Object, path: String, value: js.Any): js.Any = js.native
}

