package typings.fastCopy

import typings.fastCopy.distCjsTypesUtilsMod.Cache
import typings.std.Blob
import typings.std.Map
import typings.std.Number
import typings.std.Record
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCjsTypesCopierMod {
  
  @JSImport("fast-copy/dist/cjs/types/copier", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def copyArrayBuffer[Value /* <: js.typedarray.ArrayBuffer */](arrayBuffer: Value, _state: State): Value = (^.asInstanceOf[js.Dynamic].applyDynamic("copyArrayBuffer")(arrayBuffer.asInstanceOf[js.Any], _state.asInstanceOf[js.Any])).asInstanceOf[Value]
  
  inline def copyArrayLoose(array: js.Array[Any], state: State): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("copyArrayLoose")(array.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def copyArrayStrict[Value /* <: js.Array[Any] */](array: Value, state: State): Value = (^.asInstanceOf[js.Dynamic].applyDynamic("copyArrayStrict")(array.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Value]
  
  inline def copyBlob[Value /* <: Blob */](blob: Value, _state: State): Value = (^.asInstanceOf[js.Dynamic].applyDynamic("copyBlob")(blob.asInstanceOf[js.Any], _state.asInstanceOf[js.Any])).asInstanceOf[Value]
  
  inline def copyDataView[Value /* <: js.typedarray.DataView */](dataView: Value, state: State): Value = (^.asInstanceOf[js.Dynamic].applyDynamic("copyDataView")(dataView.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Value]
  
  inline def copyDate[Value /* <: js.Date */](date: Value, state: State): Value = (^.asInstanceOf[js.Dynamic].applyDynamic("copyDate")(date.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Value]
  
  inline def copyMapLoose[Value /* <: Map[Any, Any] */](map: Value, state: State): Value = (^.asInstanceOf[js.Dynamic].applyDynamic("copyMapLoose")(map.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Value]
  
  inline def copyMapStrict[Value /* <: Map[Any, Any] */](map: Value, state: State): Value = (^.asInstanceOf[js.Dynamic].applyDynamic("copyMapStrict")(map.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Value]
  
  inline def copyObjectLoose[Value /* <: Record[String, Any] */](`object`: Value, state: State): Value = (^.asInstanceOf[js.Dynamic].applyDynamic("copyObjectLoose")(`object`.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Value]
  
  inline def copyObjectStrict[Value /* <: Record[String, Any] */](`object`: Value, state: State): Value = (^.asInstanceOf[js.Dynamic].applyDynamic("copyObjectStrict")(`object`.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Value]
  
  inline def copyPrimitiveWrapper(primitiveObject: String, state: State): String = (^.asInstanceOf[js.Dynamic].applyDynamic("copyPrimitiveWrapper")(primitiveObject.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def copyPrimitiveWrapper(primitiveObject: Boolean, state: State): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("copyPrimitiveWrapper")(primitiveObject.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def copyPrimitiveWrapper(primitiveObject: Number, state: State): Number = (^.asInstanceOf[js.Dynamic].applyDynamic("copyPrimitiveWrapper")(primitiveObject.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Number]
  
  inline def copyRegExp[Value /* <: js.RegExp */](regExp: Value, state: State): Value = (^.asInstanceOf[js.Dynamic].applyDynamic("copyRegExp")(regExp.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Value]
  
  inline def copySelf[Value](value: Value, _state: State): Value = (^.asInstanceOf[js.Dynamic].applyDynamic("copySelf")(value.asInstanceOf[js.Any], _state.asInstanceOf[js.Any])).asInstanceOf[Value]
  
  inline def copySetLoose[Value /* <: Set[Any] */](set: Value, state: State): Value = (^.asInstanceOf[js.Dynamic].applyDynamic("copySetLoose")(set.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Value]
  
  inline def copySetStrict[Value /* <: Set[Any] */](set: Value, state: State): Value = (^.asInstanceOf[js.Dynamic].applyDynamic("copySetStrict")(set.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Value]
  
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
    
    extension [Self <: State](x: Self) {
      
      inline def setCache(value: Cache): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      inline def setConstructor(value: Any): Self = StObject.set(x, "Constructor", value.asInstanceOf[js.Any])
      
      inline def setCopier(value: (Any, /* state */ State) => Any): Self = StObject.set(x, "copier", js.Any.fromFunction2(value))
    }
  }
}
