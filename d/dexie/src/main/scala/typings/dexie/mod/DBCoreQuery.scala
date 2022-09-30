package typings.dexie.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DBCoreQuery extends StObject {
  
  var index: DBCoreIndex
  
  //keyPath: null | string | string[]; // null represents primary key. string a property, string[] several properties.
  var range: DBCoreKeyRange
}
object DBCoreQuery {
  
  inline def apply(index: DBCoreIndex, range: DBCoreKeyRange): DBCoreQuery = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any])
    __obj.asInstanceOf[DBCoreQuery]
  }
  
  extension [Self <: DBCoreQuery](x: Self) {
    
    inline def setIndex(value: DBCoreIndex): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setRange(value: DBCoreKeyRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
  }
}
