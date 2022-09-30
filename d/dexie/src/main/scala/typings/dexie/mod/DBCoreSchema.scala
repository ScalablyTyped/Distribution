package typings.dexie.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DBCoreSchema extends StObject {
  
  var name: String
  
  var tables: js.Array[DBCoreTableSchema]
}
object DBCoreSchema {
  
  inline def apply(name: String, tables: js.Array[DBCoreTableSchema]): DBCoreSchema = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], tables = tables.asInstanceOf[js.Any])
    __obj.asInstanceOf[DBCoreSchema]
  }
  
  extension [Self <: DBCoreSchema](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setTables(value: js.Array[DBCoreTableSchema]): Self = StObject.set(x, "tables", value.asInstanceOf[js.Any])
    
    inline def setTablesVarargs(value: DBCoreTableSchema*): Self = StObject.set(x, "tables", js.Array(value*))
  }
}
