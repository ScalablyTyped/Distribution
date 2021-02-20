package typings.devtoolsProtocol.mod.Protocol.Storage

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetUsageAndQuotaResponse extends StObject {
  
  /**
    * Whether or not the origin has an active storage quota override
    */
  var overrideActive: Boolean = js.native
  
  /**
    * Storage quota (bytes).
    */
  var quota: Double = js.native
  
  /**
    * Storage usage (bytes).
    */
  var usage: Double = js.native
  
  /**
    * Storage usage per type (bytes).
    */
  var usageBreakdown: js.Array[UsageForType] = js.native
}
object GetUsageAndQuotaResponse {
  
  @scala.inline
  def apply(overrideActive: Boolean, quota: Double, usage: Double, usageBreakdown: js.Array[UsageForType]): GetUsageAndQuotaResponse = {
    val __obj = js.Dynamic.literal(overrideActive = overrideActive.asInstanceOf[js.Any], quota = quota.asInstanceOf[js.Any], usage = usage.asInstanceOf[js.Any], usageBreakdown = usageBreakdown.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetUsageAndQuotaResponse]
  }
  
  @scala.inline
  implicit class GetUsageAndQuotaResponseMutableBuilder[Self <: GetUsageAndQuotaResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOverrideActive(value: Boolean): Self = StObject.set(x, "overrideActive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuota(value: Double): Self = StObject.set(x, "quota", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsage(value: Double): Self = StObject.set(x, "usage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsageBreakdown(value: js.Array[UsageForType]): Self = StObject.set(x, "usageBreakdown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsageBreakdownVarargs(value: UsageForType*): Self = StObject.set(x, "usageBreakdown", js.Array(value :_*))
  }
}
