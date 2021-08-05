package typings.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SnapshotStatus
  extends StObject
     with Generic {
  
  var ignore_unavailable: js.UndefOr[Boolean] = js.undefined
  
  var master_timeout: js.UndefOr[String] = js.undefined
  
  var repository: js.UndefOr[String] = js.undefined
  
  var snapshot: js.UndefOr[String | js.Array[String]] = js.undefined
}
object SnapshotStatus {
  
  inline def apply(): SnapshotStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SnapshotStatus]
  }
  
  extension [Self <: SnapshotStatus](x: Self) {
    
    inline def setIgnore_unavailable(value: Boolean): Self = StObject.set(x, "ignore_unavailable", value.asInstanceOf[js.Any])
    
    inline def setIgnore_unavailableUndefined: Self = StObject.set(x, "ignore_unavailable", js.undefined)
    
    inline def setMaster_timeout(value: String): Self = StObject.set(x, "master_timeout", value.asInstanceOf[js.Any])
    
    inline def setMaster_timeoutUndefined: Self = StObject.set(x, "master_timeout", js.undefined)
    
    inline def setRepository(value: String): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
    
    inline def setRepositoryUndefined: Self = StObject.set(x, "repository", js.undefined)
    
    inline def setSnapshot(value: String | js.Array[String]): Self = StObject.set(x, "snapshot", value.asInstanceOf[js.Any])
    
    inline def setSnapshotUndefined: Self = StObject.set(x, "snapshot", js.undefined)
    
    inline def setSnapshotVarargs(value: String*): Self = StObject.set(x, "snapshot", js.Array(value :_*))
  }
}
