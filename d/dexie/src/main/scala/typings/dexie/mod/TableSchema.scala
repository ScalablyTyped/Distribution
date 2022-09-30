package typings.dexie.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TableSchema extends StObject {
  
  var idxByName: StringDictionary[IndexSpec]
  
  var indexes: js.Array[IndexSpec]
  
  var mappedClass: js.Function
  
  var name: String
  
  var primKey: IndexSpec
  
  var readHook: js.UndefOr[js.Function1[/* x */ Any, Any]] = js.undefined
}
object TableSchema {
  
  inline def apply(
    idxByName: StringDictionary[IndexSpec],
    indexes: js.Array[IndexSpec],
    mappedClass: js.Function,
    name: String,
    primKey: IndexSpec
  ): TableSchema = {
    val __obj = js.Dynamic.literal(idxByName = idxByName.asInstanceOf[js.Any], indexes = indexes.asInstanceOf[js.Any], mappedClass = mappedClass.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], primKey = primKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableSchema]
  }
  
  extension [Self <: TableSchema](x: Self) {
    
    inline def setIdxByName(value: StringDictionary[IndexSpec]): Self = StObject.set(x, "idxByName", value.asInstanceOf[js.Any])
    
    inline def setIndexes(value: js.Array[IndexSpec]): Self = StObject.set(x, "indexes", value.asInstanceOf[js.Any])
    
    inline def setIndexesVarargs(value: IndexSpec*): Self = StObject.set(x, "indexes", js.Array(value*))
    
    inline def setMappedClass(value: js.Function): Self = StObject.set(x, "mappedClass", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPrimKey(value: IndexSpec): Self = StObject.set(x, "primKey", value.asInstanceOf[js.Any])
    
    inline def setReadHook(value: /* x */ Any => Any): Self = StObject.set(x, "readHook", js.Any.fromFunction1(value))
    
    inline def setReadHookUndefined: Self = StObject.set(x, "readHook", js.undefined)
  }
}
