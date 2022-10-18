package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typings.elasticElasticsearch.anon.Ignoreindexsettings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchableSnapshotsMountRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  /** @deprecated The use of the 'body' key has been deprecated, move the nested keys to the top level object. */
  var body: js.UndefOr[Ignoreindexsettings] = js.undefined
  
  var master_timeout: js.UndefOr[Duration] = js.undefined
  
  var repository: Name
  
  var snapshot: Name
  
  var storage: js.UndefOr[String] = js.undefined
  
  var wait_for_completion: js.UndefOr[Boolean] = js.undefined
}
object SearchableSnapshotsMountRequest {
  
  inline def apply(repository: Name, snapshot: Name): SearchableSnapshotsMountRequest = {
    val __obj = js.Dynamic.literal(repository = repository.asInstanceOf[js.Any], snapshot = snapshot.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchableSnapshotsMountRequest]
  }
  
  extension [Self <: SearchableSnapshotsMountRequest](x: Self) {
    
    inline def setBody(value: Ignoreindexsettings): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setMaster_timeout(value: Duration): Self = StObject.set(x, "master_timeout", value.asInstanceOf[js.Any])
    
    inline def setMaster_timeoutUndefined: Self = StObject.set(x, "master_timeout", js.undefined)
    
    inline def setRepository(value: Name): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
    
    inline def setSnapshot(value: Name): Self = StObject.set(x, "snapshot", value.asInstanceOf[js.Any])
    
    inline def setStorage(value: String): Self = StObject.set(x, "storage", value.asInstanceOf[js.Any])
    
    inline def setStorageUndefined: Self = StObject.set(x, "storage", js.undefined)
    
    inline def setWait_for_completion(value: Boolean): Self = StObject.set(x, "wait_for_completion", value.asInstanceOf[js.Any])
    
    inline def setWait_for_completionUndefined: Self = StObject.set(x, "wait_for_completion", js.undefined)
  }
}
