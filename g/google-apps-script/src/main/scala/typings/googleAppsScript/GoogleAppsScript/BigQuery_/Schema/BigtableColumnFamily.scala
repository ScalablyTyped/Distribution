package typings.googleAppsScript.GoogleAppsScript.BigQuery_.Schema

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BigtableColumnFamily extends StObject {
  
  var columns: js.UndefOr[js.Array[BigtableColumn]] = js.undefined
  
  var encoding: js.UndefOr[String] = js.undefined
  
  var familyId: js.UndefOr[String] = js.undefined
  
  var onlyReadLatest: js.UndefOr[Boolean] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
}
object BigtableColumnFamily {
  
  inline def apply(): BigtableColumnFamily = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BigtableColumnFamily]
  }
  
  extension [Self <: BigtableColumnFamily](x: Self) {
    
    inline def setColumns(value: js.Array[BigtableColumn]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    inline def setColumnsVarargs(value: BigtableColumn*): Self = StObject.set(x, "columns", js.Array(value :_*))
    
    inline def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
    
    inline def setFamilyId(value: String): Self = StObject.set(x, "familyId", value.asInstanceOf[js.Any])
    
    inline def setFamilyIdUndefined: Self = StObject.set(x, "familyId", js.undefined)
    
    inline def setOnlyReadLatest(value: Boolean): Self = StObject.set(x, "onlyReadLatest", value.asInstanceOf[js.Any])
    
    inline def setOnlyReadLatestUndefined: Self = StObject.set(x, "onlyReadLatest", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
