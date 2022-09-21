package typings.googleapis.bigtableadminV2Mod.bigtableadminV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaClusterState extends StObject {
  
  /**
    * Output only. The encryption information for the table in this cluster. If the encryption key protecting this resource is customer managed, then its version can be rotated in Cloud Key Management Service (Cloud KMS). The primary version of the key and its status will be reflected here when changes propagate from Cloud KMS.
    */
  var encryptionInfo: js.UndefOr[js.Array[SchemaEncryptionInfo]] = js.undefined
  
  /**
    * Output only. The state of replication for the table in this cluster.
    */
  var replicationState: js.UndefOr[String | Null] = js.undefined
}
object SchemaClusterState {
  
  inline def apply(): SchemaClusterState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaClusterState]
  }
  
  extension [Self <: SchemaClusterState](x: Self) {
    
    inline def setEncryptionInfo(value: js.Array[SchemaEncryptionInfo]): Self = StObject.set(x, "encryptionInfo", value.asInstanceOf[js.Any])
    
    inline def setEncryptionInfoUndefined: Self = StObject.set(x, "encryptionInfo", js.undefined)
    
    inline def setEncryptionInfoVarargs(value: SchemaEncryptionInfo*): Self = StObject.set(x, "encryptionInfo", js.Array(value*))
    
    inline def setReplicationState(value: String): Self = StObject.set(x, "replicationState", value.asInstanceOf[js.Any])
    
    inline def setReplicationStateNull: Self = StObject.set(x, "replicationState", null)
    
    inline def setReplicationStateUndefined: Self = StObject.set(x, "replicationState", js.undefined)
  }
}
