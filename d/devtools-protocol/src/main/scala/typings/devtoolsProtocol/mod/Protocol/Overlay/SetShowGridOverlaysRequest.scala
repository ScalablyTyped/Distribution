package typings.devtoolsProtocol.mod.Protocol.Overlay

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetShowGridOverlaysRequest extends StObject {
  
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
  implicit class SetShowGridOverlaysRequestMutableBuilder[Self <: SetShowGridOverlaysRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGridNodeHighlightConfigs(value: js.Array[GridNodeHighlightConfig]): Self = StObject.set(x, "gridNodeHighlightConfigs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGridNodeHighlightConfigsVarargs(value: GridNodeHighlightConfig*): Self = StObject.set(x, "gridNodeHighlightConfigs", js.Array(value :_*))
  }
}
