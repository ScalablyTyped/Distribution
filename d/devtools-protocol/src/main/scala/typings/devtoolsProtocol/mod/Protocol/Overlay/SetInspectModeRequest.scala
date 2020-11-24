package typings.devtoolsProtocol.mod.Protocol.Overlay

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetInspectModeRequest extends js.Object {
  
  /**
    * A descriptor for the highlight appearance of hovered-over nodes. May be omitted if `enabled
    * == false`.
    */
  var highlightConfig: js.UndefOr[HighlightConfig] = js.native
  
  /**
    * Set an inspection mode.
    */
  var mode: InspectMode = js.native
}
object SetInspectModeRequest {
  
  @scala.inline
  def apply(mode: InspectMode): SetInspectModeRequest = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetInspectModeRequest]
  }
  
  @scala.inline
  implicit class SetInspectModeRequestOps[Self <: SetInspectModeRequest] (val x: Self) extends AnyVal {
    
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
    def setMode(value: InspectMode): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighlightConfig(value: HighlightConfig): Self = this.set("highlightConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHighlightConfig: Self = this.set("highlightConfig", js.undefined)
  }
}
