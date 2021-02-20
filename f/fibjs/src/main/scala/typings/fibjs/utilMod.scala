package typings.fibjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** module Or Internal Object */
/**
  * @brief 常用工具模块
  * @detail 
  */
object utilMod {
  
  @JSImport("util", "LruCache")
  @js.native
  class LruCache () extends ClassLruCache
  
  @JSImport("util", "Stats")
  @js.native
  class Stats () extends ClassStats
  
  @JSImport("util", "_extend")
  @js.native
  def _extend(v: js.Any, objs: js.Any*): js.Any = js.native
  
  @JSImport("util", "buildInfo")
  @js.native
  def buildInfo(): js.Object = js.native
  
  @JSImport("util", "clone")
  @js.native
  def clone_(v: js.Any): js.Any = js.native
  
  @JSImport("util", "compile")
  @js.native
  def compile(srcname: String, script: String): ClassBuffer = js.native
  @JSImport("util", "compile")
  @js.native
  def compile(srcname: String, script: String, mode: Double): ClassBuffer = js.native
  
  @JSImport("util", "deepFreeze")
  @js.native
  def deepFreeze(v: js.Any): Unit = js.native
  
  @JSImport("util", "difference")
  @js.native
  def difference(list: js.Array[_], arrs: js.Any*): js.Array[_] = js.native
  
  @JSImport("util", "each")
  @js.native
  def each(list: js.Any, iterator: js.Function): js.Any = js.native
  @JSImport("util", "each")
  @js.native
  def each(list: js.Any, iterator: js.Function, context: js.Any): js.Any = js.native
  
  @JSImport("util", "extend")
  @js.native
  def extend(v: js.Any, objs: js.Any*): js.Any = js.native
  
  @JSImport("util", "first")
  @js.native
  def first(v: js.Any): js.Any = js.native
  @JSImport("util", "first")
  @js.native
  def first(v: js.Any, n: Double): js.Any = js.native
  
  @JSImport("util", "flatten")
  @js.native
  def flatten(arr: js.Any): js.Array[_] = js.native
  @JSImport("util", "flatten")
  @js.native
  def flatten(arr: js.Any, shallow: Boolean): js.Array[_] = js.native
  
  @JSImport("util", "format")
  @js.native
  def format(args: js.Any*): String = js.native
  @JSImport("util", "format")
  @js.native
  def format(fmt: String, args: js.Any*): String = js.native
  
  @JSImport("util", "has")
  @js.native
  def has(v: js.Any, key: String): Boolean = js.native
  
  @JSImport("util", "inherits")
  @js.native
  def inherits(constructor: js.Any, superConstructor: js.Any): Unit = js.native
  
  @JSImport("util", "inspect")
  @js.native
  def inspect(obj: js.Object): String = js.native
  @JSImport("util", "inspect")
  @js.native
  def inspect(obj: js.Object, options: js.Object): String = js.native
  
  @JSImport("util", "intersection")
  @js.native
  def intersection(arrs: js.Any*): js.Array[_] = js.native
  
  @JSImport("util", "isArray")
  @js.native
  def isArray(v: js.Any): Boolean = js.native
  
  @JSImport("util", "isAsyncFunction")
  @js.native
  def isAsyncFunction(v: js.Any): Boolean = js.native
  
  @JSImport("util", "isBoolean")
  @js.native
  def isBoolean(v: js.Any): Boolean = js.native
  
  @JSImport("util", "isBuffer")
  @js.native
  def isBuffer(v: js.Any): Boolean = js.native
  
  @JSImport("util", "isDataView")
  @js.native
  def isDataView(v: js.Any): Boolean = js.native
  
  @JSImport("util", "isDate")
  @js.native
  def isDate(v: js.Any): Boolean = js.native
  
  @JSImport("util", "isEmpty")
  @js.native
  def isEmpty(v: js.Any): Boolean = js.native
  
  @JSImport("util", "isExternal")
  @js.native
  def isExternal(v: js.Any): Boolean = js.native
  
  @JSImport("util", "isFunction")
  @js.native
  def isFunction(v: js.Any): Boolean = js.native
  
  @JSImport("util", "isMap")
  @js.native
  def isMap(v: js.Any): Boolean = js.native
  
  @JSImport("util", "isMapIterator")
  @js.native
  def isMapIterator(v: js.Any): Boolean = js.native
  
  @JSImport("util", "isNativeError")
  @js.native
  def isNativeError(v: js.Any): Boolean = js.native
  
  @JSImport("util", "isNull")
  @js.native
  def isNull(v: js.Any): Boolean = js.native
  
  @JSImport("util", "isNullOrUndefined")
  @js.native
  def isNullOrUndefined(v: js.Any): Boolean = js.native
  
  @JSImport("util", "isNumber")
  @js.native
  def isNumber(v: js.Any): Boolean = js.native
  
  @JSImport("util", "isObject")
  @js.native
  def isObject(v: js.Any): Boolean = js.native
  
  @JSImport("util", "isPrimitive")
  @js.native
  def isPrimitive(v: js.Any): Boolean = js.native
  
  @JSImport("util", "isPromise")
  @js.native
  def isPromise(v: js.Any): Boolean = js.native
  
  @JSImport("util", "isRegExp")
  @js.native
  def isRegExp(v: js.Any): Boolean = js.native
  
  @JSImport("util", "isSet")
  @js.native
  def isSet(v: js.Any): Boolean = js.native
  
  @JSImport("util", "isSetIterator")
  @js.native
  def isSetIterator(v: js.Any): Boolean = js.native
  
  @JSImport("util", "isString")
  @js.native
  def isString(v: js.Any): Boolean = js.native
  
  @JSImport("util", "isSymbol")
  @js.native
  def isSymbol(v: js.Any): Boolean = js.native
  
  @JSImport("util", "isTypedArray")
  @js.native
  def isTypedArray(v: js.Any): Boolean = js.native
  
  @JSImport("util", "isUint8Array")
  @js.native
  def isUint8Array(v: js.Any): Boolean = js.native
  
  @JSImport("util", "isUndefined")
  @js.native
  def isUndefined(v: js.Any): Boolean = js.native
  
  @JSImport("util", "keys")
  @js.native
  def keys(v: js.Any): js.Array[_] = js.native
  
  @JSImport("util", "last")
  @js.native
  def last(v: js.Any): js.Any = js.native
  @JSImport("util", "last")
  @js.native
  def last(v: js.Any, n: Double): js.Any = js.native
  
  @JSImport("util", "map")
  @js.native
  def map(list: js.Any, iterator: js.Function): js.Array[_] = js.native
  @JSImport("util", "map")
  @js.native
  def map(list: js.Any, iterator: js.Function, context: js.Any): js.Array[_] = js.native
  
  @JSImport("util", "omit")
  @js.native
  def omit(v: js.Any, keys: js.Any*): js.Object = js.native
  
  @JSImport("util", "pick")
  @js.native
  def pick(v: js.Any, objs: js.Any*): js.Object = js.native
  
  @JSImport("util", "reduce")
  @js.native
  def reduce(list: js.Any, iterator: js.Function, memo: js.Any): js.Any = js.native
  @JSImport("util", "reduce")
  @js.native
  def reduce(list: js.Any, iterator: js.Function, memo: js.Any, context: js.Any): js.Any = js.native
  
  @JSImport("util", "sync")
  @js.native
  def sync(func: js.Function): js.Function = js.native
  @JSImport("util", "sync")
  @js.native
  def sync(func: js.Function, async_func: Boolean): js.Function = js.native
  
  @JSImport("util", "union")
  @js.native
  def union(arrs: js.Any*): js.Array[_] = js.native
  
  @JSImport("util", "unique")
  @js.native
  def unique(v: js.Any): js.Array[_] = js.native
  @JSImport("util", "unique")
  @js.native
  def unique(v: js.Any, sorted: Boolean): js.Array[_] = js.native
  
  @JSImport("util", "values")
  @js.native
  def values(v: js.Any): js.Array[_] = js.native
  
  @JSImport("util", "without")
  @js.native
  def without(arr: js.Any, els: js.Any*): js.Array[_] = js.native
}
