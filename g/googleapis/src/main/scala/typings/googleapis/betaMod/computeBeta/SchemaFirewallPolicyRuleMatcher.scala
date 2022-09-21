package typings.googleapis.betaMod.computeBeta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaFirewallPolicyRuleMatcher extends StObject {
  
  /**
    * Address groups which should be matched against the traffic destination. Maximum number of destination address groups is 10.
    */
  var destAddressGroups: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * CIDR IP address range. Maximum number of destination CIDR IP ranges allowed is 5000.
    */
  var destIpRanges: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Region codes whose IP addresses will be used to match for destination of traffic. Should be specified as 2 letter country code defined as per ISO 3166 alpha-2 country codes. ex."US" Maximum number of dest region codes allowed is 5000.
    */
  var destRegionCodes: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Names of Network Threat Intelligence lists. The IPs in these lists will be matched against traffic destination.
    */
  var destThreatIntelligences: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Pairs of IP protocols and ports that the rule should match.
    */
  var layer4Configs: js.UndefOr[js.Array[SchemaFirewallPolicyRuleMatcherLayer4Config]] = js.undefined
  
  /**
    * Address groups which should be matched against the traffic source. Maximum number of source address groups is 10.
    */
  var srcAddressGroups: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * CIDR IP address range. Maximum number of source CIDR IP ranges allowed is 5000.
    */
  var srcIpRanges: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Region codes whose IP addresses will be used to match for source of traffic. Should be specified as 2 letter country code defined as per ISO 3166 alpha-2 country codes. ex."US" Maximum number of source region codes allowed is 5000.
    */
  var srcRegionCodes: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * List of secure tag values, which should be matched at the source of the traffic. For INGRESS rule, if all the srcSecureTag are INEFFECTIVE, and there is no srcIpRange, this rule will be ignored. Maximum number of source tag values allowed is 256.
    */
  var srcSecureTags: js.UndefOr[js.Array[SchemaFirewallPolicyRuleSecureTag]] = js.undefined
  
  /**
    * Names of Network Threat Intelligence lists. The IPs in these lists will be matched against traffic source.
    */
  var srcThreatIntelligences: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaFirewallPolicyRuleMatcher {
  
  inline def apply(): SchemaFirewallPolicyRuleMatcher = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFirewallPolicyRuleMatcher]
  }
  
  extension [Self <: SchemaFirewallPolicyRuleMatcher](x: Self) {
    
    inline def setDestAddressGroups(value: js.Array[String]): Self = StObject.set(x, "destAddressGroups", value.asInstanceOf[js.Any])
    
    inline def setDestAddressGroupsNull: Self = StObject.set(x, "destAddressGroups", null)
    
    inline def setDestAddressGroupsUndefined: Self = StObject.set(x, "destAddressGroups", js.undefined)
    
    inline def setDestAddressGroupsVarargs(value: String*): Self = StObject.set(x, "destAddressGroups", js.Array(value*))
    
    inline def setDestIpRanges(value: js.Array[String]): Self = StObject.set(x, "destIpRanges", value.asInstanceOf[js.Any])
    
    inline def setDestIpRangesNull: Self = StObject.set(x, "destIpRanges", null)
    
    inline def setDestIpRangesUndefined: Self = StObject.set(x, "destIpRanges", js.undefined)
    
    inline def setDestIpRangesVarargs(value: String*): Self = StObject.set(x, "destIpRanges", js.Array(value*))
    
    inline def setDestRegionCodes(value: js.Array[String]): Self = StObject.set(x, "destRegionCodes", value.asInstanceOf[js.Any])
    
    inline def setDestRegionCodesNull: Self = StObject.set(x, "destRegionCodes", null)
    
    inline def setDestRegionCodesUndefined: Self = StObject.set(x, "destRegionCodes", js.undefined)
    
    inline def setDestRegionCodesVarargs(value: String*): Self = StObject.set(x, "destRegionCodes", js.Array(value*))
    
    inline def setDestThreatIntelligences(value: js.Array[String]): Self = StObject.set(x, "destThreatIntelligences", value.asInstanceOf[js.Any])
    
    inline def setDestThreatIntelligencesNull: Self = StObject.set(x, "destThreatIntelligences", null)
    
    inline def setDestThreatIntelligencesUndefined: Self = StObject.set(x, "destThreatIntelligences", js.undefined)
    
    inline def setDestThreatIntelligencesVarargs(value: String*): Self = StObject.set(x, "destThreatIntelligences", js.Array(value*))
    
    inline def setLayer4Configs(value: js.Array[SchemaFirewallPolicyRuleMatcherLayer4Config]): Self = StObject.set(x, "layer4Configs", value.asInstanceOf[js.Any])
    
    inline def setLayer4ConfigsUndefined: Self = StObject.set(x, "layer4Configs", js.undefined)
    
    inline def setLayer4ConfigsVarargs(value: SchemaFirewallPolicyRuleMatcherLayer4Config*): Self = StObject.set(x, "layer4Configs", js.Array(value*))
    
    inline def setSrcAddressGroups(value: js.Array[String]): Self = StObject.set(x, "srcAddressGroups", value.asInstanceOf[js.Any])
    
    inline def setSrcAddressGroupsNull: Self = StObject.set(x, "srcAddressGroups", null)
    
    inline def setSrcAddressGroupsUndefined: Self = StObject.set(x, "srcAddressGroups", js.undefined)
    
    inline def setSrcAddressGroupsVarargs(value: String*): Self = StObject.set(x, "srcAddressGroups", js.Array(value*))
    
    inline def setSrcIpRanges(value: js.Array[String]): Self = StObject.set(x, "srcIpRanges", value.asInstanceOf[js.Any])
    
    inline def setSrcIpRangesNull: Self = StObject.set(x, "srcIpRanges", null)
    
    inline def setSrcIpRangesUndefined: Self = StObject.set(x, "srcIpRanges", js.undefined)
    
    inline def setSrcIpRangesVarargs(value: String*): Self = StObject.set(x, "srcIpRanges", js.Array(value*))
    
    inline def setSrcRegionCodes(value: js.Array[String]): Self = StObject.set(x, "srcRegionCodes", value.asInstanceOf[js.Any])
    
    inline def setSrcRegionCodesNull: Self = StObject.set(x, "srcRegionCodes", null)
    
    inline def setSrcRegionCodesUndefined: Self = StObject.set(x, "srcRegionCodes", js.undefined)
    
    inline def setSrcRegionCodesVarargs(value: String*): Self = StObject.set(x, "srcRegionCodes", js.Array(value*))
    
    inline def setSrcSecureTags(value: js.Array[SchemaFirewallPolicyRuleSecureTag]): Self = StObject.set(x, "srcSecureTags", value.asInstanceOf[js.Any])
    
    inline def setSrcSecureTagsUndefined: Self = StObject.set(x, "srcSecureTags", js.undefined)
    
    inline def setSrcSecureTagsVarargs(value: SchemaFirewallPolicyRuleSecureTag*): Self = StObject.set(x, "srcSecureTags", js.Array(value*))
    
    inline def setSrcThreatIntelligences(value: js.Array[String]): Self = StObject.set(x, "srcThreatIntelligences", value.asInstanceOf[js.Any])
    
    inline def setSrcThreatIntelligencesNull: Self = StObject.set(x, "srcThreatIntelligences", null)
    
    inline def setSrcThreatIntelligencesUndefined: Self = StObject.set(x, "srcThreatIntelligences", js.undefined)
    
    inline def setSrcThreatIntelligencesVarargs(value: String*): Self = StObject.set(x, "srcThreatIntelligences", js.Array(value*))
  }
}
