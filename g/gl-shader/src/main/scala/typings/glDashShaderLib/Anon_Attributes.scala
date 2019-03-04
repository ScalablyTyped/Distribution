package typings
package glDashShaderLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Attributes extends js.Object {
  var attributes: js.UndefOr[js.Array[glDashShaderLib.glDashShaderMod.Parameter]] = js.undefined
  var fragment: java.lang.String
  var uniforms: js.UndefOr[js.Array[glDashShaderLib.glDashShaderMod.Parameter]] = js.undefined
  var vertex: java.lang.String
}

object Anon_Attributes {
  @scala.inline
  def apply(
    fragment: java.lang.String,
    vertex: java.lang.String,
    attributes: js.Array[glDashShaderLib.glDashShaderMod.Parameter] = null,
    uniforms: js.Array[glDashShaderLib.glDashShaderMod.Parameter] = null
  ): Anon_Attributes = {
    val __obj = js.Dynamic.literal(fragment = fragment, vertex = vertex)
    if (attributes != null) __obj.updateDynamic("attributes")(attributes)
    if (uniforms != null) __obj.updateDynamic("uniforms")(uniforms)
    __obj.asInstanceOf[Anon_Attributes]
  }
}

