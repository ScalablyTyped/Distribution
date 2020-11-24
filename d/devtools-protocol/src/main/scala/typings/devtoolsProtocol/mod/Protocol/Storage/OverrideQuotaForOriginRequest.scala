package typings.devtoolsProtocol.mod.Protocol.Storage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OverrideQuotaForOriginRequest extends js.Object {
  
  /**
    * Security origin.
    */
  var origin: String = js.native
  
  /**
    * The quota size (in bytes) to override the original quota with.
    * If this is called multiple times, the overriden quota will be equal to
    * the quotaSize provided in the final call. If this is called without
    * specifying a quotaSize, the quota will be reset to the default value for
    * the specified origin. If this is called multiple times with different
    * origins, the override will be maintained for each origin until it is
    * disabled (called without a quotaSize).
    */
  var quotaSize: js.UndefOr[Double] = js.native
}
object OverrideQuotaForOriginRequest {
  
  @scala.inline
  def apply(origin: String): OverrideQuotaForOriginRequest = {
    val __obj = js.Dynamic.literal(origin = origin.asInstanceOf[js.Any])
    __obj.asInstanceOf[OverrideQuotaForOriginRequest]
  }
  
  @scala.inline
  implicit class OverrideQuotaForOriginRequestOps[Self <: OverrideQuotaForOriginRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setOrigin(value: String): Self = this.set("origin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuotaSize(value: Double): Self = this.set("quotaSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuotaSize: Self = this.set("quotaSize", js.undefined)
  }
}
