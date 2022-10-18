package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typings.elasticElasticsearch.anon.Ignoreunavailable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SnapshotRestoreRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  /** @deprecated The use of the 'body' key has been deprecated, move the nested keys to the top level object. */
  var body: js.UndefOr[Ignoreunavailable] = js.undefined
  
  var master_timeout: js.UndefOr[Duration] = js.undefined
  
  var repository: Name
  
  var snapshot: Name
  
  var wait_for_completion: js.UndefOr[Boolean] = js.undefined
}
object SnapshotRestoreRequest {
  
  inline def apply(repository: Name, snapshot: Name): SnapshotRestoreRequest = {
    val __obj = js.Dynamic.literal(repository = repository.asInstanceOf[js.Any], snapshot = snapshot.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnapshotRestoreRequest]
  }
  
  extension [Self <: SnapshotRestoreRequest](x: Self) {
    
    inline def setBody(value: Ignoreunavailable): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setMaster_timeout(value: Duration): Self = StObject.set(x, "master_timeout", value.asInstanceOf[js.Any])
    
    inline def setMaster_timeoutUndefined: Self = StObject.set(x, "master_timeout", js.undefined)
    
    inline def setRepository(value: Name): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
    
    inline def setSnapshot(value: Name): Self = StObject.set(x, "snapshot", value.asInstanceOf[js.Any])
    
    inline def setWait_for_completion(value: Boolean): Self = StObject.set(x, "wait_for_completion", value.asInstanceOf[js.Any])
    
    inline def setWait_for_completionUndefined: Self = StObject.set(x, "wait_for_completion", js.undefined)
  }
}
