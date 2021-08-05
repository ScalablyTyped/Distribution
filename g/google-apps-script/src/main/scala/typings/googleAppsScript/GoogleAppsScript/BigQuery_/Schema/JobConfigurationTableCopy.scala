package typings.googleAppsScript.GoogleAppsScript.BigQuery_.Schema

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JobConfigurationTableCopy extends StObject {
  
  var createDisposition: js.UndefOr[String] = js.undefined
  
  var destinationEncryptionConfiguration: js.UndefOr[EncryptionConfiguration] = js.undefined
  
  var destinationTable: js.UndefOr[TableReference] = js.undefined
  
  var sourceTable: js.UndefOr[TableReference] = js.undefined
  
  var sourceTables: js.UndefOr[js.Array[TableReference]] = js.undefined
  
  var writeDisposition: js.UndefOr[String] = js.undefined
}
object JobConfigurationTableCopy {
  
  inline def apply(): JobConfigurationTableCopy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobConfigurationTableCopy]
  }
  
  extension [Self <: JobConfigurationTableCopy](x: Self) {
    
    inline def setCreateDisposition(value: String): Self = StObject.set(x, "createDisposition", value.asInstanceOf[js.Any])
    
    inline def setCreateDispositionUndefined: Self = StObject.set(x, "createDisposition", js.undefined)
    
    inline def setDestinationEncryptionConfiguration(value: EncryptionConfiguration): Self = StObject.set(x, "destinationEncryptionConfiguration", value.asInstanceOf[js.Any])
    
    inline def setDestinationEncryptionConfigurationUndefined: Self = StObject.set(x, "destinationEncryptionConfiguration", js.undefined)
    
    inline def setDestinationTable(value: TableReference): Self = StObject.set(x, "destinationTable", value.asInstanceOf[js.Any])
    
    inline def setDestinationTableUndefined: Self = StObject.set(x, "destinationTable", js.undefined)
    
    inline def setSourceTable(value: TableReference): Self = StObject.set(x, "sourceTable", value.asInstanceOf[js.Any])
    
    inline def setSourceTableUndefined: Self = StObject.set(x, "sourceTable", js.undefined)
    
    inline def setSourceTables(value: js.Array[TableReference]): Self = StObject.set(x, "sourceTables", value.asInstanceOf[js.Any])
    
    inline def setSourceTablesUndefined: Self = StObject.set(x, "sourceTables", js.undefined)
    
    inline def setSourceTablesVarargs(value: TableReference*): Self = StObject.set(x, "sourceTables", js.Array(value :_*))
    
    inline def setWriteDisposition(value: String): Self = StObject.set(x, "writeDisposition", value.asInstanceOf[js.Any])
    
    inline def setWriteDispositionUndefined: Self = StObject.set(x, "writeDisposition", js.undefined)
  }
}
