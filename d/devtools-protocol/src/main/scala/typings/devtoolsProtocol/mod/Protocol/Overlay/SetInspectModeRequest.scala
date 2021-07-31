package typings.devtoolsProtocol.mod.Protocol.Overlay

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetInspectModeRequest extends StObject {
  
  /**
    * A descriptor for the highlight appearance of hovered-over nodes. May be omitted if `enabled
    * == false`.
    */
  var highlightConfig: js.UndefOr[HighlightConfig] = js.undefined
  
  /**
    * Set an inspection mode.
    */
  var mode: InspectMode
}
object SetInspectModeRequest {
  
  @scala.inline
  def apply(mode: InspectMode): SetInspectModeRequest = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetInspectModeRequest]
  }
  
  @scala.inline
  implicit class SetInspectModeRequestMutableBuilder[Self <: SetInspectModeRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHighlightConfig(value: HighlightConfig): Self = StObject.set(x, "highlightConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighlightConfigUndefined: Self = StObject.set(x, "highlightConfig", js.undefined)
    
    @scala.inline
    def setMode(value: InspectMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
  }
}
