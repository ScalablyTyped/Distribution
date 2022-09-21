package typings.devtoolsProtocol.mod.Protocol.Storage

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OverrideQuotaForOriginRequest extends StObject {
  
  /**
    * Security origin.
    */
  var origin: String
  
  /**
    * The quota size (in bytes) to override the original quota with.
    * If this is called multiple times, the overridden quota will be equal to
    * the quotaSize provided in the final call. If this is called without
    * specifying a quotaSize, the quota will be reset to the default value for
    * the specified origin. If this is called multiple times with different
    * origins, the override will be maintained for each origin until it is
    * disabled (called without a quotaSize).
    */
  var quotaSize: js.UndefOr[Double] = js.undefined
}
object OverrideQuotaForOriginRequest {
  
  inline def apply(origin: String): OverrideQuotaForOriginRequest = {
    val __obj = js.Dynamic.literal(origin = origin.asInstanceOf[js.Any])
    __obj.asInstanceOf[OverrideQuotaForOriginRequest]
  }
  
  extension [Self <: OverrideQuotaForOriginRequest](x: Self) {
    
    inline def setOrigin(value: String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    inline def setQuotaSize(value: Double): Self = StObject.set(x, "quotaSize", value.asInstanceOf[js.Any])
    
    inline def setQuotaSizeUndefined: Self = StObject.set(x, "quotaSize", js.undefined)
  }
}
