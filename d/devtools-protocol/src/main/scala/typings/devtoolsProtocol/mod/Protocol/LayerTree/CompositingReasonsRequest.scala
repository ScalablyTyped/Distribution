package typings.devtoolsProtocol.mod.Protocol.LayerTree

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CompositingReasonsRequest extends StObject {
  
  /**
    * The id of the layer for which we want to get the reasons it was composited.
    */
  var layerId: LayerId = js.native
}
object CompositingReasonsRequest {
  
  @scala.inline
  def apply(layerId: LayerId): CompositingReasonsRequest = {
    val __obj = js.Dynamic.literal(layerId = layerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompositingReasonsRequest]
  }
  
  @scala.inline
  implicit class CompositingReasonsRequestMutableBuilder[Self <: CompositingReasonsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLayerId(value: LayerId): Self = StObject.set(x, "layerId", value.asInstanceOf[js.Any])
  }
}
