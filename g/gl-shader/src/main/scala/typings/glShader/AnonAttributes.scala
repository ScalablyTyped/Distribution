package typings.glShader

import typings.glShader.mod.Parameter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAttributes extends js.Object {
  var attributes: js.UndefOr[js.Array[Parameter]] = js.undefined
  var fragment: String
  var uniforms: js.UndefOr[js.Array[Parameter]] = js.undefined
  var vertex: String
}

object AnonAttributes {
  @scala.inline
  def apply(
    fragment: String,
    vertex: String,
    attributes: js.Array[Parameter] = null,
    uniforms: js.Array[Parameter] = null
  ): AnonAttributes = {
    val __obj = js.Dynamic.literal(fragment = fragment.asInstanceOf[js.Any], vertex = vertex.asInstanceOf[js.Any])
    if (attributes != null) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    if (uniforms != null) __obj.updateDynamic("uniforms")(uniforms.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAttributes]
  }
}

