package typings.glReact.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShaderDefinition extends js.Object {
  
  var frag: String = js.native
  
  var vert: js.UndefOr[String] = js.native
}
object ShaderDefinition {
  
  @scala.inline
  def apply(frag: String): ShaderDefinition = {
    val __obj = js.Dynamic.literal(frag = frag.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShaderDefinition]
  }
  
  @scala.inline
  implicit class ShaderDefinitionOps[Self <: ShaderDefinition] (val x: Self) extends AnyVal {
    
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
    def setFrag(value: String): Self = this.set("frag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVert(value: String): Self = this.set("vert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVert: Self = this.set("vert", js.undefined)
  }
}
