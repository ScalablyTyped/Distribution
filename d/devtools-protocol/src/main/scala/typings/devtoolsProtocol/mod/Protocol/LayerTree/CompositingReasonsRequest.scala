package typings.devtoolsProtocol.mod.Protocol.LayerTree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CompositingReasonsRequest extends js.Object {
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
  implicit class CompositingReasonsRequestOps[Self <: CompositingReasonsRequest] (val x: Self) extends AnyVal {
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
    def setLayerId(value: LayerId): Self = this.set("layerId", value.asInstanceOf[js.Any])
  }
  
}

