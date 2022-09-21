package typings.googleapis.beyondcorpV1alphaMod.beyondcorpV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaClientConnectorService extends StObject {
  
  /**
    * Output only. [Output only] Create time stamp.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. User-provided name. The display name should follow certain format. * Must be 6 to 30 characters in length. * Can only contain lowercase letters, numbers, and hyphens. * Must start with a letter.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The details of the egress settings.
    */
  var egress: js.UndefOr[SchemaEgress] = js.undefined
  
  /**
    * Required. The details of the ingress settings.
    */
  var ingress: js.UndefOr[SchemaIngress] = js.undefined
  
  /**
    * Required. Name of resource. The name is ignored during creation.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The operational state of the ClientConnectorService.
    */
  var state: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. [Output only] Update time stamp.
    */
  var updateTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaClientConnectorService {
  
  inline def apply(): SchemaClientConnectorService = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaClientConnectorService]
  }
  
  extension [Self <: SchemaClientConnectorService](x: Self) {
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setEgress(value: SchemaEgress): Self = StObject.set(x, "egress", value.asInstanceOf[js.Any])
    
    inline def setEgressUndefined: Self = StObject.set(x, "egress", js.undefined)
    
    inline def setIngress(value: SchemaIngress): Self = StObject.set(x, "ingress", value.asInstanceOf[js.Any])
    
    inline def setIngressUndefined: Self = StObject.set(x, "ingress", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeNull: Self = StObject.set(x, "updateTime", null)
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
