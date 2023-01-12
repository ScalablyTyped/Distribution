package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShutdownGetNodeNodeShutdownStatus extends StObject {
  
  var node_id: NodeId
  
  var persistent_tasks: ShutdownGetNodePersistentTaskStatus
  
  var plugins: ShutdownGetNodePluginsStatus
  
  var reason: String
  
  var shard_migration: ShutdownGetNodeShardMigrationStatus
  
  var shutdown_startedmillis: EpochTime[UnitMillis]
  
  var status: ShutdownGetNodeShutdownStatus
  
  var `type`: ShutdownGetNodeShutdownType
}
object ShutdownGetNodeNodeShutdownStatus {
  
  inline def apply(
    node_id: NodeId,
    persistent_tasks: ShutdownGetNodePersistentTaskStatus,
    plugins: ShutdownGetNodePluginsStatus,
    reason: String,
    shard_migration: ShutdownGetNodeShardMigrationStatus,
    shutdown_startedmillis: EpochTime[UnitMillis],
    status: ShutdownGetNodeShutdownStatus,
    `type`: ShutdownGetNodeShutdownType
  ): ShutdownGetNodeNodeShutdownStatus = {
    val __obj = js.Dynamic.literal(node_id = node_id.asInstanceOf[js.Any], persistent_tasks = persistent_tasks.asInstanceOf[js.Any], plugins = plugins.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], shard_migration = shard_migration.asInstanceOf[js.Any], shutdown_startedmillis = shutdown_startedmillis.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShutdownGetNodeNodeShutdownStatus]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ShutdownGetNodeNodeShutdownStatus] (val x: Self) extends AnyVal {
    
    inline def setNode_id(value: NodeId): Self = StObject.set(x, "node_id", value.asInstanceOf[js.Any])
    
    inline def setPersistent_tasks(value: ShutdownGetNodePersistentTaskStatus): Self = StObject.set(x, "persistent_tasks", value.asInstanceOf[js.Any])
    
    inline def setPlugins(value: ShutdownGetNodePluginsStatus): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
    
    inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setShard_migration(value: ShutdownGetNodeShardMigrationStatus): Self = StObject.set(x, "shard_migration", value.asInstanceOf[js.Any])
    
    inline def setShutdown_startedmillis(value: EpochTime[UnitMillis]): Self = StObject.set(x, "shutdown_startedmillis", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: ShutdownGetNodeShutdownStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setType(value: ShutdownGetNodeShutdownType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
