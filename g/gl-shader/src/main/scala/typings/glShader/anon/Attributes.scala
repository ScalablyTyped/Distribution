package typings.glShader.anon

import typings.glShader.mod.Parameter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Attributes extends js.Object {
  var attributes: js.UndefOr[js.Array[Parameter]] = js.undefined
  var fragment: String
  var uniforms: js.UndefOr[js.Array[Parameter]] = js.undefined
  var vertex: String
}

object Attributes {
  @scala.inline
  def apply(
    fragment: String,
    vertex: String,
    attributes: js.Array[Parameter] = null,
    uniforms: js.Array[Parameter] = null
  ): Attributes = {
    val __obj = js.Dynamic.literal(fragment = fragment.asInstanceOf[js.Any], vertex = vertex.asInstanceOf[js.Any])
    if (attributes != null) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    if (uniforms != null) __obj.updateDynamic("uniforms")(uniforms.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attributes]
  }
}

