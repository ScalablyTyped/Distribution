package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VirtualServiceDetail
  extends StObject
     with Element {
  
  var _additionalInfo: js.UndefOr[js.Array[Element]] = js.undefined
  
  var _addressString: js.UndefOr[Element] = js.undefined
  
  var _addressUrl: js.UndefOr[Element] = js.undefined
  
  var _sessionKey: js.UndefOr[Element] = js.undefined
  
  /**
    * This web address can be used to provide additional details on the call, such as alternative/regional call in numbers, or other associated services.
    */
  var additionalInfo: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * What address or number needs to be used for a user to connect to the virtual service to join. The channelType informs as to which datatype is appropriate to use (requires knowledge of the specific type).
    */
  var addressContactPoint: js.UndefOr[ContactPoint] = js.undefined
  
  /**
    * What address or number needs to be used for a user to connect to the virtual service to join. The channelType informs as to which datatype is appropriate to use (requires knowledge of the specific type).
    */
  var addressExtendedContactDetail: js.UndefOr[ExtendedContactDetail] = js.undefined
  
  /**
    * What address or number needs to be used for a user to connect to the virtual service to join. The channelType informs as to which datatype is appropriate to use (requires knowledge of the specific type).
    */
  var addressString: js.UndefOr[String] = js.undefined
  
  /**
    * What address or number needs to be used for a user to connect to the virtual service to join. The channelType informs as to which datatype is appropriate to use (requires knowledge of the specific type).
    */
  var addressUrl: js.UndefOr[String] = js.undefined
  
  /**
    * As this type defines what the virtual service is, it then defines what address and additional information might be relevant.
    * Some profiles could be used for specific types to define what the other values could/should be.
    */
  var channelType: js.UndefOr[Coding] = js.undefined
  
  /**
    * Some services have only a limitted number of participants permitted to connect at a time, this is typically used in "shared" virtual services that you might find on location resources.
    * Typically on-demand services might not have these restrictions.
    */
  var maxParticipants: js.UndefOr[Double] = js.undefined
  
  /**
    * Some services require a session key to be able to access the service once connected.
    * This could be in cases where a shared number is used, and a session key is added to put into a private line, or to identify the participant in a call.
    */
  var sessionKey: js.UndefOr[String] = js.undefined
}
object VirtualServiceDetail {
  
  inline def apply(): VirtualServiceDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VirtualServiceDetail]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VirtualServiceDetail] (val x: Self) extends AnyVal {
    
    inline def setAdditionalInfo(value: js.Array[String]): Self = StObject.set(x, "additionalInfo", value.asInstanceOf[js.Any])
    
    inline def setAdditionalInfoUndefined: Self = StObject.set(x, "additionalInfo", js.undefined)
    
    inline def setAdditionalInfoVarargs(value: String*): Self = StObject.set(x, "additionalInfo", js.Array(value*))
    
    inline def setAddressContactPoint(value: ContactPoint): Self = StObject.set(x, "addressContactPoint", value.asInstanceOf[js.Any])
    
    inline def setAddressContactPointUndefined: Self = StObject.set(x, "addressContactPoint", js.undefined)
    
    inline def setAddressExtendedContactDetail(value: ExtendedContactDetail): Self = StObject.set(x, "addressExtendedContactDetail", value.asInstanceOf[js.Any])
    
    inline def setAddressExtendedContactDetailUndefined: Self = StObject.set(x, "addressExtendedContactDetail", js.undefined)
    
    inline def setAddressString(value: String): Self = StObject.set(x, "addressString", value.asInstanceOf[js.Any])
    
    inline def setAddressStringUndefined: Self = StObject.set(x, "addressString", js.undefined)
    
    inline def setAddressUrl(value: String): Self = StObject.set(x, "addressUrl", value.asInstanceOf[js.Any])
    
    inline def setAddressUrlUndefined: Self = StObject.set(x, "addressUrl", js.undefined)
    
    inline def setChannelType(value: Coding): Self = StObject.set(x, "channelType", value.asInstanceOf[js.Any])
    
    inline def setChannelTypeUndefined: Self = StObject.set(x, "channelType", js.undefined)
    
    inline def setMaxParticipants(value: Double): Self = StObject.set(x, "maxParticipants", value.asInstanceOf[js.Any])
    
    inline def setMaxParticipantsUndefined: Self = StObject.set(x, "maxParticipants", js.undefined)
    
    inline def setSessionKey(value: String): Self = StObject.set(x, "sessionKey", value.asInstanceOf[js.Any])
    
    inline def setSessionKeyUndefined: Self = StObject.set(x, "sessionKey", js.undefined)
    
    inline def set_additionalInfo(value: js.Array[Element]): Self = StObject.set(x, "_additionalInfo", value.asInstanceOf[js.Any])
    
    inline def set_additionalInfoUndefined: Self = StObject.set(x, "_additionalInfo", js.undefined)
    
    inline def set_additionalInfoVarargs(value: Element*): Self = StObject.set(x, "_additionalInfo", js.Array(value*))
    
    inline def set_addressString(value: Element): Self = StObject.set(x, "_addressString", value.asInstanceOf[js.Any])
    
    inline def set_addressStringUndefined: Self = StObject.set(x, "_addressString", js.undefined)
    
    inline def set_addressUrl(value: Element): Self = StObject.set(x, "_addressUrl", value.asInstanceOf[js.Any])
    
    inline def set_addressUrlUndefined: Self = StObject.set(x, "_addressUrl", js.undefined)
    
    inline def set_sessionKey(value: Element): Self = StObject.set(x, "_sessionKey", value.asInstanceOf[js.Any])
    
    inline def set_sessionKeyUndefined: Self = StObject.set(x, "_sessionKey", js.undefined)
  }
}
