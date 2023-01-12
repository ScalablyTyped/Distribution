package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SnapshotStatusRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var ignore_unavailable: js.UndefOr[Boolean] = js.undefined
  
  var master_timeout: js.UndefOr[Duration] = js.undefined
  
  var repository: js.UndefOr[Name] = js.undefined
  
  var snapshot: js.UndefOr[Names] = js.undefined
}
object SnapshotStatusRequest {
  
  inline def apply(): SnapshotStatusRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SnapshotStatusRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SnapshotStatusRequest] (val x: Self) extends AnyVal {
    
    inline def setIgnore_unavailable(value: Boolean): Self = StObject.set(x, "ignore_unavailable", value.asInstanceOf[js.Any])
    
    inline def setIgnore_unavailableUndefined: Self = StObject.set(x, "ignore_unavailable", js.undefined)
    
    inline def setMaster_timeout(value: Duration): Self = StObject.set(x, "master_timeout", value.asInstanceOf[js.Any])
    
    inline def setMaster_timeoutUndefined: Self = StObject.set(x, "master_timeout", js.undefined)
    
    inline def setRepository(value: Name): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
    
    inline def setRepositoryUndefined: Self = StObject.set(x, "repository", js.undefined)
    
    inline def setSnapshot(value: Names): Self = StObject.set(x, "snapshot", value.asInstanceOf[js.Any])
    
    inline def setSnapshotUndefined: Self = StObject.set(x, "snapshot", js.undefined)
    
    inline def setSnapshotVarargs(value: Name*): Self = StObject.set(x, "snapshot", js.Array(value*))
  }
}
