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
  
  @scala.inline
  def apply(): SchemaClusterState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaClusterState]
  }
  
  @scala.inline
  implicit class SchemaClusterStateMutableBuilder[Self <: SchemaClusterState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReplicationState(value: String): Self = StObject.set(x, "replicationState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplicationStateUndefined: Self = StObject.set(x, "replicationState", js.undefined)
  }
}
