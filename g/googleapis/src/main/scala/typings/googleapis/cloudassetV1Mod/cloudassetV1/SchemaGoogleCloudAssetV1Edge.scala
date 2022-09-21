package typings.googleapis.cloudassetV1Mod.cloudassetV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudAssetV1Edge extends StObject {
  
  /**
    * The source node of the edge. For example, it could be a full resource name for a resource node or an email of an identity.
    */
  var sourceNode: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The target node of the edge. For example, it could be a full resource name for a resource node or an email of an identity.
    */
  var targetNode: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudAssetV1Edge {
  
  inline def apply(): SchemaGoogleCloudAssetV1Edge = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudAssetV1Edge]
  }
  
  extension [Self <: SchemaGoogleCloudAssetV1Edge](x: Self) {
    
    inline def setSourceNode(value: String): Self = StObject.set(x, "sourceNode", value.asInstanceOf[js.Any])
    
    inline def setSourceNodeNull: Self = StObject.set(x, "sourceNode", null)
    
    inline def setSourceNodeUndefined: Self = StObject.set(x, "sourceNode", js.undefined)
    
    inline def setTargetNode(value: String): Self = StObject.set(x, "targetNode", value.asInstanceOf[js.Any])
    
    inline def setTargetNodeNull: Self = StObject.set(x, "targetNode", null)
    
    inline def setTargetNodeUndefined: Self = StObject.set(x, "targetNode", js.undefined)
  }
}
