package typings.dockerode.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseLayer extends js.Object {
  
  var BaseLayer: js.UndefOr[String] = js.native
  
  var Layers: js.UndefOr[js.Array[String]] = js.native
  
  var Type: String = js.native
}
object BaseLayer {
  
  @scala.inline
  def apply(Type: String): BaseLayer = {
    val __obj = js.Dynamic.literal(Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseLayer]
  }
  
  @scala.inline
  implicit class BaseLayerOps[Self <: BaseLayer] (val x: Self) extends AnyVal {
    
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
    def setType(value: String): Self = this.set("Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaseLayer(value: String): Self = this.set("BaseLayer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBaseLayer: Self = this.set("BaseLayer", js.undefined)
    
    @scala.inline
    def setLayersVarargs(value: String*): Self = this.set("Layers", js.Array(value :_*))
    
    @scala.inline
    def setLayers(value: js.Array[String]): Self = this.set("Layers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLayers: Self = this.set("Layers", js.undefined)
  }
}
