package typings.elasticsearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SnapshotRestoreParams
  extends StObject
     with GenericParams {
  
  var masterTimeout: js.UndefOr[TimeSpan] = js.undefined
  
  var repository: String
  
  var snapshot: String
  
  var waitForCompletion: js.UndefOr[Boolean] = js.undefined
}
object SnapshotRestoreParams {
  
  inline def apply(repository: String, snapshot: String): SnapshotRestoreParams = {
    val __obj = js.Dynamic.literal(repository = repository.asInstanceOf[js.Any], snapshot = snapshot.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnapshotRestoreParams]
  }
  
  extension [Self <: SnapshotRestoreParams](x: Self) {
    
    inline def setMasterTimeout(value: TimeSpan): Self = StObject.set(x, "masterTimeout", value.asInstanceOf[js.Any])
    
    inline def setMasterTimeoutUndefined: Self = StObject.set(x, "masterTimeout", js.undefined)
    
    inline def setRepository(value: String): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
    
    inline def setSnapshot(value: String): Self = StObject.set(x, "snapshot", value.asInstanceOf[js.Any])
    
    inline def setWaitForCompletion(value: Boolean): Self = StObject.set(x, "waitForCompletion", value.asInstanceOf[js.Any])
    
    inline def setWaitForCompletionUndefined: Self = StObject.set(x, "waitForCompletion", js.undefined)
  }
}
