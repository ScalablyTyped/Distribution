package typings.glDashShader

import typings.glDashShader.glDashShaderMod.Parameter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Attributes extends js.Object {
  var attributes: js.UndefOr[js.Array[Parameter]] = js.undefined
  var fragment: String
  var uniforms: js.UndefOr[js.Array[Parameter]] = js.undefined
  var vertex: String
}

object Anon_Attributes {
  @scala.inline
  def apply(
    fragment: String,
    vertex: String,
    attributes: js.Array[Parameter] = null,
    uniforms: js.Array[Parameter] = null
  ): Anon_Attributes = {
    val __obj = js.Dynamic.literal(fragment = fragment, vertex = vertex)
    if (attributes != null) __obj.updateDynamic("attributes")(attributes)
    if (uniforms != null) __obj.updateDynamic("uniforms")(uniforms)
    __obj.asInstanceOf[Anon_Attributes]
  }
}

