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
  open class LruCache ()
    extends StObject
       with ClassLruCache
  
  @JSImport("util", "Stats")
  @js.native
  open class Stats ()
    extends StObject
       with ClassStats
  
  inline def _extend(v: Any, objs: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("_extend")(List(v.asInstanceOf[js.Any]).`++`(objs.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Any]
  
  inline def buildInfo(): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("buildInfo")().asInstanceOf[js.Object]
  
  inline def clone_(v: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(v.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def compile(srcname: String, script: String): ClassBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("compile")(srcname.asInstanceOf[js.Any], script.asInstanceOf[js.Any])).asInstanceOf[ClassBuffer]
  inline def compile(srcname: String, script: String, mode: Double): ClassBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("compile")(srcname.asInstanceOf[js.Any], script.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[ClassBuffer]
  
  inline def deepFreeze(v: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("deepFreeze")(v.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def difference(list: js.Array[Any], arrs: Any*): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("difference")(List(list.asInstanceOf[js.Any]).`++`(arrs.asInstanceOf[Seq[js.Any]])*).asInstanceOf[js.Array[Any]]
  
  inline def each(list: Any, iterator: js.Function): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("each")(list.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def each(list: Any, iterator: js.Function, context: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("each")(list.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def extend(v: Any, objs: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(List(v.asInstanceOf[js.Any]).`++`(objs.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Any]
  
  inline def first(v: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("first")(v.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def first(v: Any, n: Double): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("first")(v.asInstanceOf[js.Any], n.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def flatten(arr: Any): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("flatten")(arr.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]
  inline def flatten(arr: Any, shallow: Boolean): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("flatten")(arr.asInstanceOf[js.Any], shallow.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
  
  inline def format(args: Any*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("format")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[String]
  inline def format(fmt: String, args: Any*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("format")(List(fmt.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[String]
  
  inline def has(v: Any, key: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("has")(v.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def inherits(constructor: Any, superConstructor: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("inherits")(constructor.asInstanceOf[js.Any], superConstructor.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def inspect(obj: js.Object): String = ^.asInstanceOf[js.Dynamic].applyDynamic("inspect")(obj.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def inspect(obj: js.Object, options: js.Object): String = (^.asInstanceOf[js.Dynamic].applyDynamic("inspect")(obj.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def intersection(arrs: Any*): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("intersection")(arrs.asInstanceOf[Seq[js.Any]]*).asInstanceOf[js.Array[Any]]
  
  inline def isArray(v: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isArray")(v.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isAsyncFunction(v: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAsyncFunction")(v.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isBoolean(v: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBoolean")(v.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isBuffer(v: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBuffer")(v.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isDataView(v: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDataView")(v.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isDate(v: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDate")(v.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isEmpty(v: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEmpty")(v.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isExternal(v: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isExternal")(v.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isFunction(v: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFunction")(v.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isMap(v: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMap")(v.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isMapIterator(v: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMapIterator")(v.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isNativeError(v: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNativeError")(v.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isNull(v: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNull")(v.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isNullOrUndefined(v: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNullOrUndefined")(v.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isNumber(v: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNumber")(v.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isObject(v: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isObject")(v.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isPrimitive(v: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPrimitive")(v.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isPromise(v: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPromise")(v.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isRegExp(v: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRegExp")(v.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isSet(v: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSet")(v.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isSetIterator(v: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSetIterator")(v.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isString(v: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isString")(v.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isSymbol(v: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSymbol")(v.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isTypedArray(v: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTypedArray")(v.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isUint8Array(v: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isUint8Array")(v.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isUndefined(v: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isUndefined")(v.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def keys(v: Any): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("keys")(v.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]
  
  inline def last(v: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("last")(v.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def last(v: Any, n: Double): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("last")(v.asInstanceOf[js.Any], n.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def map(list: Any, iterator: js.Function): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(list.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
  inline def map(list: Any, iterator: js.Function, context: Any): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(list.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
  
  inline def omit(v: Any, keys: Any*): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("omit")(List(v.asInstanceOf[js.Any]).`++`(keys.asInstanceOf[Seq[js.Any]])*).asInstanceOf[js.Object]
  
  inline def pick(v: Any, objs: Any*): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("pick")(List(v.asInstanceOf[js.Any]).`++`(objs.asInstanceOf[Seq[js.Any]])*).asInstanceOf[js.Object]
  
  inline def reduce(list: Any, iterator: js.Function, memo: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("reduce")(list.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any], memo.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def reduce(list: Any, iterator: js.Function, memo: Any, context: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("reduce")(list.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any], memo.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def sync(func: js.Function): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("sync")(func.asInstanceOf[js.Any]).asInstanceOf[js.Function]
  inline def sync(func: js.Function, async_func: Boolean): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("sync")(func.asInstanceOf[js.Any], async_func.asInstanceOf[js.Any])).asInstanceOf[js.Function]
  
  inline def union(arrs: Any*): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("union")(arrs.asInstanceOf[Seq[js.Any]]*).asInstanceOf[js.Array[Any]]
  
  inline def unique(v: Any): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("unique")(v.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]
  inline def unique(v: Any, sorted: Boolean): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("unique")(v.asInstanceOf[js.Any], sorted.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
  
  inline def values(v: Any): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("values")(v.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]
  
  inline def without(arr: Any, els: Any*): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("without")(List(arr.asInstanceOf[js.Any]).`++`(els.asInstanceOf[Seq[js.Any]])*).asInstanceOf[js.Array[Any]]
}
