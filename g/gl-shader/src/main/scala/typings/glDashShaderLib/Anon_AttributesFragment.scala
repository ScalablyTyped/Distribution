package typings
package glDashShaderLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AttributesFragment extends js.Object {
  var attributes: js.Array[glDashShaderLib.glDashShaderMod.Parameter]
  var fragment: java.lang.String
  var uniforms: js.Array[glDashShaderLib.glDashShaderMod.Parameter]
  var vertex: java.lang.String
}

object Anon_AttributesFragment {
  @scala.inline
  def apply(
    attributes: js.Array[glDashShaderLib.glDashShaderMod.Parameter],
    fragment: java.lang.String,
    uniforms: js.Array[glDashShaderLib.glDashShaderMod.Parameter],
    vertex: java.lang.String
  ): Anon_AttributesFragment = {
    val __obj = js.Dynamic.literal(attributes = attributes, fragment = fragment, uniforms = uniforms, vertex = vertex)
  
    __obj.asInstanceOf[Anon_AttributesFragment]
  }
}

