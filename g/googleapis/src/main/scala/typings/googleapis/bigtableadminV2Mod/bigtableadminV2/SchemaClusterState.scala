package typings.googleapis.bigtableadminV2Mod.bigtableadminV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The state of a table&#39;s data in a particular cluster.
  */
trait SchemaClusterState extends StObject {
  
  /**
    * Output only. The state of replication for the table in this cluster.
    */
  var replicationState: js.UndefOr[String] = js.undefined
}
object SchemaClusterState {
  
  inline def apply(): SchemaClusterState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaClusterState]
  }
  
  extension [Self <: SchemaClusterState](x: Self) {
    
    inline def setReplicationState(value: String): Self = StObject.set(x, "replicationState", value.asInstanceOf[js.Any])
    
    inline def setReplicationStateUndefined: Self = StObject.set(x, "replicationState", js.undefined)
  }
}
