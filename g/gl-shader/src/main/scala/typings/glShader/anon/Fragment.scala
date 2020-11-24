package typings.glShader.anon

import typings.glShader.mod.Parameter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Fragment extends js.Object {
  
  var attributes: js.Array[Parameter] = js.native
  
  var fragment: String = js.native
  
  var uniforms: js.Array[Parameter] = js.native
  
  var vertex: String = js.native
}
object Fragment {
  
  @scala.inline
  def apply(attributes: js.Array[Parameter], fragment: String, uniforms: js.Array[Parameter], vertex: String): Fragment = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], fragment = fragment.asInstanceOf[js.Any], uniforms = uniforms.asInstanceOf[js.Any], vertex = vertex.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fragment]
  }
  
  @scala.inline
  implicit class FragmentOps[Self <: Fragment] (val x: Self) extends AnyVal {
    
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
    def setAttributesVarargs(value: Parameter*): Self = this.set("attributes", js.Array(value :_*))
    
    @scala.inline
    def setAttributes(value: js.Array[Parameter]): Self = this.set("attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFragment(value: String): Self = this.set("fragment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUniformsVarargs(value: Parameter*): Self = this.set("uniforms", js.Array(value :_*))
    
    @scala.inline
    def setUniforms(value: js.Array[Parameter]): Self = this.set("uniforms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVertex(value: String): Self = this.set("vertex", value.asInstanceOf[js.Any])
  }
}
