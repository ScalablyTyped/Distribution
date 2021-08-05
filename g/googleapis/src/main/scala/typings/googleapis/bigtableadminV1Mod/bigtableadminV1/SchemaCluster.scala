package typings.googleapis.bigtableadminV1Mod.bigtableadminV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A resizable group of nodes in a particular cloud location, capable of
  * serving all Tables in the parent Instance.
  */
trait SchemaCluster extends StObject {
  
  /**
    * (`CreationOnly`) The type of storage used by this cluster to serve its
    * parent instance&#39;s tables, unless explicitly overridden.
    */
  var defaultStorageType: js.UndefOr[String] = js.undefined
  
  /**
    * (`CreationOnly`) The location where this cluster&#39;s nodes and storage
    * reside. For best performance, clients should be located as close as
    * possible to this cluster. Currently only zones are supported, so values
    * should be of the form `projects/&lt;project&gt;/locations/&lt;zone&gt;`.
    */
  var location: js.UndefOr[String] = js.undefined
  
  /**
    * (`OutputOnly`) The unique name of the cluster. Values are of the form
    * `projects/&lt;project&gt;/instances/&lt;instance&gt;/clusters/a-z*`.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The number of nodes allocated to this cluster. More nodes enable higher
    * throughput and more consistent performance.
    */
  var serveNodes: js.UndefOr[Double] = js.undefined
  
  /**
    * (`OutputOnly`) The current state of the cluster.
    */
  var state: js.UndefOr[String] = js.undefined
}
object SchemaCluster {
  
  inline def apply(): SchemaCluster = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCluster]
  }
  
  extension [Self <: SchemaCluster](x: Self) {
    
    inline def setDefaultStorageType(value: String): Self = StObject.set(x, "defaultStorageType", value.asInstanceOf[js.Any])
    
    inline def setDefaultStorageTypeUndefined: Self = StObject.set(x, "defaultStorageType", js.undefined)
    
    inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setServeNodes(value: Double): Self = StObject.set(x, "serveNodes", value.asInstanceOf[js.Any])
    
    inline def setServeNodesUndefined: Self = StObject.set(x, "serveNodes", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
