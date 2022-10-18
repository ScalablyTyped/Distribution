package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SnapshotGetRepositoryRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var local: js.UndefOr[Boolean] = js.undefined
  
  var master_timeout: js.UndefOr[Duration] = js.undefined
  
  var name: js.UndefOr[Names] = js.undefined
}
object SnapshotGetRepositoryRequest {
  
  inline def apply(): SnapshotGetRepositoryRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SnapshotGetRepositoryRequest]
  }
  
  extension [Self <: SnapshotGetRepositoryRequest](x: Self) {
    
    inline def setLocal(value: Boolean): Self = StObject.set(x, "local", value.asInstanceOf[js.Any])
    
    inline def setLocalUndefined: Self = StObject.set(x, "local", js.undefined)
    
    inline def setMaster_timeout(value: Duration): Self = StObject.set(x, "master_timeout", value.asInstanceOf[js.Any])
    
    inline def setMaster_timeoutUndefined: Self = StObject.set(x, "master_timeout", js.undefined)
    
    inline def setName(value: Names): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNameVarargs(value: Name*): Self = StObject.set(x, "name", js.Array(value*))
  }
}
