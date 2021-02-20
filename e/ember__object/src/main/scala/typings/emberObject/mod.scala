package typings.emberObject

import org.scalablytyped.runtime.Instantiable0
import typings.emberObject.anon.Id
import typings.emberObject.anon.Until
import typings.emberObject.computedMod.ComputedProperty
import typings.emberObject.typesMod.ComputedPropertyCallback
import typings.emberObject.typesMod.UnwrapComputedPropertyGetter
import typings.emberObject.typesMod.UnwrapComputedPropertyGetters
import typings.emberObject.typesMod.UnwrapComputedPropertySetter
import typings.emberObject.typesMod.UnwrapComputedPropertySetters
import typings.std.MethodDecorator
import typings.std.Pick
import typings.std.PropertyDescriptor
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: parser.TsParser#tsDeclClass functionCall class extends from : CoreObject.extend(Observable) * / any */ @JSImport("@ember/object", JSImport.Default)
  @js.native
  class default () extends StObject
  
  @JSImport("@ember/object", "action")
  @js.native
  val action: MethodDecorator = js.native
  
  @JSImport("@ember/object", "aliasMethod")
  @js.native
  def aliasMethod(methodName: String): ComputedProperty[_, _] = js.native
  
  object computed {
    
    @JSImport("@ember/object", "computed")
    @js.native
    def apply(deps: String*): MethodDecorator = js.native
    @JSImport("@ember/object", "computed")
    @js.native
    def apply(k1: String, k2: String, k3: String, k4: String, k5: String, k6: String, k7: String, rest: js.Any*): ComputedProperty[_, _] = js.native
    @JSImport("@ember/object", "computed")
    @js.native
    def apply[T](cb: ComputedPropertyCallback[T]): ComputedProperty[T, T] = js.native
    @JSImport("@ember/object", "computed")
    @js.native
    def apply[T](k1: String, cb: ComputedPropertyCallback[T]): ComputedProperty[T, T] = js.native
    @JSImport("@ember/object", "computed")
    @js.native
    def apply[T](k1: String, k2: String, cb: ComputedPropertyCallback[T]): ComputedProperty[T, T] = js.native
    @JSImport("@ember/object", "computed")
    @js.native
    def apply[T](k1: String, k2: String, k3: String, cb: ComputedPropertyCallback[T]): ComputedProperty[T, T] = js.native
    @JSImport("@ember/object", "computed")
    @js.native
    def apply[T](k1: String, k2: String, k3: String, k4: String, cb: ComputedPropertyCallback[T]): ComputedProperty[T, T] = js.native
    @JSImport("@ember/object", "computed")
    @js.native
    def apply[T](k1: String, k2: String, k3: String, k4: String, k5: String, cb: ComputedPropertyCallback[T]): ComputedProperty[T, T] = js.native
    @JSImport("@ember/object", "computed")
    @js.native
    def apply[T](
      k1: String,
      k2: String,
      k3: String,
      k4: String,
      k5: String,
      k6: String,
      cb: ComputedPropertyCallback[T]
    ): ComputedProperty[T, T] = js.native
    
    /* was `typeof ComputedNamespace.alias` */
    @JSImport("@ember/object", "computed.alias")
    @js.native
    def alias(dependentKey: String): ComputedProperty[_, _] = js.native
    
    /* was `typeof ComputedNamespace.and` */
    @JSImport("@ember/object", "computed.and")
    @js.native
    def and(dependentKeys: String*): ComputedProperty[Boolean, Boolean] = js.native
    
    /* was `typeof ComputedNamespace.bool` */
    @JSImport("@ember/object", "computed.bool")
    @js.native
    def bool(dependentKey: String): ComputedProperty[Boolean, Boolean] = js.native
    
    /* was `typeof ComputedNamespace.collect` */
    @JSImport("@ember/object", "computed.collect")
    @js.native
    def collect(dependentKeys: String*): ComputedProperty[js.Array[_], js.Array[_]] = js.native
    
    /* was `typeof ComputedNamespace.deprecatingAlias` */
    @JSImport("@ember/object", "computed.deprecatingAlias")
    @js.native
    def deprecatingAlias(dependentKey: String): ComputedProperty[_, _] = js.native
    /* was `typeof ComputedNamespace.deprecatingAlias` */
    @JSImport("@ember/object", "computed.deprecatingAlias")
    @js.native
    def deprecatingAlias(dependentKey: String, options: Id): ComputedProperty[_, _] = js.native
    @JSImport("@ember/object", "computed.deprecatingAlias")
    @js.native
    def deprecatingAlias(dependentKey: String, options: Until): ComputedProperty[_, _] = js.native
    
    /* was `typeof ComputedNamespace.empty` */
    @JSImport("@ember/object", "computed.empty")
    @js.native
    def empty(dependentKey: String): ComputedProperty[Boolean, Boolean] = js.native
    
    /* was `typeof ComputedNamespace.equal` */
    @JSImport("@ember/object", "computed.equal")
    @js.native
    def equal(dependentKey: String, value: js.Any): ComputedProperty[Boolean, Boolean] = js.native
    
    /* was `typeof ComputedNamespace.filter` */
    @JSImport("@ember/object", "computed.filter")
    @js.native
    def filter(
      dependentKey: String,
      additionalDependentKeys: js.Array[String],
      callback: js.Function3[/* value */ js.Any, /* index */ Double, /* array */ js.Array[_], Boolean]
    ): ComputedProperty[js.Array[_], js.Array[_]] = js.native
    /* was `typeof ComputedNamespace.filter` */
    @JSImport("@ember/object", "computed.filter")
    @js.native
    def filter(
      dependentKey: String,
      callback: js.Function3[/* value */ js.Any, /* index */ Double, /* array */ js.Array[_], Boolean]
    ): ComputedProperty[js.Array[_], js.Array[_]] = js.native
    
    /* was `typeof ComputedNamespace.filterBy` */
    @JSImport("@ember/object", "computed.filterBy")
    @js.native
    def filterBy(dependentKey: String, propertyKey: String): ComputedProperty[js.Array[_], js.Array[_]] = js.native
    @JSImport("@ember/object", "computed.filterBy")
    @js.native
    def filterBy(dependentKey: String, propertyKey: String, value: js.Any): ComputedProperty[js.Array[_], js.Array[_]] = js.native
    
    /* was `typeof ComputedNamespace.gt` */
    @JSImport("@ember/object", "computed.gt")
    @js.native
    def gt(dependentKey: String, value: Double): ComputedProperty[Boolean, Boolean] = js.native
    
    /* was `typeof ComputedNamespace.gte` */
    @JSImport("@ember/object", "computed.gte")
    @js.native
    def gte(dependentKey: String, value: Double): ComputedProperty[Boolean, Boolean] = js.native
    
    /* was `typeof ComputedNamespace.intersect` */
    @JSImport("@ember/object", "computed.intersect")
    @js.native
    def intersect(propertyKeys: String*): ComputedProperty[js.Array[_], js.Array[_]] = js.native
    
    /* was `typeof ComputedNamespace.lt` */
    @JSImport("@ember/object", "computed.lt")
    @js.native
    def lt(dependentKey: String, value: Double): ComputedProperty[Boolean, Boolean] = js.native
    
    /* was `typeof ComputedNamespace.lte` */
    @JSImport("@ember/object", "computed.lte")
    @js.native
    def lte(dependentKey: String, value: Double): ComputedProperty[Boolean, Boolean] = js.native
    
    /* was `typeof ComputedNamespace.map` */
    @JSImport("@ember/object", "computed.map")
    @js.native
    def map[U](
      dependentKey: String,
      callback: js.Function3[/* value */ js.Any, /* index */ Double, /* array */ js.Array[_], U]
    ): ComputedProperty[js.Array[U], js.Array[U]] = js.native
    
    /* was `typeof ComputedNamespace.mapBy` */
    @JSImport("@ember/object", "computed.mapBy")
    @js.native
    def mapBy(dependentKey: String, propertyKey: String): ComputedProperty[js.Array[_], js.Array[_]] = js.native
    
    /* was `typeof ComputedNamespace.max` */
    @JSImport("@ember/object", "computed.max")
    @js.native
    def max(dependentKey: String): ComputedProperty[Double, Double] = js.native
    
    /* was `typeof ComputedNamespace.min` */
    @JSImport("@ember/object", "computed.min")
    @js.native
    def min(dependentKey: String): ComputedProperty[Double, Double] = js.native
    
    /* was `typeof ComputedNamespace.none` */
    @JSImport("@ember/object", "computed.none")
    @js.native
    def none(dependentKey: String): ComputedProperty[Boolean, Boolean] = js.native
    
    /* was `typeof ComputedNamespace.not` */
    @JSImport("@ember/object", "computed.not")
    @js.native
    def not(dependentKey: String): ComputedProperty[Boolean, Boolean] = js.native
    
    /* was `typeof ComputedNamespace.notEmpty` */
    @JSImport("@ember/object", "computed.notEmpty")
    @js.native
    def notEmpty(dependentKey: String): ComputedProperty[Boolean, Boolean] = js.native
    
    /* was `typeof ComputedNamespace.oneWay` */
    @JSImport("@ember/object", "computed.oneWay")
    @js.native
    def oneWay(dependentKey: String): ComputedProperty[_, _] = js.native
    
    /* was `typeof ComputedNamespace.or` */
    @JSImport("@ember/object", "computed.or")
    @js.native
    def or(dependentKeys: String*): ComputedProperty[Boolean, Boolean] = js.native
    
    /* was `typeof ComputedNamespace.readOnly` */
    @JSImport("@ember/object", "computed.readOnly")
    @js.native
    def readOnly(dependentKey: String): ComputedProperty[_, _] = js.native
    
    /* was `typeof ComputedNamespace.reads` */
    @JSImport("@ember/object", "computed.reads")
    @js.native
    def reads(dependentKey: String): ComputedProperty[_, _] = js.native
    
    /* was `typeof ComputedNamespace.setDiff` */
    @JSImport("@ember/object", "computed.setDiff")
    @js.native
    def setDiff(setAProperty: String, setBProperty: String): ComputedProperty[js.Array[_], js.Array[_]] = js.native
    
    /* was `typeof ComputedNamespace.sort` */
    @JSImport("@ember/object", "computed.sort")
    @js.native
    def sort(itemsKey: String, dependentKeys: js.Array[String], sortDefinition: String): ComputedProperty[js.Array[_], js.Array[_]] = js.native
    @JSImport("@ember/object", "computed.sort")
    @js.native
    def sort(
      itemsKey: String,
      dependentKeys: js.Array[String],
      sortDefinition: js.Function2[/* itemA */ js.Any, /* itemB */ js.Any, Double]
    ): ComputedProperty[js.Array[_], js.Array[_]] = js.native
    /* was `typeof ComputedNamespace.sort` */
    @JSImport("@ember/object", "computed.sort")
    @js.native
    def sort(itemsKey: String, sortDefinition: String): ComputedProperty[js.Array[_], js.Array[_]] = js.native
    @JSImport("@ember/object", "computed.sort")
    @js.native
    def sort(itemsKey: String, sortDefinition: js.Function2[/* itemA */ js.Any, /* itemB */ js.Any, Double]): ComputedProperty[js.Array[_], js.Array[_]] = js.native
    
    /* was `typeof ComputedNamespace.sum` */
    @JSImport("@ember/object", "computed.sum")
    @js.native
    def sum(dependentKey: String): ComputedProperty[Double, Double] = js.native
    
    /* was `typeof ComputedNamespace.union` */
    @JSImport("@ember/object", "computed.union")
    @js.native
    def union(propertyKeys: String*): ComputedProperty[js.Array[_], js.Array[_]] = js.native
    
    /* was `typeof ComputedNamespace.uniq` */
    @JSImport("@ember/object", "computed.uniq")
    @js.native
    def uniq(propertyKey: String): ComputedProperty[js.Array[_], js.Array[_]] = js.native
    
    /* was `typeof ComputedNamespace.uniqBy` */
    @JSImport("@ember/object", "computed.uniqBy")
    @js.native
    def uniqBy(dependentKey: String, propertyKey: String): ComputedProperty[js.Array[_], js.Array[_]] = js.native
    
    /* was `typeof ComputedNamespace.match` */
    @JSImport("@ember/object", "computed.match")
    @js.native
    def `match`(dependentKey: String, regexp: RegExp): ComputedProperty[Boolean, Boolean] = js.native
  }
  
  @JSImport("@ember/object", "defineProperty")
  @js.native
  def defineProperty(obj: js.Object, keyName: String): Unit = js.native
  @JSImport("@ember/object", "defineProperty")
  @js.native
  def defineProperty(
    obj: js.Object,
    keyName: String,
    desc: js.UndefOr[scala.Nothing],
    data: js.UndefOr[scala.Nothing],
    meta: js.Any
  ): Unit = js.native
  @JSImport("@ember/object", "defineProperty")
  @js.native
  def defineProperty(obj: js.Object, keyName: String, desc: js.UndefOr[scala.Nothing], data: js.Any): Unit = js.native
  @JSImport("@ember/object", "defineProperty")
  @js.native
  def defineProperty(obj: js.Object, keyName: String, desc: js.UndefOr[scala.Nothing], data: js.Any, meta: js.Any): Unit = js.native
  @JSImport("@ember/object", "defineProperty")
  @js.native
  def defineProperty(obj: js.Object, keyName: String, desc: ComputedProperty[_, _]): Unit = js.native
  @JSImport("@ember/object", "defineProperty")
  @js.native
  def defineProperty(
    obj: js.Object,
    keyName: String,
    desc: ComputedProperty[_, _],
    data: js.UndefOr[scala.Nothing],
    meta: js.Any
  ): Unit = js.native
  @JSImport("@ember/object", "defineProperty")
  @js.native
  def defineProperty(obj: js.Object, keyName: String, desc: ComputedProperty[_, _], data: js.Any): Unit = js.native
  @JSImport("@ember/object", "defineProperty")
  @js.native
  def defineProperty(obj: js.Object, keyName: String, desc: ComputedProperty[_, _], data: js.Any, meta: js.Any): Unit = js.native
  @JSImport("@ember/object", "defineProperty")
  @js.native
  def defineProperty(obj: js.Object, keyName: String, desc: PropertyDescriptor): Unit = js.native
  @JSImport("@ember/object", "defineProperty")
  @js.native
  def defineProperty(
    obj: js.Object,
    keyName: String,
    desc: PropertyDescriptor,
    data: js.UndefOr[scala.Nothing],
    meta: js.Any
  ): Unit = js.native
  @JSImport("@ember/object", "defineProperty")
  @js.native
  def defineProperty(obj: js.Object, keyName: String, desc: PropertyDescriptor, data: js.Any): Unit = js.native
  @JSImport("@ember/object", "defineProperty")
  @js.native
  def defineProperty(obj: js.Object, keyName: String, desc: PropertyDescriptor, data: js.Any, meta: js.Any): Unit = js.native
  
  @JSImport("@ember/object", "get")
  @js.native
  def get[T, K /* <: /* keyof T */ String */](obj: T, key: K): UnwrapComputedPropertyGetter[
    /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
  ] = js.native
  
  @JSImport("@ember/object", "getProperties")
  @js.native
  def getProperties[T, K /* <: /* keyof T */ String */](obj: T, list: K*): Pick[UnwrapComputedPropertyGetters[T], K] = js.native
  @JSImport("@ember/object", "getProperties")
  @js.native
  def getProperties[T, K /* <: /* keyof T */ String */](obj: T, list: js.Array[K]): Pick[UnwrapComputedPropertyGetters[T], K] = js.native
  
  @JSImport("@ember/object", "getWithDefault")
  @js.native
  def getWithDefault[T, K /* <: /* keyof T */ String */](
    obj: T,
    key: K,
    defaultValue: UnwrapComputedPropertyGetter[
      /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
    ]
  ): UnwrapComputedPropertyGetter[
    /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
  ] = js.native
  
  @JSImport("@ember/object", "notifyPropertyChange")
  @js.native
  def notifyPropertyChange(obj: js.Object, keyName: String): Unit = js.native
  
  @JSImport("@ember/object", "observer")
  @js.native
  def observer[Fn /* <: js.Function2[/* target */ js.Any, /* key */ String, Unit] */](key1: String, func: Fn): Fn = js.native
  @JSImport("@ember/object", "observer")
  @js.native
  def observer[Fn /* <: js.Function2[/* target */ js.Any, /* key */ String, Unit] */](key1: String, key2: String, func: Fn): Fn = js.native
  @JSImport("@ember/object", "observer")
  @js.native
  def observer[Fn /* <: js.Function2[/* target */ js.Any, /* key */ String, Unit] */](key1: String, key2: String, key3: String, func: Fn): Fn = js.native
  @JSImport("@ember/object", "observer")
  @js.native
  def observer[Fn /* <: js.Function2[/* target */ js.Any, /* key */ String, Unit] */](key1: String, key2: String, key3: String, key4: String, func: Fn): Fn = js.native
  @JSImport("@ember/object", "observer")
  @js.native
  def observer[Fn /* <: js.Function2[/* target */ js.Any, /* key */ String, Unit] */](key1: String, key2: String, key3: String, key4: String, key5: String, func: Fn): Fn = js.native
  
  @JSImport("@ember/object", "set")
  @js.native
  def set[T, K /* <: /* keyof T */ String */](
    obj: T,
    key: K,
    value: UnwrapComputedPropertySetter[
      /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
    ]
  ): UnwrapComputedPropertyGetter[
    /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
  ] = js.native
  
  @JSImport("@ember/object", "setProperties")
  @js.native
  def setProperties[T, K /* <: /* keyof T */ String */](obj: T, hash: Pick[T | UnwrapComputedPropertySetters[T], K]): Pick[UnwrapComputedPropertyGetters[T], K] = js.native
  
  @JSImport("@ember/object", "set")
  @js.native
  def set_TK_String_Any[T, K /* <: /* keyof T */ String */](
    obj: T,
    key: K,
    value: /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
  ): /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any = js.native
  
  @JSImport("@ember/object", "trySet")
  @js.native
  def trySet(root: js.Object, path: String, value: js.Any): js.Any = js.native
  
  type EmberObject = /* import warning: parser.TsParser#tsDeclClass functionCall class extends from : CoreObject.extend(Observable) */ js.Any
  
  object emberUtilsPrivateTypesAugmentingMod {
    
    @js.native
    trait TypeLookup extends StObject {
      
      var `class`: Instantiable0[EmberObject] = js.native
      
      var instance: EmberObject = js.native
    }
    object TypeLookup {
      
      @scala.inline
      def apply(`class`: Instantiable0[EmberObject], instance: EmberObject): TypeLookup = {
        val __obj = js.Dynamic.literal(instance = instance.asInstanceOf[js.Any])
        __obj.updateDynamic("class")(`class`.asInstanceOf[js.Any])
        __obj.asInstanceOf[TypeLookup]
      }
      
      @scala.inline
      implicit class TypeLookupMutableBuilder[Self <: TypeLookup] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setClass(value: Instantiable0[EmberObject]): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setInstance(value: EmberObject): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
      }
    }
  }
}
