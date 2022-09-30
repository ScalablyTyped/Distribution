package typings.googleCloudSpanner.protosMod.google.spanner.admin.database.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of an OptimizeRestoredDatabaseMetadata. */
trait IOptimizeRestoredDatabaseMetadata extends StObject {
  
  /** OptimizeRestoredDatabaseMetadata name */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /** OptimizeRestoredDatabaseMetadata progress */
  var progress: js.UndefOr[IOperationProgress | Null] = js.undefined
}
object IOptimizeRestoredDatabaseMetadata {
  
  inline def apply(): IOptimizeRestoredDatabaseMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IOptimizeRestoredDatabaseMetadata]
  }
  
  extension [Self <: IOptimizeRestoredDatabaseMetadata](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setProgress(value: IOperationProgress): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
    
    inline def setProgressNull: Self = StObject.set(x, "progress", null)
    
    inline def setProgressUndefined: Self = StObject.set(x, "progress", js.undefined)
  }
}
