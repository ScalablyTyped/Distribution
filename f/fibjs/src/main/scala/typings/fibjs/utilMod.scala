package typings.fibjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** module Or Internal Object */
/**
  * @brief 常用工具模块
  * @detail 
  */
object utilMod {
  
  @JSImport("util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("util", "LruCache")
  @js.native
  class LruCache ()
    extends StObject
       with ClassLruCache
  
  @JSImport("util", "Stats")
  @js.native
  class Stats ()
    extends StObject
       with ClassStats
  
  inline def _extend(v: js.Any, objs: js.Any*): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("_extend")(v.asInstanceOf[js.Any], objs.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  inline def buildInfo(): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("buildInfo")().asInstanceOf[js.Object]
  
  inline def clone_(v: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(v.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  inline def compile(srcname: String, script: String): ClassBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("compile")(srcname.asInstanceOf[js.Any], script.asInstanceOf[js.Any])).asInstanceOf[ClassBuffer]
  inline def compile(srcname: String, script: String, mode: Double): ClassBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("compile")(srcname.asInstanceOf[js.Any], script.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[ClassBuffer]
  
  inline def deepFreeze(v: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("deepFreeze")(v.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def difference(list: js.Array[js.Any], arrs: js.Any*): js.Array[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("difference")(list.asInstanceOf[js.Any], arrs.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Any]]
  
  inline def each(list: js.Any, iterator: js.Function): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("each")(list.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def each(list: js.Any, iterator: js.Function, context: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("each")(list.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  inline def extend(v: js.Any, objs: js.Any*): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(v.asInstanceOf[js.Any], objs.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  inline def first(v: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("first")(v.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  inline def first(v: js.Any, n: Double): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("first")(v.asInstanceOf[js.Any], n.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  inline def flatten(arr: js.Any): js.Array[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("flatten")(arr.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Any]]
  inline def flatten(arr: js.Any, shallow: Boolean): js.Array[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("flatten")(arr.asInstanceOf[js.Any], shallow.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Any]]
  
  inline def format(args: js.Any*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("format")(args.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def format(fmt: String, args: js.Any*): String = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(fmt.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def has(v: js.Any, key: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("has")(v.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def inherits(constructor: js.Any, superConstructor: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("inherits")(constructor.asInstanceOf[js.Any], superConstructor.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def inspect(obj: js.Object): String = ^.asInstanceOf[js.Dynamic].applyDynamic("inspect")(obj.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def inspect(obj: js.Object, options: js.Object): String = (^.asInstanceOf[js.Dynamic].applyDynamic("inspect")(obj.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def intersection(arrs: js.Any*): js.Array[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("intersection")(arrs.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Any]]
  
  inline def isArray(v: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isArray")(v.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isAsyncFunction(v: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAsyncFunction")(v.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isBoolean(v: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBoolean")(v.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isBuffer(v: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBuffer")(v.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isDataView(v: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDataView")(v.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isDate(v: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDate")(v.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isEmpty(v: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEmpty")(v.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isExternal(v: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isExternal")(v.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isFunction(v: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFunction")(v.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isMap(v: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMap")(v.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isMapIterator(v: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMapIterator")(v.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isNativeError(v: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNativeError")(v.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isNull(v: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNull")(v.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isNullOrUndefined(v: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNullOrUndefined")(v.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isNumber(v: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNumber")(v.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isObject(v: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isObject")(v.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isPrimitive(v: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPrimitive")(v.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isPromise(v: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPromise")(v.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isRegExp(v: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRegExp")(v.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isSet(v: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSet")(v.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isSetIterator(v: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSetIterator")(v.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isString(v: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isString")(v.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isSymbol(v: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSymbol")(v.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isTypedArray(v: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTypedArray")(v.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isUint8Array(v: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isUint8Array")(v.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isUndefined(v: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isUndefined")(v.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def keys(v: js.Any): js.Array[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("keys")(v.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Any]]
  
  inline def last(v: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("last")(v.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  inline def last(v: js.Any, n: Double): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("last")(v.asInstanceOf[js.Any], n.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  inline def map(list: js.Any, iterator: js.Function): js.Array[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(list.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Any]]
  inline def map(list: js.Any, iterator: js.Function, context: js.Any): js.Array[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(list.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Any]]
  
  inline def omit(v: js.Any, keys: js.Any*): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("omit")(v.asInstanceOf[js.Any], keys.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  
  inline def pick(v: js.Any, objs: js.Any*): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("pick")(v.asInstanceOf[js.Any], objs.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  
  inline def reduce(list: js.Any, iterator: js.Function, memo: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("reduce")(list.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any], memo.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def reduce(list: js.Any, iterator: js.Function, memo: js.Any, context: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("reduce")(list.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any], memo.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  inline def sync(func: js.Function): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("sync")(func.asInstanceOf[js.Any]).asInstanceOf[js.Function]
  inline def sync(func: js.Function, async_func: Boolean): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("sync")(func.asInstanceOf[js.Any], async_func.asInstanceOf[js.Any])).asInstanceOf[js.Function]
  
  inline def union(arrs: js.Any*): js.Array[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("union")(arrs.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Any]]
  
  inline def unique(v: js.Any): js.Array[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("unique")(v.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Any]]
  inline def unique(v: js.Any, sorted: Boolean): js.Array[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("unique")(v.asInstanceOf[js.Any], sorted.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Any]]
  
  inline def values(v: js.Any): js.Array[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("values")(v.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Any]]
  
  inline def without(arr: js.Any, els: js.Any*): js.Array[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("without")(arr.asInstanceOf[js.Any], els.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Any]]
}
