package typings.ember.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object default {
  
  /* was `typeof EmberArrayNs.A` */
  @scala.inline
  def A[T](): typings.emberArray.nativeArrayMod.NativeArray[T] = typings.ember.mod.default.^.asInstanceOf[js.Dynamic].applyDynamic("A")().asInstanceOf[typings.emberArray.nativeArrayMod.NativeArray[T]]
  /* was `typeof EmberArrayNs.A` */
  @scala.inline
  def A[T](arr: typings.emberArray.mod.Array[T]): typings.emberArray.nativeArrayMod.NativeArray[T] = typings.ember.mod.default.^.asInstanceOf[js.Dynamic].applyDynamic("A")(arr.asInstanceOf[js.Any]).asInstanceOf[typings.emberArray.nativeArrayMod.NativeArray[T]]
  
  /* was `typeof EmberActionHandler` */
  @scala.inline
  def ActionHandler: typings.emberObject.mixinMod.default[
    typings.emberObject.actionHandlerMod.ActionHandler, 
    typings.emberObject.mod.default
  ] = typings.ember.mod.default.^.asInstanceOf[js.Dynamic].selectDynamic("ActionHandler").asInstanceOf[typings.emberObject.mixinMod.default[
    typings.emberObject.actionHandlerMod.ActionHandler, 
    typings.emberObject.mod.default
  ]]
  
  // Ember.Array rather than Array because the `array-type` lint rule doesn't realize the global is shadowed
  // tslint:disable-next-line:array-type
  /* was `typeof EmberArrayNs.default` */
  @scala.inline
  def Array: typings.emberObject.mixinMod.default[typings.emberArray.mod.Array[js.Any], typings.emberObject.mod.default] = typings.ember.mod.default.^.asInstanceOf[js.Dynamic].selectDynamic("Array").asInstanceOf[typings.emberObject.mixinMod.default[typings.emberArray.mod.Array[js.Any], typings.emberObject.mod.default]]
  
  @scala.inline
  def Comparable: typings.emberObject.mixinMod.default[typings.ember.mod.Ember.Comparable, typings.emberObject.mod.default] = typings.ember.mod.default.^.asInstanceOf[js.Dynamic].selectDynamic("Comparable").asInstanceOf[typings.emberObject.mixinMod.default[typings.ember.mod.Ember.Comparable, typings.emberObject.mod.default]]
  
  /* was `typeof EmberEnumerable` */
  @scala.inline
  def Enumerable: typings.emberObject.mixinMod.default[
    typings.emberArray.enumerableMod.Enumerable[js.Any], 
    typings.emberObject.mod.default
  ] = typings.ember.mod.default.^.asInstanceOf[js.Dynamic].selectDynamic("Enumerable").asInstanceOf[typings.emberObject.mixinMod.default[
    typings.emberArray.enumerableMod.Enumerable[js.Any], 
    typings.emberObject.mod.default
  ]]
  
  /* was `typeof EmberObjectEventedNs.default` */
  @scala.inline
  def Evented: typings.emberObject.mixinMod.default[typings.emberObject.eventedMod.Evented, typings.emberObject.mod.default] = typings.ember.mod.default.^.asInstanceOf[js.Dynamic].selectDynamic("Evented").asInstanceOf[typings.emberObject.mixinMod.default[typings.emberObject.eventedMod.Evented, typings.emberObject.mod.default]]
  
  /* was `typeof EmberMutableArray` */
  @scala.inline
  def MutableArray: typings.emberObject.mixinMod.default[
    typings.emberArray.mutableMod.MutableArray[js.Any], 
    typings.emberObject.mod.default
  ] = typings.ember.mod.default.^.asInstanceOf[js.Dynamic].selectDynamic("MutableArray").asInstanceOf[typings.emberObject.mixinMod.default[
    typings.emberArray.mutableMod.MutableArray[js.Any], 
    typings.emberObject.mod.default
  ]]
  
  /* was `typeof EmberMutableEnumerable` */
  @scala.inline
  def MutableEnumerable: typings.emberObject.mixinMod.default[
    typings.emberArray.mutableEnumerableMod.MutableEnumerable[js.Any], 
    typings.emberObject.mod.default
  ] = typings.ember.mod.default.^.asInstanceOf[js.Dynamic].selectDynamic("MutableEnumerable").asInstanceOf[typings.emberObject.mixinMod.default[
    typings.emberArray.mutableEnumerableMod.MutableEnumerable[js.Any], 
    typings.emberObject.mod.default
  ]]
  
  /* was `typeof EmberNativeArray` */
  @scala.inline
  def NativeArray: typings.emberObject.mixinMod.default[
    typings.emberArray.nativeArrayMod.NativeArray[js.Any], 
    typings.emberObject.mod.default
  ] = typings.ember.mod.default.^.asInstanceOf[js.Dynamic].selectDynamic("NativeArray").asInstanceOf[typings.emberObject.mixinMod.default[
    typings.emberArray.nativeArrayMod.NativeArray[js.Any], 
    typings.emberObject.mod.default
  ]]
  
  /* was `typeof EmberObservable` */
  @scala.inline
  def Observable: typings.emberObject.mixinMod.default[typings.emberObject.observableMod.Observable, typings.emberObject.coreMod.default] = typings.ember.mod.default.^.asInstanceOf[js.Dynamic].selectDynamic("Observable").asInstanceOf[typings.emberObject.mixinMod.default[typings.emberObject.observableMod.Observable, typings.emberObject.coreMod.default]]
  
  /* was `typeof EmberObjectPromiseProxyNs.default` */
  @scala.inline
  def PromiseProxyMixin: typings.emberObject.mixinMod.default[
    typings.emberObject.promiseProxyMixinMod.PromiseProxyMixin[js.Any], 
    typings.emberObject.mod.default
  ] = typings.ember.mod.default.^.asInstanceOf[js.Dynamic].selectDynamic("PromiseProxyMixin").asInstanceOf[typings.emberObject.mixinMod.default[
    typings.emberObject.promiseProxyMixinMod.PromiseProxyMixin[js.Any], 
    typings.emberObject.mod.default
  ]]
  
  /**
    * The semantic version
    */
  @scala.inline
  def VERSION: java.lang.String = typings.ember.mod.default.^.asInstanceOf[js.Dynamic].selectDynamic("VERSION").asInstanceOf[java.lang.String]
  
  @scala.inline
  def ViewTargetActionSupport: typings.ember.mod.Ember.Mixin[typings.ember.mod.Ember.ViewTargetActionSupport, typings.emberObject.mod.default] = typings.ember.mod.default.^.asInstanceOf[js.Dynamic].selectDynamic("ViewTargetActionSupport").asInstanceOf[typings.ember.mod.Ember.Mixin[typings.ember.mod.Ember.ViewTargetActionSupport, typings.emberObject.mod.default]]
  
  /**
    * Alias for jQuery
    */
  @scala.inline
  def _empty: typings.jquery.JQueryStatic = typings.ember.mod.default.^.asInstanceOf[js.Dynamic].selectDynamic("$").asInstanceOf[typings.jquery.JQueryStatic]
  
  /* was `typeof EmberObjectEventsNs.addListener` */
  @scala.inline
  def addListener[Context](
    obj: Context,
    key: /* keyof Context */ java.lang.String,
    method: typings.emberObject.typesMod.ObserverMethod[Context, Context]
  ): scala.Unit = (typings.ember.mod.default.^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(obj.asInstanceOf[js.Any], key.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  /* was `typeof EmberObjectEventsNs.addListener` */
  @scala.inline
  def addListener[Context, Target](
    obj: Context,
    key: /* keyof Context */ java.lang.String,
    target: Target,
    method: typings.emberObject.typesMod.ObserverMethod[Target, Context]
  ): scala.Unit = (typings.ember.mod.default.^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(obj.asInstanceOf[js.Any], key.asInstanceOf[js.Any], target.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  /* was `typeof EmberObjectEventsNs.addListener` */
  @scala.inline
  def addListener[Context, Target](
    obj: Context,
    key: /* keyof Context */ java.lang.String,
    target: Target,
    method: typings.emberObject.typesMod.ObserverMethod[Target, Context],
    once: scala.Boolean
  ): scala.Unit = (typings.ember.mod.default.^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(obj.asInstanceOf[js.Any], key.asInstanceOf[js.Any], target.asInstanceOf[js.Any], method.asInstanceOf[js.Any], once.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  /* was `typeof EmberObjectObserversNs.addObserver` */
  @scala.inline
  def addObserver[Context](
    obj: Context,
    key: /* keyof Context */ java.lang.String,
    method: typings.emberObject.typesMod.ObserverMethod[Context, Context]
  ): scala.Unit = (typings.ember.mod.default.^.asInstanceOf[js.Dynamic].applyDynamic("addObserver")(obj.asInstanceOf[js.Any], key.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  /* was `typeof EmberObjectObserversNs.addObserver` */
  @scala.inline
  def addObserver[Context, Target](
    obj: Context,
    key: /* keyof Context */ java.lang.String,
    target: Target,
    method: typings.emberObject.typesMod.ObserverMethod[Target, Context]
  ): scala.Unit = (typings.ember.mod.default.^.asInstanceOf[js.Dynamic].applyDynamic("addObserver")(obj.asInstanceOf[js.Any], key.asInstanceOf[js.Any], target.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  /* was `typeof EmberObjectNs.aliasMethod` */
  @scala.inline
  def aliasMethod(methodName: java.lang.String): typings.emberObject.computedMod.ComputedProperty[_, _] = typings.ember.mod.default.^.asInstanceOf[js.Dynamic].applyDynamic("aliasMethod")(methodName.asInstanceOf[js.Any]).asInstanceOf[typings.emberObject.computedMod.ComputedProperty[_, _]]
  
  /* was `typeof EmberDebugNs.assert` */
  @scala.inline
  def assert(desc: java.lang.String): scala.Nothing = typings.ember.mod.default.^.asInstanceOf[js.Dynamic].applyDynamic("assert")(desc.asInstanceOf[js.Any]).asInstanceOf[scala.Nothing]
  /* was `typeof EmberDebugNs.assert` */
  @scala.inline
  def assert(desc: java.lang.String, test: js.Any): /* asserts test */ scala.Boolean = (typings.ember.mod.default.^.asInstanceOf[js.Dynamic].applyDynamic("assert")(desc.asInstanceOf[js.Any], test.asInstanceOf[js.Any])).asInstanceOf[/* asserts test */ scala.Boolean]
  
  /* was `typeof EmberPolyfillsNs.assign` */
  @scala.inline
  def assign(target: js.Object): scala.Nothing = typings.ember.mod.default.^.asInstanceOf[js.Dynamic].applyDynamic("assign")(target.asInstanceOf[js.Any]).asInstanceOf[scala.Nothing]
  /* was `typeof EmberPolyfillsNs.assign` */
  @scala.inline
  def assign(target: js.Object, sources: js.Object*): js.Any = (typings.ember.mod.default.^.asInstanceOf[js.Dynamic].applyDynamic("assign")(target.asInstanceOf[js.Any], sources.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  /* was `typeof EmberPolyfillsNs.assign` */
  @scala.inline
  def assign[T /* <: js.Object */, U /* <: js.Object */](target: T, source: U): typings.emberPolyfills.typesMod.Mix[T, U] = (typings.ember.mod.default.^.asInstanceOf[js.Dynamic].applyDynamic("assign")(target.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[typings.emberPolyfills.typesMod.Mix[T, U]]
  /* was `typeof EmberPolyfillsNs.assign` */
  @scala.inline
  def assign[T /* <: js.Object */, U /* <: js.Object */, V /* <: js.Object */](target: T, source1: U, source2: V): typings.emberPolyfills.typesMod.Mix3[T, U, V] = (typings.ember.mod.default.^.asInstanceOf[js.Dynamic].applyDynamic("assign")(target.asInstanceOf[js.Any], source1.asInstanceOf[js.Any], source2.asInstanceOf[js.Any])).asInstanceOf[typings.emberPolyfills.typesMod.Mix3[T, U, V]]
  /* was `typeof EmberPolyfillsNs.assign` */
  @scala.inline
  def assign[T /* <: js.Object */, U /* <: js.Object */, V /* <: js.Object */, W /* <: js.Object */](target: T, source1: U, source2: V, source3: W): typings.emberPolyfills.typesMod.Mix4[T, U, V, W] = (typings.ember.mod.default.^.asInstanceOf[js.Dynamic].applyDynamic("assign")(target.asInstanceOf[js.Any], source1.asInstanceOf[js.Any], source2.asInstanceOf[js.Any], source3.asInstanceOf[js.Any])).asInstanceOf[typings.emberPolyfills.typesMod.Mix4[T, U, V, W]]
  
  /* was `typeof EmberObjectInternalsNs.cacheFor` */
  @scala.inline
  def cacheFor[T, K /* <: /* keyof T */ java.lang.String */](obj: T, key: K): js.UndefOr[
    typings.emberObject.typesMod.UnwrapComputedPropertyGetter[
      /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
    ]
  ] = (typings.ember.mod.default.^.asInstanceOf[js.Dynamic].applyDynamic("cacheFor")(obj.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[
    typings.emberObject.typesMod.UnwrapComputedPropertyGetter[
      /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
    ]
  ]]
  
  /* was `typeof EmberUtilsNs.compare` */
  @scala.inline
  def compare(v: js.Any, w: js.Any): scala.Double = (typings.ember.mod.default.^.asInstanceOf[js.Dynamic].applyDynamic("compare")(v.asInstanceOf[js.Any], w.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
  
  /* was `typeof EmberObjectInternalsNs.copy` */
  @scala.inline
  def copy(obj: js.Any): js.Any = typings.ember.mod.default.^.asInstanceOf[js.Dynamic].applyDynamic("copy")(obj.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  /* was `typeof EmberObjectInternalsNs.copy` */
  @scala.inline
  def copy(obj: js.Any, deep: scala.Boolean): js.Any = (typings.ember.mod.default.^.asInstanceOf[js.Dynamic].applyDynamic("copy")(obj.asInstanceOf[js.Any], deep.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  /* was `typeof EmberObjectInternalsNs.copy` */
  @scala.inline
  def copy_true[T](obj: T, deep: typings.ember.emberBooleans.`true`): T = (typings.ember.mod.default.^.asInstanceOf[js.Dynamic].applyDynamic("copy")(obj.asInstanceOf[js.Any], deep.asInstanceOf[js.Any])).asInstanceOf[T]
  
  /* was `typeof EmberDebugNs.debug` */
  @scala.inline
  def debug(message: java.lang.String): scala.Unit = typings.ember.mod.default.^.asInstanceOf[js.Dynamic].applyDynamic("debug")(message.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  /* was `typeof EmberObjectNs.defineProperty` */
  @scala.inline
  def defineProperty(obj: js.Object, keyName: java.lang.String): scala.Unit = (typings.ember.mod.default.^.asInstanceOf[js.Dynamic].applyDynamic("defineProperty")(obj.asInstanceOf[js.Any], keyName.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  /* was `typeof EmberObjectNs.defineProperty` */
  @scala.inline
  def defineProperty(
    obj: js.Object,
    keyName: java.lang.String,
    desc: js.UndefOr[scala.Nothing],
    data: js.UndefOr[scala.Nothing],
    meta: js.Any
  ): scala.Unit = (typings.ember.mod.default.^.asInstanceOf[js.Dynamic].applyDynamic("defineProperty")(obj.asInstanceOf[js.Any], keyName.asInstanceOf[js.Any], desc.asInstanceOf[js.Any], data.asInstanceOf[js.Any], meta.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  /* was `typeof EmberObjectNs.defineProperty` */
  @scala.inline
  def defineProperty(obj: js.Object, keyName: java.lang.String, desc: js.UndefOr[scala.Nothing], data: js.Any): scala.Unit = (typings.ember.mod.default.^.asInstanceOf[js.Dynamic].applyDynamic("defineProperty")(obj.asInstanceOf[js.Any], keyName.asInstanceOf[js.Any], desc.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  /* was `typeof EmberObjectNs.defineProperty` */
  @scala.inline
  def defineProperty(
    obj: js.Object,
    keyName: java.lang.String,
    desc: js.UndefOr[scala.Nothing],
    data: js.Any,
    meta: js.Any
  ): scala.Unit = (typings.ember.mod.default.^.asInstanceOf[js.Dynamic].applyDynamic("defineProperty")(obj.asInstanceOf[js.Any], keyName.asInstanceOf[js.Any], desc.asInstanceOf[js.Any], data.asInstanceOf[js.Any], meta.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  /* was `typeof EmberObjectNs.defineProperty` */
  @scala.inline
  def defineProperty(
    obj: js.Object,
    keyName: java.lang.String,
    desc: typings.emberObject.computedMod.ComputedProperty[_, _]
  ): scala.Unit = (typings.ember.mod.default.^.asInstanceOf[js.Dynamic].applyDynamic("defineProperty")(obj.asInstanceOf[js.Any], keyName.asInstanceOf[js.Any], desc.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  /* was `typeof EmberObjectNs.defineProperty` */
  @scala.inline
  def defineProperty(
    obj: js.Object,
    keyName: java.lang.String,
    desc: typings.emberObject.computedMod.ComputedProperty[_, _],
    data: js.UndefOr[scala.Nothing],
    meta: js.Any
  ): scala.Unit = (typings.ember.mod.default.^.asInstanceOf[js.Dynamic].applyDynamic("defineProperty")(obj.asInstanceOf[js.Any], keyName.asInstanceOf[js.Any], desc.asInstanceOf[js.Any], data.asInstanceOf[js.Any], meta.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  /* was `typeof EmberObjectNs.defineProperty` */
  @scala.inline
  def defineProperty(
    obj: js.Object,
    keyName: java.lang.String,
    desc: typings.emberObject.computedMod.ComputedProperty[_, _],
    data: js.Any
  ): scala.Unit = (typings.ember.mod.default.^.asInstanceOf[js.Dynamic].applyDynamic("defineProperty")(obj.asInstanceOf[js.Any], keyName.asInstanceOf[js.Any], desc.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  /* was `typeof EmberObjectNs.defineProperty` */
  @scala.inline
  def defineProperty(
    obj: js.Object,
    keyName: java.lang.String,
    desc: typings.emberObject.computedMod.ComputedProperty[_, _],
    data: js.Any,
    meta: js.Any
  ): scala.Unit = (typings.ember.mod.default.^.asInstanceOf[js.Dynamic].applyDynamic("defineProperty")(obj.asInstanceOf[js.Any], keyName.asInstanceOf[js.Any], desc.asInstanceOf[js.Any], data.asInstanceOf[js.Any], meta.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  /* was `typeof EmberObjectNs.defineProperty` */
  @scala.inline
  def defineProperty(obj: js.Object, keyName: java.lang.String, desc: typings.std.PropertyDescriptor): scala.Unit = (typings.ember.mod.default.^.asInstanceOf[js.Dynamic].applyDynamic("defineProperty")(obj.asInstanceOf[js.Any], keyName.asInstanceOf[js.Any], desc.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  /* was `typeof EmberObjectNs.defineProperty` */
  @scala.inline
  def defineProperty(
    obj: js.Object,
    keyName: java.lang.String,
    desc: typings.std.PropertyDescriptor,
    data: js.UndefOr[scala.Nothing],
    meta: js.Any
  ): scala.Unit = (typings.ember.mod.default.^.asInstanceOf[js.Dynamic].applyDynamic("defineProperty")(obj.asInstanceOf[js.Any], keyName.asInstanceOf[js.Any], desc.asInstanceOf[js.Any], data.asInstanceOf[js.Any], meta.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  /* was `typeof EmberObjectNs.defineProperty` */
  @scala.inline
  def defineProperty(obj: js.Object, keyName: java.lang.String, desc: typings.std.PropertyDescriptor, data: js.Any): scala.Unit = (typings.ember.mod.default.^.asInstanceOf[js.Dynamic].applyDynamic("defineProperty")(obj.asInstanceOf[js.Any], keyName.asInstanceOf[js.Any], desc.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  /* was `typeof EmberObjectNs.defineProperty` */
  @scala.inline
  def defineProperty(
    obj: js.Object,
    keyName: java.lang.String,
    desc: typings.std.PropertyDescriptor,
    data: js.Any,
    meta: js.Any
  ): scala.Unit = (typings.ember.mod.default.^.asInstanceOf[js.Dynamic].applyDynamic("defineProperty")(obj.asInstanceOf[js.Any], keyName.asInstanceOf[js.Any], desc.asInstanceOf[js.Any], data.asInstanceOf[js.Any], meta.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  /* was `typeof EmberApplicationDeprecateNs.deprecate` */
  @scala.inline
  def deprecate(
    message: java.lang.String,
    test: scala.Boolean,
    options: typings.emberApplication.deprecationsMod.DeprecationOptions
  ): js.Any = (typings.ember.mod.default.^.asInstanceOf[js.Dynamic].applyDynamic("deprecate")(message.asInstanceOf[js.Any], test.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  /* was `typeof EmberApplicationDeprecateNs.deprecateFunc` */
  @scala.inline
  def deprecateFunc[Func /* <: js.Function1[/* repeated */ js.Any, _] */](
    message: java.lang.String,
    options: typings.emberApplication.deprecationsMod.DeprecationOptions,
    func: Func
  ): Func = (typings.ember.mod.default.^.asInstanceOf[js.Dynamic].applyDynamic("deprecateFunc")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[Func]
  
  /* was `typeof EmberObjectComputedNs.expandProperties` */
  @scala.inline
  def expandProperties(pattern: java.lang.String, callback: js.Function1[/* expanded */ java.lang.String, scala.Unit]): scala.Unit = (typings.ember.mod.default.^.asInstanceOf[js.Dynamic].applyDynamic("expandProperties")(pattern.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  /* was `typeof EmberObjectNs.get` */
  @scala.inline
  def get[T, K /* <: /* keyof T */ java.lang.String */](obj: T, key: K): typings.emberObject.typesMod.UnwrapComputedPropertyGetter[
    /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
  ] = (typings.ember.mod.default.^.asInstanceOf[js.Dynamic].applyDynamic("get")(obj.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[typings.emberObject.typesMod.UnwrapComputedPropertyGetter[
    /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
  ]]
  
  /**
    * `getEngineParent` retrieves an engine instance's parent instance.
    */
  @scala.inline
  def getEngineParent(engine: typings.ember.mod.Ember.EngineInstance): typings.ember.mod.Ember.EngineInstance = typings.ember.mod.default.^.asInstanceOf[js.Dynamic].applyDynamic("getEngineParent")(engine.asInstanceOf[js.Any]).asInstanceOf[typings.ember.mod.Ember.EngineInstance]
  
  /* was `typeof EmberApplicationNs.getOwner` */
  @scala.inline
  def getOwner(`object`: js.Any): js.Any = typings.ember.mod.default.^.asInstanceOf[js.Dynamic].applyDynamic("getOwner")(`object`.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  /* was `typeof EmberObjectNs.getProperties` */
  @scala.inline
  def getProperties[T, K /* <: /* keyof T */ java.lang.String */](obj: T, list: K*): typings.std.Pick[typings.emberObject.typesMod.UnwrapComputedPropertyGetters[T], K] = (typings.ember.mod.default.^.asInstanceOf[js.Dynamic].applyDynamic("getProperties")(obj.asInstanceOf[js.Any], list.asInstanceOf[js.Any])).asInstanceOf[typings.std.Pick[typings.emberObject.typesMod.UnwrapComputedPropertyGetters[T], K]]
  /* was `typeof EmberObjectNs.getProperties` */
  @scala.inline
  def getProperties[T, K /* <: /* keyof T */ java.lang.String */](obj: T, list: js.Array[K]): typings.std.Pick[typings.emberObject.typesMod.UnwrapComputedPropertyGetters[T], K] = (typings.ember.mod.default.^.asInstanceOf[js.Dynamic].applyDynamic("getProperties")(obj.asInstanceOf[js.Any], list.asInstanceOf[js.Any])).asInstanceOf[typings.std.Pick[typings.emberObject.typesMod.UnwrapComputedPropertyGetters[T], K]]
  
  /* was `typeof EmberObjectNs.getWithDefault` */
  @scala.inline
  def getWithDefault[T, K /* <: /* keyof T */ java.lang.String */](
    obj: T,
    key: K,
    defaultValue: typings.emberObject.typesMod.UnwrapComputedPropertyGetter[
      /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
    ]
  ): typings.emberObject.typesMod.UnwrapComputedPropertyGetter[
    /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
  ] = (typings.ember.mod.default.^.asInstanceOf[js.Dynamic].applyDynamic("getWithDefault")(obj.asInstanceOf[js.Any], key.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[typings.emberObject.typesMod.UnwrapComputedPropertyGetter[
    /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
  ]]
  
  /* was `typeof EmberObjectInternalsNs.guidFor` */
  @scala.inline
  def guidFor(obj: js.Any): java.lang.String = typings.ember.mod.default.^.asInstanceOf[js.Dynamic].applyDynamic("guidFor")(obj.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  
  /* was `typeof EmberDebugNs.inspect` */
  @scala.inline
  def inspect(obj: js.Any): java.lang.String = typings.ember.mod.default.^.asInstanceOf[js.Dynamic].applyDynamic("inspect")(obj.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  
  /* was `typeof EmberArrayNs.isArray` */
  @scala.inline
  def isArray(obj: js.Any): /* is std.ArrayLike<any> */ scala.Boolean = typings.ember.mod.default.^.asInstanceOf[js.Dynamic].applyDynamic("isArray")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is std.ArrayLike<any> */ scala.Boolean]
  
  /* was `typeof EmberUtilsNs.isBlank` */
  @scala.inline
  def isBlank(): scala.Boolean = typings.ember.mod.default.^.asInstanceOf[js.Dynamic].applyDynamic("isBlank")().asInstanceOf[scala.Boolean]
  /* was `typeof EmberUtilsNs.isBlank` */
  @scala.inline
  def isBlank(obj: js.Any): scala.Boolean = typings.ember.mod.default.^.asInstanceOf[js.Dynamic].applyDynamic("isBlank")(obj.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
  
  /* was `typeof EmberUtilsNs.isEmpty` */
  @scala.inline
  def isEmpty(): scala.Boolean = typings.ember.mod.default.^.asInstanceOf[js.Dynamic].applyDynamic("isEmpty")().asInstanceOf[scala.Boolean]
  /* was `typeof EmberUtilsNs.isEmpty` */
  @scala.inline
  def isEmpty(obj: js.Any): scala.Boolean = typings.ember.mod.default.^.asInstanceOf[js.Dynamic].applyDynamic("isEmpty")(obj.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
  
  /* was `typeof EmberUtilsNs.isEqual` */
  @scala.inline
  def isEqual(a: js.Any, b: js.Any): scala.Boolean = (typings.ember.mod.default.^.asInstanceOf[js.Dynamic].applyDynamic("isEqual")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
  
  /* was `typeof EmberUtilsNs.isNone` */
  @scala.inline
  def isNone(): scala.Boolean = typings.ember.mod.default.^.asInstanceOf[js.Dynamic].applyDynamic("isNone")().asInstanceOf[scala.Boolean]
  /* was `typeof EmberUtilsNs.isNone` */
  @scala.inline
  def isNone(obj: js.Any): scala.Boolean = typings.ember.mod.default.^.asInstanceOf[js.Dynamic].applyDynamic("isNone")(obj.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
  
  /* was `typeof EmberUtilsNs.isPresent` */
  @scala.inline
  def isPresent(): scala.Boolean = typings.ember.mod.default.^.asInstanceOf[js.Dynamic].applyDynamic("isPresent")().asInstanceOf[scala.Boolean]
  /* was `typeof EmberUtilsNs.isPresent` */
  @scala.inline
  def isPresent(obj: js.Any): scala.Boolean = typings.ember.mod.default.^.asInstanceOf[js.Dynamic].applyDynamic("isPresent")(obj.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
  
  /**
    * Polyfill for Object.keys
    * @deprecated Use Object.keys
    */
  @scala.inline
  def keys(o: js.Any): typings.ember.mod.Ember.Array[java.lang.String] = typings.ember.mod.default.^.asInstanceOf[js.Dynamic].applyDynamic("keys")(o.asInstanceOf[js.Any]).asInstanceOf[typings.ember.mod.Ember.Array[java.lang.String]]
  
  /* was `typeof EmberPolyfillsNs.merge` */
  @scala.inline
  def merge[T /* <: js.Object */, U /* <: js.Object */](original: T, updates: U): typings.emberPolyfills.typesMod.Mix[T, U] = (typings.ember.mod.default.^.asInstanceOf[js.Dynamic].applyDynamic("merge")(original.asInstanceOf[js.Any], updates.asInstanceOf[js.Any])).asInstanceOf[typings.emberPolyfills.typesMod.Mix[T, U]]
  
  /* was `typeof EmberObjectNs.notifyPropertyChange` */
  @scala.inline
  def notifyPropertyChange(obj: js.Object, keyName: java.lang.String): scala.Unit = (typings.ember.mod.default.^.asInstanceOf[js.Dynamic].applyDynamic("notifyPropertyChange")(obj.asInstanceOf[js.Any], keyName.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  /* was `typeof EmberObjectNs.observer` */
  @scala.inline
  def observer[Fn /* <: js.Function2[/* target */ js.Any, /* key */ java.lang.String, scala.Unit] */](key1: java.lang.String, func: Fn): Fn = (typings.ember.mod.default.^.asInstanceOf[js.Dynamic].applyDynamic("observer")(key1.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[Fn]
  /* was `typeof EmberObjectNs.observer` */
  @scala.inline
  def observer[Fn /* <: js.Function2[/* target */ js.Any, /* key */ java.lang.String, scala.Unit] */](key1: java.lang.String, key2: java.lang.String, func: Fn): Fn = (typings.ember.mod.default.^.asInstanceOf[js.Dynamic].applyDynamic("observer")(key1.asInstanceOf[js.Any], key2.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[Fn]
  /* was `typeof EmberObjectNs.observer` */
  @scala.inline
  def observer[Fn /* <: js.Function2[/* target */ js.Any, /* key */ java.lang.String, scala.Unit] */](key1: java.lang.String, key2: java.lang.String, key3: java.lang.String, func: Fn): Fn = (typings.ember.mod.default.^.asInstanceOf[js.Dynamic].applyDynamic("observer")(key1.asInstanceOf[js.Any], key2.asInstanceOf[js.Any], key3.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[Fn]
  /* was `typeof EmberObjectNs.observer` */
  @scala.inline
  def observer[Fn /* <: js.Function2[/* target */ js.Any, /* key */ java.lang.String, scala.Unit] */](
    key1: java.lang.String,
    key2: java.lang.String,
    key3: java.lang.String,
    key4: java.lang.String,
    func: Fn
  ): Fn = (typings.ember.mod.default.^.asInstanceOf[js.Dynamic].applyDynamic("observer")(key1.asInstanceOf[js.Any], key2.asInstanceOf[js.Any], key3.asInstanceOf[js.Any], key4.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[Fn]
  /* was `typeof EmberObjectNs.observer` */
  @scala.inline
  def observer[Fn /* <: js.Function2[/* target */ js.Any, /* key */ java.lang.String, scala.Unit] */](
    key1: java.lang.String,
    key2: java.lang.String,
    key3: java.lang.String,
    key4: java.lang.String,
    key5: java.lang.String,
    func: Fn
  ): Fn = (typings.ember.mod.default.^.asInstanceOf[js.Dynamic].applyDynamic("observer")(key1.asInstanceOf[js.Any], key2.asInstanceOf[js.Any], key3.asInstanceOf[js.Any], key4.asInstanceOf[js.Any], key5.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[Fn]
  
  /* was `typeof EmberObjectEventedNs.on` */
  @scala.inline
  def on(
    eventName: java.lang.String,
    eventName2: java.lang.String,
    eventName3: java.lang.String,
    eventName4: java.lang.String,
    eventName5: java.lang.String,
    eventName6: java.lang.String,
    func: js.Function1[/* repeated */ js.Any, scala.Unit]
  ): js.Function1[/* repeated */ js.Any, scala.Unit] = (typings.ember.mod.default.^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], eventName2.asInstanceOf[js.Any], eventName3.asInstanceOf[js.Any], eventName4.asInstanceOf[js.Any], eventName5.asInstanceOf[js.Any], eventName6.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* repeated */ js.Any, scala.Unit]]
  /* was `typeof EmberObjectEventedNs.on` */
  @scala.inline
  def on(
    eventName: java.lang.String,
    eventName2: java.lang.String,
    eventName3: java.lang.String,
    eventName4: java.lang.String,
    eventName5: java.lang.String,
    func: js.Function1[/* repeated */ js.Any, scala.Unit]
  ): js.Function1[/* repeated */ js.Any, scala.Unit] = (typings.ember.mod.default.^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], eventName2.asInstanceOf[js.Any], eventName3.asInstanceOf[js.Any], eventName4.asInstanceOf[js.Any], eventName5.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* repeated */ js.Any, scala.Unit]]
  /* was `typeof EmberObjectEventedNs.on` */
  @scala.inline
  def on(
    eventName: java.lang.String,
    eventName2: java.lang.String,
    eventName3: java.lang.String,
    eventName4: java.lang.String,
    func: js.Function1[/* repeated */ js.Any, scala.Unit]
  ): js.Function1[/* repeated */ js.Any, scala.Unit] = (typings.ember.mod.default.^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], eventName2.asInstanceOf[js.Any], eventName3.asInstanceOf[js.Any], eventName4.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* repeated */ js.Any, scala.Unit]]
  /* was `typeof EmberObjectEventedNs.on` */
  @scala.inline
  def on(
    eventName: java.lang.String,
    eventName2: java.lang.String,
    eventName3: java.lang.String,
    func: js.Function1[/* repeated */ js.Any, scala.Unit]
  ): js.Function1[/* repeated */ js.Any, scala.Unit] = (typings.ember.mod.default.^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], eventName2.asInstanceOf[js.Any], eventName3.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* repeated */ js.Any, scala.Unit]]
  /* was `typeof EmberObjectEventedNs.on` */
  @scala.inline
  def on(
    eventName: java.lang.String,
    eventName2: java.lang.String,
    func: js.Function1[/* repeated */ js.Any, scala.Unit]
  ): js.Function1[/* repeated */ js.Any, scala.Unit] = (typings.ember.mod.default.^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], eventName2.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* repeated */ js.Any, scala.Unit]]
  /* was `typeof EmberObjectEventedNs.on` */
  @scala.inline
  def on(eventName: java.lang.String, func: js.Function1[/* repeated */ js.Any, scala.Unit]): js.Function1[/* repeated */ js.Any, scala.Unit] = (typings.ember.mod.default.^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* repeated */ js.Any, scala.Unit]]
  
  /**
    * A function may be assigned to `Ember.onerror` to be called when Ember
    * internals encounter an error. This is useful for specialized error handling
    * and reporting code.
    */
  @scala.inline
  def onerror(error: typings.std.Error): scala.Unit = typings.ember.mod.default.^.asInstanceOf[js.Dynamic].applyDynamic("onerror")(error.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  /* was `typeof EmberObjectEventsNs.removeListener` */
  @scala.inline
  def removeListener[Context](
    obj: Context,
    key: /* keyof Context */ java.lang.String,
    method: typings.emberObject.typesMod.ObserverMethod[Context, Context]
  ): js.Any = (typings.ember.mod.default.^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(obj.asInstanceOf[js.Any], key.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  /* was `typeof EmberObjectEventsNs.removeListener` */
  @scala.inline
  def removeListener[Context, Target](
    obj: Context,
    key: /* keyof Context */ java.lang.String,
    target: Target,
    method: typings.emberObject.typesMod.ObserverMethod[Target, Context]
  ): js.Any = (typings.ember.mod.default.^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(obj.asInstanceOf[js.Any], key.asInstanceOf[js.Any], target.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  /* was `typeof EmberObjectObserversNs.removeObserver` */
  @scala.inline
  def removeObserver[Context](
    obj: Context,
    key: /* keyof Context */ java.lang.String,
    method: typings.emberObject.typesMod.ObserverMethod[Context, Context]
  ): js.Any = (typings.ember.mod.default.^.asInstanceOf[js.Dynamic].applyDynamic("removeObserver")(obj.asInstanceOf[js.Any], key.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  /* was `typeof EmberObjectObserversNs.removeObserver` */
  @scala.inline
  def removeObserver[Context, Target](
    obj: Context,
    key: /* keyof Context */ java.lang.String,
    target: Target,
    method: typings.emberObject.typesMod.ObserverMethod[Target, Context]
  ): js.Any = (typings.ember.mod.default.^.asInstanceOf[js.Dynamic].applyDynamic("removeObserver")(obj.asInstanceOf[js.Any], key.asInstanceOf[js.Any], target.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  /* was `typeof EmberRunloopNs.run` */
  @scala.inline
  def run: typings.emberRunloop.mod.RunNamespace = typings.ember.mod.default.^.asInstanceOf[js.Dynamic].selectDynamic("run").asInstanceOf[typings.emberRunloop.mod.RunNamespace]
  
  /* was `typeof EmberDebugNs.runInDebug` */
  @scala.inline
  def runInDebug(func: js.Function0[_]): scala.Unit = typings.ember.mod.default.^.asInstanceOf[js.Dynamic].applyDynamic("runInDebug")(func.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  /* was `typeof EmberObjectEventsNs.sendEvent` */
  @scala.inline
  def sendEvent(obj: js.Any, eventName: java.lang.String): scala.Boolean = (typings.ember.mod.default.^.asInstanceOf[js.Dynamic].applyDynamic("sendEvent")(obj.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
  /* was `typeof EmberObjectEventsNs.sendEvent` */
  @scala.inline
  def sendEvent(obj: js.Any, eventName: java.lang.String, params: js.UndefOr[scala.Nothing], actions: js.Array[_]): scala.Boolean = (typings.ember.mod.default.^.asInstanceOf[js.Dynamic].applyDynamic("sendEvent")(obj.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], params.asInstanceOf[js.Any], actions.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
  /* was `typeof EmberObjectEventsNs.sendEvent` */
  @scala.inline
  def sendEvent(obj: js.Any, eventName: java.lang.String, params: js.Array[_]): scala.Boolean = (typings.ember.mod.default.^.asInstanceOf[js.Dynamic].applyDynamic("sendEvent")(obj.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
  /* was `typeof EmberObjectEventsNs.sendEvent` */
  @scala.inline
  def sendEvent(obj: js.Any, eventName: java.lang.String, params: js.Array[_], actions: js.Array[_]): scala.Boolean = (typings.ember.mod.default.^.asInstanceOf[js.Dynamic].applyDynamic("sendEvent")(obj.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], params.asInstanceOf[js.Any], actions.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
  
  /* was `typeof EmberObjectNs.set` */
  @scala.inline
  def set[T, K /* <: /* keyof T */ java.lang.String */](
    obj: T,
    key: K,
    value: typings.emberObject.typesMod.UnwrapComputedPropertySetter[
      /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
    ]
  ): typings.emberObject.typesMod.UnwrapComputedPropertyGetter[
    /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
  ] = (typings.ember.mod.default.^.asInstanceOf[js.Dynamic].applyDynamic("set")(obj.asInstanceOf[js.Any], key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[typings.emberObject.typesMod.UnwrapComputedPropertyGetter[
    /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
  ]]
  
  /* was `typeof EmberApplicationNs.setOwner` */
  @scala.inline
  def setOwner(`object`: js.Any, owner: js.Any): scala.Unit = (typings.ember.mod.default.^.asInstanceOf[js.Dynamic].applyDynamic("setOwner")(`object`.asInstanceOf[js.Any], owner.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  /* was `typeof EmberObjectNs.setProperties` */
  @scala.inline
  def setProperties[T, K /* <: /* keyof T */ java.lang.String */](
    obj: T,
    hash: typings.std.Pick[T | typings.emberObject.typesMod.UnwrapComputedPropertySetters[T], K]
  ): typings.std.Pick[T, K] = (typings.ember.mod.default.^.asInstanceOf[js.Dynamic].applyDynamic("setProperties")(obj.asInstanceOf[js.Any], hash.asInstanceOf[js.Any])).asInstanceOf[typings.std.Pick[T, K]]
  
  /* was `typeof EmberObjectNs.set` */
  @scala.inline
  def set_TK_String_Any[T, K /* <: /* keyof T */ java.lang.String */](
    obj: T,
    key: K,
    value: /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
  ): /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any = (typings.ember.mod.default.^.asInstanceOf[js.Dynamic].applyDynamic("set")(obj.asInstanceOf[js.Any], key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any]
  
  /**
    * This property indicates whether or not this application is currently in
    * testing mode. This is set when `setupForTesting` is called on the current
    * application.
    */
  @scala.inline
  def testing: scala.Boolean = typings.ember.mod.default.^.asInstanceOf[js.Dynamic].selectDynamic("testing").asInstanceOf[scala.Boolean]
  
  /* was `typeof EmberUtilsNs.tryInvoke` */
  @scala.inline
  def tryInvoke(obj: js.Object, methodName: java.lang.String): js.UndefOr[scala.Nothing] = (typings.ember.mod.default.^.asInstanceOf[js.Dynamic].applyDynamic("tryInvoke")(obj.asInstanceOf[js.Any], methodName.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[scala.Nothing]]
  /* was `typeof EmberUtilsNs.tryInvoke` */
  @scala.inline
  def tryInvoke(obj: js.Object, methodName: java.lang.String, args: js.Array[_]): js.UndefOr[scala.Nothing] = (typings.ember.mod.default.^.asInstanceOf[js.Dynamic].applyDynamic("tryInvoke")(obj.asInstanceOf[js.Any], methodName.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[scala.Nothing]]
  /* was `typeof EmberUtilsNs.tryInvoke` */
  @scala.inline
  def tryInvoke[FNAME /* <: /* keyof T */ java.lang.String */, T /* <: js.Object */](obj: T, methodName: FNAME): js.UndefOr[
    typings.std.ReturnType[
      /* import warning: importer.ImportType#apply Failed type conversion: T[FNAME] */ js.Any
    ]
  ] = (typings.ember.mod.default.^.asInstanceOf[js.Dynamic].applyDynamic("tryInvoke")(obj.asInstanceOf[js.Any], methodName.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[
    typings.std.ReturnType[
      /* import warning: importer.ImportType#apply Failed type conversion: T[FNAME] */ js.Any
    ]
  ]]
  /* was `typeof EmberUtilsNs.tryInvoke` */
  @scala.inline
  def tryInvoke[FNAME /* <: /* keyof T */ java.lang.String */, T /* <: js.Object */](
    obj: T,
    methodName: FNAME,
    args: typings.emberUtils.typesMod.FunctionArgs[
      /* import warning: importer.ImportType#apply Failed type conversion: T[FNAME] */ js.Any
    ]
  ): js.UndefOr[
    typings.std.ReturnType[
      /* import warning: importer.ImportType#apply Failed type conversion: T[FNAME] */ js.Any
    ]
  ] = (typings.ember.mod.default.^.asInstanceOf[js.Dynamic].applyDynamic("tryInvoke")(obj.asInstanceOf[js.Any], methodName.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[
    typings.std.ReturnType[
      /* import warning: importer.ImportType#apply Failed type conversion: T[FNAME] */ js.Any
    ]
  ]]
  
  /* was `typeof EmberObjectNs.trySet` */
  @scala.inline
  def trySet(root: js.Object, path: java.lang.String, value: js.Any): js.Any = (typings.ember.mod.default.^.asInstanceOf[js.Dynamic].applyDynamic("trySet")(root.asInstanceOf[js.Any], path.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  /* was `typeof EmberUtilsNs.typeOf` */
  @scala.inline
  def typeOf(): typings.ember.emberStrings.undefined = typings.ember.mod.default.^.asInstanceOf[js.Dynamic].applyDynamic("typeOf")().asInstanceOf[typings.ember.emberStrings.undefined]
  /* was `typeof EmberUtilsNs.typeOf` */
  @scala.inline
  def typeOf(item: js.Any): java.lang.String = typings.ember.mod.default.^.asInstanceOf[js.Dynamic].applyDynamic("typeOf")(item.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  /* was `typeof EmberUtilsNs.typeOf` */
  @scala.inline
  def typeOf[T](value: T): typings.emberUtils.typesMod.TypeOf[typings.emberUtils.typesMod.TypeLookup, T] = typings.ember.mod.default.^.asInstanceOf[js.Dynamic].applyDynamic("typeOf")(value.asInstanceOf[js.Any]).asInstanceOf[typings.emberUtils.typesMod.TypeOf[typings.emberUtils.typesMod.TypeLookup, T]]
  
  /* was `typeof EmberDebugNs.warn` */
  @scala.inline
  def warn(message: java.lang.String): scala.Unit = typings.ember.mod.default.^.asInstanceOf[js.Dynamic].applyDynamic("warn")(message.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  /* was `typeof EmberDebugNs.warn` */
  @scala.inline
  def warn(message: java.lang.String, options: typings.emberDebug.anon.IdString): scala.Unit = (typings.ember.mod.default.^.asInstanceOf[js.Dynamic].applyDynamic("warn")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  /* was `typeof EmberDebugNs.warn` */
  @scala.inline
  def warn(message: java.lang.String, options: typings.emberDebug.anon.`0`): scala.Unit = (typings.ember.mod.default.^.asInstanceOf[js.Dynamic].applyDynamic("warn")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  /* was `typeof EmberDebugNs.warn` */
  @scala.inline
  def warn(message: java.lang.String, test: scala.Boolean): scala.Unit = (typings.ember.mod.default.^.asInstanceOf[js.Dynamic].applyDynamic("warn")(message.asInstanceOf[js.Any], test.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  /* was `typeof EmberDebugNs.warn` */
  @scala.inline
  def warn(message: java.lang.String, test: scala.Boolean, options: typings.emberDebug.anon.IdString): scala.Unit = (typings.ember.mod.default.^.asInstanceOf[js.Dynamic].applyDynamic("warn")(message.asInstanceOf[js.Any], test.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  /* was `typeof EmberDebugNs.warn` */
  @scala.inline
  def warn(message: java.lang.String, test: scala.Boolean, options: typings.emberDebug.anon.`0`): scala.Unit = (typings.ember.mod.default.^.asInstanceOf[js.Dynamic].applyDynamic("warn")(message.asInstanceOf[js.Any], test.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
}
