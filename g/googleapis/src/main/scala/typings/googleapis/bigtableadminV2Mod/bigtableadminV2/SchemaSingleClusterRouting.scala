package typings.googleapis.bigtableadminV2Mod.bigtableadminV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Unconditionally routes all read/write requests to a specific cluster. This
  * option preserves read-your-writes consistency, but does not improve
  * availability.
  */
trait SchemaSingleClusterRouting extends StObject {
  
  /**
    * Whether or not `CheckAndMutateRow` and `ReadModifyWriteRow` requests are
    * allowed by this app profile. It is unsafe to send these requests to the
    * same table/row/column in multiple clusters.
    */
  var allowTransactionalWrites: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The cluster to which read/write requests should be routed.
    */
  var clusterId: js.UndefOr[String] = js.undefined
}
object SchemaSingleClusterRouting {
  
  @scala.inline
  def apply(): SchemaSingleClusterRouting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSingleClusterRouting]
  }
  
  @scala.inline
  implicit class SchemaSingleClusterRoutingMutableBuilder[Self <: SchemaSingleClusterRouting] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowTransactionalWrites(value: Boolean): Self = StObject.set(x, "allowTransactionalWrites", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowTransactionalWritesUndefined: Self = StObject.set(x, "allowTransactionalWrites", js.undefined)
    
    @scala.inline
    def setClusterId(value: String): Self = StObject.set(x, "clusterId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterIdUndefined: Self = StObject.set(x, "clusterId", js.undefined)
  }
}
