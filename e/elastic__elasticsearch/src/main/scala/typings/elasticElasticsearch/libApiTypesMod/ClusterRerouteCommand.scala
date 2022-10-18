package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClusterRerouteCommand extends StObject {
  
  var allocate_empty_primary: js.UndefOr[ClusterRerouteCommandAllocatePrimaryAction] = js.undefined
  
  var allocate_replica: js.UndefOr[ClusterRerouteCommandAllocateReplicaAction] = js.undefined
  
  var allocate_stale_primary: js.UndefOr[ClusterRerouteCommandAllocatePrimaryAction] = js.undefined
  
  var cancel: js.UndefOr[ClusterRerouteCommandCancelAction] = js.undefined
  
  var move: js.UndefOr[ClusterRerouteCommandMoveAction] = js.undefined
}
object ClusterRerouteCommand {
  
  inline def apply(): ClusterRerouteCommand = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterRerouteCommand]
  }
  
  extension [Self <: ClusterRerouteCommand](x: Self) {
    
    inline def setAllocate_empty_primary(value: ClusterRerouteCommandAllocatePrimaryAction): Self = StObject.set(x, "allocate_empty_primary", value.asInstanceOf[js.Any])
    
    inline def setAllocate_empty_primaryUndefined: Self = StObject.set(x, "allocate_empty_primary", js.undefined)
    
    inline def setAllocate_replica(value: ClusterRerouteCommandAllocateReplicaAction): Self = StObject.set(x, "allocate_replica", value.asInstanceOf[js.Any])
    
    inline def setAllocate_replicaUndefined: Self = StObject.set(x, "allocate_replica", js.undefined)
    
    inline def setAllocate_stale_primary(value: ClusterRerouteCommandAllocatePrimaryAction): Self = StObject.set(x, "allocate_stale_primary", value.asInstanceOf[js.Any])
    
    inline def setAllocate_stale_primaryUndefined: Self = StObject.set(x, "allocate_stale_primary", js.undefined)
    
    inline def setCancel(value: ClusterRerouteCommandCancelAction): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
    
    inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
    
    inline def setMove(value: ClusterRerouteCommandMoveAction): Self = StObject.set(x, "move", value.asInstanceOf[js.Any])
    
    inline def setMoveUndefined: Self = StObject.set(x, "move", js.undefined)
  }
}
