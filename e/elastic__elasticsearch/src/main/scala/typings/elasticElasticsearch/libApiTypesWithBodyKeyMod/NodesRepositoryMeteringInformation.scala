package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodesRepositoryMeteringInformation extends StObject {
  
  var archived: Boolean
  
  var cluster_version: js.UndefOr[VersionNumber] = js.undefined
  
  var repository_ephemeral_id: Id
  
  var repository_location: NodesRepositoryLocation
  
  var repository_name: Name
  
  var repository_started_at: EpochTime[UnitMillis]
  
  var repository_stopped_at: js.UndefOr[EpochTime[UnitMillis]] = js.undefined
  
  var repository_type: String
  
  var request_counts: NodesRequestCounts
}
object NodesRepositoryMeteringInformation {
  
  inline def apply(
    archived: Boolean,
    repository_ephemeral_id: Id,
    repository_location: NodesRepositoryLocation,
    repository_name: Name,
    repository_started_at: EpochTime[UnitMillis],
    repository_type: String,
    request_counts: NodesRequestCounts
  ): NodesRepositoryMeteringInformation = {
    val __obj = js.Dynamic.literal(archived = archived.asInstanceOf[js.Any], repository_ephemeral_id = repository_ephemeral_id.asInstanceOf[js.Any], repository_location = repository_location.asInstanceOf[js.Any], repository_name = repository_name.asInstanceOf[js.Any], repository_started_at = repository_started_at.asInstanceOf[js.Any], repository_type = repository_type.asInstanceOf[js.Any], request_counts = request_counts.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodesRepositoryMeteringInformation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NodesRepositoryMeteringInformation] (val x: Self) extends AnyVal {
    
    inline def setArchived(value: Boolean): Self = StObject.set(x, "archived", value.asInstanceOf[js.Any])
    
    inline def setCluster_version(value: VersionNumber): Self = StObject.set(x, "cluster_version", value.asInstanceOf[js.Any])
    
    inline def setCluster_versionUndefined: Self = StObject.set(x, "cluster_version", js.undefined)
    
    inline def setRepository_ephemeral_id(value: Id): Self = StObject.set(x, "repository_ephemeral_id", value.asInstanceOf[js.Any])
    
    inline def setRepository_location(value: NodesRepositoryLocation): Self = StObject.set(x, "repository_location", value.asInstanceOf[js.Any])
    
    inline def setRepository_name(value: Name): Self = StObject.set(x, "repository_name", value.asInstanceOf[js.Any])
    
    inline def setRepository_started_at(value: EpochTime[UnitMillis]): Self = StObject.set(x, "repository_started_at", value.asInstanceOf[js.Any])
    
    inline def setRepository_stopped_at(value: EpochTime[UnitMillis]): Self = StObject.set(x, "repository_stopped_at", value.asInstanceOf[js.Any])
    
    inline def setRepository_stopped_atUndefined: Self = StObject.set(x, "repository_stopped_at", js.undefined)
    
    inline def setRepository_type(value: String): Self = StObject.set(x, "repository_type", value.asInstanceOf[js.Any])
    
    inline def setRequest_counts(value: NodesRequestCounts): Self = StObject.set(x, "request_counts", value.asInstanceOf[js.Any])
  }
}
