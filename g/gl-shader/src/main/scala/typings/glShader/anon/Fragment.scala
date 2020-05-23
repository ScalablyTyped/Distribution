package typings.glShader.anon

import typings.glShader.mod.Parameter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Fragment extends js.Object {
  var attributes: js.Array[Parameter]
  var fragment: String
  var uniforms: js.Array[Parameter]
  var vertex: String
}

object Fragment {
  @scala.inline
  def apply(attributes: js.Array[Parameter], fragment: String, uniforms: js.Array[Parameter], vertex: String): Fragment = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], fragment = fragment.asInstanceOf[js.Any], uniforms = uniforms.asInstanceOf[js.Any], vertex = vertex.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fragment]
  }
}

