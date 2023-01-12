package typings.fastCopy

import typings.std.Blob
import typings.std.Map
import typings.std.Record
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("fast-copy", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[Value](value: Value): Value = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(value.asInstanceOf[js.Any]).asInstanceOf[Value]
  
  inline def copyStrict[Value](value: Value): Value = ^.asInstanceOf[js.Dynamic].applyDynamic("copyStrict")(value.asInstanceOf[js.Any]).asInstanceOf[Value]
  
  inline def createCopier(options: CreateCopierOptions): js.Function1[/* value */ Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("createCopier")(options.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* value */ Any, Any]]
  
  inline def createStrictCopier(options: CreateCopierOptions): js.Function1[/* value */ Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("createStrictCopier")(options.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* value */ Any, Any]]
  
  trait Cache extends StObject {
    
    var _keys: js.UndefOr[js.Array[Any]] = js.undefined
    
    var _values: js.UndefOr[js.Array[Any]] = js.undefined
    
    def get(key: Any): Any
    
    def has(value: Any): Boolean
    
    def set(key: Any, value: Any): Unit
  }
  object Cache {
    
    inline def apply(get: Any => Any, has: Any => Boolean, set: (Any, Any) => Unit): Cache = {
      val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), has = js.Any.fromFunction1(has), set = js.Any.fromFunction2(set))
      __obj.asInstanceOf[Cache]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Cache] (val x: Self) extends AnyVal {
      
      inline def setGet(value: Any => Any): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      inline def setHas(value: Any => Boolean): Self = StObject.set(x, "has", js.Any.fromFunction1(value))
      
      inline def setSet(value: (Any, Any) => Unit): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
      
      inline def set_keys(value: js.Array[Any]): Self = StObject.set(x, "_keys", value.asInstanceOf[js.Any])
      
      inline def set_keysUndefined: Self = StObject.set(x, "_keys", js.undefined)
      
      inline def set_keysVarargs(value: Any*): Self = StObject.set(x, "_keys", js.Array(value*))
      
      inline def set_values(value: js.Array[Any]): Self = StObject.set(x, "_values", value.asInstanceOf[js.Any])
      
      inline def set_valuesUndefined: Self = StObject.set(x, "_values", js.undefined)
      
      inline def set_valuesVarargs(value: Any*): Self = StObject.set(x, "_values", js.Array(value*))
    }
  }
  
  trait CreateCopierOptions extends StObject {
    
    var array: js.UndefOr[InternalCopier[js.Array[Any]]] = js.undefined
    
    var arrayBuffer: js.UndefOr[InternalCopier[js.typedarray.ArrayBuffer]] = js.undefined
    
    var blob: js.UndefOr[InternalCopier[Blob]] = js.undefined
    
    var dataView: js.UndefOr[InternalCopier[js.typedarray.DataView]] = js.undefined
    
    var date: js.UndefOr[InternalCopier[js.Date]] = js.undefined
    
    var map: js.UndefOr[InternalCopier[Map[Any, Any]]] = js.undefined
    
    var `object`: js.UndefOr[InternalCopier[Record[String, Any]]] = js.undefined
    
    var regExp: js.UndefOr[InternalCopier[js.RegExp]] = js.undefined
    
    var set: js.UndefOr[InternalCopier[Set[Any]]] = js.undefined
  }
  object CreateCopierOptions {
    
    inline def apply(): CreateCopierOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateCopierOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CreateCopierOptions] (val x: Self) extends AnyVal {
      
      inline def setArray(value: (js.Array[Any], /* state */ State) => js.Array[Any]): Self = StObject.set(x, "array", js.Any.fromFunction2(value))
      
      inline def setArrayBuffer(value: (js.typedarray.ArrayBuffer, /* state */ State) => js.typedarray.ArrayBuffer): Self = StObject.set(x, "arrayBuffer", js.Any.fromFunction2(value))
      
      inline def setArrayBufferUndefined: Self = StObject.set(x, "arrayBuffer", js.undefined)
      
      inline def setArrayUndefined: Self = StObject.set(x, "array", js.undefined)
      
      inline def setBlob(value: (Blob, /* state */ State) => Blob): Self = StObject.set(x, "blob", js.Any.fromFunction2(value))
      
      inline def setBlobUndefined: Self = StObject.set(x, "blob", js.undefined)
      
      inline def setDataView(value: (js.typedarray.DataView, /* state */ State) => js.typedarray.DataView): Self = StObject.set(x, "dataView", js.Any.fromFunction2(value))
      
      inline def setDataViewUndefined: Self = StObject.set(x, "dataView", js.undefined)
      
      inline def setDate(value: (js.Date, /* state */ State) => js.Date): Self = StObject.set(x, "date", js.Any.fromFunction2(value))
      
      inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
      
      inline def setMap(value: (Map[Any, Any], /* state */ State) => Map[Any, Any]): Self = StObject.set(x, "map", js.Any.fromFunction2(value))
      
      inline def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
      
      inline def setObject(value: (Record[String, Any], /* state */ State) => Record[String, Any]): Self = StObject.set(x, "object", js.Any.fromFunction2(value))
      
      inline def setObjectUndefined: Self = StObject.set(x, "object", js.undefined)
      
      inline def setRegExp(value: (js.RegExp, /* state */ State) => js.RegExp): Self = StObject.set(x, "regExp", js.Any.fromFunction2(value))
      
      inline def setRegExpUndefined: Self = StObject.set(x, "regExp", js.undefined)
      
      inline def setSet(value: (Set[Any], /* state */ State) => Set[Any]): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
      
      inline def setSetUndefined: Self = StObject.set(x, "set", js.undefined)
    }
  }
  
  type InternalCopier[Value] = js.Function2[/* value */ Value, /* state */ State, Value]
  
  trait State extends StObject {
    
    var Constructor: Any
    
    var cache: Cache
    
    def copier(value: Any, state: State): Any
    @JSName("copier")
    var copier_Original: InternalCopier[Any]
  }
  object State {
    
    inline def apply(Constructor: Any, cache: Cache, copier: (Any, /* state */ State) => Any): State = {
      val __obj = js.Dynamic.literal(Constructor = Constructor.asInstanceOf[js.Any], cache = cache.asInstanceOf[js.Any], copier = js.Any.fromFunction2(copier))
      __obj.asInstanceOf[State]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: State] (val x: Self) extends AnyVal {
      
      inline def setCache(value: Cache): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      inline def setConstructor(value: Any): Self = StObject.set(x, "Constructor", value.asInstanceOf[js.Any])
      
      inline def setCopier(value: (Any, /* state */ State) => Any): Self = StObject.set(x, "copier", js.Any.fromFunction2(value))
    }
  }
}
