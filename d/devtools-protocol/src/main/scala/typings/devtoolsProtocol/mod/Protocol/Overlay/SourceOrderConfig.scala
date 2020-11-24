package typings.devtoolsProtocol.mod.Protocol.Overlay

import typings.devtoolsProtocol.mod.Protocol.DOM.RGBA
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SourceOrderConfig extends js.Object {
  
  /**
    * the color to outline the child elements in.
    */
  var childOutlineColor: RGBA = js.native
  
  /**
    * the color to outline the givent element in.
    */
  var parentOutlineColor: RGBA = js.native
}
object SourceOrderConfig {
  
  @scala.inline
  def apply(childOutlineColor: RGBA, parentOutlineColor: RGBA): SourceOrderConfig = {
    val __obj = js.Dynamic.literal(childOutlineColor = childOutlineColor.asInstanceOf[js.Any], parentOutlineColor = parentOutlineColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceOrderConfig]
  }
  
  @scala.inline
  implicit class SourceOrderConfigOps[Self <: SourceOrderConfig] (val x: Self) extends AnyVal {
    
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
    def setChildOutlineColor(value: RGBA): Self = this.set("childOutlineColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentOutlineColor(value: RGBA): Self = this.set("parentOutlineColor", value.asInstanceOf[js.Any])
  }
}
