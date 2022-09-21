package typings.googleapis.bigqueryV2Mod.bigqueryV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDmlStatistics extends StObject {
  
  /**
    * Number of deleted Rows. populated by DML DELETE, MERGE and TRUNCATE statements.
    */
  var deletedRowCount: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Number of inserted Rows. Populated by DML INSERT and MERGE statements.
    */
  var insertedRowCount: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Number of updated Rows. Populated by DML UPDATE and MERGE statements.
    */
  var updatedRowCount: js.UndefOr[String | Null] = js.undefined
}
object SchemaDmlStatistics {
  
  inline def apply(): SchemaDmlStatistics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDmlStatistics]
  }
  
  extension [Self <: SchemaDmlStatistics](x: Self) {
    
    inline def setDeletedRowCount(value: String): Self = StObject.set(x, "deletedRowCount", value.asInstanceOf[js.Any])
    
    inline def setDeletedRowCountNull: Self = StObject.set(x, "deletedRowCount", null)
    
    inline def setDeletedRowCountUndefined: Self = StObject.set(x, "deletedRowCount", js.undefined)
    
    inline def setInsertedRowCount(value: String): Self = StObject.set(x, "insertedRowCount", value.asInstanceOf[js.Any])
    
    inline def setInsertedRowCountNull: Self = StObject.set(x, "insertedRowCount", null)
    
    inline def setInsertedRowCountUndefined: Self = StObject.set(x, "insertedRowCount", js.undefined)
    
    inline def setUpdatedRowCount(value: String): Self = StObject.set(x, "updatedRowCount", value.asInstanceOf[js.Any])
    
    inline def setUpdatedRowCountNull: Self = StObject.set(x, "updatedRowCount", null)
    
    inline def setUpdatedRowCountUndefined: Self = StObject.set(x, "updatedRowCount", js.undefined)
  }
}
