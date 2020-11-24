package typings.devtoolsProtocol.mod.Protocol.Overlay

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetShowGridOverlaysRequest extends js.Object {
  
  /**
    * An array of node identifiers and descriptors for the highlight appearance.
    */
  var gridNodeHighlightConfigs: js.Array[GridNodeHighlightConfig] = js.native
}
object SetShowGridOverlaysRequest {
  
  @scala.inline
  def apply(gridNodeHighlightConfigs: js.Array[GridNodeHighlightConfig]): SetShowGridOverlaysRequest = {
    val __obj = js.Dynamic.literal(gridNodeHighlightConfigs = gridNodeHighlightConfigs.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetShowGridOverlaysRequest]
  }
  
  @scala.inline
  implicit class SetShowGridOverlaysRequestOps[Self <: SetShowGridOverlaysRequest] (val x: Self) extends AnyVal {
    
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
    def setGridNodeHighlightConfigsVarargs(value: GridNodeHighlightConfig*): Self = this.set("gridNodeHighlightConfigs", js.Array(value :_*))
    
    @scala.inline
    def setGridNodeHighlightConfigs(value: js.Array[GridNodeHighlightConfig]): Self = this.set("gridNodeHighlightConfigs", value.asInstanceOf[js.Any])
  }
}
