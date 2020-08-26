package typings.devtoolsProtocol.mod.Protocol.LayerTree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LayerTreeDidChangeEvent extends js.Object {
  /**
    * Layer tree, absent if not in the comspositing mode.
    */
  var layers: js.UndefOr[js.Array[Layer]] = js.native
}

object LayerTreeDidChangeEvent {
  @scala.inline
  def apply(): LayerTreeDidChangeEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LayerTreeDidChangeEvent]
  }
  @scala.inline
  implicit class LayerTreeDidChangeEventOps[Self <: LayerTreeDidChangeEvent] (val x: Self) extends AnyVal {
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
    def setLayersVarargs(value: Layer*): Self = this.set("layers", js.Array(value :_*))
    @scala.inline
    def setLayers(value: js.Array[Layer]): Self = this.set("layers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLayers: Self = this.set("layers", js.undefined)
  }
  
}

