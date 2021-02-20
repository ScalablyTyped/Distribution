package typings.googleapis.betaMod.computeBeta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaSecurityPolicyRuleMatcherConfig extends StObject {
  
  /**
    * CIDR IP address range.
    */
  var srcIpRanges: js.UndefOr[js.Array[String]] = js.native
}
object SchemaSecurityPolicyRuleMatcherConfig {
  
  @scala.inline
  def apply(): SchemaSecurityPolicyRuleMatcherConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSecurityPolicyRuleMatcherConfig]
  }
  
  @scala.inline
  implicit class SchemaSecurityPolicyRuleMatcherConfigMutableBuilder[Self <: SchemaSecurityPolicyRuleMatcherConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSrcIpRanges(value: js.Array[String]): Self = StObject.set(x, "srcIpRanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSrcIpRangesUndefined: Self = StObject.set(x, "srcIpRanges", js.undefined)
    
    @scala.inline
    def setSrcIpRangesVarargs(value: String*): Self = StObject.set(x, "srcIpRanges", js.Array(value :_*))
  }
}
