package typings.googleapis.baremetalsolutionV2Mod.baremetalsolutionV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaVRF extends StObject {
  
  /**
    * The name of the VRF.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The QOS policy applied to this VRF.
    */
  var qosPolicy: js.UndefOr[SchemaQosPolicy] = js.undefined
  
  /**
    * The possible state of VRF.
    */
  var state: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The list of VLAN attachments for the VRF.
    */
  var vlanAttachments: js.UndefOr[js.Array[SchemaVlanAttachment]] = js.undefined
}
object SchemaVRF {
  
  inline def apply(): SchemaVRF = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVRF]
  }
  
  extension [Self <: SchemaVRF](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setQosPolicy(value: SchemaQosPolicy): Self = StObject.set(x, "qosPolicy", value.asInstanceOf[js.Any])
    
    inline def setQosPolicyUndefined: Self = StObject.set(x, "qosPolicy", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setVlanAttachments(value: js.Array[SchemaVlanAttachment]): Self = StObject.set(x, "vlanAttachments", value.asInstanceOf[js.Any])
    
    inline def setVlanAttachmentsUndefined: Self = StObject.set(x, "vlanAttachments", js.undefined)
    
    inline def setVlanAttachmentsVarargs(value: SchemaVlanAttachment*): Self = StObject.set(x, "vlanAttachments", js.Array(value*))
  }
}
