package typings.googleAppsScript.GoogleAppsScript.BigQuery_.Schema

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BigtableOptions extends StObject {
  
  var columnFamilies: js.UndefOr[js.Array[BigtableColumnFamily]] = js.undefined
  
  var ignoreUnspecifiedColumnFamilies: js.UndefOr[Boolean] = js.undefined
  
  var readRowkeyAsString: js.UndefOr[Boolean] = js.undefined
}
object BigtableOptions {
  
  inline def apply(): BigtableOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BigtableOptions]
  }
  
  extension [Self <: BigtableOptions](x: Self) {
    
    inline def setColumnFamilies(value: js.Array[BigtableColumnFamily]): Self = StObject.set(x, "columnFamilies", value.asInstanceOf[js.Any])
    
    inline def setColumnFamiliesUndefined: Self = StObject.set(x, "columnFamilies", js.undefined)
    
    inline def setColumnFamiliesVarargs(value: BigtableColumnFamily*): Self = StObject.set(x, "columnFamilies", js.Array(value :_*))
    
    inline def setIgnoreUnspecifiedColumnFamilies(value: Boolean): Self = StObject.set(x, "ignoreUnspecifiedColumnFamilies", value.asInstanceOf[js.Any])
    
    inline def setIgnoreUnspecifiedColumnFamiliesUndefined: Self = StObject.set(x, "ignoreUnspecifiedColumnFamilies", js.undefined)
    
    inline def setReadRowkeyAsString(value: Boolean): Self = StObject.set(x, "readRowkeyAsString", value.asInstanceOf[js.Any])
    
    inline def setReadRowkeyAsStringUndefined: Self = StObject.set(x, "readRowkeyAsString", js.undefined)
  }
}
