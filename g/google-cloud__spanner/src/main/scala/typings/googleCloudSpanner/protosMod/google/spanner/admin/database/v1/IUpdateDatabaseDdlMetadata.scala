package typings.googleCloudSpanner.protosMod.google.spanner.admin.database.v1

import typings.googleCloudSpanner.protosMod.google.protobuf.ITimestamp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of an UpdateDatabaseDdlMetadata. */
trait IUpdateDatabaseDdlMetadata extends StObject {
  
  /** UpdateDatabaseDdlMetadata commitTimestamps */
  var commitTimestamps: js.UndefOr[js.Array[ITimestamp] | Null] = js.undefined
  
  /** UpdateDatabaseDdlMetadata database */
  var database: js.UndefOr[String | Null] = js.undefined
  
  /** UpdateDatabaseDdlMetadata progress */
  var progress: js.UndefOr[js.Array[IOperationProgress] | Null] = js.undefined
  
  /** UpdateDatabaseDdlMetadata statements */
  var statements: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /** UpdateDatabaseDdlMetadata throttled */
  var throttled: js.UndefOr[Boolean | Null] = js.undefined
}
object IUpdateDatabaseDdlMetadata {
  
  inline def apply(): IUpdateDatabaseDdlMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IUpdateDatabaseDdlMetadata]
  }
  
  extension [Self <: IUpdateDatabaseDdlMetadata](x: Self) {
    
    inline def setCommitTimestamps(value: js.Array[ITimestamp]): Self = StObject.set(x, "commitTimestamps", value.asInstanceOf[js.Any])
    
    inline def setCommitTimestampsNull: Self = StObject.set(x, "commitTimestamps", null)
    
    inline def setCommitTimestampsUndefined: Self = StObject.set(x, "commitTimestamps", js.undefined)
    
    inline def setCommitTimestampsVarargs(value: ITimestamp*): Self = StObject.set(x, "commitTimestamps", js.Array(value*))
    
    inline def setDatabase(value: String): Self = StObject.set(x, "database", value.asInstanceOf[js.Any])
    
    inline def setDatabaseNull: Self = StObject.set(x, "database", null)
    
    inline def setDatabaseUndefined: Self = StObject.set(x, "database", js.undefined)
    
    inline def setProgress(value: js.Array[IOperationProgress]): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
    
    inline def setProgressNull: Self = StObject.set(x, "progress", null)
    
    inline def setProgressUndefined: Self = StObject.set(x, "progress", js.undefined)
    
    inline def setProgressVarargs(value: IOperationProgress*): Self = StObject.set(x, "progress", js.Array(value*))
    
    inline def setStatements(value: js.Array[String]): Self = StObject.set(x, "statements", value.asInstanceOf[js.Any])
    
    inline def setStatementsNull: Self = StObject.set(x, "statements", null)
    
    inline def setStatementsUndefined: Self = StObject.set(x, "statements", js.undefined)
    
    inline def setStatementsVarargs(value: String*): Self = StObject.set(x, "statements", js.Array(value*))
    
    inline def setThrottled(value: Boolean): Self = StObject.set(x, "throttled", value.asInstanceOf[js.Any])
    
    inline def setThrottledNull: Self = StObject.set(x, "throttled", null)
    
    inline def setThrottledUndefined: Self = StObject.set(x, "throttled", js.undefined)
  }
}
