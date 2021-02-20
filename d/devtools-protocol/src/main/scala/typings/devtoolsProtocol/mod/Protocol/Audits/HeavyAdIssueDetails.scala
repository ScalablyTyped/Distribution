package typings.devtoolsProtocol.mod.Protocol.Audits

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HeavyAdIssueDetails extends StObject {
  
  /**
    * The frame that was blocked.
    */
  var frame: AffectedFrame = js.native
  
  /**
    * The reason the ad was blocked, total network or cpu or peak cpu.
    */
  var reason: HeavyAdReason = js.native
  
  /**
    * The resolution status, either blocking the content or warning.
    */
  var resolution: HeavyAdResolutionStatus = js.native
}
object HeavyAdIssueDetails {
  
  @scala.inline
  def apply(frame: AffectedFrame, reason: HeavyAdReason, resolution: HeavyAdResolutionStatus): HeavyAdIssueDetails = {
    val __obj = js.Dynamic.literal(frame = frame.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], resolution = resolution.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeavyAdIssueDetails]
  }
  
  @scala.inline
  implicit class HeavyAdIssueDetailsMutableBuilder[Self <: HeavyAdIssueDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFrame(value: AffectedFrame): Self = StObject.set(x, "frame", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReason(value: HeavyAdReason): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolution(value: HeavyAdResolutionStatus): Self = StObject.set(x, "resolution", value.asInstanceOf[js.Any])
  }
}
