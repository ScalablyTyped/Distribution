package typings.fibjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** module Or Internal Object */
/**
  * @brief 常用工具模块
  * @detail 
  */
@JSImport("util", JSImport.Namespace)
@js.native
object utilMod extends js.Object {
  
  def _extend(v: js.Any, objs: js.Any*): js.Any = js.native
  
  def buildInfo(): js.Object = js.native
  
  def clone(v: js.Any): js.Any = js.native
  
  def compile(srcname: String, script: String): ClassBuffer = js.native
  def compile(srcname: String, script: String, mode: Double): ClassBuffer = js.native
  
  def deepFreeze(v: js.Any): Unit = js.native
  
  def difference(list: js.Array[_], arrs: js.Any*): js.Array[_] = js.native
  
  def each(list: js.Any, iterator: js.Function): js.Any = js.native
  def each(list: js.Any, iterator: js.Function, context: js.Any): js.Any = js.native
  
  def extend(v: js.Any, objs: js.Any*): js.Any = js.native
  
  def first(v: js.Any): js.Any = js.native
  def first(v: js.Any, n: Double): js.Any = js.native
  
  def flatten(arr: js.Any): js.Array[_] = js.native
  def flatten(arr: js.Any, shallow: Boolean): js.Array[_] = js.native
  
  def format(args: js.Any*): String = js.native
  def format(fmt: String, args: js.Any*): String = js.native
  
  def has(v: js.Any, key: String): Boolean = js.native
  
  def inherits(constructor: js.Any, superConstructor: js.Any): Unit = js.native
  
  def inspect(obj: js.Object): String = js.native
  def inspect(obj: js.Object, options: js.Object): String = js.native
  
  def intersection(arrs: js.Any*): js.Array[_] = js.native
  
  def isArray(v: js.Any): Boolean = js.native
  
  def isAsyncFunction(v: js.Any): Boolean = js.native
  
  def isBoolean(v: js.Any): Boolean = js.native
  
  def isBuffer(v: js.Any): Boolean = js.native
  
  def isDataView(v: js.Any): Boolean = js.native
  
  def isDate(v: js.Any): Boolean = js.native
  
  def isEmpty(v: js.Any): Boolean = js.native
  
  def isExternal(v: js.Any): Boolean = js.native
  
  def isFunction(v: js.Any): Boolean = js.native
  
  def isMap(v: js.Any): Boolean = js.native
  
  def isMapIterator(v: js.Any): Boolean = js.native
  
  def isNativeError(v: js.Any): Boolean = js.native
  
  def isNull(v: js.Any): Boolean = js.native
  
  def isNullOrUndefined(v: js.Any): Boolean = js.native
  
  def isNumber(v: js.Any): Boolean = js.native
  
  def isObject(v: js.Any): Boolean = js.native
  
  def isPrimitive(v: js.Any): Boolean = js.native
  
  def isPromise(v: js.Any): Boolean = js.native
  
  def isRegExp(v: js.Any): Boolean = js.native
  
  def isSet(v: js.Any): Boolean = js.native
  
  def isSetIterator(v: js.Any): Boolean = js.native
  
  def isString(v: js.Any): Boolean = js.native
  
  def isSymbol(v: js.Any): Boolean = js.native
  
  def isTypedArray(v: js.Any): Boolean = js.native
  
  def isUint8Array(v: js.Any): Boolean = js.native
  
  def isUndefined(v: js.Any): Boolean = js.native
  
  def keys(v: js.Any): js.Array[_] = js.native
  
  def last(v: js.Any): js.Any = js.native
  def last(v: js.Any, n: Double): js.Any = js.native
  
  def map(list: js.Any, iterator: js.Function): js.Array[_] = js.native
  def map(list: js.Any, iterator: js.Function, context: js.Any): js.Array[_] = js.native
  
  def omit(v: js.Any, keys: js.Any*): js.Object = js.native
  
  def pick(v: js.Any, objs: js.Any*): js.Object = js.native
  
  def reduce(list: js.Any, iterator: js.Function, memo: js.Any): js.Any = js.native
  def reduce(list: js.Any, iterator: js.Function, memo: js.Any, context: js.Any): js.Any = js.native
  
  def sync(func: js.Function): js.Function = js.native
  def sync(func: js.Function, async_func: Boolean): js.Function = js.native
  
  def union(arrs: js.Any*): js.Array[_] = js.native
  
  def unique(v: js.Any): js.Array[_] = js.native
  def unique(v: js.Any, sorted: Boolean): js.Array[_] = js.native
  
  def values(v: js.Any): js.Array[_] = js.native
  
  def without(arr: js.Any, els: js.Any*): js.Array[_] = js.native
  
  @js.native
  class LruCache () extends ClassLruCache
  
  @js.native
  class Stats () extends ClassStats
}
