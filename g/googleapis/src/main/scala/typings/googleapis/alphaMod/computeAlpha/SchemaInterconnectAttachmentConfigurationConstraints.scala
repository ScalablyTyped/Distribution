package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaInterconnectAttachmentConfigurationConstraints extends StObject {
  
  /**
    * [Output Only] Whether the attachment's BGP session requires/allows/disallows BGP MD5 authentication. This can take one of the following values: MD5_OPTIONAL, MD5_REQUIRED, MD5_UNSUPPORTED. For example, a Cross-Cloud Interconnect connection to a remote cloud provider that requires BGP MD5 authentication has the interconnectRemoteLocation attachment_configuration_constraints.bgp_md5 field set to MD5_REQUIRED, and that property is propagated to the attachment. Similarly, if BGP MD5 is MD5_UNSUPPORTED, an error is returned if MD5 is requested.
    */
  var bgpMd5: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output Only] List of ASN ranges that the remote location is known to support. Formatted as an array of inclusive ranges {min: min-value, max: max-value\}. For example, [{min: 123, max: 123\}, {min: 64512, max: 65534\}] allows the peer ASN to be 123 or anything in the range 64512-65534. This field is only advisory. Although the API accepts other ranges, these are the ranges that we recommend.
    */
  var bgpPeerAsnRanges: js.UndefOr[js.Array[SchemaInterconnectAttachmentConfigurationConstraintsBgpPeerASNRange]] = js.undefined
  
  /**
    * [Output Only] Network Connectivity Center constraints, which can take one of the following values: NCC_UNCONSTRAINED, NCC_SPOKE_REQUIRED
    */
  var networkConnectivityCenter: js.UndefOr[String | Null] = js.undefined
}
object SchemaInterconnectAttachmentConfigurationConstraints {
  
  inline def apply(): SchemaInterconnectAttachmentConfigurationConstraints = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInterconnectAttachmentConfigurationConstraints]
  }
  
  extension [Self <: SchemaInterconnectAttachmentConfigurationConstraints](x: Self) {
    
    inline def setBgpMd5(value: String): Self = StObject.set(x, "bgpMd5", value.asInstanceOf[js.Any])
    
    inline def setBgpMd5Null: Self = StObject.set(x, "bgpMd5", null)
    
    inline def setBgpMd5Undefined: Self = StObject.set(x, "bgpMd5", js.undefined)
    
    inline def setBgpPeerAsnRanges(value: js.Array[SchemaInterconnectAttachmentConfigurationConstraintsBgpPeerASNRange]): Self = StObject.set(x, "bgpPeerAsnRanges", value.asInstanceOf[js.Any])
    
    inline def setBgpPeerAsnRangesUndefined: Self = StObject.set(x, "bgpPeerAsnRanges", js.undefined)
    
    inline def setBgpPeerAsnRangesVarargs(value: SchemaInterconnectAttachmentConfigurationConstraintsBgpPeerASNRange*): Self = StObject.set(x, "bgpPeerAsnRanges", js.Array(value*))
    
    inline def setNetworkConnectivityCenter(value: String): Self = StObject.set(x, "networkConnectivityCenter", value.asInstanceOf[js.Any])
    
    inline def setNetworkConnectivityCenterNull: Self = StObject.set(x, "networkConnectivityCenter", null)
    
    inline def setNetworkConnectivityCenterUndefined: Self = StObject.set(x, "networkConnectivityCenter", js.undefined)
  }
}
