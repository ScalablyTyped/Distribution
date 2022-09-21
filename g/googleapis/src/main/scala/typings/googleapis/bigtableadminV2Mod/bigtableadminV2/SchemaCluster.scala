package typings.googleapis.bigtableadminV2Mod.bigtableadminV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCluster extends StObject {
  
  /**
    * Configuration for this cluster.
    */
  var clusterConfig: js.UndefOr[SchemaClusterConfig] = js.undefined
  
  /**
    * Immutable. The type of storage used by this cluster to serve its parent instance's tables, unless explicitly overridden.
    */
  var defaultStorageType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Immutable. The encryption configuration for CMEK-protected clusters.
    */
  var encryptionConfig: js.UndefOr[SchemaEncryptionConfig] = js.undefined
  
  /**
    * Immutable. The location where this cluster's nodes and storage reside. For best performance, clients should be located as close as possible to this cluster. Currently only zones are supported, so values should be of the form `projects/{project\}/locations/{zone\}`.
    */
  var location: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The unique name of the cluster. Values are of the form `projects/{project\}/instances/{instance\}/clusters/a-z*`.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The number of nodes allocated to this cluster. More nodes enable higher throughput and more consistent performance.
    */
  var serveNodes: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Output only. The current state of the cluster.
    */
  var state: js.UndefOr[String | Null] = js.undefined
}
object SchemaCluster {
  
  inline def apply(): SchemaCluster = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCluster]
  }
  
  extension [Self <: SchemaCluster](x: Self) {
    
    inline def setClusterConfig(value: SchemaClusterConfig): Self = StObject.set(x, "clusterConfig", value.asInstanceOf[js.Any])
    
    inline def setClusterConfigUndefined: Self = StObject.set(x, "clusterConfig", js.undefined)
    
    inline def setDefaultStorageType(value: String): Self = StObject.set(x, "defaultStorageType", value.asInstanceOf[js.Any])
    
    inline def setDefaultStorageTypeNull: Self = StObject.set(x, "defaultStorageType", null)
    
    inline def setDefaultStorageTypeUndefined: Self = StObject.set(x, "defaultStorageType", js.undefined)
    
    inline def setEncryptionConfig(value: SchemaEncryptionConfig): Self = StObject.set(x, "encryptionConfig", value.asInstanceOf[js.Any])
    
    inline def setEncryptionConfigUndefined: Self = StObject.set(x, "encryptionConfig", js.undefined)
    
    inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationNull: Self = StObject.set(x, "location", null)
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setServeNodes(value: Double): Self = StObject.set(x, "serveNodes", value.asInstanceOf[js.Any])
    
    inline def setServeNodesNull: Self = StObject.set(x, "serveNodes", null)
    
    inline def setServeNodesUndefined: Self = StObject.set(x, "serveNodes", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
